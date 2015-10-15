package com.example.dm2.aplicaciontabswhatsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listaChats, listaContactos, listaLlamadas;
    Chat[]datosChat;
    Llamada[]datosLlamada;
    Contacto[]datosContacto;
    private ArrayList<Contacto>arrContactos;
    private ArrayList<Llamada>arrLlamadas;
    private ArrayList<Chat>arrChats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabHost tabs=(TabHost)findViewById(android.R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec=tabs.newTabSpec("LLAMADAS");
        spec.setContent(R.id.tab1);
        spec.setIndicator(getResources().getString(R.string.tab1title));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("CHATS");
        spec.setContent(R.id.tab2);
        spec.setIndicator(getResources().getString(R.string.tab2title));
        tabs.addTab(spec);

        spec=tabs.newTabSpec("CONTACTOS");
        spec.setContent(R.id.tab3);
        spec.setIndicator(getResources().getString(R.string.tab3title));
        tabs.addTab(spec);
        tabs.setCurrentTab(0);
        rellenaListaChats(null);
        rellenaListaContactos(null);
        rellenaListaLlamadas(null);
    }
    public void rellenaListaContactos(Contacto c){
        arrContactos=new ArrayList<Contacto>();
        arrContactos.add(new Contacto("xx","yy",android.R.drawable.ic_menu_save));
        arrContactos.add(new Contacto("xx","yy",android.R.drawable.ic_menu_save));
        arrContactos.add(new Contacto("xx","yy",android.R.drawable.ic_menu_save));
        arrContactos.add(new Contacto("xx","yy",android.R.drawable.ic_menu_save));
        arrContactos.add(new Contacto("xx","yy",android.R.drawable.ic_menu_save));
        arrContactos.add(new Contacto("xx","yy",android.R.drawable.ic_menu_save));
        arrContactos.add(new Contacto("xx","yy",android.R.drawable.ic_menu_save));
        arrContactos.add(new Contacto("xx","yy",android.R.drawable.ic_menu_save));
        arrContactos.add(new Contacto("xx","yy",android.R.drawable.ic_menu_save));
        if(c!=null)
            arrContactos.add(c);
        datosContacto=new Contacto[arrContactos.size()];
        for(int i=0;i<arrContactos.size();i++)
            datosContacto[i]=arrContactos.get(i);
        AdaptadorContactos adaptador=new AdaptadorContactos(this,datosContacto);
        listaContactos=(ListView)findViewById(R.id.ListViewContactos);
        listaContactos.setAdapter(adaptador);

    }
    public void rellenaListaChats(Chat c){
        arrChats=new ArrayList<Chat>();
        arrChats.add(new Chat("xx","yy",android.R.drawable.ic_menu_save));
        arrChats.add(new Chat("xx","yy",android.R.drawable.ic_menu_save));
        arrChats.add(new Chat("xx","yy",android.R.drawable.ic_menu_save));
        arrChats.add(new Chat("xx","yy",android.R.drawable.ic_menu_save));
        arrChats.add(new Chat("xx","yy",android.R.drawable.ic_menu_save));
        arrChats.add(new Chat("xx","yy",android.R.drawable.ic_menu_save));
        arrChats.add(new Chat("xx","yy",android.R.drawable.ic_menu_save));
        arrChats.add(new Chat("xx","yy",android.R.drawable.ic_menu_save));
        arrChats.add(new Chat("xx","yy",android.R.drawable.ic_menu_save));
        if(c!=null)
            arrChats.add(c);
        datosChat=new Chat[arrChats.size()];
        for (int i=0;i<arrChats.size();i++)
            datosChat[i]=arrChats.get(i);
        AdaptadorChats adaptadorChat=new AdaptadorChats(this,datosChat);
        listaChats=(ListView)findViewById(R.id.ListViewChats);
        listaChats.setAdapter(adaptadorChat);

    }
    public void rellenaListaLlamadas(Llamada l){
        arrLlamadas=new ArrayList<Llamada>();
        arrLlamadas.add(new Llamada("xx","yy",android.R.drawable.ic_menu_save));
        arrLlamadas.add(new Llamada("xx","yy",android.R.drawable.ic_menu_save));
        arrLlamadas.add(new Llamada("xx","yy",android.R.drawable.ic_menu_save));
        arrLlamadas.add(new Llamada("xx","yy",android.R.drawable.ic_menu_save));
        arrLlamadas.add(new Llamada("xx","yy",android.R.drawable.ic_menu_save));
        arrLlamadas.add(new Llamada("xx","yy",android.R.drawable.ic_menu_save));
        arrLlamadas.add(new Llamada("xx","yy",android.R.drawable.ic_menu_save));
        arrLlamadas.add(new Llamada("xx","yy",android.R.drawable.ic_menu_save));
        arrLlamadas.add(new Llamada("xx","yy",android.R.drawable.ic_menu_save));
        if(l!=null)
            arrLlamadas.add(l);
        datosLlamada=new Llamada[arrLlamadas.size()];
        for(int i=0;i<arrLlamadas.size();i++)
            datosLlamada[i]=arrLlamadas.get(i);
        AdaptadorLlamadas adaptadorLlamadas=new AdaptadorLlamadas(this, datosLlamada);
        listaLlamadas=(ListView)findViewById(R.id.ListViewLlamadas);
        listaLlamadas.setAdapter(adaptadorLlamadas);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
