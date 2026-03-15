package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1,t2;
    RadioButton r1,r2,r3;

    int bk = 100;
    int os = 0, es = 0, ts = 0;
    int tt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);

        t1.setText("Boş koltuk sayısı: " + bk);

        b1.setOnClickListener(view ->  {

                if (bk > 0) {

                    if (r1.isChecked()) {
                        os++;
                        tt += 10;
                    }
                    else if (r2.isChecked()) {
                        es++;
                        tt += 15;
                    }
                    else if (r3.isChecked()) {
                        ts++;
                        tt += 20;
                    }
                    bk--;
                    t1.setText("Boş koltuk sayısı: " + bk);
                }
                t2.setText("Öğrenci: " + os + " Adet => " + (os * 10) + " TL\n"+
                           "Emekli: " + es + " Adet => " + (es * 15) + " TL\n"+
                           "Tam: " + ts + " Adet => " + (ts * 20) + " TL\n"+
                           "Toplam: " + (os + es + ts) + " Adet => " + tt + " TL");
            });
    }
}
