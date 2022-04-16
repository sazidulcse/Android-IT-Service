package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity3 extends AppCompatActivity {
WebView mwebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web3);
        mwebview = findViewById(R.id.mwebview);
        mwebview.getSettings().setJavaScriptEnabled(true);
        mwebview.loadUrl("https://sazidulcse.github.io/sazid.com/");


    }
}