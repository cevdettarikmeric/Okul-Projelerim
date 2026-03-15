package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    TextView t1;
    EditText et1;
    ArrayList<String> isimlitesi=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        t1=findViewById(R.id.t1);
        et1=findViewById(R.id.et1);
        isimlitesi.add("Alper");
        isimlitesi.add("Cevdet");
        isimlitesi.add("Melih");
        isimlitesi.add("Kaan");
        listele();
        b1.setOnClickListener(v -> {
            isimlitesi.add(et1.getText().toString());
            listele();
        });
        b2.setOnClickListener(v -> {
            isimlitesi.remove(et1.getText().toString());
            listele();
        });
        b3.setOnClickListener(v -> {
            boolean bul=isimlitesi.contains(et1.getText().toString());
            if (bul==true)
                Toast.makeText(this, "Eleman Var", Toast.LENGTH_SHORT).show();
            else
                Toast.makeText(this, "Eleman Yok", Toast.LENGTH_SHORT).show();

        });
    }
    void listele(){
        t1.setText("Elemanlar");
        for (int i=0;i<isimlitesi.size();i++){
            t1.append("\n"+isimlitesi.get(i));
        }
    }
}