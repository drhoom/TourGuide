 package com.example.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;


 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hotels = (TextView) findViewById(R.id.hotels);
        hotels.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(hotelsIntent);
            }
        });

        TextView mosques = (TextView) findViewById(R.id.mosques);
        mosques.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mosquesIntent = new Intent(MainActivity.this, MosquesActivity.class);
                startActivity(mosquesIntent);
            }
        });
        
        TextView shopping = (TextView) findViewById(R.id.shopping);
        shopping.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });
        
        TextView restaurants = (TextView) findViewById(R.id.restaurants);
        
        restaurants.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });
    }
}
