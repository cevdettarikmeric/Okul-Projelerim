package com.example.uyg2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3;
    TextView sonuc;
    RadioButton radio1, radio2, radio3, radio4;
    ImageView foto1;

    int sayac = 0;

    int[] resimler = {R.drawable.resim1,R.drawable.resim2,R.drawable.resim3,R.drawable.resim4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        sonuc = findViewById(R.id.sonuc);
        foto1 = findViewById(R.id.foto1);
        radio1 = findViewById(R.id.radio1);
        radio2 = findViewById(R.id.radio2);
        radio3 = findViewById(R.id.radio3);
        radio4 = findViewById(R.id.radio4);

        foto1.setImageResource(resimler[sayac]);
        radio1.setChecked(true);


        b1.setOnClickListener(v -> {
            sayac--;
            if (sayac < 0) sayac = 3;

            foto1.setImageResource(resimler[sayac]);

            if (sayac == 0) radio1.setChecked(true);
            if (sayac == 1) radio2.setChecked(true);
            if (sayac == 2) radio3.setChecked(true);
            if (sayac == 3) radio4.setChecked(true);

            sonuc.setText("Görünen Foto: " + (sayac + 1) + ".Resim");
        });


        b2.setOnClickListener(v -> {
            sayac++;
            if (sayac > 3) sayac = 0;

            foto1.setImageResource(resimler[sayac]);

            if (sayac == 0) radio1.setChecked(true);
            if (sayac == 1) radio2.setChecked(true);
            if (sayac == 2) radio3.setChecked(true);
            if (sayac == 3) radio4.setChecked(true);

            sonuc.setText("Görünen Foto: " + (sayac + 1) + ".Resim");
        });


        b3.setOnClickListener(v -> {
            sayac = ThreadLocalRandom.current().nextInt(4);

            foto1.setImageResource(resimler[sayac]);

            if (sayac == 0) radio1.setChecked(true);
            if (sayac == 1) radio2.setChecked(true);
            if (sayac == 2) radio3.setChecked(true);
            if (sayac == 3) radio4.setChecked(true);

            sonuc.setText("Görünen Foto: " + (sayac + 1) + ".Resim");
        });


        radio1.setOnClickListener(v -> {
            sayac = 0;
            foto1.setImageResource(resimler[sayac]);
            sonuc.setText("Görünen Foto: 1.Resim");
        });

        radio2.setOnClickListener(v -> {
            sayac = 1;
            foto1.setImageResource(resimler[sayac]);
            sonuc.setText("Görünen Foto: 2.Resim");
        });

        radio3.setOnClickListener(v -> {
            sayac = 2;
            foto1.setImageResource(resimler[sayac]);
            sonuc.setText("Görünen Foto: 3.Resim");
        });

        radio4.setOnClickListener(v -> {
            sayac = 3;
            foto1.setImageResource(resimler[sayac]);
            sonuc.setText("Görünen Foto: 4.Resim");
        });
    }
}