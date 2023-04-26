package com.example.practica2oliver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ConstraintLayout constraintLayout;
    private Button botonHacerPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Referencia al toolbar */
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Referencia a la vista del layout
        constraintLayout = findViewById(R.id.vista);

        //Obtenemos las referencias a los controles
        botonHacerPedido = findViewById(R.id.botonHacerPedido);
        //Agregamos un listener al botón
        botonHacerPedido.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), PantallaRegistro.class);
            startActivity(intent);
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menuAyuda:
                Intent abrirActivityAyuda = new Intent(getApplicationContext(), PantallaAyuda.class);
                startActivity(abrirActivityAyuda);
                break;
            case R.id.menuAcercaDe:
                Intent abrirActivityAcercaDe = new Intent(getApplicationContext(), PantallaAcercaDe.class);
                startActivity(abrirActivityAcercaDe);
                break;
        }
        return true;
    }






}