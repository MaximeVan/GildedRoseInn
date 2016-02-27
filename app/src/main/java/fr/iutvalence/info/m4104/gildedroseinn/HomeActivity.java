package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class HomeActivity extends Activity {

    private static final String PREFS_NAME = "Mes Prefs";
    private boolean mSilentMode;
    private int day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.day=1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
        ((TextView)findViewById(R.id.currentDay)).setText("Day"+this.day);
        SharedPreferences settings = getSharedPreferences(PREFS_NAME,0);
        boolean silent = settings.getBoolean("silentMode", false);
        setSilent(silent);

    }

    @Override
    protected void onStop() {
        super.onStop();
        SharedPreferences settings = getSharedPreferences(PREFS_NAME,0);
        SharedPreferences.Editor editor = settings.edit();
        editor.commit();
    }

    public void homeActivityClickListener(View view)
    {
        switch (view.getId())
        {
            case R.id.shop_button :
                startShopActivity();
                break;
            case R.id.inventory_button :
                startInventoryActivity();
                break;
            case R.id.nextDay :
                nextDay();
                break;
            default :
        }
    }

    private void nextDay() {
        this.day ++;
        ((TextView)findViewById(R.id.currentDay)).setText("Day"+this.day);
    }


    private void startInventoryActivity()
    {
        this.startActivity(new Intent(this, InventoryActivity.class));
    }

    private void startShopActivity()
    {
        this.startActivity( new Intent(this, ShopActivity.class));
    }

    public void setSilent(boolean Item) {
        this.mSilentMode = false;
    }
}
