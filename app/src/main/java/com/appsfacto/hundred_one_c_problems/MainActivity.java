package com.appsfacto.hundred_one_c_problems;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import  android.app.ActionBar;
import android.graphics.drawable.ColorDrawable;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set ActionBar color
        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(Color.parseColor("#E6006666")));
        //Chapter No TextView
        TextView tv1= (TextView) findViewById(R.id.tv1);
        TextView tv2= (TextView) findViewById(R.id.tv2);
        TextView tv3= (TextView) findViewById(R.id.tv3);
        TextView tv4= (TextView) findViewById(R.id.tv4);
        TextView tv5= (TextView) findViewById(R.id.tv5);
        TextView tv6= (TextView) findViewById(R.id.tv6);
        TextView tv7= (TextView) findViewById(R.id.tv7);
        TextView tv8= (TextView) findViewById(R.id.tv8);
        TextView tv9= (TextView) findViewById(R.id.tv9);
        TextView tv10= (TextView) findViewById(R.id.tv10);
        TextView tv11= (TextView) findViewById(R.id.tv11);
        TextView tv12= (TextView) findViewById(R.id.tv12);
        //Change color dynamically for chapter shape background
        GradientDrawable bg1Shape= (GradientDrawable) tv1.getBackground();
        bg1Shape.setColor(Color.parseColor("#8C006666"));
        GradientDrawable bg2Shape= (GradientDrawable) tv2.getBackground();
        bg2Shape.setColor(Color.parseColor("#8C470c82"));
        GradientDrawable bg3Shape= (GradientDrawable) tv3.getBackground();
        bg3Shape.setColor(Color.parseColor("#8Ca05000"));
        GradientDrawable bg4Shape= (GradientDrawable) tv4.getBackground();
        bg4Shape.setColor(Color.parseColor("#8C75a31a"));
        GradientDrawable bg5Shape= (GradientDrawable) tv5.getBackground();
        bg5Shape.setColor(Color.parseColor("#8C0d2e04"));
        GradientDrawable bg6Shape= (GradientDrawable) tv6.getBackground();
        bg6Shape.setColor(Color.parseColor("#8C1f463b"));
        GradientDrawable bg7Shape= (GradientDrawable) tv7.getBackground();
        bg7Shape.setColor(Color.parseColor("#8C4ba745"));
        GradientDrawable bg8Shape= (GradientDrawable) tv8.getBackground();
        bg8Shape.setColor(Color.parseColor("#8Cb45847"));
        GradientDrawable bg9Shape= (GradientDrawable) tv9.getBackground();
        bg9Shape.setColor(Color.parseColor("#8C22478b"));
        GradientDrawable bg10Shape= (GradientDrawable) tv10.getBackground();
        bg10Shape.setColor(Color.parseColor("#8C683333"));
        GradientDrawable bg11Shape= (GradientDrawable) tv11.getBackground();
        bg11Shape.setColor(Color.parseColor("#8C855705"));
        GradientDrawable bg12Shape= (GradientDrawable) tv12.getBackground();
        bg12Shape.setColor(Color.parseColor("#8C3f3b3b"));

        //Initialize layouts
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

        //Click option for chapters

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
