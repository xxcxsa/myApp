package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class newsActivity extends AppCompatActivity {

    ImageView user_icon, akcii, convertValutes;
    ImageView n_news;
    ImageView n_logOut;
    ImageView n_valutes;
    ImageView n_transfer;
    ImageView n_akcii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_news);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        user_icon = findViewById(R.id.user_icon);
        akcii = findViewById(R.id.akcii);
        convertValutes = findViewById(R.id.convertValutes);

        user_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsActivity.this, Menu.class);
                startActivity(intent);
            }
        });

        akcii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsActivity.this, AksciiActivity.class);
                startActivity(intent);
            }
        });

        convertValutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(newsActivity.this, Menu.class);
                startActivity(intent);
            }
        });

        WebView browser=findViewById(R.id.webBrowser);
        browser.loadUrl("https://www.rbc.ru/finances/");

        user_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user();
            }
        });
    }
    public void user(){
        Intent intent = new Intent(newsActivity.this, HomeActivity.class);
        startActivity(intent);
    }
}