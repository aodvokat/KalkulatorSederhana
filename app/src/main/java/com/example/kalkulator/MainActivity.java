package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.kalkulator.R;

public class MainActivity extends AppCompatActivity {

    EditText bilangan1, bilangan2;
    TextView tvhasil;
    Button bttambah, btkurang, btkali, btbagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bilangan1 = (EditText) findViewById(R.id.bil1);
        bilangan2 = (EditText) findViewById(R.id.bil2);
        tvhasil = (TextView) findViewById(R.id.hasil);
        bttambah = (Button) findViewById(R.id.tambah);
        btkurang = (Button) findViewById(R.id.kurang);
        btkali = (Button) findViewById(R.id.kali);
        btbagi = (Button) findViewById(R.id.bagi);


        bttambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(bilangan1.getText().toString().trim());
                bil2=Double.valueOf(bilangan2.getText().toString().trim());
                hasil=bil1+bil2;
                String hasil1=String.valueOf(hasil);
                tvhasil.setText(hasil1);
            }
        });

        btkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(bilangan1.getText().toString().trim());
                bil2=Double.valueOf(bilangan2.getText().toString().trim());
                hasil=bil1-bil2;
                String hasil1=String.valueOf(hasil);
                tvhasil.setText(hasil1);
            }
        });

        btkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(bilangan1.getText().toString().trim());
                bil2=Double.valueOf(bilangan2.getText().toString().trim());
                hasil=bil1*bil2;
                String hasil1=String.valueOf(hasil);
                tvhasil.setText(hasil1);
            }
        });

        btbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double bil1, bil2, hasil;
                bil1=Double.valueOf(bilangan1.getText().toString().trim());
                bil2=Double.valueOf(bilangan2.getText().toString().trim());
                hasil=bil1/bil2;
                String hasil1=String.valueOf(hasil);
                tvhasil.setText(hasil1);
            }
        });
    }
}
