package com.example.calculadoradenotas.DAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.calculadoradenotas.dbHelper.ConexaoSQLite;
import com.example.calculadoradenotas.model.Disciplinas;

import java.util.ArrayList;
import java.util.List;

// Essa clase e responsavel por realizar a execução das querys
// que acessam ao banco de dados para fazer escrita e leitura em seus dados.
public class DisciplinasDAO {

    //declara uma conexao com o SQLite
    private final ConexaoSQLite conexaoSQLite;


    // contrutor da classe
    public DisciplinasDAO(ConexaoSQLite conexaoSQLite) {
        this.conexaoSQLite = conexaoSQLite;
    }


    /*
    Esse metodo pega os dados da classe Disciplinas e repassa para o Banco de Dados.
    Ele cria uma conexao de escrita com banco de dados e com isso ele consegue armazenar os dados.
     */
    public long salvarDisciplinaDao(Disciplinas disciplinas){

        SQLiteDatabase db = conexaoSQLite.getWritableDatabase();


        try {
            ContentValues values = new ContentValues();
            values.put("id", disciplinas.getId());
            values.put("nome", disciplinas.getNomeDisciplina());
            values.put("simulado1", disciplinas.getSimulado1());
            values.put("simulado2", disciplinas.getSimulado2());
            values.put("nota_prova", disciplinas.getProva());
            values.put("nota_exame", disciplinas.getExame());
            values.put("nota_final", disciplinas.getNtFinal());
            values.put("situacao", disciplinas.getSituacao());

            long idDisciplinaInserida = db.insert("disciplinas", null, values);

            return idDisciplinaInserida;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (db != null){
                db.close();
            }
        }

        return 0;
    }


    /*
    Esse metodo fica responsavel por criar uma
     lista das disciplinas que estão armazenadas no banco de dados.
     Com isso e possivel listar as disciplinas em um list view entre outras coisas.
     Aqui e criado uma conexão de leitura no banco de dados.
     */
    public List<Disciplinas> getListaDisciplinasDAO(){

        List<Disciplinas> listaDisciplinas = new ArrayList<>();
        SQLiteDatabase db = null;
        Cursor cursor;

        String query = "SELECT * FROM disciplinas;";

        try {
            db = this.conexaoSQLite.getReadableDatabase();

            cursor = db.rawQuery(query, null);

            Disciplinas disciplinaTemporaria = null;

            if (cursor.moveToFirst()){

                do {
                    disciplinaTemporaria = new Disciplinas();

                    disciplinaTemporaria.setId(cursor.getLong(0));
                    disciplinaTemporaria.setNomeDisciplina(cursor.getString(1));
                    disciplinaTemporaria.setSimulado1(cursor.getInt(2));
                    disciplinaTemporaria.setSimulado2(cursor.getInt(3));
                    disciplinaTemporaria.setProva(cursor.getDouble(4));
                    disciplinaTemporaria.setExame(cursor.getDouble(5));
                    disciplinaTemporaria.setNtFinal(cursor.getDouble(6));
                    disciplinaTemporaria.setSituacao(cursor.getString(7));

                    listaDisciplinas.add(disciplinaTemporaria);

                }while (cursor.moveToNext());
            }

        }catch (Exception e){
            Log.d("ERRO LISTA DISCIPLINAS", "Erro ao retorna as Disciplinas");
            return null;

        }finally {
            if (db != null){
                db.close();
            }
        }

        return listaDisciplinas;
    }


    /*
    Esse metodo terá a função de excluir uma disciplina selecionada pelo o usuario do sistema.
     */
    public boolean excluirDisciplinaDAO(long idDisciplinas){

        SQLiteDatabase db = null;

        try {
            db = this.conexaoSQLite.getWritableDatabase();

            db.delete(
                    "disciplinas",
                    "id = ?",
                    new String[]{String.valueOf(idDisciplinas)}
            );


        }catch (Exception ex){
            Log.d("DISCIPLINASDAO", "NÃO FOI POSSIVEL DELETAR A DISCIPLINA");
            return false;

        }finally {
            if (db != null){
                db.close();
            }
        }
        return true;
    }


    /*
    Esse metodo terá a função de alterar os dados de uma disciplina selecionada pelo o usuario do sistema.
     */
    public boolean alterarDisciplinaDAO(Disciplinas disciplinas){
        SQLiteDatabase db = null;

        try {
            db = this.conexaoSQLite.getWritableDatabase();

            ContentValues DisciplinasAtributos = new ContentValues();

            DisciplinasAtributos.put("nome", disciplinas.getNomeDisciplina());
            DisciplinasAtributos.put("simulado1", disciplinas.getSimulado1());
            DisciplinasAtributos.put("simulado2", disciplinas.getSimulado2());
            DisciplinasAtributos.put("nota_prova", disciplinas.getProva());
            DisciplinasAtributos.put("nota_exame", disciplinas.getExame());
            DisciplinasAtributos.put("nota_final", disciplinas.getNtFinal());


            int atualizou = db.update(
                    "disciplinas",
                    DisciplinasAtributos,
                    "id =? ",
                    new String[]{String.valueOf(disciplinas.getId())}
            );

            if (atualizou > 0 ){
                Log.d("DISCIPLINADAO", "DISCIPLINA ATUALIZADA COM SUCESSO.");
                return true;
            }

        }catch (Exception ex){
            Log.d("DISCIPLINADAO", "NÃO FOI POSSIVEL ALTERAR A DISCIPLINA");
            return false;

        }finally {
            if (db != null) {
                db.close();
            }
        }

        return false;
    }
}
