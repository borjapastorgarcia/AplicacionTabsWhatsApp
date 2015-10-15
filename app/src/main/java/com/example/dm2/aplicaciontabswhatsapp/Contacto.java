package com.example.dm2.aplicaciontabswhatsapp;

/**
 * Created by DM2 on 15/10/2015.
 */
public class Contacto {
    private String nombreContacto;
    private String nick;
    private int imageIcon;

    public Contacto(String nombreContacto, String nick, int imageIcon) {
        this.nombreContacto = nombreContacto;
        this.nick = nick;
        this.imageIcon = imageIcon;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public int getImageIcon() {
        return imageIcon;
    }

    public String getNick() {
        return nick;
    }

}
