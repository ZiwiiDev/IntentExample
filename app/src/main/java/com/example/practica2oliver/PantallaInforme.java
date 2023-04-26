package com.example.practica2oliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class PantallaInforme extends AppCompatActivity {

    private Button botonPantallaPrincipal;
    private TextView nombre;
    private TextView apellidos;
    private TextView telefono;
    private TextView recogida;
    private TextView direccion;
    private TextView zumoElegido;
    private TextView precioZumoElegido;
    private TextView textDireccion2;
    private TextView lactosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_informe);

        Toast.makeText(this, getString(R.string.pedidoCorrecto), Toast.LENGTH_LONG).show();

        nombre = findViewById(R.id.reciboNombre);
        apellidos = findViewById(R.id.reciboApellidos);
        telefono = findViewById(R.id.reciboTelefono);
        recogida = findViewById(R.id.reciboRecogida);
        direccion = findViewById(R.id.reciboDireccion);

        textDireccion2 = findViewById(R.id.textDireccion2);

        zumoElegido = findViewById(R.id.zumoElegido);
        precioZumoElegido = findViewById(R.id.precioZumoElegido);

        lactosa = findViewById(R.id.lactosa);

        //Compruebo si estoy recibiendo parámetros desde una actividad
        Bundle parametros_PantallaRegistro = this.getIntent().getExtras();
        if(parametros_PantallaRegistro !=null){
            //Objetengo el objeto y muestro cada mensaje por pantalla
            ObjetoPedido om = (ObjetoPedido) parametros_PantallaRegistro.getSerializable("Mensajes PantallaRegistro");
            nombre.setText(om.getPrimer_mensaje());
            apellidos.setText(om.getSegundo_mensaje());
            telefono.setText(om.getTercer_mensaje());
            recogida.setText(om.getCuarto_mensaje());
            direccion.setText(om.getQuinto_mensaje());

            if (recogida.getText().toString().equals("Establecimiento")){
                textDireccion2.setVisibility(View.INVISIBLE);
                direccion.setVisibility(View.INVISIBLE);
            }
        }

        Bundle parametros_PantallaZumos = this.getIntent().getExtras();
        if(parametros_PantallaZumos !=null) {
            ObjetoPedido oz = (ObjetoPedido) parametros_PantallaZumos.getSerializable("Mensajes PantallaZumos");
            zumoElegido.setText(oz.getNombreZumo());
            precioZumoElegido.setText(oz.getPrecioZumo());
            lactosa.setText(oz.getZumoLactosa());
        }

        //Obtenemos las referencias a los controles
        botonPantallaPrincipal = findViewById(R.id.botonPantallaPrincipal);
        //Agregamos un listener al botón
        botonPantallaPrincipal.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}