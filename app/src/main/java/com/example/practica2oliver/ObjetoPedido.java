package com.example.practica2oliver;

import java.io.Serializable;
import java.util.ArrayList;

public class ObjetoPedido implements Serializable {

    private String primer_mensaje;
    private String segundo_mensaje;
    private String tercer_mensaje;
    private String cuarto_mensaje;
    private String quinto_mensaje;
    private ArrayList<String> mensajes;

    private String nombreZumo;
    private String precioZumo;

    private String zumoLactosa;


    //Constructor
    public ObjetoPedido(String primer_mensaje, String segundo_mensaje, String tercer_mensaje, String cuarto_mensaje, String quinto_mensaje, ArrayList<String> mensajes) {
        this.primer_mensaje = primer_mensaje;
        this.segundo_mensaje = segundo_mensaje;
        this.tercer_mensaje = tercer_mensaje;
        this.cuarto_mensaje = cuarto_mensaje;
        this.quinto_mensaje = quinto_mensaje;
        this.mensajes = mensajes;
    }

    public ObjetoPedido(String nombreZumo, String precioZumo, ArrayList<String> mensajes){
        this.nombreZumo = nombreZumo;
        this.precioZumo = precioZumo;
        this.mensajes = mensajes;
    }

    public ObjetoPedido(String nombreZumo, String precioZumo, String zumoLactosa, ArrayList<String> mensajes){
        this.nombreZumo = nombreZumo;
        this.precioZumo = precioZumo;
        this.zumoLactosa = zumoLactosa;
        this.mensajes = mensajes;
    }

    //GETTERS
    public String getPrimer_mensaje() {
        return primer_mensaje;
    }

    public String getSegundo_mensaje() {
        return segundo_mensaje;
    }

    public String getTercer_mensaje() {
        return tercer_mensaje;
    }

    public String getCuarto_mensaje() {
        return cuarto_mensaje;
    }

    public String getQuinto_mensaje() {
        return quinto_mensaje;
    }

    public String getNombreZumo() {
        return nombreZumo;
    }

    public String getPrecioZumo() {
        return precioZumo;
    }

    public String getZumoLactosa() { return zumoLactosa; }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }


    //SETTERS
    public void setPrimer_mensaje(String primer_mensaje) {
        this.primer_mensaje = primer_mensaje;
    }

    public void setSegundo_mensaje(String segundo_mensaje) { this.segundo_mensaje = segundo_mensaje; }

    public void setTercer_mensaje(String tercer_mensaje) {
        this.tercer_mensaje = tercer_mensaje;
    }

    public void setCuarto_mensaje(String cuarto_mensaje) { this.cuarto_mensaje = cuarto_mensaje; }

    public void setQuinto_mensaje(String quinto_mensaje) {
        this.quinto_mensaje = quinto_mensaje;
    }

    public void setNombreZumo(String nombreZumo) {
        this.nombreZumo = nombreZumo;
    }

    public void setPrecioZumo(String precioZumo) {
        this.precioZumo = precioZumo;
    }

    public void setZumoLactosa(String zumoLactosa) { this.zumoLactosa = zumoLactosa; }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
    }
}
