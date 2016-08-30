package br.com.erico.vingadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

import br.com.erico.vingadores.controller.Vingadores;
import br.com.erico.vingadores.model.Vingador;

public class MainActivity extends AppCompatActivity {

    private ListView lsvVingadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvVingadores = (ListView) findViewById(R.id.lsvVingadores);

        List vingadores = Vingadores.getGrupoVingadores();

        ArrayAdapter<Vingador> adapter = new ArrayAdapter<>
                (MainActivity.this, android.R.layout.simple_list_item_1, vingadores);

        lsvVingadores.setAdapter(adapter);

    }
}
