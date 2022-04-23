package com.example.calculadoradenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.calculadoradenotas.acitivies.AdicionarDisciplinaActivity;
import com.example.calculadoradenotas.acitivies.ListarDisciplinasActivity;

public class MainActivity extends AppCompatActivity {

    // cria os botoes na class Main para pode-lo implementar as ações.
    private Button btnAdicionarDisciplinas;
    private Button btnGerenciarDisciplinas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Indica que os botões criados nessa classe se refere
        aos criados no arquivo acitivity_main.xml
        e aqui serão implementado suas funções/ações.
        */
        this.btnAdicionarDisciplinas = (Button)findViewById(R.id.btnAdicionarDisciplinas);
        this.btnGerenciarDisciplinas = (Button)findViewById(R.id.btnGerenciarDisciplinas);

        /*
         Esse metodo vai criar a função de mudar de activity/tela quando
         ele for clicado ele irá mudar para tela Adicionar Displina.
         */
        this.btnAdicionarDisciplinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adicionarDisciplina = new Intent(MainActivity.this, AdicionarDisciplinaActivity.class);
                startActivity(adicionarDisciplina);
            }
        });


        /*
         Esse metodo vai criar a função de mudar de activity/tela quando
         ele for clicado ele irá mudar para tela Gerenciamento Estudos.
         */
        this.btnGerenciarDisciplinas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gerenciamentoEstudos = new Intent(MainActivity.this, ListarDisciplinasActivity.class);
                startActivity(gerenciamentoEstudos);
            }
        });



    }


}