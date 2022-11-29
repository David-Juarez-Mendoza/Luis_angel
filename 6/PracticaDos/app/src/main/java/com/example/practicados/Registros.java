package com.example.practicados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Registros extends AppCompatActivity {

 private TextView registrosC;
 Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registros);
        registrosC=findViewById(R.id.registrosC);
        datos =getIntent().getExtras();

        registrosC.setText(datos.getString("registroos"));



    }
}