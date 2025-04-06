package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class liteActivity extends AppCompatActivity {

    ImageView user_icon, news, akcii, logOut, convertValutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lite);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        user_icon = findViewById(R.id.user_icon);
        news = findViewById(R.id.news);
        akcii = findViewById(R.id.akcii);
        logOut = findViewById(R.id.logOut);
        convertValutes = findViewById(R.id.convertValutes);

        WebView browser=findViewById(R.id.webBrowser);
        browser.loadUrl("https://www.bybit.com/ru-RU/coin-price/litecoin/");

        convertValutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(liteActivity.this, convertorActivity.class);
                startActivity(intent);
            }
        });

        user_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(liteActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(liteActivity.this, newsActivity.class);
                startActivity(intent);
            }
        });
        akcii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(liteActivity.this, AksciiActivity.class);
                startActivity(intent);
            }
        });
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(liteActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}