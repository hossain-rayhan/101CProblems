package com.appsfacto.hundred_one_c_problems;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class viewFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_four);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#75a31a")));
        getSupportActionBar().setTitle("Apply your conditions");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView wv= (WebView)findViewById(R.id.wvFour);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("file:///android_asset/Chapter4.html");
    }
}
