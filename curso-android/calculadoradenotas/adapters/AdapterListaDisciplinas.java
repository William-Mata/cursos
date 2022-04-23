package com.example.calculadoradenotas.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.calculadoradenotas.R;
import com.example.calculadoradenotas.model.Disciplinas;

import java.util.List;

public class AdapterListaDisciplinas extends BaseAdapter {

    private Context context;
    private List<Disciplinas> disciplinasList;

    public AdapterListaDisciplinas(Context context, List<Disciplinas> disciplinasList) {
        this.context = context;
        this.disciplinasList = disciplinasList;
    }

    @Override
    public int getCount() {
        return this.disciplinasList.size();
    }

    @Override
    public Object getItem(int posicao) {
        return this.disciplinasList.get(posicao);
    }

    @Override
    public long getItemId(int posicao) {
        return posicao;
    }

    public void removerDisciplinas(int posicao){
        this.disciplinasList.remove(posicao);
        notifyDataSetChanged();
    }

    public void alterarDisciplina(List<Disciplinas> disciplinas){
        this.disciplinasList.clear();
        this.disciplinasList = disciplinas;
        notifyDataSetChanged();
    }

    @Override
    public View getView(int posicao, View view, ViewGroup viewGroup) {

        View v = View.inflate(this.context, R.layout.layout_disciplinas, null);

        TextView txvNomeDisciplina = (TextView)v.findViewById(R.id.txvNomeDisciplina);
        TextView txvSimuladoA = (TextView)v.findViewById(R.id.txvSimuladoA);
        TextView txvSimuladoB = (TextView)v.findViewById(R.id.txvSimuladoB);
        TextView txvNtProva = (TextView)v.findViewById(R.id.txvNtProva);
        TextView txvNtExame = (TextView)v.findViewById(R.id.txvNtExame);
        TextView txvNtFinal = (TextView)v.findViewById(R.id.txvNtFinal);
        TextView txvSituacao = (TextView)v.findViewById(R.id.txvSituacao);

        txvNomeDisciplina.setText(this.disciplinasList.get(posicao).getNomeDisciplina());
        txvSimuladoA.setText(String.valueOf(this.disciplinasList.get(posicao).getSimulado1()));
        txvSimuladoB.setText(String.valueOf(this.disciplinasList.get(posicao).getSimulado2()));
        txvNtProva.setText(String.valueOf(this.disciplinasList.get(posicao).getProva()));
        txvNtExame.setText(String.valueOf(this.disciplinasList.get(posicao).getExame()));
        txvNtFinal.setText(String.valueOf(this.disciplinasList.get(posicao).getNtFinal()));
        txvSituacao.setText(String.valueOf(this.disciplinasList.get(posicao).getSituacao()));


        return v;
    }
}
