package com.example.practica2oliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PantallaZumos extends AppCompatActivity {

    private Button botonVolver;
    private ImageView zumoArandanos;
    private ImageView zumoTomate;
    private ImageView zumoMelocoton;
    private ImageView zumoNaranja;
    private TextView tipoZumoArandano;
    private TextView precioZumoArandano;
    private TextView tipoZumoMelocoton;
    private TextView precioZumoMelocoton;
    private TextView tipoZumoNaranja;
    private TextView precioZumoNaranja;
    private TextView tipoZumoTomate;
    private TextView precioZumoTomate;
    private CheckBox intoleranteLactosa;
    private ArrayList<String> arrayMensajes = new ArrayList<>();
    private ObjetoPedido objetoPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_zumos);

        zumoArandanos = findViewById(R.id.zumoArandanos);
        zumoTomate = findViewById(R.id.zumoTomate);
        zumoMelocoton = findViewById(R.id.zumoMelocoton);
        zumoNaranja = findViewById(R.id.zumoNaranja);

        tipoZumoArandano = findViewById(R.id.nombreZumoArandano);
        precioZumoArandano = findViewById(R.id.precioArandanos);
        tipoZumoMelocoton = findViewById(R.id.nombreZumoMelocoton);
        precioZumoMelocoton = findViewById(R.id.precioMelocoton);
        tipoZumoNaranja = findViewById(R.id.nombreZumoNaranja);
        precioZumoNaranja = findViewById(R.id.precioNaranja);
        tipoZumoTomate = findViewById(R.id.nombreZumoTomate);
        precioZumoTomate = findViewById(R.id.precioTomate);

        intoleranteLactosa = findViewById(R.id.cbIntoleranteLactosa);

        zumoArandanos.setOnClickListener(v -> {
            arrayMensajes.add(tipoZumoArandano.getText().toString());
            arrayMensajes.add(precioZumoArandano.getText().toString());

            this.objetoPedido = new ObjetoPedido(tipoZumoArandano.getText().toString(), precioZumoArandano.getText().toString(), arrayMensajes);

            if (intoleranteLactosa.isChecked()) {
                arrayMensajes.add(intoleranteLactosa.getText().toString());
                this.objetoPedido = new ObjetoPedido(tipoZumoArandano.getText().toString(), precioZumoArandano.getText().toString(), intoleranteLactosa.getText().toString(), arrayMensajes);
            }

            Intent intent = new Intent(PantallaZumos.this, PantallaInforme.class);
            intent.putExtra("Mensajes PantallaZumos",objetoPedido);
            Bundle parametros_PantallaInformes = getIntent().getExtras();
            if (parametros_PantallaInformes != null) {
                intent.putExtras(parametros_PantallaInformes);
            }
            startActivity(intent);
        });

        zumoTomate.setOnClickListener(v -> {
            arrayMensajes.add(tipoZumoTomate.getText().toString());
            arrayMensajes.add(precioZumoTomate.getText().toString());

            this.objetoPedido = new ObjetoPedido(tipoZumoTomate.getText().toString(), precioZumoTomate.getText().toString(), arrayMensajes);

            if (intoleranteLactosa.isChecked()) {
                arrayMensajes.add(intoleranteLactosa.getText().toString());
                this.objetoPedido = new ObjetoPedido(tipoZumoTomate.getText().toString(), precioZumoTomate.getText().toString(), intoleranteLactosa.getText().toString(), arrayMensajes);
            }

            Intent intent = new Intent(PantallaZumos.this, PantallaInforme.class);
            intent.putExtra("Mensajes PantallaZumos",objetoPedido);
            Bundle parametros_PantallaInformes = getIntent().getExtras();
            if (parametros_PantallaInformes != null) {
                intent.putExtras(parametros_PantallaInformes);
            }
            startActivity(intent);
        });

        zumoMelocoton.setOnClickListener(v -> {
            arrayMensajes.add(tipoZumoMelocoton.getText().toString());
            arrayMensajes.add(precioZumoMelocoton.getText().toString());

            this.objetoPedido = new ObjetoPedido(tipoZumoMelocoton.getText().toString(), precioZumoMelocoton.getText().toString(), arrayMensajes);

            if (intoleranteLactosa.isChecked()) {
                arrayMensajes.add(intoleranteLactosa.getText().toString());
                this.objetoPedido = new ObjetoPedido(tipoZumoMelocoton.getText().toString(), precioZumoMelocoton.getText().toString(), intoleranteLactosa.getText().toString(), arrayMensajes);
            }

            Intent intent = new Intent(PantallaZumos.this, PantallaInforme.class);
            intent.putExtra("Mensajes PantallaZumos",objetoPedido);
            Bundle parametros_PantallaInformes = getIntent().getExtras();
            if (parametros_PantallaInformes != null) {
                intent.putExtras(parametros_PantallaInformes);
            }
            startActivity(intent);
        });

        zumoNaranja.setOnClickListener(v -> {
            arrayMensajes.add(tipoZumoNaranja.getText().toString());
            arrayMensajes.add(precioZumoNaranja.getText().toString());

            this.objetoPedido = new ObjetoPedido(tipoZumoNaranja.getText().toString(), precioZumoNaranja.getText().toString(), arrayMensajes);

            if (intoleranteLactosa.isChecked()) {
                arrayMensajes.add(intoleranteLactosa.getText().toString());
                this.objetoPedido = new ObjetoPedido(tipoZumoNaranja.getText().toString(), precioZumoNaranja.getText().toString(), intoleranteLactosa.getText().toString(), arrayMensajes);
            }

            Intent intent = new Intent(PantallaZumos.this, PantallaInforme.class);
            intent.putExtra("Mensajes PantallaZumos",objetoPedido);
            Bundle parametros_PantallaInformes = getIntent().getExtras();
            if (parametros_PantallaInformes != null) {
                intent.putExtras(parametros_PantallaInformes);
            }
            startActivity(intent);
        });

        //Obtenemos las referencias a los controles
        botonVolver = findViewById(R.id.botonVolver);
        //Agregamos un listener al botón
        botonVolver.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), PantallaRegistro.class);
            startActivity(intent);
        });
    }
}