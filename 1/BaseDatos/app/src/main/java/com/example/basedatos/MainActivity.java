package com.example.basedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1, ed2, ed3, ed4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        ed3 = findViewById(R.id.ed3);
        ed4 = findViewById(R.id.ed4);
    }

    public void altas(View view) {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String Ncontrol = ed1.getText().toString();
        String Nombre = ed2.getText().toString();
        String Semestre = ed3.getText().toString();
        String Carrera = ed4.getText().toString();
        ContentValues registro = new ContentValues();
        registro.put("Ncontrol", Ncontrol);
        registro.put("Nombre", Nombre);
        registro.put("Semestre", Semestre);
        registro.put("Carrera", Carrera);
        bd.insert("alumno", null, registro);
        bd.close();
        Toast.makeText(this, "Datos del alumno cargados", Toast.LENGTH_SHORT).show();
        this.limpia();
    }

    public void limpia() {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");

    }

    public void limpiar(View view) {
        this.limpia();
    }

    public void consulta(View view) {
        /*AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();

        String Ncontrol = ed1.getText().toString();
        try {


            Toast.makeText(this, "select Nombre, Semestre, Carrera, Semestre from alumno", Toast.LENGTH_SHORT).show();
            Cursor fila = bd.rawQuery("Select Nombre From alumno", null);
            Toast.makeText(this, "aqui voy" + fila, Toast.LENGTH_SHORT).show();
            // Cursor fila = db.rawQuery("select Nombre,Semestre,Carrera from alumno where Ncontrol=" + Ncontrol, null);
       /* if (fila.moveToFirst()) {
            Toast.makeText(this, "estoy dentro del primer registro", Toast.LENGTH_SHORT).show();
            ed2.setText(fila.getString(0));
            ed3.setText(fila.getString(1));
            ed4.setText(fila.getString(2));
        } else
            Toast.makeText(this, "No existe ningún usuario con ese dni", Toast.LENGTH_SHORT).show();
            // bd.close();
       // }catch(Exception e ){
         //   Toast.makeText(this, " Error"+ e, Toast.LENGTH_SHORT).show();
            System.out.println( "Error"+ e);
        }*/
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this,"administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String Ncontrol = ed1.getText().toString();
        Cursor fila = bd.rawQuery( "select Nombre, Semestre, Carrera from alumno where Ncontrol=" + Ncontrol, null);
        if (fila.moveToFirst()) {
            ed2.setText(fila.getString(0));
            ed3.setText(fila.getString(1));
            ed4.setText(fila.getString(2));
        } else
            Toast.makeText(this, "No existe ningún usuario con ese dni", Toast.LENGTH_SHORT).show();
        bd.close();

    }
    public void baja(View view) {
        AdminSQLiteOpenHelper admin = new
                AdminSQLiteOpenHelper(this,"administracion", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();
        String Ncontrol = ed1.getText().toString();
// aquí borro la base de datos del usuario por el dni
        int cant = db.delete("alumno", "Ncontrol=" + Ncontrol, null);
        db.close();
        ed1.setText(""); ed2.setText(""); ed3.setText("");
        ed4.setText("");
        if (cant == 1)
            Toast.makeText(this, "Usuario eliminado",
                    Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "No existe usuario",
                    Toast.LENGTH_SHORT).show();
    }

    }
    
