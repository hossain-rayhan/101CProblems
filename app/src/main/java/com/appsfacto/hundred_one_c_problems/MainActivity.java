package com.appsfacto.hundred_one_c_problems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import  android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#006666")));
        RelativeLayout chapterOne= (RelativeLayout) findViewById(R.id.chapter1);
        RelativeLayout chapterTwo= (RelativeLayout) findViewById(R.id.chapter2);
        RelativeLayout chapterThree= (RelativeLayout) findViewById(R.id.chapter3);
        RelativeLayout chapterFour= (RelativeLayout) findViewById(R.id.chapter4);
        RelativeLayout chapterFive= (RelativeLayout) findViewById(R.id.chapter5);
        RelativeLayout chapterSix= (RelativeLayout) findViewById(R.id.chapter6);
        RelativeLayout chapterSeven= (RelativeLayout) findViewById(R.id.chapter7);
        RelativeLayout chapterEight= (RelativeLayout) findViewById(R.id.chapter8);
        RelativeLayout chapterNine= (RelativeLayout) findViewById(R.id.chapter9);
        RelativeLayout chapterTen= (RelativeLayout) findViewById(R.id.chapter10);
        RelativeLayout chapterEleven= (RelativeLayout) findViewById(R.id.chapter11);
        RelativeLayout chapterTwelve= (RelativeLayout) findViewById(R.id.chapter12);

        chapterOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch1=new Intent(MainActivity.this,viewOne.class);
                startActivity(ch1);
            }
        });
        chapterTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch2=new Intent(MainActivity.this,viewTwo.class);
                startActivity(ch2);
            }
        });
        chapterThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch3=new Intent(MainActivity.this,viewThree.class);
                startActivity(ch3);
            }
        });
        chapterFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch4=new Intent(MainActivity.this,viewFour.class);
                startActivity(ch4);
            }
        });
        chapterFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch5=new Intent(MainActivity.this,viewFive.class);
                startActivity(ch5);
            }
        });
        chapterSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch6=new Intent(MainActivity.this,viewSix.class);
                startActivity(ch6);
            }
        });
        chapterSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch7=new Intent(MainActivity.this,viewSeven.class);
                startActivity(ch7);
            }
        });
        chapterEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch8=new Intent(MainActivity.this,viewEight.class);
                startActivity(ch8);
            }
        });
        chapterNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch9=new Intent(MainActivity.this,viewNine.class);
                startActivity(ch9);
            }
        });
        chapterTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch10=new Intent(MainActivity.this,viewTen.class);
                startActivity(ch10);
            }
        });
        chapterEleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch11=new Intent(MainActivity.this,viewEleven.class);
                startActivity(ch11);
            }
        });
        chapterTwelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch12=new Intent(MainActivity.this,viewTwelve.class);
                startActivity(ch12);
            }
        });

    }


}
