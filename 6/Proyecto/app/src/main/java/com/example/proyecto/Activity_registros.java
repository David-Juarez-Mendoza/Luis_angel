package com.example.proyecto;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_registros extends AppCompatActivity {
    EditText nombre, contra, telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nombre);
        contra = findViewById(R.id.contra);
        telefono = findViewById(R.id.telefono);

    }

    public void altas(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String nom = nombre.getText().toString();
        String tel = telefono.getText().toString();
        String cont = contra.getText().toString();

        ContentValues registro = new ContentValues();
        registro.put("nombre", nom);
        registro.put("contraseña", tel);
        registro.put("telefono", cont);

        bd.insert("registro", null, registro);
        bd.close();
        Toast.makeText(this, "Datos del alumno cargados", Toast.LENGTH_SHORT).show();
        this.limpia();
    }

    public void limpia() {
        nombre.setText("");
        telefono.setText("");
        contra.setText("");


    }

    public void limpiar(View view) {
        this.limpia();
    }
}
