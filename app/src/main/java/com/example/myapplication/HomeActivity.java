package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    TextView welcome;
    DatabaseHelper databaseHelper;
    ImageView logOut;
    ImageView user_icon, news;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        welcome = findViewById(R.id.welcome);
        user_icon = findViewById(R.id.user_icon);
        news = findViewById(R.id.news);
        logOut = findViewById(R.id.logOut);
        databaseHelper = new DatabaseHelper(this);
        String user = getIntent().getStringExtra("USERNAME");
        String money = getIntent().getStringExtra("MONEY");

        welcome.setText("Добро Пожаловать, " + user);

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LogOut();
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                News();
            }
        });







    }
    public void LogOut(){
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void News(){
        Intent intent = new Intent(HomeActivity.this, newsActivity.class);
        startActivity(intent);

    }

}