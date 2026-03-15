package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button b1;
 TextView cevre,alan,kk;
 EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        kk=findViewById(R.id.kk);
        cevre=findViewById(R.id.cevre);
        alan=findViewById(R.id.alan);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        b1.setOnClickListener(v -> {
         int s1=Integer.parseInt(et1.getText().toString());
         int s2=Integer.parseInt(et2.getText().toString());
         int c=(s1+s2)*2;
         int a=s1*s2;
        cevre.setText("Çevre : "+c);
        alan.setText("Alan : "+a);
        if (s1<s2){
            kk.setText("Kısa Kenar : "+s1);
        }
        else{
            kk.setText("Kısa Kenar : "+s2);
        }
        });
    }
}