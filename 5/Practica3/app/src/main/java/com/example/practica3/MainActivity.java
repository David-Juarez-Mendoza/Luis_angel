//Programa de saludo DESARROLLADO POR:Luis Angel ChaveZ Garcia 24/08/2022
package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;//DECLARAR VARIABLES
    private Button bNombre;
    private TextView resultado;
    private Button botonL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);
        bNombre = (Button) findViewById(R.id.bNombre);//CREAR LOS ATRIBUTOS
        resultado = (TextView) findViewById(R.id.resultado);
    }

    //CONSTRUCCION DE METODOS A UTILIZAR
    public void Saludo(View view) {
        String n;

        n = nombre.getText().toString(); //EXTRAE LO DE LA CAJA DE TEXTO DE NOMBRE Y LO CONVIERTO A STRING

            resultado.setText("HOLA " + n + " Como estas..");

    }


    public void Limpiar(View view){
        nombre.setText("");      //metodo para limpiar
        resultado.setText("");

    }

}