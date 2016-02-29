package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class InventoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory_layout);

        ListView myList = (ListView) findViewById(R.id.inventoryListView);
        myList.setAdapter(new ItemInventoryCategory(this));



    }
}

