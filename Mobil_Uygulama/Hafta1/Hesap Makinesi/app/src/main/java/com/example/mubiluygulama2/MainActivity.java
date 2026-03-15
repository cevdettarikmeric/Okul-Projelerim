package com.example.mubiluygulama2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.IntArrayEvaluator;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView sonuc;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        sonuc=findViewById(R.id.sonuc);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        b1.setOnClickListener(v -> {
            int s1= Integer.parseInt(et1.getText().toString());
            int s2= Integer.parseInt(et2.getText().toString());
            int s=s1+s2;
            sonuc.setText("Sonuç : "+s);
        });
        b2.setOnClickListener(v -> {
            int s1= Integer.parseInt(et1.getText().toString());
            int s2= Integer.parseInt(et2.getText().toString());
            int s=s1-s2;
            sonuc.setText("Sonuç : "+s);
        });
        b3.setOnClickListener(v -> {
            int s1= Integer.parseInt(et1.getText().toString());
            int s2= Integer.parseInt(et2.getText().toString());
            int s=s1*s2;
            sonuc.setText("Sonuç : "+s);
        });
        b4.setOnClickListener(v -> {
            int s1= Integer.parseInt(et1.getText().toString());
            int s2= Integer.parseInt(et2.getText().toString());
            int s=s1/s2;
            sonuc.setText("Sonuç : "+s);
        });
    }
}