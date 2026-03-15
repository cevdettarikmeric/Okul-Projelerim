package com.example.hesapmakinesiv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText et1,et2;
    CheckBox t,ci,b,c;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=findViewById(R.id.topla);
        ci=findViewById(R.id.cikart);
        b=findViewById(R.id.bol);
        c=findViewById(R.id.carp);
        t1=findViewById(R.id.sonuc);
        b1=findViewById(R.id.b1);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        b1.setOnClickListener(view -> {
            t1.setText("Sonuc : 0");
            int s1=Integer.parseInt(et1.getText().toString());
            int s2=Integer.parseInt(et2.getText().toString());
            if (t.isChecked()==true){
                int s=s1+s2;
                t1.setText("Sonuc : "+s);
            }
            else if (ci.isChecked()==true){
                int s=s1-s2;
                t1.setText("Sonuc : "+s);
            }
            else if (b.isChecked()==true){
                int s=s1/s2;
                t1.setText("Sonuc : "+s);
            }
            else if (c.isChecked()==true){
                int s=s1*s2;
                t1.setText("Sonuc : "+s);
            }
        });
    }
}