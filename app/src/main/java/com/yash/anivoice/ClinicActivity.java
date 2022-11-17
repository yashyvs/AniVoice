package com.yash.anivoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ClinicActivity extends AppCompatActivity {

    ImageView sriP,creativeVH,tripathiVC,newP,ghzC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic);
        getSupportActionBar().hide();

        sriP = findViewById(R.id.sriP);
        creativeVH = findViewById(R.id.creativeVH);
        tripathiVC = findViewById(R.id.tripathiVC);
        newP = findViewById(R.id.newP);
        ghzC = findViewById(R.id.ghzC);

        sriP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/WSevJDmebzeZ4yDU9";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        creativeVH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/amoduSjSDJLxm86v5";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        tripathiVC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/Wn9227WR5cXnCrJi6";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        newP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/ZZoVqXMc51cA8jpWA";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        ghzC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/y9XTTrmS7ejhbUoe7";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}