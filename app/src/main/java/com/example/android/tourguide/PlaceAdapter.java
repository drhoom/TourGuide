package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.description;

public class PlaceAdapter extends ArrayAdapter<Place> {
    
    public PlaceAdapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            holder = new ViewHolder();
            holder.nameTextView =  convertView.findViewById(R.id.name_text_view);
            holder.descriptionTextView =  convertView.findViewById(R.id.description_text_view);
            holder.imageView =  convertView.findViewById(R.id.image);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        Place currentPlace = getItem(position);

        holder.nameTextView.setText(currentPlace.getPlaceName());
        holder.descriptionTextView.setText(currentPlace.getPlaceDescription());

        if (currentPlace.hasImage()) {
            holder.imageView.setImageResource(currentPlace.getImageResourceId());
            holder.imageView.setVisibility(View.VISIBLE);
        } else {
            holder.imageView.setVisibility(View.GONE);
        }
        return convertView;
    }

    private static class ViewHolder {
        TextView nameTextView;
        TextView descriptionTextView;
        ImageView imageView;
    }
}