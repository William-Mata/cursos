package br.com.crud.factory;

import java.util.Date;

public class Contato {

	
	private int id;
	private String nome;
	private int idade;
	private Date dataCadatro;
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public Date getDataCadastro() {
		return this.dataCadatro;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadatro = dataCadastro;
	}
}
