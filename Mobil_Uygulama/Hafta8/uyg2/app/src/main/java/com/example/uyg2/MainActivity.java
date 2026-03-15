package com.example.uyg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(v -> {
            int a= ThreadLocalRandom.current().nextInt(1,11);

            t1.setText("Üretilen Sayı : "+a);
        });
        b2.setOnClickListener(v -> {
            int a= ThreadLocalRandom.current().nextInt(10,100);

            t1.setText("Üretilen Sayı : "+a);
        });
        b3.setOnClickListener(v -> {
            int a,b,c;
            do {
                a = ThreadLocalRandom.current().nextInt(10, 80);
                b = ThreadLocalRandom.current().nextInt(10, 80);
                c = 180 - (a + b);
            } while (c <= 0 || c >= 90);

                t1.setText("1.Açı : "+a);
                t1.append("\n2.Açı : "+b);
                t1.append("\n3.Açı : "+c);
        });
        b4.setOnClickListener(v -> {
            int a = 90;
            int b = ThreadLocalRandom.current().nextInt(1, 89);
            int c = 90 - b;

            t1.setText("1. Açı : " + a);
            t1.append("\n2. Açı : " + b);
            t1.append("\n3. Açı : " + c);
        });
        b5.setOnClickListener(v -> {
            double a,b,c;
                a = ThreadLocalRandom.current().nextInt(10, 180);
                b = (180-a)/2;
                c = b;

            t1.setText("1. Açı : " + a);
            t1.append("\n2. Açı : " + b);
            t1.append("\n3. Açı : " + c);
        });
        b6.setOnClickListener(v -> {
                int h=ThreadLocalRandom.current().nextInt(1,6);
                if (h==1)
                    t1.setText("Üretilen Harf : " +"A");
                else if (h==2)
                t1.setText("Üretilen Harf : " +"B");
                else if (h==3)
                    t1.setText("Üretilen Harf : " +"C");
                else if (h==4)
                    t1.setText("Üretilen Harf : " +"D");
                else if (h==5)
                    t1.setText("Üretilen Harf : " +"E");
        });
    }
}