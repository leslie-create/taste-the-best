package com.example.tastethebest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Fish extends AppCompatActivity {

    private ImageButton mbackbtn;

    private Button mGinataangSalmonbtn;
    private Button mPinangatbtn;
    private Button mSweetTilapiabtn;
    private Button mBangusSisigbtn;
    private Button mFishSinigangbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);

        mbackbtn = findViewById(R.id.backbtn);

        mGinataangSalmonbtn       = findViewById(R.id.ginataangsalmonbtn);
        mPinangatbtn    = findViewById(R.id.pinangatbtn);
        mSweetTilapiabtn   = findViewById(R.id.sweettilapiabtn);
        mBangusSisigbtn    = findViewById(R.id.bangussisigbtn);
        mFishSinigangbtn   = findViewById(R.id.fishsinigangbtn);

        mbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        mGinataangSalmonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),GinataangSalmon.class));
            }
        });

        mPinangatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Pinangat.class));
            }
        });

        mSweetTilapiabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SweetTilapia.class));
            }
        });

        mBangusSisigbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),BangusSisig.class));
            }
        });

        mFishSinigangbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FishSinigang.class));
            }
        });
    }
}