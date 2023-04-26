package com.example.practica2oliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PantallaAcercaDe extends AppCompatActivity {

    private Button botonVolverAcercaDe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_acerca_de);

        //Obtenemos las referencias a los controles
        botonVolverAcercaDe = findViewById(R.id.botonVolverAcercaDe);
        //Agregamos un listener al botón
        botonVolverAcercaDe.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}