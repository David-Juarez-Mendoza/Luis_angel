package com.example.registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Noregistro extends AppCompatActivity {
   private Button alta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noregistro);
        alta=findViewById(R.id.Alta);
    }
    public void registro(View view){
        Intent siguiente = new Intent(Noregistro.this,MainActivity.class);
        startActivity(siguiente);

    }
}