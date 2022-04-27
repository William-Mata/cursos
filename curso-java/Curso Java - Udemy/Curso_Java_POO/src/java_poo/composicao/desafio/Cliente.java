package java_poo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> compras = new ArrayList<Compra>();

	Double consultarTotalGasto() {
		Double valorTotal = 0d;
		
		for (Compra compra : compras) {
			valorTotal += compra.obterTotalCompra();
		}
		
		return valorTotal;
	}
	
	
	void Comprar(Compra compra) {
		this.compras.add(compra);
		
	}
	
}
