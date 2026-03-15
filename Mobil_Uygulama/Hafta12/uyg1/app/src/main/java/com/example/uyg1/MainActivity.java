package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        b1.setOnClickListener(view -> {
            int s1=Integer.parseInt(et1.getText().toString());
            int s2=Integer.parseInt(et2.getText().toString());
            int sonuc=topla(s1,s2);
            t1.setText("Toplam : "+sonuc);
            t1.append("\nÇarpımı : "+carp(s1,s2));
            t1.append("\nFarkı : "+eksi(s1,s2));
            bolme(s1,s2);
            t1.append("\nPozitif Fark : "+pozitifark(s1,s2));
        });
    }
    int topla(int a,int b){
        int toplam=a+b;
        return toplam;
    }
    int carp(int a,int b){
        return a*b;
    }
    int eksi(int a,int b){
        return a-b;
    }
    void bolme(int a,int b){
            double sonuc=(double)a/b;
        Toast.makeText(this, "Bölmenin Sonucu : "+sonuc , Toast.LENGTH_SHORT).show();
    }
    int pozitifark (int a,int b){
        if (a>b)
            return a-b;
        else
            return b-a;
    }
}