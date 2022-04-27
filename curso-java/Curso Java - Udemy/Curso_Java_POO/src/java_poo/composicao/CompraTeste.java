package java_poo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		Compra c1 = new Compra();
		
		c1.cliente = "William";
		c1.adicionarItem("Caneta", 3, 1.50);
		c1.adicionarItem("Lapís", 2, 1.00);
		c1.adicionarItem("Caderno", 5, 10.00);
		c1.adicionarItem("Borracha", 2, 0.50);
		
		
		System.out.println(c1.itens.size());
		
		
		System.out.println("Valor Total: "+c1.getTotalValue());
		
	}
	
	

}
