package br.com.erico.vingadores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView lsvVingadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lsvVingadores = (ListView) findViewById(R.id.lsvVingadores);

        String[] pecados = {"Inveja", "Ira", "Ganância", "Gula", "Luxuria", "Avareza", "Vaidade"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (MainActivity.this, android.R.layout.simple_list_item_1, pecados);

        lsvVingadores.setAdapter(adapter);

    }
}
