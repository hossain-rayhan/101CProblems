package com.appsfacto.hundred_one_c_problems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout chapterOne= (RelativeLayout) findViewById(R.id.chapter1);

        chapterOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch1=new Intent(MainActivity.this,viewOne.class);
                startActivity(ch1);
            }
        });


    }


}
