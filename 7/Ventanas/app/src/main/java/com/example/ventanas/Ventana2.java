package com.example.ventanas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Ventana2 extends AppCompatActivity {
    private TextView mnombre;
    Bundle datos;
    //Toma toda la info de cache en la app
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        mnombre = findViewById(R.id.textView2);
        datos = getIntent().getExtras();//todo lo que llega por intent se mete a datos con get extras
        mnombre.setText(""+datos.getString("nombre"));//mnombre es set text y lo traigo de datos que lo saca de nombre
    }

    public void click2 (View view){
        //pa regresar a la ventana principal o un close pa cerrar toda la app
        finish();
    }

}