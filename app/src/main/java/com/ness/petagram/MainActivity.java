package com.ness.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas>  mascotas;
    private RecyclerView rvPetagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);



        rvPetagram = findViewById(R.id.rvPetagram);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvPetagram.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

    }

    public MascotaAdaptador adaptador;
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,this);
        rvPetagram.setAdapter(adaptador);
    }

    private void inicializarListaMascotas() {

        mascotas = new ArrayList<Mascotas>();

        mascotas.add(new Mascotas(R.drawable.matiflor, "Mati en su florecita"));
        mascotas.add(new Mascotas(R.drawable.matilindo, "Mati súper lindo" ));
        mascotas.add(new Mascotas(R.drawable.matibanado, "Mati bañadito"));
        mascotas.add(new Mascotas(R.drawable.matiacostado, "Mati con flojera"));
        mascotas.add(new Mascotas(R.drawable.maticoche, "Mati feliz"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.btnFavoritos){
            Toast.makeText(this, "(:", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this, Favoritos.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);

    }


}