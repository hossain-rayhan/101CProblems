
package com.appsfacto.hundred_one_c_problems;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class viewOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_one);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#006666")));
        getSupportActionBar().setTitle("play with printf()");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        WebView wv= (WebView)findViewById(R.id.wvOne);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wv.loadUrl("file:///android_asset/chapterOne.html");
    }
}
