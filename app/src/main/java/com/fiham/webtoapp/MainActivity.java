package com.fiham.webtoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {


    WebView ytomp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      ytomp = findViewById(R.id.ytomp);

      ytomp.getSettings().setJavaScriptEnabled(true);

      ytomp.loadUrl("https://ytomp4.com");


    }
}