package br.com.erico.vingadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        List vingadores = Vingadores.getGrupoVingadores();

        VingadorAdapter adapter = new VingadorAdapter(MainActivity.this, vingadores);
        lsvVingadores = (ListView) findViewById(R.id.lsvVingadores);
        lsvVingadores.setAdapter(adapter);

    }
}
