package com.example.uyg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    EditText et1,et2,et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        b1.setOnClickListener(v -> {
            int a=Integer.parseInt(et1.getText().toString());
            int b=Integer.parseInt(et2.getText().toString());
            int c=Integer.parseInt(et3.getText().toString());
            t1.setText(faktoryel(a));
            t1.append("\n"+faktoryel(b));
            t1.append("\n"+faktoryel(c));
            double sonuc4=(faktoryel(a)+faktoryel(b))/(double)faktoryel(c);
            t1.append("\n"+sonuc4);
            t1.append("\n"+faktoryel(a+b));
            t1.append("\n"+faktoryel(a+b+c));
        });
    }
    int faktoryel (int a){
        if (a<1)
            a=1;
        int f=1;
        for (int i=2;i<=a;i++)
            f*=i;
        return f;
    }
}