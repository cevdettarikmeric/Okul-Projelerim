package com.example.uyg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText et1;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        et1=findViewById(R.id.et1);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        b1.setOnClickListener(v -> {
            int s=Integer.parseInt(et1.getText().toString());
            if (99 < s && s <1000){
                int y=s/100;
                int o=(s-y*100)/10;
                int i=s%10;
                t1.setText("Yüzler Basamağı : "+y);
                t2.setText("Onlar Basamağı : "+o);
                t3.setText("Birler Basamağı : "+i);
            }
            else
                Toast.makeText(getApplicationContext(),"3 Basamaklı Bir Sayı Giriniz",Toast.LENGTH_LONG).show();
        });
    }
}