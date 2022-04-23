package com.example.aula01.DAO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.aula01.dbHelper.ConexaoSQLite;
import com.example.aula01.model.ItemDoCarrinho;
import com.example.aula01.model.Venda;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendaDAO {

    private final ConexaoSQLite conexaoSQLite;

    public VendaDAO(ConexaoSQLite conexaoSQLite) {
        this.conexaoSQLite = conexaoSQLite;
    }

    public long salvarVendaDao(Venda venda){
        SQLiteDatabase db = conexaoSQLite.getWritableDatabase();

        try{
            ContentValues contentValues = new ContentValues();

            contentValues.put("data", venda.getDataDaVenda().getTime());

            long idVendaInserido = db.insert(
              "venda",
                    null,
                    contentValues
            );

            return idVendaInserido;
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if (db != null){
                db.close();
            }
        }

        return 0;

    }

    public boolean salvarItensDaVendaDAO(Venda venda){

        SQLiteDatabase db = conexaoSQLite.getWritableDatabase();

        try{
           
            ContentValues contentValues = null;

            for (ItemDoCarrinho itemDaVenda: venda.getListItemDoCarrinho()) {
                contentValues = new ContentValues();
                contentValues.put("quantidade_de_itens", itemDaVenda.getQuantidadeSelecionada());
                contentValues.put("id_produto", itemDaVenda.getIdProduto());
                contentValues.put("id_venda", venda.getId());

                db.insert("item_da_venda",
                        null,
                        contentValues
                );


            }
            return true;
           
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if (db != null){
                db.close();
            }
        }
        return false;
    }

    public List<Venda> listarVendasDAO() {
        List<Venda> listaVenda = new ArrayList<>();
        SQLiteDatabase db = null;
        Cursor cursor;

        String query =
                "SELECT " +
                        " venda.id," +
                        " venda.data," +
                        " SUM(produto.preco * item_da_venda.quantidade_de_itens)," +
                        " SUM(item_da_venda.quantidade_de_itens)" +
                        " FROM venda" +
                        " INNER JOIN item_da_venda ON (venda.id = item_da_venda.id_venda)" +
                        " INNER JOIN produto ON (item_da_venda.id_produto = produto.id)" +
                        " GROUP BY venda.id;";

        try {
            db = this.conexaoSQLite.getReadableDatabase();

            cursor = db.rawQuery(query, null);

            if (cursor.moveToFirst()){
                Venda vendatemp = null;

                do {
                    vendatemp = new Venda();
                    vendatemp.setId(cursor.getLong(0));
                    vendatemp.setDataDaVenda(new Date(cursor.getLong(1)));
                    vendatemp.setTotalVenda(cursor.getDouble(2));
                    vendatemp.setQtdItens(cursor.getInt(3));

                    listaVenda.add(vendatemp);
                }while (cursor.moveToNext());
            }


        }catch (Exception e){
            Log.d("ERRO VENDASDAO", "ERRO AO RETORNA AS VENDAS.");

        }finally {
            if (db != null){
                db.close();
            }
        }



        return listaVenda;

    }
}
