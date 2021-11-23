package com.example.tastethebest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Meat extends AppCompatActivity {

    private ImageButton mbackbtn;

    private Button mAdobobtn;
    private Button mSinigangbtn;
    private Button mBeefSteakbtn;
    private Button mKareKarebtn;
    private Button mCalderetabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);

        mbackbtn = findViewById(R.id.backbtn);

        mAdobobtn       = findViewById(R.id.adobobtn);
        mSinigangbtn    = findViewById(R.id.sinigangbtn);
        mBeefSteakbtn   = findViewById(R.id.beefsteakbtn);
        mKareKarebtn    = findViewById(R.id.karekarebtn);
        mCalderetabtn   = findViewById(R.id.calderetabtn);

        mbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        mAdobobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Adobo.class));
            }
        });

        mSinigangbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Sinigang.class));
            }
        });

        mBeefSteakbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BeefSteak.class));
            }
        });

        mKareKarebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),KareKare.class));
            }
        });

        mCalderetabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Caldereta.class));
            }
        });
    }
}