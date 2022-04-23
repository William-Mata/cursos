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

public class AdicionarDisciplinaActivity extends AppCompatActivity {

    private EditText editxtNomeDisciplina1;
    private EditText editxtSimulado1;
    private EditText editxtSimulado2;
    private EditText editxtNtProva;
    private EditText editxtId;
    private EditText editxtNtExame;

    private Button btnSalvarDisciplinas;

    private Disciplinas disciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_disciplina);

        editxtId = (EditText)findViewById(R.id.editxtId);
        editxtNomeDisciplina1 = (EditText)findViewById(R.id.editxtNomeDisciplina1);
        editxtSimulado1 = (EditText)findViewById(R.id.editxtSimulado1);
        editxtSimulado2 = (EditText)findViewById(R.id.editxtSimulado2);
        editxtNtProva = (EditText)findViewById(R.id.editxtNtProva);
        editxtNtExame = (EditText)findViewById(R.id.editxtNtExame);

        btnSalvarDisciplinas = (Button) findViewById(R.id.btnSalvarDisciplinas);

        this.clickNoBotaoSalvarListener();

    }
    /*
     Esse metodo ficara responsavel por salvar os dados no
     Banco de dados quando o botão Salvar Disciplinas for clicado.
     */
    private void clickNoBotaoSalvarListener(){
        this.btnSalvarDisciplinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Disciplinas disciplinasACadastrar = getDadosDaDisciplinaFormulario();

                if (disciplinasACadastrar != null){
                    DisciplinasCtrl disciplinasCtrl = new
                            DisciplinasCtrl(ConexaoSQLite.getInstance(AdicionarDisciplinaActivity.this));

                    long idDisciplina = disciplinasCtrl.salvarProdutoCrtl(disciplinasACadastrar);

                    if (idDisciplina > 0){
                        Toast.makeText(AdicionarDisciplinaActivity.this,
                                "Disciplina Cadastrada Com Sucesso!",
                                Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        Toast.makeText(AdicionarDisciplinaActivity.this,
                                "Não foi possivel realizar o cadastro.",
                                Toast.LENGTH_LONG).show();
                    }

                }
                else
                {
                    Toast.makeText(AdicionarDisciplinaActivity.this,
                            "Todos os campos são Obrigatorios!",
                            Toast.LENGTH_LONG).show();
                }

                if (disciplinasACadastrar.getNtFinal() >= 5){
                    Toast.makeText(AdicionarDisciplinaActivity.this,
                            "Você já está " + disciplinasACadastrar.getSituacao() +" nessa disciplina!", Toast.LENGTH_LONG).show();

                }
                else
                {
                    if((disciplinasACadastrar.getSimulado1() !=1 ) || (disciplinasACadastrar.getSimulado2())  !=1){
                            Toast.makeText(AdicionarDisciplinaActivity.this,
                                    "Você precisa realizar os simulados para ficar mais proximo de sua aprovação, " +
                                            "no momento você está " + disciplinasACadastrar.getSituacao(),
                                    Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(AdicionarDisciplinaActivity.this,
                                "Você precisa fazer o exame final, caso ja tenha feito você está "
                                        + disciplinasACadastrar.getSituacao() +" nessa disciplina!", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

    }


    private Disciplinas getDadosDaDisciplinaFormulario(){

        this.disciplinas = new Disciplinas();

        // Pega o dado do editext id da disciplina e repassa para classe Disciplinas atributo id
        if (this.editxtId.getText().toString().isEmpty() == false){
            long id = Long.parseLong(this.editxtId.getText().toString());
            this.disciplinas.setId(id);
        }
        else
        {
            return null;
        }
        // Pega o dado do editext do nome disciplina e repassa para classe Disciplinas atributo nomeDisciplina
        if(this.editxtNomeDisciplina1.getText().toString().isEmpty() == false){
            this.disciplinas.setNomeDisciplina(this.editxtNomeDisciplina1.getText().toString());
        }
        else
        {
            return null;
        }
        // Pega o dado do editext 1° simulado e repassa para classe Disciplinas atributo simulado1
        if (this.editxtSimulado1.getText().toString().isEmpty() == false){
            int simulado1 = Integer.parseInt(this.editxtSimulado1.getText().toString());
            this.disciplinas.setSimulado1(simulado1);
            this.disciplinas.setNtFinal(this.disciplinas.getNtFinal()+simulado1);
        }
        else {
            return null;
        }
        // Pega o dado do editext 2° simulado e repassa para classe Disciplinas atributo simulado2
        if (this.editxtSimulado2.getText().toString().isEmpty() == false){
            int simulado2 = Integer.parseInt(this.editxtSimulado2.getText().toString());
            this.disciplinas.setSimulado2(simulado2);
            this.disciplinas.setNtFinal(this.disciplinas.getNtFinal()+simulado2);
        }
        else
        {
            return null;
        }
        // Pega o dado do editext da NOTA AP3 e repassa para Disciplinas atributo ap3
        if (this.editxtNtProva.getText().toString().isEmpty() == false){
            double ntProva = Double.parseDouble(this.editxtNtProva.getText().toString());
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
        // Pega o dado do editext da NOTA Exame e repassa para Disciplinas atributo exame
        if(this.editxtNtExame.getText().toString().isEmpty() == false){
            double ntExame = Double.parseDouble(this.editxtNtExame.getText().toString());
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
