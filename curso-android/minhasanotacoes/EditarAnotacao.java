package com.example.minhasanotacoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


import com.example.minhasanotacoes.bancodedados.BancoDeDados;

public class EditarAnotacao extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_anotacao);

        BancoDeDados bancoDeDados = new BancoDeDados(getBaseContext());
        final Cursor cursor = bancoDeDados.consultarAnotacaoPeloId(this.getIntent().getIntExtra("id", 0));

        EditText titulo = (EditText) findViewById(R.id.campoTituloAlterar);
        EditText conteudo = (EditText) findViewById(R.id.campoConteudo);


        titulo.setText(cursor.getString(cursor.getColumnIndexOrThrow("titulo")));
        conteudo.setText(cursor.getString(cursor.getColumnIndexOrThrow("conteudo")));

    }

    public void voltar(View v) {
        Intent startNewActivity = new Intent(this, TelaInicial.class);
        startActivity(startNewActivity);
    }

    public void atualizarAnotacao(View v) {
        BancoDeDados bancoDeDados = new BancoDeDados(getBaseContext());
        EditText titulo = (EditText)findViewById(R.id.campoTituloAlterar);
        EditText conteudo = (EditText)findViewById(R.id.campoConteudo);

        try {
            bancoDeDados.atualizaAnotacao(this.getIntent().getIntExtra("id", 0),
                    titulo.getText().toString(), conteudo.getText().toString());
            Toast.makeText(getApplicationContext(), "Anotaçao Atualizada com sucesso", Toast.LENGTH_LONG).show();

        }catch (Exception ex){
            Toast.makeText(getApplicationContext(), "Não foi possivel atualizar a anotação tente novamente.", Toast.LENGTH_LONG).show();

            voltar(v);
            
        }
    }

    public void excluirAnotacao(View v) {
        BancoDeDados bancoDeDados = new BancoDeDados(getBaseContext());

        EditText titulo = (EditText)findViewById(R.id.campoTituloAlterar);
        EditText conteudo = (EditText)findViewById(R.id.campoConteudo);

        try {
            bancoDeDados.excluiAnotacao(this.getIntent().getIntExtra("id", 0));
            Toast.makeText (getApplicationContext(), "Anotaçao Excluida com sucesso",
                    Toast.LENGTH_LONG).show();

        }catch (Exception ex){
            Toast.makeText(getApplicationContext(),
                    "Não foi possivel excluir a anotação tente novamente.",
                    Toast.LENGTH_LONG).show();

            voltar(v);

        }
    }


}