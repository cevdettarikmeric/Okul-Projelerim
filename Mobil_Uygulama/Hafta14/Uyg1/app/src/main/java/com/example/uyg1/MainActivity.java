package com.example.uyg1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    TextView t4,t5;
    EditText et1;

    String[] isimler={"Camper","Damper","Malper","Kumper"};
    int[] notlar=new int[isimler.length];
    int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        t4=findViewById(R.id.t4);
        t5=findViewById(R.id.t5);
        et1=findViewById(R.id.et1);

        t4.setText("Öğrenci : "+isimler[index]);

        b1.setOnClickListener(v->{
            if(index<isimler.length){
                int not=Integer.parseInt(et1.getText().toString());
                notlar[index]=not;
                index++;
                et1.setText("");
                if(index<isimler.length){
                    t4.setText("Öğrenci : "+isimler[index]);
                }else{
                    t4.setText("Tüm öğrenciler girildi");
                }
            }
        });

        b2.setOnClickListener(v->{
            String s="";
            for(int i=0;i<isimler.length;i++){
                s+=isimler[i]+" : "+notlar[i]+"\n";
            }
            t5.setText(s);
        });

        b3.setOnClickListener(v->{
            int toplam=0;
            int zayif=0;
            int en=notlar[0];
            String ad=isimler[0];
            for(int i=0;i<notlar.length;i++){
                toplam+=notlar[i];
                if(notlar[i]<50)zayif++;
                if(notlar[i]>en){
                    en=notlar[i];
                    ad=isimler[i];
                }
            }
            double ort=(double)toplam/notlar.length;
            t5.setText("Sınıf Ortalaması : "+ort+
                    "\nZayıf Sayısı : "+zayif+
                    "\nEn Başarılı : "+ad);
        });
    }
}
