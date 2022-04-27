package java_poo.composicao.desafio;

import java.util.ArrayList;

public class Produto {
	String nome;
	Double valor;
	ArrayList<Item> itens = new ArrayList<Item>();

	
	
	public Produto(String nome, Double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}



	void adicionarItem(Item item) {
		item.produto = this;
		this.itens.add(item);
	}
}
