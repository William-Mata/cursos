package com.example.calculadoradenotas.acitivies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.calculadoradenotas.R;
import com.example.calculadoradenotas.controller.DisciplinasCtrl;
import com.example.calculadoradenotas.dbHelper.ConexaoSQLite;
import com.example.calculadoradenotas.model.Disciplinas;

public class AlterarDisciplinaActivity extends AppCompatActivity {

    Disciplinas disciplinas = new Disciplinas();

    private EditText editxAlterartId;
    private EditText editxtAlterarNomeDisciplina1;
    private EditText editxtAlterarSimulado1;
    private EditText editxtAlterarSimulado2;
    private EditText editxtAlterarNtProva;
    private EditText editxtAlterarNtExame;

    private Button btnSalvarAlteracaoDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_disciplina);

        editxAlterartId = (EditText)findViewById(R.id.editxAlterartId);
        editxtAlterarNomeDisciplina1 = (EditText)findViewById(R.id.editxtAlterarNomeDisciplina1);
        editxtAlterarSimulado1 = (EditText)findViewById(R.id.editxtAlterarSimulado1);
        editxtAlterarSimulado2 = (EditText)findViewById(R.id.editxtAlterarSimulado2);
        editxtAlterarNtProva = (EditText)findViewById(R.id.editxtAlterarNtProva);
        editxtAlterarNtExame = (EditText)findViewById(R.id.editxtAlterarNtExame);

        btnSalvarAlteracaoDisciplinas = (Button)findViewById(R.id.btnSalvarAlteracaoDisciplinas);


        Bundle bundleDadosDisciplinas = getIntent().getExtras();

        Disciplinas disciplinas = new Disciplinas();

        disciplinas.setId(bundleDadosDisciplinas.getLong("id_disciplinas"));
        disciplinas.setNomeDisciplina(bundleDadosDisciplinas.getString("nome_disciplinas"));
        disciplinas.setSimulado1(bundleDadosDisciplinas.getInt("simulado1_disciplinas"));
        disciplinas.setSimulado2(bundleDadosDisciplinas.getInt("simulado2_disciplinas"));
        disciplinas.setProva(bundleDadosDisciplinas.getDouble("nota_prova_disciplinas"));
        disciplinas.setExame(bundleDadosDisciplinas.getDouble("nota_exame_disciplinas"));
        disciplinas.setNtFinal(bundleDadosDisciplinas.getDouble("nota_final_disciplinas"));

        this.setDadosProdutos(disciplinas);

        this.clickNoBotaoSalvarAlteracaoListener();

    }


    private void setDadosProdutos(Disciplinas disciplinas){

        this.editxAlterartId.setText(String.valueOf(disciplinas.getId()));
        this.editxtAlterarNomeDisciplina1.setText(disciplinas.getNomeDisciplina());
        this.editxtAlterarSimulado1.setText(String.valueOf(disciplinas.getSimulado1()));
        this.editxtAlterarSimulado2.setText(String.valueOf(disciplinas.getSimulado2()));
        this.editxtAlterarNtProva.setText(String.valueOf(disciplinas.getProva()));
        this.editxtAlterarNtExame.setText(String.valueOf(disciplinas.getExame()));

    }

    private void clickNoBotaoSalvarAlteracaoListener(){
        this.btnSalvarAlteracaoDisciplinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Disciplinas disciplinaaAlterar = getDadosProdutoFormulario();

                if (disciplinaaAlterar != null){
                    DisciplinasCtrl produtoCtrl = new DisciplinasCtrl(ConexaoSQLite.getInstance
                            (AlterarDisciplinaActivity.this));
                    boolean atualizou = produtoCtrl.alterarDisciplinaCtrl(disciplinaaAlterar);

                    if (atualizou == true){
                        Toast.makeText(AlterarDisciplinaActivity.this,"Disciplina Alterado Com Sucesso!",
                                Toast.LENGTH_LONG ).show();
                    }
                    else
                    {
                        Toast.makeText(AlterarDisciplinaActivity.this,
                                "Não foi possivel realizar a alteração da disciplina.",
                                Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(AlterarDisciplinaActivity.this, "Todos os campos são Obrigatorios!",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    private Disciplinas getDadosProdutoFormulario(){

        this.disciplinas = new Disciplinas();

        if(this.editxAlterartId.getText().toString().isEmpty() == false){
            long idDisciplina = Long.parseLong(editxAlterartId.getText().toString());
            this.disciplinas.setId(idDisciplina);
        }
        else
        {
            return null;
        }

        if(this.editxtAlterarNomeDisciplina1.getText().toString().isEmpty() == false){
            this.disciplinas.setNomeDisciplina(this.editxtAlterarNomeDisciplina1.getText().toString());
        }
        else
        {
            return null;
        }

        if (this.editxtAlterarSimulado1.getText().toString().isEmpty() == false){
            int simulado1 = Integer.parseInt(this.editxtAlterarSimulado1.getText().toString());
            this.disciplinas.setSimulado1(simulado1);
            this.disciplinas.setNtFinal(this.disciplinas.getNtFinal()+simulado1);
        }
        else
        {
            return null;
        }

        if (this.editxtAlterarSimulado2.getText().toString().isEmpty() == false){
            int simulado2 = Integer.parseInt(this.editxtAlterarSimulado2.getText().toString());
            this.disciplinas.setSimulado2(simulado2);
            this.disciplinas.setNtFinal(this.disciplinas.getNtFinal()+simulado2);
        }
        else
        {
            return null;
        }

        if (this.editxtAlterarNtProva.getText().toString().isEmpty() == false){
            double ntProva = Double.parseDouble(this.editxtAlterarNtProva.getText().toString());
            this.disciplinas.setProva(ntProva);

            if (ntProva < 5){
                this.disciplinas.setNtFinal(this.disciplinas.getNtFinal()+ntProva);
            }
            else
            {
                this.disciplinas.setNtFinal(ntProva);
            }

            if (this.disciplinas.getNtFinal() >= 5){
                this.disciplinas.setSituacao("Aprovado");
            }
            else
            {
                this.disciplinas.setSituacao("Recuperação");
            }

        }
        else
        {
            return null;
        }

        if(this.editxtAlterarNtExame.getText().toString().isEmpty() == false){
            double ntExame = Double.parseDouble(this.editxtAlterarNtExame.getText().toString());
            this.disciplinas.setExame(ntExame);

            if (this.disciplinas.getNtFinal() < 5){
                this.disciplinas.setNtFinal((this.disciplinas.getNtFinal() + ntExame) / 2 );

                if (this.disciplinas.getNtFinal() >= 5){
                    this.disciplinas.setSituacao("Aprovado");
                }
                else
                {
                    this.disciplinas.setSituacao("Reprovado");
                }
            }

        }

        return disciplinas;
    }
}