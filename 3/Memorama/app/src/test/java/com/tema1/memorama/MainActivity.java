package com.tema1.memorama;

import org.junit.Test;

import static org.junit.Assert.*;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class MainActivity extends AppCompatActivity {


    EditText jugador1,jugador2;
    int j1=0,j2=0,v1=0,v2=0;
    int[][] mv={{1,5,8,2},{2,7,3,5},{6,8,1,6},{5,4,3,7}};


protected void onCcreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    jugador1=findViewById(R.id.jugador1);
    jugador2=findViewById(R.id.jugador2);
}

    public void mv00(View view) {


    }
}