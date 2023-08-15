package com.example.myapplication_xiaobai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
    private WebView mWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mWvMain=(WebView) findViewById(R.id.wv);
        //加载本地HTML
        mWvMain.loadUrl("file:///android_asset/RGB.html");


    }
}
