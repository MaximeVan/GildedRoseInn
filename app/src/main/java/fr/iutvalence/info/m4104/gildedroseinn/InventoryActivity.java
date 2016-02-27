package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class InventoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory_layout);
        ListView inventoryList = (ListView) findViewById(R.id.inventoryListView);
        inventoryList.setAdapter(new ItemCategory(this.getBaseContext(),
                ((MonApp)getApplication()).getItemInventory()));
    }
}
