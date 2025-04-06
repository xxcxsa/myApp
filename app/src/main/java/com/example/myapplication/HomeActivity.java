package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    TextView welcome;
    DatabaseHelper databaseHelper;
    ImageView logOut;
    ImageView user_icon, news, akcii, convertValutes, card;
    SQLiteDatabase db;
    Cursor userCursor;
    SimpleCursorAdapter userAdapter;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        welcome = findViewById(R.id.welcome);
        user_icon = findViewById(R.id.user_icon);
        news = findViewById(R.id.news);
        akcii = findViewById(R.id.akcii);
        logOut = findViewById(R.id.logOut);
        card = findViewById(R.id.card);
        convertValutes = findViewById(R.id.convertValutes);
        databaseHelper = new DatabaseHelper(this);






        convertValutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, convertorActivity.class);
                startActivity(intent);
            }
        });





        akcii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, AksciiActivity.class);
                startActivity(intent);
            }
        });



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