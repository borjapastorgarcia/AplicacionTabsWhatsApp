package com.example.dm2.aplicaciontabswhatsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by DM2 on 15/10/2015.
 */
public class AdaptadorChats extends ArrayAdapter<Chat> {
    private Chat[]datosChats;
    public AdaptadorChats(Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(getContext());

        View item=inflater.inflate(R.layout.lista_chats, null);

        TextView tvNombreContacto=(TextView)item.findViewById(R.id.tvNombreContacto);
        tvNombreContacto.setText(datosChats[position].getNombreContacto());

        TextView tvUltimoMensaje=(TextView)item.findViewById(R.id.tvUltimoMensaje);
        tvUltimoMensaje.setText(datosChats[position].getUltimoMensaje());

        ImageView imChat=(ImageView)item.findViewById(R.id.imIconContactoChat);
        imChat.setImageResource(datosChats[position].getImageIcon());

        return item;


    }
}
