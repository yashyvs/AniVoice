package com.yash.anivoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MissingReportActivity extends AppCompatActivity {

    FloatingActionButton floatingPoint1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_report);
        getSupportActionBar().hide();

        floatingPoint1 = findViewById(R.id.floatingActionButton1);
        floatingPoint1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MissingReportActivity.this,missingPost.class);
                startActivity(i);
            }
        });
    }
}