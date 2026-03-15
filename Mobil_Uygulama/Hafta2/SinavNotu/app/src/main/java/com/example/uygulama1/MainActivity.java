package com.example.uygulama1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
TextView ort,gecme;
EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        ort=findViewById(R.id.ort);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        gecme=findViewById(R.id.gecme);
        b1.setOnClickListener(view -> {
            int s1=Integer.parseInt(et1.getText().toString());
            int s2=Integer.parseInt(et2.getText().toString());
            double s=(s1+s2)/2.0;
            ort.setText("Ortalama : "+s);
            if (s1>100){
                Toast.makeText(getApplicationContext(),"100'den aşşağı bir sayı giriniz",Toast.LENGTH_LONG).show();
            }
            else if (s1<0){
                Toast.makeText(getApplicationContext(),"0'dan aşşağı bir sayı giriniz",Toast.LENGTH_LONG).show();
            }
            else if (s2>100){
                Toast.makeText(getApplicationContext(),"100'den aşşağı bir sayı giriniz",Toast.LENGTH_LONG).show();
            }
            else if (s2<0){
                Toast.makeText(getApplicationContext(),"0'dan aşşağı bir sayı giriniz",Toast.LENGTH_LONG).show();
            }
            else if (s>=50){
                gecme.setText("Geçti");
            }
            else if (s<50){
                gecme.setText("Kaldı");
            }
        });

    }
}