package java_poo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}	
	
	void adicionarItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double getTotalValue() {
		double valorTotal = 0;
		for(Item item: itens) {
			valorTotal+= item.quantidade * item.preco;			
		}
		return valorTotal;
	}

	
}
