package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button ekle,sil;
    ListView lvl1;
    EditText et1;
    String[] isimdizisi=new String[]{"Alper","Melih","Cewdet","Mehmet","Murat"};
    ArrayList<String> isimlistesi=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ekle=findViewById(R.id.ekle);
        sil=findViewById(R.id.sil);
        lvl1=findViewById(R.id.lvl1);
        et1=findViewById(R.id.et1);
        isimlistesi.add("Onur"); isimlistesi.add("Efe");isimlistesi.add("kaan");
        ArrayAdapter<String> abc=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,isimlistesi);
        lvl1.setAdapter(abc);
        ekle.setOnClickListener(view -> {
            String isim=et1.getText().toString();
            isimlistesi.add(isim);
            lvl1.setAdapter(abc);
        });
        sil.setOnClickListener(view -> {
            String isim=et1.getText().toString();
            isimlistesi.remove(isim);
            lvl1.setAdapter(abc);
        });
    }
}