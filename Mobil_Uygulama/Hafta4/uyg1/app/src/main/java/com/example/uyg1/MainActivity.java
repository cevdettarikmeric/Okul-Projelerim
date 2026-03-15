package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button arti,eksi,m,k;
    TextView sayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arti=findViewById(R.id.arti);
        eksi=findViewById(R.id.eksi);
        m=findViewById(R.id.mavi);
        k=findViewById(R.id.k);
        sayi=findViewById(R.id.sayi);
        arti.setOnClickListener(v -> {
            int s=Integer.parseInt(sayi.getText().toString());
            int sonic=s+1;
            sayi.setText(""+sonic);
            if (sonic > 15){
                sayi.setText("15");
                Toast.makeText(getApplicationContext(),"SAYI -5 İLE 15 ARASINDA OLMALIDIR",Toast.LENGTH_LONG).show();
            }
        });
        eksi.setOnClickListener(v -> {
            int s=Integer.parseInt(sayi.getText().toString());
            int sonic=s-1;
            sayi.setText(""+sonic);
            if (sonic < (-5)){
                sayi.setText("-5");
                Toast.makeText(getApplicationContext(),"SAYI -5 İLE 15 ARASINDA OLMALIDIR",Toast.LENGTH_LONG).show();
            }
        });
        m.setOnClickListener(v -> {
            sayi.setTextColor(Color.BLUE);
        });
        k.setOnClickListener(v -> {
            sayi.setTextColor(Color.RED);
        });
    }
}