package com.example.uyg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    EditText et1;
    TextView t1,t2;
    ArrayList<String> urunler=new ArrayList();
    ArrayList<Float> fiyatlar=new ArrayList<Float>();
    int sayac=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        et1=findViewById(R.id.et1);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        urunler.add("Kalem");urunler.add("Silgi");urunler.add("Kalem Kutu");urunler.add("Pergel");urunler.add("Defter");urunler.add("0.9 Uç");
        urunler.add("0.7 Uç");urunler.add("0.5 Uç");urunler.add("Tebeşir");urunler.add("62GB USB");urunler.add("32GB USB");urunler.add("16GB USB");
        listele();
        b2.setEnabled(false);
        b3.setEnabled(false);
        t1.setText(urunler.get(sayac));
        b1.setOnClickListener(v -> {
            float fiyat=Float.parseFloat(et1.getText().toString());
            fiyatlar.add(fiyat);
            listele();
            sayac++;
            if (sayac==10){
                b1.setEnabled(false);
                b2.setEnabled(true);
                b3.setEnabled(true);
            }
            else
                t1.setText(urunler.get(sayac));
        });
        b3.setOnClickListener(v -> {
            float ef=fiyatlar.get(0);
            String ep=urunler.get(0);
            for (int i=1;i<fiyatlar.size();i++){
                if (fiyatlar.get(i)>ef){
                    ef=fiyatlar.get(i);
                    ep=urunler.get(i);
                }
            }
            Toast.makeText(this, "En Pahalı Ürün :"+ep, Toast.LENGTH_SHORT).show();
        });

    }
    void listele(){
        t2.setText("Ürün Listele");
        for (int i=0;i<= urunler.size();i++){
            t2.append("\n"+ urunler.get(i));
            if (i<fiyatlar.size())
                t2.append(" "+fiyatlar.get(i));
        }
    }
}