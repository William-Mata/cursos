package com.example.calculadoradenotas.acitivies;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.calculadoradenotas.R;
import com.example.calculadoradenotas.adapters.AdapterListaDisciplinas;
import com.example.calculadoradenotas.controller.DisciplinasCtrl;
import com.example.calculadoradenotas.dbHelper.ConexaoSQLite;
import com.example.calculadoradenotas.model.Disciplinas;

import java.util.List;

public class ListarDisciplinasActivity extends AppCompatActivity {

    private ListView lvDisciplinas;
    private List<Disciplinas> disciplinasList;
    private AdapterListaDisciplinas adapterListaDisciplinas;

    private DisciplinasCtrl disciplinasCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_disciplinas);

        // Aqui está sendo instanciado uma DisciplinasCtrl passando a coxexaoSql.
        this.disciplinasCtrl = new DisciplinasCtrl(ConexaoSQLite.getInstance(ListarDisciplinasActivity.this));

        // Aqui está sendo excutado o metodo
        // getListaDisciplinasCtrl que tem como objetivo passa as disciplina para a disciplinaslList
        this.disciplinasList = this.disciplinasCtrl.getListaDisciplinasCtrl();

        // Aqui e declarado que o List View lvDisciplina desta classe
        // está ligado ao do layout activity_listar_disciplinas.xml
        this.lvDisciplinas = (ListView) findViewById(R.id.lvDisciplinas);

        // Aqui é instanciado o AdapterListaDisciplinas passando
        // a activity que está instanciando e a lista de disciplinas
        // para que ele faça a adaptação para o list view.
        this.adapterListaDisciplinas = new AdapterListaDisciplinas(ListarDisciplinasActivity.this,
                this.disciplinasList);

        //Aqui o List View utiliza o adapter ja com as informações para imprimir o conteúdo passado na disciplinasList
        this.lvDisciplinas.setAdapter(this.adapterListaDisciplinas);

        //Esse metodo irá criar um caixa de dialogo com as opções
        // de Cancelar, Altera e Remover as disciplinas no List View
        this.lvDisciplinas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int posicao, long l) {

                final Disciplinas disciplinaSelecionada = (Disciplinas) adapterListaDisciplinas.getItem(posicao);

                AlertDialog.Builder janelaDeEscolha = new AlertDialog.Builder(ListarDisciplinasActivity.this);

                janelaDeEscolha.setTitle("Escolha: ");

                janelaDeEscolha.setMessage("O que deseja fazer com a disciplina selecionada? ");

                janelaDeEscolha.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                janelaDeEscolha.setNegativeButton("Excluir", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        boolean excluiu = disciplinasCtrl.excluirDisciplinaCtrl(disciplinaSelecionada.getId());


                        if (excluiu == true){

                            adapterListaDisciplinas.removerDisciplinas(posicao);

                            Toast.makeText(ListarDisciplinasActivity.this,
                                    "Disciplina Excluida com sucesso.", Toast.LENGTH_LONG).show();

                        }else{
                            Toast.makeText(ListarDisciplinasActivity.this,
                                    "Não foi possivel excluir a disciplina.", Toast.LENGTH_LONG).show();
                        }
                    }
                });

                janelaDeEscolha.setPositiveButton("Alterar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Bundle bundleDadosDisciplinas = new Bundle();

                        bundleDadosDisciplinas.putLong("id_disciplinas", disciplinaSelecionada.getId());
                        bundleDadosDisciplinas.putString("nome_disciplinas", disciplinaSelecionada.getNomeDisciplina());
                        bundleDadosDisciplinas.putInt("simulado1_disciplinas", disciplinaSelecionada.getSimulado1());
                        bundleDadosDisciplinas.putInt("simulado2_disciplinas", disciplinaSelecionada.getSimulado2());
                        bundleDadosDisciplinas.putDouble("nota_prova_disciplinas", disciplinaSelecionada.getProva());
                        bundleDadosDisciplinas.putDouble("nota_exame_disciplinas" , disciplinaSelecionada.getExame());
                        bundleDadosDisciplinas.putDouble("nota_final_disciplinas", disciplinaSelecionada.getNtFinal());
                        bundleDadosDisciplinas.putString("situacao_disciplinas", disciplinaSelecionada.getSituacao());

                        Intent intentEditarDisciplinas = new Intent(ListarDisciplinasActivity.this,
                                AlterarDisciplinaActivity.class);
                        intentEditarDisciplinas.putExtras(bundleDadosDisciplinas);
                        startActivity(intentEditarDisciplinas);
                    }
                });

                janelaDeEscolha.create().show();
            }
        });

    }

    public void eventAtulizasLista(View view)
    {
        this.adapterListaDisciplinas.alterarDisciplina(this.disciplinasCtrl.getListaDisciplinasCtrl());
    }
}