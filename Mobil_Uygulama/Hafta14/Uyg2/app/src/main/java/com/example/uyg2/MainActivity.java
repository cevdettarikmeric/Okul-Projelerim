package com.example.uyg2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;
    TextView t1;

    String[][] dizi={
            {"10AB","Ali","Veli","Ayse","Mehmet","Zeynep"},
            {"11AB","Can","Ece","Mert","Sude","Kerem"},
            {"12AB","Ahmet","Elif","Burak","Cem","Derya"}
    };

    Random r=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        t1=findViewById(R.id.t1);

        b1.setOnClickListener(v->{
            String s="";
            for(int i=0;i<3;i++){
                for(int j=0;j<6;j++){
                    s+=dizi[i][j]+"\n";
                }
                s+="\n";
            }
            t1.setText(s);
        });

        b2.setOnClickListener(v->{
            String s="";
            for(int i=0;i<3;i++){
                int a=r.nextInt(5)+1;
                s+=dizi[i][0]+" - "+dizi[i][a]+"\n";
            }
            t1.setText(s);
        });

        b3.setOnClickListener(v->{
            int i=r.nextInt(3);
            int j=r.nextInt(5)+1;
            t1.setText(dizi[i][0]+" - "+dizi[i][j]);
        });
    }
}
