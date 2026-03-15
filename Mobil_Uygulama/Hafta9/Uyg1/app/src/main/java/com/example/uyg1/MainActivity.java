package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1,t2,t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        b1.setOnClickListener(view -> {
            int a= ThreadLocalRandom.current().nextInt(1,7);
            int b= ThreadLocalRandom.current().nextInt(1,7);
            int c= ThreadLocalRandom.current().nextInt(1,7);
            int d= ThreadLocalRandom.current().nextInt(1,7);
            int o1=a+b;
            int o2=c+d;
            t1.setText(a+" , "+b);
            t2.setText(c+" , "+d);
            if (o1>o2){
                t3.setText("Kazanan Oyuncu : Oyuncu 1");
            }
            else if (o1<o2){
                t3.setText("Kazanan Oyuncu : Oyuncu 2");
            }
            else {
                t3.setText("Kazanan Oyuncu : Berabere");
            }
        });
    }

}