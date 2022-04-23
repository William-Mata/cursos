package com.example.calculadoradenotas.controller;

import com.example.calculadoradenotas.DAO.DisciplinasDAO;
import com.example.calculadoradenotas.dbHelper.ConexaoSQLite;
import com.example.calculadoradenotas.model.Disciplinas;

import java.util.List;

// Essa clase e responsavel por fazer o acesso a classe DAO é uma clase de controle.
public class DisciplinasCtrl {

    private final DisciplinasDAO disciplinasDAO;

    public DisciplinasCtrl(ConexaoSQLite conexaoSQLite){
        disciplinasDAO = new DisciplinasDAO(conexaoSQLite);
    }

    // aqui a classe de controle pede a classe DAO para executar
    // query responsavel pelo salvamento das disciplinas no banco de dados.
    public long salvarProdutoCrtl(Disciplinas disciplinas){
        return  this.disciplinasDAO.salvarDisciplinaDao(disciplinas);
    }

    // aqui a classe de controle pede a classe DAO para executar
    // a query que tem a função de pegar os dados das displinas no banco de dados
    public List<Disciplinas> getListaDisciplinasCtrl(){
        return this.disciplinasDAO.getListaDisciplinasDAO();
    }

    // aqui a classe de controle pede para que a classe DAO
    // para executar a query para excluir a disciplina selecionada pelo usuario
    public boolean excluirDisciplinaCtrl(long idDisciplina){
        return this.disciplinasDAO.excluirDisciplinaDAO(idDisciplina);
    }

    // aqui a classe de controle pede para que a classe DAO
    // executar a query para salvar as alterações feitas em uma disciplina
    //selecionada pelo usuario
    public boolean alterarDisciplinaCtrl(Disciplinas disciplinas){
        return this.disciplinasDAO.alterarDisciplinaDAO(disciplinas);
    }
}
