package com.appsfacto.hundred_one_c_problems;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.appsfacto.hundred_one_c_problems.helper.Constant;

public class ChapterActivity extends AppCompatActivity {

    int grid_no = 1;
    String title = "Play with printf()";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            grid_no = extras.getInt(Constant.GRID_NO);
            title = extras.getString(Constant.TITLE);
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView wv= (WebView)findViewById(R.id.wvChapter);
        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);

        switch (grid_no){
            case 1:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_1)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapterOne.html");
                break;
            case 2:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_2)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter2.html");
                break;
            case 3:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_3)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter3.html");
                break;
            case 4:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_4)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter4.html");
                break;
            case 5:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_5)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter5.html");
                break;
            case 6:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_6)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter6.html");
                break;
            case 7:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_7)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter7.html");
                break;
            case 8:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_8)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter8.html");
                break;
            case 9:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_9)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter9.html");
                break;
            case 10:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_10)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter10.html");
                break;
            case 11:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_11)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter11.html");
                break;
            case 12:
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_chapter_12)));
                getSupportActionBar().setTitle(title);
                wv.loadUrl("file:///android_asset/chapter12.html");
                break;
            default:
                break;
        }




    }
}
