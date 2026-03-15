package com.example.forrnek;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3;

    TextView tvSonuc;

    EditText et1, et2, et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1.setOnClickListener(R.id.b1);
        b2.setOnClickListener(R.id.b2);
        b3.setOnClickListener(R.id.b3);
        tvSonuc.setOnClickListener(R.id.tvSonuc);
        et1.setOnClickListener(R.id.et1);
        et2.setOnClickListener(R.id.et2);
        et3.setOnClickListener(R.id.et3);


        b1.setOnClickListener(v ->
        {
            tvSonuc.setText(("1"));
            int a = Integer.parseInt(et1.getText().toString());
            int b = Integer.parseInt(et2.getText().toString());
            for(int i = a; i<=b; i++)
            {
                tvSonuc.append(i+"\n");
            }
        });
        b2.setOnClickListener(v ->
            {
                tvSonuc.setText("1");
                int b=Integer.parseInt(et2.getText().toString());
                int i=1;
                while(i<=b)
                {
                    tvSonuc.append(i+"\n");
                    i=i+2;
                }
            }
        );
        b3.setOnClickListener(v ->
        {
            tvSonuc.setText("1");
            int b=Integer.parseInt(et2.getText().toString());
            int c=Integer.parseInt(et3.getText().toString());
            int  i=c;
            do
            {
                tvSonuc.append(i+"\n");
                i=i-c;
            }
            while(i<=b);
        }
        );
    }
}