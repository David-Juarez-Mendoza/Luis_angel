package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText Nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre = findViewById(R.id.EscribeNombre);
    }

    public void click (View view){
        Intent v = new Intent(this,Ventana2.class);
        //el intent construye en memoria virtual los objetos construyendo la ventana
        v.putExtra("nombre",Nombre.getText().toString());
        //Manda a la memoria cache una memoria llamada nombre con el valor de el objeto Nombre
        startActivity(v);
    }

}