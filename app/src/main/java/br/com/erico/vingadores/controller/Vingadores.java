package br.com.erico.vingadores.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.erico.vingadores.R;
import br.com.erico.vingadores.model.Vingador;

/**
 * Created by Mobile on 29/08/2016.
 */
public class Vingadores {

    public static List<Vingador> getGrupoVingadores() {

        ArrayList<Vingador> vingadores = new ArrayList<>();

        vingadores.add(new Vingador("Hawkeye", R.drawable.avenger01, "Eyes of a hawk"));
        vingadores.add(new Vingador("War Machine", R.drawable.avenger02, "Militarized version of Mark III"));
        vingadores.add(new Vingador("Thor", R.drawable.avenger03, "Thunder God"));
        vingadores.add(new Vingador());
        vingadores.add(new Vingador("Loki", R.drawable.avenger05, "Thor's brother"));
        vingadores.add(new Vingador("Iron Man", R.drawable.avenger06, "Millionary"));
        vingadores.add(new Vingador("Hulk", R.drawable.avenger07, "\"We have a Hulk\" - MAN, Iron"));
        vingadores.add(new Vingador("Antman", R.drawable.avenger08, "He is tiny"));
        vingadores.add(new Vingador("Captain America", R.drawable.avenger09, "Believes in God"));
        vingadores.add(new Vingador("Black Widow", R.drawable.avenger10, "Secret agent"));
        vingadores.add(new Vingador("Phil Coulson", R.drawable.avenger11, "KIA"));

        return vingadores;
    }

}
