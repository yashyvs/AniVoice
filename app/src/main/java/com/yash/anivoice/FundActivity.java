package com.yash.anivoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FundActivity extends AppCompatActivity {

    FloatingActionButton floatingPoint3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fund);
        getSupportActionBar().hide();

        floatingPoint3 =findViewById(R.id.floatingActionButton3);
        floatingPoint3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FundActivity.this,FundPost.class);
                startActivity(i);
            }
        });
    }
}