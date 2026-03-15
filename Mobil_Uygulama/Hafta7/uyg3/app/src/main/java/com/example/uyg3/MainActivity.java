package com.example.uyg3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button b1,b2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        t1=findViewById(R.id.t1);
        int s=Integer.parseInt(et1.getText().toString());

        b1.setOnClickListener(v -> {
            int t=0;
            for (int i=1;i<=s;i++){
                t1.append(i+"\n");
                t=i+t;
            }
            t1.append("Toplam : "+t);
        });

        b2.setOnClickListener(v -> {
            int c=1;
            for (int i=1;i<=s;i++){
                t1.append(i+"\n");
                c=i*c;
            }
            t1.append("Faktoriyeli : "+c);
        });
    }
}