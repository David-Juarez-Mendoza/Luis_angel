package com.example.juegogato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int Turno,contador;
Button boton1;
TextView tex0,tex1,tex2,tex3,tex4,tex5,tex6,tex7,tex8,Ganador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tex0= (TextView)findViewById(R.id.tex0);
        tex1= (TextView)findViewById(R.id.tex1);
        tex2= (TextView)findViewById(R.id.tex2);
        tex3= (TextView)findViewById(R.id.tex3);
        tex4= (TextView)findViewById(R.id.tex4);
        tex5= (TextView)findViewById(R.id.tex5);
        tex6= (TextView)findViewById(R.id.tex6);
        tex7= (TextView)findViewById(R.id.tex7);
        tex8= (TextView)findViewById(R.id.tex8);
        boton1= (Button) findViewById(R.id.boton1);


        tex0.setOnClickListener(this::onClick);
        tex1.setOnClickListener(this::onClick);
        tex2.setOnClickListener(this::onClick);
        tex3.setOnClickListener(this::onClick);
        tex4.setOnClickListener(this::onClick);
        tex5.setOnClickListener(this::onClick);
        tex6.setOnClickListener(this::onClick);
        tex7.setOnClickListener(this::onClick);
        tex8.setOnClickListener(this::onClick);
        boton1.setOnClickListener(this::onClick);



    }

    public void onClick(View v) {
        contador++;
        Turno=contador%2;

        //play 1

        if(Turno==1){
            imprimirXO('x',v);


        }
        //play 2
        else{
            imprimirXO('o',v);

        }

    }//FIN DEL METODO
    public void imprimirXO(char letra, View v) {
        if(v.getId()==R.id.boton1){
        Ganador.setEnabled(false);

        tex0.setEnabled(true);
        tex0.setText("");

        tex1.setEnabled(true);
        tex1.setText("");

    tex2.setEnabled(true);
        tex2.setText("");


        tex3.setEnabled(true);
            tex3.setText("");
            tex4.setEnabled(true);
            tex4.setText("");
            tex5.setEnabled(true);
            tex5.setText("");
            tex6.setEnabled(true);
            tex6.setText("");
            tex7.setEnabled(true);
            tex7.setText("");
            tex8.setEnabled(true);
            tex8.setText("");


}



        if (v.getId() == R.id.tex0) {
            tex0.setText(letra + "");
            tex0.setEnabled(false);
        } else if (v.getId() == R.id.tex1) {
            tex1.setText(letra + "");
            tex1.setEnabled(false);
        } else if (v.getId() == R.id.tex2) {
            tex2.setText(letra + "");
            tex2.setEnabled(false);
        } else if (v.getId() == R.id.tex3) {
            tex3.setText(letra + "");
            tex3.setEnabled(false);
        } else if (v.getId() == R.id.tex4) {
            tex4.setText(letra + "");
            tex4.setEnabled(false);
        } else if (v.getId() == R.id.tex5) {
            tex5.setText(letra + "");
            tex5.setEnabled(false);
        } else if (v.getId() == R.id.tex6) {
            tex6.setText(letra + "");
            tex6.setEnabled(false);
        } else if (v.getId() == R.id.tex7) {
            tex7.setText(letra + "");
            tex7.setEnabled(false);
        } else {
            tex8.setText(letra + "");
            tex8.setEnabled(false);

        }
        Ganador(letra);
    }
    public void Ganador(char letra){
        if(tex0.getTag().toString().equals(letra+"") && (tex1.getTag().toString().equals(letra+"") && (tex2.getTag().toString().equals(letra+"")));
        Ganador.setText("El ganador"+letra);
    }
}