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
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        
        Place currentPlace = getItem(position);

        TextView nameTextView =  listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getPlaceName());

        TextView descriptionTextView =  listItemView.findViewById(R.id.description_text_view);
        descriptionTextView.setText(currentPlace.getPlaceDescription());

        ImageView imageView =  listItemView.findViewById(R.id.image);
        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}