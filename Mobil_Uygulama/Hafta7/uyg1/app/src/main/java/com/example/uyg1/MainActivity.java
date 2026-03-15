package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(view -> {
            for (int i=1;i<=10;i++)
                t1.append(i+"\n");
        });

        b2.setOnClickListener(view -> {
            int i=1;
            while (i<=10) {
                t1.append(i + "\n");
                i++;
            }
        });

        b3.setOnClickListener(view -> {
            int i=1;
            do {
                t1.append(i + "\n");
                i++;
            }while  (i<=10);
        });
    }
}