package com.example.uyg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button b1;
    CheckBox c1,c2;
    TextView t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        b1=findViewById(R.id.b1);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        b1.setOnClickListener(view -> {
            double s1=Double.parseDouble(et1.getText().toString());
            double s2=Double.parseDouble(et2.getText().toString());
            double s=s1*s2;
            double i=s-((s1*s2)*0.05);
            double k=s+ ((s1*s2)*0.10);
            t1.setText("Normal Tutar : "+s);
            if (c1.isChecked()==true)
                t2.setText("İndirimli Tutar : "+i);
            else
                t2.setText("İndirimli Tutar : "+s);
            if (c2.isChecked()==true&&c1.isChecked()==true){
                double ik=(s-((s1*s2)*0.05))+((s1*s2)*0.10);
                t3.setText("Toplam Tutar : "+ik);
            }
            if (c2.isChecked()==false&&c1.isChecked()==true){
                t3.setText("Toplam Tutar : "+i);
            }
            if (c2.isChecked()==true&&c1.isChecked()==false){
                t3.setText("Toplam Tutar : "+k);
            }
        });
    }
}