package com.ness.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Favoritos extends AppCompatActivity {

    ArrayList<Mascotas>  mascotas;

    private RecyclerView rvPetagram;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        rvPetagram = findViewById(R.id.rvPetagram);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvPetagram.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public MascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,this);
        rvPetagram.setAdapter(adaptador);
    }

    private void inicializarListaMascotas() {

        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas(R.drawable.matiflor, "Mati en su florecita"));
        mascotas.add(new Mascotas(R.drawable.matibanado, "Mati bañadito"));
        mascotas.add(new Mascotas(R.drawable.matiacostado, "Mati con flojera"));
        mascotas.add(new Mascotas(R.drawable.maticoche, "Mati feliz"));

    }
}