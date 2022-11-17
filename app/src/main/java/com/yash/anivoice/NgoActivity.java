package com.yash.anivoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NgoActivity extends AppCompatActivity {

    ImageView kingdom,posh,jeev,petInn,careWelfare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngo);
        getSupportActionBar().hide();


        kingdom = findViewById(R.id.Kingdom);
        posh = findViewById(R.id.Posh);
        jeev = findViewById(R.id.Jeev);
        petInn = findViewById(R.id.PetInn);
        careWelfare = findViewById(R.id.CareWelfare);

        kingdom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/cy9Exuz57nr1X1Hs8";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        posh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/1jL2iuCCX2KzpwKR6";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        jeev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/EWamfEeqAkzGBJQW8";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        petInn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/zL9ZzwJBfS87Cjvk6";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
        careWelfare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "https://maps.app.goo.gl/rYEutSNoosdtPqpq8";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}