package me.mostasim.a101cproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class viewFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_five);
        WebView wv= (WebView)findViewById(R.id.wvFive);
        wv.loadUrl("file:///android_asset/view5.html");
    }
}
