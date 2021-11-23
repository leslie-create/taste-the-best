package com.example.tastethebest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FishSinigang extends AppCompatActivity {
    private ImageView mbackbtn;
    private Button mResponseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish_sinigang);

        mbackbtn = findViewById(R.id.backbtn);
        mResponseBtn = findViewById(R.id.responsebtbn);

        mbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Fish.class));
            }
        });
        mResponseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Response.class));
            }
        });
    }
}