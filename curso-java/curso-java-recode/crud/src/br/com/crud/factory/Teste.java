package br.com.crud.factory;

import java.util.Date;

public class Teste {

	public static void main(String args[]) {
		
		ContatoDAO contatoDAO = new ContatoDAO();
		
		//Cria um contato e salva no banco
		Contato contato = new Contato();
		contato.setId(2);
		contato.setNome("NINA");
		contato.setIdade(24);
		contato.setDataCadastro(new Date());
		
		//contatoDAO.save(contato);
		
		//Atualiza o contato com id = 1 com os dados do objeto contato1;
		Contato contato1 = new Contato();
		contato1.setNome("WILLIAM MATA");
		contato1.setIdade(25);
		contato1.setDataCadastro(new Date());
		contato1.setId(57);
		
		contatoDAO.update(contato1);
		
		//Remove o contato com id = 1
		//contatoDAO.removeById(55);
		
		//Lista todos os contatos do banco de dados
		
		for(Contato c : contatoDAO.getContatos()) {
			
			System.out.println("NOME: " + c.getNome() + ", IDADE: " + c.getIdade() + ", DATA DE CADASTRO: " + c.getDataCadastro());
		}
		
	
		
		
		
	}
	
}
