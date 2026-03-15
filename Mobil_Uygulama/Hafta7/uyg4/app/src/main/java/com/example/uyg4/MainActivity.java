package com.example.uyg4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(v -> {
                int s = Integer.parseInt(et1.getText().toString());
                String sonuc=" ";
                for (int i=1;i<=s;i++) {
                    sonuc +=i+"  " +(i*i)+"  "+(i*i*i)+"\n";
                }
                t1.setText(sonuc);
        });
    }
}