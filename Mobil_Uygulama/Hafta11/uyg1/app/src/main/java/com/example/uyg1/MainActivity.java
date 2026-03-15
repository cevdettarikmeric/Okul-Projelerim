package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView t1, t2, t3, t4;
    EditText et1;
    Button b1, b2;
    int a, b, cevap, puan, ss = 0;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        et1 = findViewById(R.id.et1);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

        b2.setEnabled(false);
        b1.setEnabled(true);

        t1.setText("Soru: 0");

        b1.setOnClickListener(v -> {

            ss++;

            a = r.nextInt(10);
            b = r.nextInt(10);
            int secim = r.nextInt(3);

            if (secim == 0) {
                cevap = a + b;
                t1.setText("Soru " + ss + ": " + a + " + " + b + " = ?");
            }

            if (secim == 1) {
                cevap = a - b;
                t1.setText("Soru " + ss + ": " + a + " - " + b + " = ?");
            }

            if (secim == 2) {
                cevap = a * b;
                t1.setText("Soru " + ss + ": " + a + " x " + b + " = ?");
            }

            b1.setEnabled(false);
            b2.setEnabled(true);
        });

        b2.setOnClickListener(v -> {

            int girilen = Integer.parseInt(et1.getText().toString());

            if (girilen == cevap) {
                puan = puan + 10;
                t4.setText("Puan: " + puan);
                t2.append(t1.getText().toString() + "\n");
            }

            else  {
                puan = puan - 10;
                t4.setText("Puan: " + puan);
                t3.append(t1.getText().toString() + "\n");
            }

            et1.setText("");

            b2.setEnabled(false);
            b1.setEnabled(true);
        });
    }
}
