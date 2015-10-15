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
public class AdaptadorLlamadas extends ArrayAdapter<Llamada> {
    private Llamada[]datosLlamada;
    public AdaptadorLlamadas(Context context, int resource) {
        super(context, resource);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(getContext());

        View item=inflater.inflate(R.layout.lista_chats, null);

        TextView tvNombreContacto=(TextView)item.findViewById(R.id.tvNombreContacto);
        tvNombreContacto.setText(datosLlamada[position].getNombreContacto());

        TextView tvDetallesLlamada=(TextView)item.findViewById(R.id.TvDetallesLlamada);
        tvDetallesLlamada.setText(datosLlamada[position].getDatosUltimaLlamada());

        ImageView imWeb=(ImageView)item.findViewById(R.id.imIconContactoLlamada);
        imWeb.setImageResource(datosLlamada[position].getImageIcon());

        return item;

    }
}
