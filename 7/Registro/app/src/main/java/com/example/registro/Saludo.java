package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {
     private TextView saludom;
     Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        saludom=findViewById(R.id.saludom);
        datos=getIntent().getExtras();//ES PARA PASAR DATOS POR PARAMETROS
        saludom.setText(datos.getString("nombre"));
    }
   public void salir(View view){
        finish();
   }
}