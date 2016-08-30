package br.com.erico.vingadores.model;

import br.com.erico.vingadores.R;

/**
 * Created by Mobile on 29/08/2016.
 */
public class Vingador {

    public static final String NICK_FURY_NAME = "Nick Fury";
    public static final int NICK_FURY_PHOTO = R.drawable.avenger04;
    public static final String NICK_FURY_BIO = "He is the leader";

    private String nome;
    private int foto;
    private String poderes;

    public Vingador() {
        this.nome = NICK_FURY_NAME;
        this.foto = NICK_FURY_PHOTO;
        this.poderes = NICK_FURY_BIO;
    }

    public Vingador(String nome, int foto, String poderes) {
        this.nome = nome;
        this.foto = foto;
        this.poderes = poderes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoderes() {
        return poderes;
    }

    public void setPoderes(String poderes) {
        this.poderes = poderes;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return nome;
    }
}
