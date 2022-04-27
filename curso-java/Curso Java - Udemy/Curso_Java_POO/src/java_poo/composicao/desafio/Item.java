package java_poo.composicao.desafio;

public class Item {
	Compra compra;
	Integer quantidade;
	Produto produto;
	
	
	
	public Item(Integer quantidade) {
		super();
		this.quantidade = quantidade;
	}



	Double calcularValor() {
		return (this.quantidade * this.produto.valor);
	}
	
}


