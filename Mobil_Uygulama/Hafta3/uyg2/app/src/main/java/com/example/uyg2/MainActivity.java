package com.example.uyg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
Button b1;
CheckBox cb1,cb2;
EditText t1;
Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        t1=findViewById(R.id.t1);
        sw=findViewById(R.id.sw);
        b1.setOnClickListener(view -> {
           t1.setText("Nesnelerin Durumu:");
           if (cb1.isChecked()==true)
               t1.setText(t1.getText()+"\n cb1 seçili");
           else
               t1.setText(t1.getText()+"\n cb1 seçili değil");
            if (cb2.isChecked()==true)
                t1.setText(t1.getText()+"\n cb2 seçili");
            else
                t1.setText(t1.getText()+"\n cb2 seçili değil");
            if (sw.isChecked()==true)
                t1.setText(t1.getText()+"\n Switch1 seçili");
            else
                t1.setText(t1.getText()+"\n Switch1 seçili değil");
        });
    }
}