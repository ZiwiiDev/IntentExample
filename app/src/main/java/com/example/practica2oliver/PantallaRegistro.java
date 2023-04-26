package com.example.practica2oliver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.view.View;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PantallaRegistro extends AppCompatActivity {

    private EditText editTextNombre;
    private EditText editTextApellidos;
    private EditText editTextTelefono;
    private Spinner spRecogida;
    private EditText editTextDireccion;
    private ArrayList<String> arrayMensajes = new ArrayList<>();
    private TextView textDireccion;
    private ObjetoPedido objetoPedido;
    private Button botonVolver;
    private Button botonContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_registro);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellidos = findViewById(R.id.editTextApellidos);
        editTextTelefono = findViewById(R.id.editTextTelefono);
        spRecogida = findViewById(R.id.spRecogida);
        editTextDireccion = findViewById(R.id.editTextDireccion);
        textDireccion = findViewById(R.id.textDireccion);

        //Compruebo si estoy recibiendo parámetros desde otra actividad
        //(si no se comprueba puede dar error)
        Bundle parametros_PantallaInformes = getIntent().getExtras();
        if(parametros_PantallaInformes != null){
            String mensaje = parametros_PantallaInformes.getString("nuevo_mensaje");
            Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show();
        }

        //Obtenemos las referencias a los controles
        botonContinuar = findViewById(R.id.botonContinuar);
        //Agregamos un listener al botón
        botonContinuar.setOnClickListener(v -> {
            if (!editTextNombre.getText().toString().isEmpty() && !editTextApellidos.getText().toString().isEmpty() && !editTextTelefono.getText().toString().isEmpty() && !spRecogida.getSelectedItem().toString().isEmpty()) {
                arrayMensajes.add(editTextNombre.getText().toString());
                arrayMensajes.add(editTextApellidos.getText().toString());
                arrayMensajes.add(editTextTelefono.getText().toString());
                arrayMensajes.add(spRecogida.getSelectedItem().toString());
                arrayMensajes.add(editTextDireccion.getText().toString());

                if (spRecogida.getSelectedItem().toString().equals("A domicilio") && editTextDireccion.getText().toString().isEmpty()) {
                    Toast.makeText(this, getString(R.string.errorDatosIncorrectos), Toast.LENGTH_LONG).show();
                } else {
                    this.objetoPedido = new ObjetoPedido(editTextNombre.getText().toString(), editTextApellidos.getText().toString(), editTextTelefono.getText().toString(), spRecogida.getSelectedItem().toString(), editTextDireccion.getText().toString(), arrayMensajes);

                    Intent intent = new Intent(this, PantallaZumos.class);
                    intent.putExtra("Mensajes PantallaRegistro", objetoPedido);
                    startActivity(intent);
                }
            } else {
                Toast.makeText(this, getString(R.string.errorDatosIncorrectos), Toast.LENGTH_LONG).show();
            }
        });


        spRecogida.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Object item = parent.getItemAtPosition(position);
                if(item.equals("A domicilio")){
                    editTextDireccion.setVisibility(View.VISIBLE);
                    textDireccion.setVisibility(View.VISIBLE);
                } else {
                    editTextDireccion.setVisibility(View.INVISIBLE);
                    textDireccion.setVisibility(View.INVISIBLE);
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        //Obtenemos las referencias a los controles
        botonVolver = findViewById(R.id.botonVolver);
        //Agregamos un listener al botón
        botonVolver.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
    }
}