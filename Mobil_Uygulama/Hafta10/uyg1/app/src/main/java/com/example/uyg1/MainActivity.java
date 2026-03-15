package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    Switch s1;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        s1=findViewById(R.id.s1);
        i1=findViewById(R.id.i1);
        i1.setImageResource(R.drawable.resim3);
        b1.setOnClickListener(v -> {
            i1.setImageResource(R.drawable.resim4);
        });
        b2.setOnClickListener(v -> {
            i1.setImageResource(R.drawable.resim2);
        } );
        s1.setOnClickListener(v -> {
            if (s1.isChecked()==true)
                i1.setVisibility(View.INVISIBLE);
            else
                i1.setVisibility(View.VISIBLE);
        });
    }
}