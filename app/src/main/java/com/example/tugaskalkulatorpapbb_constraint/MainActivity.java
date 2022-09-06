package com.example.tugaskalkulatorpapbb_constraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText inp1, inp2;
    Button btnKali, btnBagi, btnTambah, btnKurang;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inp1 = findViewById(R.id.input1);
        inp2 = findViewById(R.id.input2);
        btnKali = findViewById(R.id.kali);
        btnBagi = findViewById(R.id.bagi);
        btnKurang = findViewById(R.id.kurang);
        btnTambah = findViewById(R.id.tambah);
        hasil = findViewById(R.id.text_result);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1, num2, nilaiHasil;
                num1 = Double.valueOf(inp1.getText().toString());
                num2 = Double.valueOf(inp2.getText().toString());
                nilaiHasil = num1 + num2;

                hasil.setText(nilaiHasil.toString());
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1, num2, nilaiHasil;
                num1 = Double.valueOf(inp1.getText().toString());
                num2 = Double.valueOf(inp2.getText().toString());
                nilaiHasil = num1 - num2;

                hasil.setText(nilaiHasil.toString());
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1, num2, nilaiHasil;
                num1 = Double.valueOf(inp1.getText().toString());
                num2 = Double.valueOf(inp2.getText().toString());
                nilaiHasil = num1 * num2;

                hasil.setText(nilaiHasil.toString());
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double num1, num2, nilaiHasil;
                num1 = Double.valueOf(inp1.getText().toString());
                num2 = Double.valueOf(inp2.getText().toString());
                nilaiHasil = num1/num2;

                hasil.setText(nilaiHasil.toString());
            }
        });
    }
}