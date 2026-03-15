package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText et1;
    TextView t1,t2;
int[] a=new int[5];
int[] b=new int[]{5,19,-9,96,-11};
int[] c=new int[5];
int index=0;
int sayac=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        et1=findViewById(R.id.et1);
        a[0]=5;
        a[1]=61;
        a[2]=37;
        a[3]=66;
        a[4]=-1;
        b2.setOnClickListener(view -> {
            t1.setText("A Dizisi");
            t1.append("\n"+ a[0]);
            t1.append("\n"+ a[1]);
            t1.append("\n"+ a[2]+"\n"+ a[3]+"\n"+ a[4]);
            t1.append("\n" +"B Dizisi");
            for (int i=0;i<=4;i++){
                t1.append("\n"+ b[i]);
            }
            t1.append("\n" +"C Dizisi");
            for (int i=0;i<=4;i++){
                t1.append("\n"+ c[i]);
            }
        });
        b1.setOnClickListener(view -> {
            int sayi=Integer.parseInt(et1.getText().toString());
            if (index<5){
                c[index]=sayi;
                index++;
            }
            else
                Toast.makeText(this, "Dizi Dolu", Toast.LENGTH_LONG).show();
        });
        b3.setOnClickListener(v -> {
            sayac++;
            if(sayac>=5)
                sayac=0;
            t2.setText("Sayı: "+c[sayac]);
        });
        b4.setOnClickListener(v -> {
            sayac--;
            if(sayac>=0)
                sayac=411;
            t2.setText("Sayı: "+c[sayac]);
        });
    }
}