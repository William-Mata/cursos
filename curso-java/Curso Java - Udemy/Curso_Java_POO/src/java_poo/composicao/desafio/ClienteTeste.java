package java_poo.composicao.desafio;

public class ClienteTeste {
	
	public static void main(String[] args) {
		Cliente cli1 = new Cliente();
		
		Compra co1 = new Compra();
		Compra co2 = new Compra();
		
		Item it1 = new Item(5);
		Item it2 = new Item(3);
		Item it3 = new Item(1);
		Item it4 = new Item(10);
		
		
		Produto p1 = new Produto("Feijao", 7.50);
		Produto p2 = new Produto("Cafe", 17.00);
		Produto p3 = new Produto("Arroz", 18.00);
		Produto p4 = new Produto("Carne", 30.00);
		
		p1.adicionarItem(it1);
		p2.adicionarItem(it2);
		p3.adicionarItem(it3);
		p4.adicionarItem(it4);
		
		
		co1.adicionarItens(it1);
		co1.adicionarItens(it2);
		co1.adicionarItens(it3);
		
		
		co2.adicionarItens(it4);
		co2.adicionarItens(it3);
		co2.adicionarItens(it2);
		co2.adicionarItens(it1);
		
		cli1.Comprar(co1);
		cli1.Comprar(co2);
		
		System.out.println(cli1.consultarTotalGasto());
		
		
		
	}
	
}
