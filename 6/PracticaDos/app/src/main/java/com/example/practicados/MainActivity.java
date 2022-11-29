package com.example.practicados;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    //-----CREACION DE VARIABLES-----//
    private EditText a_paterno;
    private EditText a_materno;
    private EditText nombre;
    private EditText colonia;
    private EditText cp;
    private EditText calle;
    private EditText estado;
    private EditText municipio;
    private Button eliminar;
    private Button aceptar;
    private Button otro;
    private TextView resultado;
    private TextView nR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-----ENLAZAMOS-----//
        nombre = (EditText) findViewById(R.id.nombre);
        a_paterno = (EditText) findViewById(R.id.a_paterno);
        a_materno = (EditText) findViewById(R.id.a_materno);
        colonia = (EditText) findViewById(R.id.colonia);
        cp = (EditText) findViewById(R.id.cp);
        calle = (EditText) findViewById(R.id.calle);
        estado = (EditText) findViewById(R.id.estado);
        municipio = (EditText) findViewById(R.id.municipio);
        aceptar = (Button) findViewById(R.id.aceptar);
        eliminar = (Button) findViewById(R.id.eliminar);
        resultado = (TextView) findViewById(R.id.resultado);
    }

    //-----METODOS-----//
    public void Aceptar(View view) {


String nR;
        String nom = nombre.getText().toString();
        String aPat = a_paterno.getText().toString();
        String aMat = a_materno.getText().toString();
        String col = colonia.getText().toString();
        String codP = cp.getText().toString();
        String call = calle.getText().toString();
        String est = estado.getText().toString();
        String muni = municipio.getText().toString();

        nR= (" "+nom+" "+aPat+" "+aMat+" "+col+" "+codP+" "+call+" "+est+" "+muni);

        resultado.setText(nR);
        Intent mandarR = new Intent(MainActivity.this, Registros.class);
        mandarR.putExtra("registroos", nR);
        startActivity(mandarR);


    }




        //resultado.setText( nom + "\n"+ aPat+"\n"+ aMat +"\n"+ col +"\n"+ codP + "\n"+ call +"\n"+ est +"\n"+ muni +"\n");
        /*resultado.setText(col);
        resultado.setText(codP);
        resultado.setText(call);
        resultado.setText(est);
        resultado.setText(muni);
         */


    public void Limpiar(View view){
        nombre.setText("");
        a_paterno.setText("");
        a_materno.setText("");
        colonia.setText("");
        cp.setText("");
        calle.setText("");
        estado.setText("");
        municipio.setText("");
        resultado.setText("");

    }

}