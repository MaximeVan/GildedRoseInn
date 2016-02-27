package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Activity;
import android.database.DataSetObserver;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import java.util.ArrayList;


public class ShopActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_layout);
        ArrayList<Item> myArrayList = new ArrayList<Item>();
        myArrayList.add(new Item("+5 Dexterity Vest", 10, 20));
        myArrayList.add(new Item("Aged Brie", 2, 0));
        myArrayList.add(new Item("Elixir of the Mongoose", 5, 7));
        myArrayList.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        myArrayList.add(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
        myArrayList.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        myArrayList.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        myArrayList.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        myArrayList.add(new Item("Conjured Mana Cake", 3, 6));

        ListView myList = (ListView) findViewById(R.id.shopListView);
        myList.setAdapter(new ItemCategory(this.getBaseContext(), myArrayList));

    }
}