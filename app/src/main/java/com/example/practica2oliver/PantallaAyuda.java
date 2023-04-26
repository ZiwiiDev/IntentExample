package com.example.practica2oliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PantallaAyuda extends AppCompatActivity {

    private Button botonVolverAyuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_ayuda);

        //Obtenemos las referencias a los controles
        botonVolverAyuda = findViewById(R.id.botonVolverAyuda);
        //Agregamos un listener al botón
        botonVolverAyuda.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}