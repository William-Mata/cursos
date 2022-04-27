package java_poo.composicao.desafio;

import java.util.ArrayList;

import java_poo.heranca.Cliente;

public class Compra {
	Cliente cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	
	
	Double obterTotalCompra() {
		Double total = 0d;
		
		for (Item item : itens) {
			total += item.calcularValor();
		}
		
		return total;
	}
	
	void adicionarItens(Item item) {
		item.compra = this;
		this.itens.add(item);
		
	}
}


