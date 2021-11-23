package com.example.tastethebest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Vegetables extends AppCompatActivity {

    private ImageButton mbackbtn;

    private Button mPinakbetbtn;
    private Button mChopsueybtn;
    private Button mBinagoonganbtn;
    private Button mMunggobtn;
    private Button mGinataangkalabasabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        mbackbtn = findViewById(R.id.backbtn);

        mPinakbetbtn = findViewById(R.id.pinakbetbtn);
        mChopsueybtn = findViewById(R.id.chopsueybtbn);
        mBinagoonganbtn = findViewById(R.id.binagoonganbtn);
        mMunggobtn = findViewById(R.id.munggobtn);
        mGinataangkalabasabtn = findViewById(R.id.ginataangkalabasabtn);


        mbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        mPinakbetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Pinakbet.class));
            }
        });

        mChopsueybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Chapsuey.class));
            }
        });

        mBinagoonganbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Binagoongan.class));
            }
        });

        mMunggobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Munggo.class));
            }
        });

        mGinataangkalabasabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),GinataangKalabasa.class));
            }
        });
    }
}