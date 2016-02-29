package fr.iutvalence.info.m4104.gildedroseinn;

import android.app.Application;

import java.util.ArrayList;


/**
 * Created by vanbossm on 05/02/16.
 */
public class MonApp extends Application {

    public ArrayList<Item> inventory;
    public MonApp(){
         this.inventory = new ArrayList<Item>();
/*
        this.inventory.add(new Item("+5 Dexterity Vest", 10, 20));
        this.inventory.add(new Item("Aged Brie", 2, 0));
        this.inventory.add(new Item("Elixir of the Mongoose", 5, 7));
        this.inventory.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        this.inventory.add(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
        this.inventory.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        this.inventory.add(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        this.inventory.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49));
        this.inventory.add(new Item("Conjured Mana Cake", 3, 6));*/
    }

    public void addItemInventory (Item item)
    {
        this.inventory.add(item);
    }

    public ArrayList<Item> getItemInventory()
    {
        return this.inventory;
    }

}
