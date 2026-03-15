package com.example.radioalan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText et1,et2;
    TextView t1;
    RadioButton r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        t1=findViewById(R.id.t1);
        r1=findViewById(R.id.r1);
        r2=findViewById(R.id.r2);
        r3=findViewById(R.id.r3);
        r4=findViewById(R.id.r4);
        b1.setOnClickListener(view -> {
            int s1=Integer.parseInt(et1.getText().toString());
            int s2=Integer.parseInt(et2.getText().toString());
            int a=s1*s2;
            int c=(s1+s2)*2;
            if (r3.isChecked()==true){
                if (s1==s2)
                t1.setText("Geometrik Şekil : Kare");
                else
                t1.setText("Geometrik Şekil : Dikdörtgen");
            }
            else if (r1.isChecked()==true)
                t1.setText("Alan :"+a);
            else if (r2.isChecked()==true)
                t1.setText("Çevre :"+c);
            else if (r4.isChecked()==true){
                if (s1==s2)
                    t1.setText("Geometrik Şekil : Kare"+"\n"+"Çevre :"+c+"\n"+"Alan :"+a+ "\n");
                else
                    t1.setText("Geometrik Şekil : Dikdörtgen"+"\n"+"Çevre :"+c+"\n"+"Alan :"+a+ "\n");
            }
        });
    }
}