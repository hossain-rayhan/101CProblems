package com.appsfacto.hundred_one_c_problems;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class viewThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_three);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#a05000")));
        getSupportActionBar().setTitle("User input");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView wv= (WebView)findViewById(R.id.wvThree);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("file:///android_asset/Chapter3.html");
    }
}
