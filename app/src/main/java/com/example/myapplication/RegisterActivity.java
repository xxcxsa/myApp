package com.example.myapplication;

import android.content.ContentValues;
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

public class RegisterActivity extends AppCompatActivity {

    EditText username, password;
    TextView loginText;
    Button signupButton;
    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        username = findViewById(R.id.userNameText);
        password = findViewById(R.id.passwordText);
        signupButton = findViewById(R.id.signupButton);
        loginText = findViewById(R.id.textLogin);
        databaseHelper = new DatabaseHelper(this );


        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString().trim();
                String pass = password.getText().toString().trim();
                if (user.isEmpty() || pass.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Пожалуйста введите логин и пароль ", Toast.LENGTH_SHORT).show();
                }
                else {
                    if (databaseHelper.insertData(user, pass)){
                        Toast.makeText(RegisterActivity.this, "Регистрация прошла успешно!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterActivity.this, HomeActivity.class);
                        intent.putExtra("USERNAME", user);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(RegisterActivity.this, "Аккаунт с таким пользователем уже существует", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}