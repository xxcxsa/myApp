package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    TextView signupText;
    Button loginButton;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        username = findViewById(R.id.userNameText);
        password = findViewById(R.id.passwordText);
        loginButton = findViewById(R.id.loginButton);
        signupText = findViewById(R.id.textSignup);
        databaseHelper = new DatabaseHelper(this );

        signupText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String user = username.getText().toString().trim();
                    String pass = password.getText().toString().trim();
                    if (user.isEmpty() || pass.isEmpty()){
                        Toast.makeText(MainActivity.this, "Пожалуйста введите логин и пароль ", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        String loggedInUserName = databaseHelper.checkLogin(user,pass);
                        if(loggedInUserName!=null){
                            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                            intent.putExtra("USERNAME", loggedInUserName);
                            startActivity(intent);
                            finish();
                        } else {
                            Toast.makeText(MainActivity.this, "Неверное имя пользователя или неверно введен пароль", Toast.LENGTH_SHORT).show();
                        }
                    }

            }
        });

    }
}