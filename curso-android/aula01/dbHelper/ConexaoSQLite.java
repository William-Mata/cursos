package com.example.aula01.dbHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexaoSQLite extends SQLiteOpenHelper {

    private static ConexaoSQLite INSTANCIA_CONEXAO;
    private static final int VERSAO_DB = 1;
    private static final String NOME_DB = "produtos_app";

    public ConexaoSQLite(@Nullable Context context) {
        super(context, NOME_DB, null, VERSAO_DB);
    }

    public static ConexaoSQLite getInstance(Context context) {
        if (INSTANCIA_CONEXAO == null) ;
        {
            INSTANCIA_CONEXAO = new ConexaoSQLite(context);
        }

        return INSTANCIA_CONEXAO;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sqlTabelaProduto =
                "CREATE TABLE IF NOT EXISTS produto" +
                        "("+
                        "id INTEGER PRIMARY KEY,"+
                        "nome TEXT,"+
                        "quantidade_em_estoque INTEGER,"+
                        "preco REAL"+
                        ")";

        sqLiteDatabase.execSQL(sqlTabelaProduto);

        String sqlTabelaVenda =
                "CREATE TABLE IF NOT EXISTS venda" +
                        "(" +
                        "id INTEGER PRIMARY KEY," +
                        "data INTEGER" +
                        ")";

        sqLiteDatabase.execSQL(sqlTabelaVenda);

        String sqlItemDaVenda =
                "CREATE TABLE IF NOT EXISTS item_da_venda" +
                        "(" +
                        "id INTEGER PRIMARY KEY," +
                        "quantidade_de_itens INTEGER," +
                        "id_produto INTEGER," +
                        "id_venda INTEGER"+
                        ")" ;

        sqLiteDatabase.execSQL(sqlItemDaVenda);
    };

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
