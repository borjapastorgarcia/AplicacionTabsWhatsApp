package com.example.dm2.aplicaciontabswhatsapp;

/**
 * Created by DM2 on 15/10/2015.
 */
public class Chat {
    private String nombreContacto;
    private String ultimoMensaje;
    private int imageIcon;

    public Chat(String nombreContacto, String ultimoMensaje, int imageIcon) {
        this.nombreContacto = nombreContacto;
        this.ultimoMensaje = ultimoMensaje;
        this.imageIcon = imageIcon;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public String getUltimoMensaje() {
        return ultimoMensaje;
    }

}
