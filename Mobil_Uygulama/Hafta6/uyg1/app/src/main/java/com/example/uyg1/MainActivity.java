package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    RadioButton c,j,k,p;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
b1=findViewById(R.id.b1);
c=findViewById(R.id.c);
j=findViewById(R.id.java);
k=findViewById(R.id.kot);
p=findViewById(R.id.py);
t1=findViewById(R.id.t1);
b1.setOnClickListener(view -> {
    if(c.isChecked()==true)
        Toast.makeText(this, "Favori diliniz C# .NET", Toast.LENGTH_LONG).show();
    else if(j.isChecked()==true)
        Toast.makeText(this, "Favori diliniz Java", Toast.LENGTH_LONG).show();
    else if(k.isChecked()==true)
        Toast.makeText(this, "Favori diliniz Kotlin", Toast.LENGTH_LONG).show();
    else if(p.isChecked()==true)
        Toast.makeText(this, "Favori diliniz Python", Toast.LENGTH_LONG).show();
     });
c.setOnClickListener(v -> {
    t1.setText("Seçim Sonucu : C# .NET");
});
        j.setOnClickListener(v -> {
            t1.setText("Seçim Sonucu : Java");
        });
        p.setOnClickListener(v -> {
            t1.setText("Seçim Sonucu : Python");
        });
        k.setOnClickListener(v -> {
            t1.setText("Seçim Sonucu : Kotlin");
        });
    }
}