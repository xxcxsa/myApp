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

public class convertorActivity extends AppCompatActivity {
    ImageView bitcoin, eth_coinn, doge_coinn, lite_coinn, tether_coinn, tron_coin, icon_image, user_icon, news, akcii, logOut;
    Button convert_btn;
    EditText convert_editText;
    TextView convert_text, valutes_textt;






        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_convertor);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bitcoin = findViewById(R.id.bitcoin);
        eth_coinn = findViewById(R.id.eth_coinn);
        doge_coinn = findViewById(R.id.doge_coinn);
        lite_coinn = findViewById(R.id.lite_coinn);
        tether_coinn = findViewById(R.id.tether_coinn);
        tron_coin = findViewById(R.id.tron_coinn);
        valutes_textt = findViewById(R.id.valutes_text);
        icon_image = findViewById(R.id.icon_image_1);

        user_icon = findViewById(R.id.user_icon);
        news = findViewById(R.id.news);
        akcii = findViewById(R.id.akcii);
        logOut = findViewById(R.id.logOut);

        convert_btn = findViewById(R.id.convert_btn_1);
        convert_editText = findViewById(R.id.convert_editText_1);
        convert_text = findViewById(R.id.convert_text_1);

        user_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(convertorActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(convertorActivity.this, newsActivity.class);
                startActivity(intent);
            }
        });

        akcii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(convertorActivity.this, newsActivity.class);
                startActivity(intent);
            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(convertorActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        valutes_textt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(convertorActivity.this, valutesConvertor.class);
                startActivity(intent);
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Bit();
            }

        });

        eth_coinn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Eth();
            }
        });

        doge_coinn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Doge();
            }
        });

        lite_coinn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Lite();
            }
        });

        tether_coinn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tether();
            }
        });

        tron_coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tron();
            }
        });



    }

    public void Bit(){
        int a = 83245;
        convert_text.setText("Цена Bitcoin: " + a);
        icon_image.setImageResource(R.drawable.bit_icon);
        convert_editText.setHint("Введите количество Bitcoin");
        convert_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int values = Integer.parseInt(convert_editText.getText().toString());
                int result = values * a;

                convert_text.setText("Цена " + values + " Биткоинов Равна: " + result + "Долларов");
            }
        });

    }

    public void Eth(){
            int a = 1796;
            icon_image.setImageResource(R.drawable.eth_icon);
            convert_text.setText("Цена Etherum: " + a);
            convert_editText.setHint("Введите количество Ethereum");
            convert_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int values = Integer.parseInt(convert_editText.getText().toString());
                    int result = values * a;

                    convert_text.setText("Цена " + values + " Ethereum равна: " + result + " Долларов ");


                }
            });
    }

    public void Doge(){
            float a = 0.17f;
            icon_image.setImageResource(R.drawable.doge_icon);
            convert_text.setText("Цена DOGE: " + a);
            convert_editText.setHint("Введите количество DOGE");
            convert_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int values = Integer.parseInt(convert_editText.getText().toString());
                    float result = values * a;

                    convert_text.setText("Цена " + values + " DOGE равна: " + result + " Долларов ");

                }
            });


    }

    public void Lite(){
            float a = 82.57f;
            icon_image.setImageResource(R.drawable.lite_icon);
            convert_text.setText("Цена LITE: " + a);
            convert_editText.setHint("Введите количество LITE");
            convert_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int values = Integer.parseInt(convert_editText.getText().toString());
                    float result = values * a;

                    convert_text.setText("Цена " + values + " LITE равна " + result + " Долларов");
                }
            });

    }

    public void Tether(){
            int a = 1;
            icon_image.setImageResource(R.drawable.tether_icon);
            convert_text.setText("Цена USDT: " + a);
            convert_editText.setHint("Введите количество USDT");
            convert_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int values = Integer.parseInt(convert_editText.getText().toString());
                    float result = values * a;

                    convert_text.setText("Цена " + values + " USDT равна " + result + " Долларов");
                }
            });

    }

    public  void Tron(){
            float a = 0.24f;
            icon_image.setImageResource(R.drawable.tron_icon);
            convert_text.setText("Цена TRON: " + a);
            convert_editText.setHint("Введите количество TRON");
            convert_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float values = Integer.parseInt(convert_editText.getText().toString());
                    float result = values * a;

                    convert_text.setText("Цена " + values + " TRON равна " + result + " Долларов");
                }
            });
    }


}