package fr.iutvalence.info.m4104.gildedroseinn;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vanbossm on 05/02/16.
 */
public class ItemCategory implements ListAdapter {
    private ArrayList<Item> item_list;
    private Context context;
    private int counter;

    public ItemCategory(Context context, ArrayList<Item> list){
        super();
        this.context = context;
        this.item_list = list;
        this.counter = 1;
    }


    //@Override
   // public View getDropDownView(int position, View convertView, ViewGroup parent) {
   //     if (convertView == null) {
   //         convertView = LayoutInflater.from(this.context).inflate(R.layout.item_layout, parent, false);
   //         ItemCategory itemCategory = (ItemCategory) this.getItem(position);
   //         //TextView textView = (TextView) convertView.findViewById(R.id.item_description);
   //         TextView setText = (itemCategory.getDescription());
   //         ImageView imageView = (ImageView) convertView.findViewById(R.id.item_logo);
   //         //Drawable drawable = this.context.getRessources().getDrawable(R.drawable.item_);
   //         //imageView.setImageDrawable(drawable);
   //         return convertView;
   //     }
   //     return null;
   // }

    @Override
    public boolean areAllItemsEnabled() {
        return true;
    }
    @Override
    public boolean isEnabled(int position) {
        return true;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return this.item_list.size();
    }

    @Override
    public Object getItem(int position) {
        return this.item_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = new Button(this.context);
        else
            convertView =  convertView;
        ((Button) convertView).setText(this.getItem(position).toString());
        convertView.setTag(this.getItem(position));
        return convertView;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return this.counter;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

}
