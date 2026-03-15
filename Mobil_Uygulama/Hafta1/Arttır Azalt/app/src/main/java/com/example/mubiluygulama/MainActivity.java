package com.example.mubiluygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button arttir,azalt;
    TextView sayac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arttir=findViewById(R.id.arttir);
        azalt=findViewById(R.id.azalt);
        sayac=findViewById(R.id.sayac);
        arttir.setOnClickListener(v -> {
            int s;
            s=Integer.parseInt(sayac.getText().toString());
            s++;
            sayac.setText(String.valueOf(s));
        });
        azalt.setOnClickListener(v -> {
            int s;
            s=Integer.parseInt(sayac.getText().toString());
            s--;
            sayac.setText(String.valueOf(s));
        });
    }

}