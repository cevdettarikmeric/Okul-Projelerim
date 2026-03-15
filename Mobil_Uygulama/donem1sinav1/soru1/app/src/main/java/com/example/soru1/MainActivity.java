package com.example.soru1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText et1,et2,ort;
    TextView topla,carp,cik,bol,t1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        ort=findViewById(R.id.ort);
        topla=findViewById(R.id.topla);
        cik=findViewById(R.id.cik);
        carp=findViewById(R.id.carp);
        bol=findViewById(R.id.bol);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(v -> {
            int s=Integer.parseInt(ort.getText().toString());
            if (s>100)
                t1.setText("Hata! Ortalama 100'den büyük...");
                else if (s<0)
                t1.setText("Hata! Ortalama negatif...");
            else
                t1.setText("Ortalamayı Doğru Girdiniz...");
        });
        b2.setOnClickListener(v -> {
            double s1=Double.parseDouble(et1.getText().toString());
            double s2=Double.parseDouble(et2.getText().toString());
            double st=s1+s2;
            double se=s1-s2;
            double sc=s1*s2;
            double sb=s1/s2;
            topla.setText(s1+"+"+s2+"="+st);
            cik.setText(s1+"-"+s2+"="+se);
            carp.setText(s1+"x"+s2+"="+sc);
            bol.setText(s1+"/"+s2+"="+sb);
        });
    }
}