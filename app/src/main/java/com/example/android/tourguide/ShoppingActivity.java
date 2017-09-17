package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.alNakheelMall), getString(R.string.alNakheelMall_desc)));
        places.add(new Place(getString(R.string.panoramaMall), getString(R.string.panoramaMall_desc)));
        PlaceAdapter adapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
