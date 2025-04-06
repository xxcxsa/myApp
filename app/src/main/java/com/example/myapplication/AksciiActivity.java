package com.example.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AksciiActivity extends AppCompatActivity {

    ImageView bitcoin_coin, doge_coin, eth_coin, tether_coin, lite_coin, tron_coin, user_icon, logOut, akcii, news, convertValutes;
    TextView text_bitcoin, text_doge_coin, text_eth_coin, text_teth_coin, text_lite_coin, text_tron_coin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_akscii);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bitcoin_coin = findViewById(R.id.bitcoin_coin);
        text_bitcoin = findViewById(R.id.text_bitcoin);
        user_icon = findViewById(R.id.user_icon);
        logOut = findViewById(R.id.logOut);
        akcii = findViewById(R.id.akcii);
        news = findViewById(R.id.news);
        convertValutes = findViewById(R.id.convertValutes);
        doge_coin = findViewById(R.id.doge_coin);
        eth_coin = findViewById(R.id.eth_coin);
        tether_coin = findViewById(R.id.tether_coin);
        lite_coin = findViewById(R.id.lite_coin);
        tron_coin = findViewById(R.id.tron_coin);
        text_doge_coin = findViewById(R.id.text_doge_coin);
        text_eth_coin = findViewById(R.id.text_eth_coin);
        text_teth_coin = findViewById(R.id.text_teth_coin);
        text_lite_coin = findViewById(R.id.text_lite_coin);
        text_tron_coin = findViewById(R.id.text_tron_coin);

        user_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        akcii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, AksciiActivity.class);
                startActivity(intent);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, newsActivity.class);
                startActivity(intent);
            }
        });

        convertValutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, convertorActivity.class);
                startActivity(intent);
            }
        });


        bitcoin_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, bitcoinActivity.class);
                startActivity(intent);
            }
        });

        text_bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, bitcoinActivity.class);
                startActivity(intent);
            }
        });

        doge_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, dogeActivity.class);
                startActivity(intent);
            }
        });

        text_doge_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, dogeActivity.class);
                startActivity(intent);
            }
        });

        eth_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, ethActivity.class);
                startActivity(intent);
            }
        });

        text_eth_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, ethActivity.class);
                startActivity(intent);
            }
        });

        tether_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, tetherActivity.class);
                startActivity(intent);
            }
        });

        text_teth_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, tetherActivity.class);
                startActivity(intent);
            }
        });

        lite_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, liteActivity.class);
                startActivity(intent);
            }
        });

        text_lite_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, liteActivity.class);
                startActivity(intent);
            }
        });

        tron_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, tronActivity.class);
                startActivity(intent);
            }
        });

        text_tron_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AksciiActivity.this, tronActivity.class);
                startActivity(intent);
            }
        });
    }
}