package com.example.uyg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    TextView t1,t2;
    EditText et1;
    int sayac = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        et1=findViewById(R.id.et1);
        int sayi= ThreadLocalRandom.current().nextInt(1,101);

        b1.setOnClickListener(v->{
            sayac++;
            int t=Integer.parseInt(et1.getText().toString());
            if (t>sayi){
                t1.setText("girdiğiniz sayı büyük küçültün");

            } else if (t<sayi) {
                t1.setText("tahmininiz küçük büyültün");
            }
            else {
                t1.setText("tebrikler sayıyı buldunuz");
                t2.setText(sayac+" Denemede buldunuz");
            }
        });
        b2.setOnClickListener(v -> {

        });
    }
}