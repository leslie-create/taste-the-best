package com.example.tastethebest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Dessert extends AppCompatActivity {

    private ImageButton mbackbtn;

    private Button mLecheFlanbtn;
    private Button mFruitSaladbtn;
    private Button mUbePutobtn;
    private Button mMangoGrahambtn;
    private Button mMajaBlancabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        mbackbtn = findViewById(R.id.backbtn);

        mLecheFlanbtn = findViewById(R.id.lecheflanbtn);
        mFruitSaladbtn = findViewById(R.id.fruitsaladbtn);
        mUbePutobtn = findViewById(R.id.ubeputobtn);
        mMangoGrahambtn = findViewById(R.id.mangograhambtn);
        mMajaBlancabtn = findViewById(R.id.majablancabtn);

        mbackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });

        mLecheFlanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),LecheFlan.class));
            }
        });

        mFruitSaladbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FruitSalad.class));
            }
        });

        mUbePutobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),UbePuto.class));
            }
        });

        mMangoGrahambtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MangoGraham.class));
            }
        });

        mMajaBlancabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MajaBlanca.class));
            }
        });
    }
}