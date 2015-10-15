package com.example.dm2.aplicaciontabswhatsapp;

/**
 * Created by DM2 on 15/10/2015.
 */
public class Llamada {
    private String nombreContacto;
    private String datosUltimaLlamada;
    private int imageIcon;

    public Llamada(String nombreContacto, String datosUltimaLlamada, int imageIcon) {
        this.nombreContacto = nombreContacto;
        this.datosUltimaLlamada = datosUltimaLlamada;
        this.imageIcon = imageIcon;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public String getDatosUltimaLlamada() {
        return datosUltimaLlamada;
    }

}
