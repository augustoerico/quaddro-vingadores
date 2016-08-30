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

        Vingador gaviao = new Vingador();
        gaviao.nome = "Gaviao Arqueiro";
        gaviao.foto = R.drawable.avenger01;
        gaviao.poderes = "Habilidades com arco e flecha";

        vingadores.add(gaviao);

        return vingadores;
    }

}
