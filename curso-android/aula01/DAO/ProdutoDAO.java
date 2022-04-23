package com.example.aula01.DAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private final ConexaoSQLite conexaoSQLite;


    public ProdutoDAO(ConexaoSQLite conexaoSQLite) {
        this.conexaoSQLite = conexaoSQLite;
    }

    public long salvarProdutoDao(Produto produto){

        SQLiteDatabase db = conexaoSQLite.getWritableDatabase();

        try {
            ContentValues values = new ContentValues();
            values.put("id", produto.getId());
            values.put("nome", produto.getNome());
            values.put("quantidade_em_estoque", produto.getQuantidadeEmEstoque());
            values.put("preco", produto.getPreco());

            long idProdutoInserido = db.insert("produto", null, values);

            return idProdutoInserido;

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (db != null){
                db.close();
            }
        }

        return 0;
    }



    public List<Produto> getListaProdutosDAO(){

        List<Produto> listaProdutos = new ArrayList<>();
        SQLiteDatabase db = null;
        Cursor cursor;

        String query = "SELECT * FROM produto;";

        try {
            db = this.conexaoSQLite.getReadableDatabase();

            cursor = db.rawQuery(query, null);

            Produto produtoTemporario = null;

            if (cursor.moveToFirst()){

                do {
                    produtoTemporario = new Produto();
                    produtoTemporario.setId(cursor.getLong( 0));
                    produtoTemporario.setNome(cursor.getString(1));
                    produtoTemporario.setQuantidadeEmEstoque(cursor.getInt(2));
                    produtoTemporario.setPreco(cursor.getDouble(3));

                    listaProdutos.add(produtoTemporario);

                }while (cursor.moveToNext());
            }

        }catch (Exception e){
            Log.d("ERRO LISTA PRODUTOS", "Erro ao retorna os produtos");
            return null;

        }finally {
            if (db != null){
                db.close();
            }
        }

        return listaProdutos;
    }


    public boolean excluirProdutoDAO(long idProduto){

        SQLiteDatabase db = null;

        try {
            db = this.conexaoSQLite.getWritableDatabase();

            db.delete(
                    "produto",
                    "id = ?",
                    new String[]{String.valueOf(idProduto)}
            );


        }catch (Exception ex){
            Log.d("PRODUTODAO", "NÃO FOI POSSIVEL DELETAR O PRODUTO");
            return false;

        }finally {
            if (db != null){
                db.close();
            }
        }
        return true;
    }


    public boolean alterarProdutoDAO(Produto produto){
        SQLiteDatabase db = null;

        try {
            db = this.conexaoSQLite.getWritableDatabase();

            ContentValues produtosAtributos = new ContentValues();

            produtosAtributos.put("nome", produto.getNome());
            produtosAtributos.put("preco", produto.getPreco());
            produtosAtributos.put("quantidade_em_estoque", produto.getQuantidadeEmEstoque());

           int atualizou = db.update(
                        "produto",
                                produtosAtributos,
                   "id =? ",
                                new String[]{String.valueOf(produto.getId())}
                            );

           if (atualizou > 0 ){
               Log.d("PRODUTODAO", "PRODUTO ATUALIZADO COM SUCESSO.");
               return true;
           }

        }catch (Exception ex){
            Log.d("PRODUTODAO", "NÃO FOI POSSIVEL ALTERAR O PRODUTO");
            return false;

        }finally {
            if (db != null) {
                db.close();
            }
        }

        return false;
    }
}
