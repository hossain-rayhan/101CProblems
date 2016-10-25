package com.appsfacto.hundred_one_c_problems;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.appsfacto.hundred_one_c_problems.helper.Utilities;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(getResources().getColor(R.color.bg_chapter_1)));
        getSupportActionBar().setTitle("All info You Need!");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tvAppVersion = (TextView) findViewById(R.id.tv_app_name_version);
        StringBuilder stringBuilder = new StringBuilder(tvAppVersion.getText()).append(Utilities.getVersionName(this));
        tvAppVersion.setText(stringBuilder.toString());

        TextView tv_header_app_name = (TextView)findViewById(R.id.tv_app);
        TextView tv_header_rate = (TextView)findViewById(R.id.tv_rate);
        TextView tv_header_plan = (TextView)findViewById(R.id.tv_plan);
        TextView tv_header_contact = (TextView)findViewById(R.id.tv_contact);

        // Font path
        String fontPath = "fonts/comic.ttf";
        // Loading Font Face
        Typeface tf = Typeface.createFromAsset(getAssets(), fontPath);

        tv_header_app_name.setTypeface(tf);
        tv_header_rate.setTypeface(tf);
        tv_header_plan.setTypeface(tf);
        tv_header_contact.setTypeface(tf);
    }
}
