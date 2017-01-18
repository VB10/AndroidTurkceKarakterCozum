package com.example.vb.empty;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView tv_index;
    String text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv_index = (TextView) findViewById(R.id.asd);
        text = "Eski hali :Iğdır \n";

        checktext(text);


    }

    private void checktext(String s) {

        String dogru="";
        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {

                //burada kelimeyi tek tek dolasıyoruz
                //eğer ğ ı gibi kelime görürse bunu geçici kelimeye düzelterek ekliyor
                case 'ğ':
                    dogru += 'g';
                    break;
                case 'ı':
                    dogru += 'i';
                    break;
                case 'I':
                    dogru += 'i';
                    break;
                case 'İ':
                    dogru += 'i';
                    break;
                case 'Ç':
                    dogru += 'c';
                    break;

                case 'ş':
                    dogru += 's';
                    break;
                case 'ü':
                    dogru += 'u';
                    break;
                case 'ö':
                    dogru += 'o';
                    break;
                case 'ç':
                    dogru += 'c';
                    break;


                default:
                    //eğer bizim belirlediğimiz kelimelerden değil ise
                    //kelimeyi direk kendisi çevirerek  ekliyor
                    //A harfi veya sessiz harfler toLowerCase de herhangi bir bozukluk yaşamıyor
                    dogru += s.charAt(i);
                    dogru.toLowerCase();

            }
            if (i == s.length() - 1){
                text+="Yeni hali"+dogru;
                tv_index.setText(text);
            }

        }

    }


}
