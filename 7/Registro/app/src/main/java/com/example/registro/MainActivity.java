package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2;
    ImageView ivCodigoQR;
    EditText nom,password;
    Button btnGenerar;

    String nombre="Juna Perez",login="Juan",pass="123";
    private EditText log,pas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivCodigoQR = findViewById(R.id.ivCodigoQR);
        btnGenerar = findViewById(R.id.btnGenerar);
        log = findViewById(R.id.nom);
        pas = findViewById(R.id.password);
        //b1=findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);

    }
        public void validar (View view){
            Intent Saludoo = new Intent(MainActivity.this, Saludo.class);
            Intent fallo = new Intent(MainActivity.this, Noregistro.class);
            String l = log.getText().toString();
            String p = pas.getText().toString();
            if (l.equals(login) && (p.equals(pass))) {
                Saludoo.putExtra("nombre", nombre);
                startActivity(Saludoo);
            } else {
                startActivity(fallo);
            }


        }
        public void limpiar (View View){

        }
        public void onClick (View view){
            try {
                BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                Bitmap bitmap = barcodeEncoder.encodeBitmap(
                         pas.getText().toString(),
                        BarcodeFormat.QR_CODE,
                        750,
                        750);
                ivCodigoQR.setImageBitmap(bitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
   /* public void fallo(View view){
        Intent siguiente = new Intent(MainActivity.this,Saludo.class);
        startActivity(siguiente);

    }*/
    }
