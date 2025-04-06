package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class valutesConvertor extends AppCompatActivity {

    ImageView usd_1, euro_1, yuan_1, tenge_1, lira_1, icon_image_1, user_icon, logOut, news, akcii, convertValutes;
    Button convert_btn_1;
    EditText convert_editText_1;
    TextView valutes_text, convert_text_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_valutes_convertor);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        usd_1 = findViewById(R.id.usd_1);
        euro_1 = findViewById(R.id.euro_1);
        yuan_1 = findViewById(R.id.yuan_1);
        lira_1 = findViewById(R.id.lira_1);
        tenge_1 = findViewById(R.id.tenge_1);
        icon_image_1 = findViewById(R.id.icon_image_1);
        valutes_text = findViewById(R.id.valutes_text);

        convert_text_1 = findViewById(R.id.convert_text_1);
        convert_btn_1 = findViewById(R.id.convert_btn_1);
        convert_editText_1 = findViewById(R.id.convert_editText_1);

        user_icon = findViewById(R.id.user_icon);
        logOut = findViewById(R.id.logOut);
        news = findViewById(R.id.news);
        akcii = findViewById(R.id.akcii);
        convertValutes = findViewById(R.id.convertValutes);


        user_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(valutesConvertor.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(valutesConvertor.this, MainActivity.class);
                startActivity(intent);
            }
        });
        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(valutesConvertor.this, newsActivity.class);
                startActivity(intent);
            }
        });

        akcii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(valutesConvertor.this, AksciiActivity.class);
                startActivity(intent);
            }
        });

        convertValutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(valutesConvertor.this, convertorActivity.class);
                startActivity(intent);
            }
        });



        valutes_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(valutesConvertor.this, convertorActivity.class);
                startActivity(intent);
            }
        });


        usd_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usd();
            }
        });
        euro_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Euro();
            }
        });
        yuan_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Yuan();
            }
        });
        lira_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lira();
            }
        });
        tenge_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tenge();
            }
        });



    }

    public void Usd(){
        float a = 84.28f;
        convert_text_1.setText("Цена Доллара: " + a);
        icon_image_1.setImageResource(R.drawable.usd_icon);
        convert_editText_1.setHint("Введите количество Доллара");
        convert_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int values = Integer.parseInt(convert_editText_1.getText().toString());
                float result = values * a;

                convert_text_1.setText("Цена " + values + " Доллара равна: " + result + "Рублей");
            }
        });
    }

    public void Euro (){
        float a = 92.99f;
        convert_text_1.setText("Цена Евро: " + a);
        icon_image_1.setImageResource(R.drawable.euro_icon);
        convert_editText_1.setHint("Введите количество Евро");
        convert_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int values = Integer.parseInt(convert_editText_1.getText().toString());
                float result = values * a;

                convert_text_1.setText("Цена " + values + " Евро равна: " + result + " Рублей");
            }
        });
    }
    public  void Yuan (){
        float a = 11.6f;
        convert_text_1.setText("Цена Юаня: " + a);
        icon_image_1.setImageResource(R.drawable.yuan_icon);
        convert_editText_1.setHint("Введите количество Юаня");
        convert_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int values = Integer.parseInt(convert_editText_1.getText().toString());
                float result = values * a;

                convert_text_1.setText("Цена " + values + " Евро равна: " + result + " Рублей");
            }
        });
    }

    public void Lira(){
        float a = 2.22f;
        convert_text_1.setText("Цена Турецкой Лиры: " + a);
        icon_image_1.setImageResource(R.drawable.lira_icon);
        convert_editText_1.setHint("Введите количетсво Тур.Лиры");
        convert_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int values = Integer.parseInt(convert_editText_1.getText().toString());
                float result = values * a;

                convert_text_1.setText("Цена " + values + " Турецких лир равна: " + result + " Рублей");
            }
        });
    }

    public  void Tenge(){
        float a = 0.17f;
        convert_text_1.setText("Цена Тенге: " + a);
        icon_image_1.setImageResource(R.drawable.renge_icon);
        convert_editText_1.setHint("Введите количество Тенге");
        convert_btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int values = Integer.parseInt(convert_editText_1.getText().toString());
                float result = values * a;

                convert_text_1.setText("Цена " + values + " Тенге равна: " + result + " Рублей" );
            }
        });
    }
}