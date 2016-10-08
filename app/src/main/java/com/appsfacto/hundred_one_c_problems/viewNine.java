package com.appsfacto.hundred_one_c_problems;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class viewNine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_nine);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#22478b")));
        getSupportActionBar().setTitle("Pointer complexity");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView wv= (WebView)findViewById(R.id.wvNine);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("file:///android_asset/Chapter9.html");
    }
}
