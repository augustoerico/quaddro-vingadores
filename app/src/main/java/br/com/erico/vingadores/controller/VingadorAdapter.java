package br.com.erico.vingadores.controller;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.erico.vingadores.R;
import br.com.erico.vingadores.model.Vingador;

/**
 * Created by Mobile on 29/08/2016.
 */
public class VingadorAdapter extends ArrayAdapter<Vingador> {

    private static final Integer VINGADOR_LAYOUT_DETALHE = R.layout.vingador_detalhe;

    private List<Vingador> vingadores;

    public VingadorAdapter(Context context, List<Vingador> vingadores) {
        super(context, VINGADOR_LAYOUT_DETALHE, vingadores);
        this.vingadores = vingadores;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = convertView;

        VingadorHolder holder;

        if(view == null) {
            holder = new VingadorHolder();

            LayoutInflater inflater = ((Activity) getContext()).getLayoutInflater();
            view = inflater.inflate(VINGADOR_LAYOUT_DETALHE, parent, false);

            holder.imvFoto = (ImageView) view.findViewById(R.id.imvFoto);
            holder.txvNome = (TextView) view.findViewById(R.id.txvNome);
            holder.txvPoderes = (TextView) view.findViewById(R.id.txvPoderes);

            view.setTag(holder);
        } else {

            holder = (VingadorHolder) view.getTag();

        }

        Vingador vingador = vingadores.get(position);
        holder.imvFoto.setImageResource(vingador.foto);
        holder.txvNome.setText(vingador.nome);
        holder.txvPoderes.setText(vingador.poderes);

        return view;
    }

    class VingadorHolder {

        ImageView imvFoto;
        TextView txvNome;
        TextView txvPoderes;

    }
}
