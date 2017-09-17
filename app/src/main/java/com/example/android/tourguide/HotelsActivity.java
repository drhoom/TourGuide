package com.example.android.tourguide;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.burj_rafal_kempinski),getString(R.string.burj_rafal_kempinski_desc), R.drawable.burj_rafal));
        places.add(new Place(getString(R.string.the_ritz_carlton),getString(R.string.the_ritz_carlton_desc), R.drawable.the_ritz_carlton));
        PlaceAdapter adapter = new PlaceAdapter(this, places);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
