package com.example.calculadoradenotas.dbHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ConexaoSQLite extends SQLiteOpenHelper{
    /*
     Aqui foi declarado uma instancia da conexaoSQLite,
     a versão do banco de dados e o banco de dados disciplinas_app
     */
    private static ConexaoSQLite INSTANCIA_CONEXAO;
    private static final int VERSAO_DB = 1;
    private static final String NOME_DB = "disciplinas_app";

    // Quando a conexao for estanciada sera necessario passar o context,
    public ConexaoSQLite(@Nullable Context context) {
        super(context, NOME_DB, null, VERSAO_DB);
    }

    // atraves desse meto será possivel pegar a instancia da conexão SQLite.
    public static ConexaoSQLite getInstance(Context context) {
        if (INSTANCIA_CONEXAO == null) ;
        {
            INSTANCIA_CONEXAO = new ConexaoSQLite(context);
        }

        return INSTANCIA_CONEXAO;
    }
    /*
     Criação da tabela disciplinas onde ira fica armazenado
    os dados como o id, nome, simulado1, simulado2, nota_ap3 e nota_final
     */
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String sqlTabelaDisciplinas =
                "CREATE TABLE IF NOT EXISTS disciplinas" +
                        "(" +
                        "id INTEGER PRIMARY KEY," +
                        "nome TEXT," +
                        "simulado1 INTEGER," +
                        "simulado2 INTEGER," +
                        "nota_prova REAL," +
                        "nota_exame REAL," +
                        "nota_final REAL," +
                        "situacao TEXT" +
                        ")";

        sqLiteDatabase.execSQL(sqlTabelaDisciplinas);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
