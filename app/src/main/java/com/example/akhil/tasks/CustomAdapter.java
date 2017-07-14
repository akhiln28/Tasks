package com.example.akhil.tasks;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.resource;

/**
 * Created by akhil on 13-07-2017.
 */

class CustomAdapter extends ArrayAdapter<String>{

    public CustomAdapter(@NonNull Context context,String[] names) {
        super(context,R.layout.custom_row, names);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater akhilInfalter = LayoutInflater.from(getContext());
        View customView = akhilInfalter.inflate(R.layout.custom_row,parent,false);

        String singlename= getItem(position);
        TextView akhilview = (TextView) customView.findViewById(R.id.textview_custom_row);
        ImageView akhilimage = (ImageView) customView.findViewById(R.id.imageview_custom_row);
        akhilview.setText(singlename);
        akhilimage.setImageResource(R.drawable.google_image);
        return customView;
    }
}
