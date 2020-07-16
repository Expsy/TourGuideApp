package com.example.android.tourguideapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter {

    public CustomListAdapter (Activity context, ArrayList<Location> arrayList ) {
        super(context, 0, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        Location currentItem = (Location) getItem(position);

        TextView nameView = listItemView.findViewById(R.id.name);
        nameView.setText(currentItem.getName());

        TextView addressView = listItemView.findViewById(R.id.adress);
        addressView.setText(currentItem.getAdress());

        ImageView imageView = listItemView.findViewById(R.id.image);

        if (currentItem.hasImage())
        imageView.setImageResource(currentItem.getImageResourceID());
        else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
