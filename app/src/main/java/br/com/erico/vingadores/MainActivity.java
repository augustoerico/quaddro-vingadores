package br.com.erico.vingadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import br.com.erico.vingadores.controller.VingadorAdapter;
import br.com.erico.vingadores.controller.Vingadores;
import br.com.erico.vingadores.model.Vingador;

public class MainActivity extends AppCompatActivity {

    private ListView lsvVingadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View header = (View) getLayoutInflater().inflate(R.layout.cabecalho, null);
        View footer = (View) getLayoutInflater().inflate(R.layout.cabecalho, null);

        VingadorAdapter adapter = new VingadorAdapter(MainActivity.this, Vingadores.getGrupoVingadores());
        lsvVingadores = (ListView) findViewById(R.id.lsvVingadores);
        lsvVingadores.addHeaderView(header);
        lsvVingadores.addFooterView(footer);
        lsvVingadores.setAdapter(adapter);
    }
}
