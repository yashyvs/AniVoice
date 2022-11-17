package com.yash.anivoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class CommunityActivity extends AppCompatActivity {

    FloatingActionButton floatingPoint2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);
        getSupportActionBar().hide();
    floatingPoint2 = findViewById(R.id.floatingActionButton2);
    floatingPoint2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i = new Intent(CommunityActivity.this,CommunityPost.class);
            startActivity(i);
        }
    });
    }
}