package com.example.mubiluygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ede,mat,fiz;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        ede=findViewById(R.id.ede);
        mat=findViewById(R.id.mat);
        fiz=findViewById(R.id.fiz);
        t1=findViewById(R.id.t1);
        b1.setOnClickListener(v -> {
            t1.setText("Zayıf Dersler:");
           int e=Integer.parseInt(ede.getText().toString());
           int m=Integer.parseInt(mat.getText().toString());
           int f=Integer.parseInt(fiz.getText().toString());
           if (e<50){
               t1.setText(t1.getText() +"\n Edebiyat ");
           }
            if (m<50){
                t1.setText(t1.getText() +"\n Matematik ");
            }
            if (f<50){
                t1.setText(t1.getText() +"\n Fizik ");
            }
            else if (e>50 && m>50 && f>50)
                t1.setText(t1.getText()+"\n Yok ");
        });
    }
}