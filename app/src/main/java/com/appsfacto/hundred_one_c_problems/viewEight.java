package com.appsfacto.hundred_one_c_problems;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class viewEight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_eight);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#b45847")));
        getSupportActionBar().setTitle("String");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView wv= (WebView)findViewById(R.id.wvEight);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("file:///android_asset/Chapter8.html");
    }
}
