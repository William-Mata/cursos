import java.util.ArrayList;

public class Exercicio013Pedidos {
	private ArrayList<String> nomeProduto = new ArrayList<String>();
	private ArrayList<Integer> preco = new ArrayList<Integer>();
	private ArrayList<Integer> codigo = new ArrayList<Integer>();
	private ArrayList<Integer >qtdProduto = new ArrayList<Integer>();
	private double precoTotal;
	
	
	public void informacoes() {
		
		for(int aux = 0; aux <= codigo.size(); aux++) {
			System.out.print(codigo.get(aux));
			System.out.println(nomeProduto.get(aux));
			System.out.println( preco.get(aux));
			System.out.println( qtdProduto.get(aux));
		}
	}
	
	public ArrayList<Integer> getPreco() {
		return preco;
	}

	public void setPreco(ArrayList<Integer> preco) {
		this.preco = preco;
	}

	public ArrayList<Integer> getCodigo() {
		return codigo;
	}

	public void setCodigo(ArrayList<Integer> codigo) {
		this.codigo = codigo;
	}

	public ArrayList<Integer> getQtdProduto() {
		return qtdProduto;
	}

	public void setQtdProduto(ArrayList<Integer> qtdProduto) {
		this.qtdProduto = qtdProduto;
	}

	public double getPrecoTotal() {
		
		for(int aux = 0; aux <= preco.size(); aux++) {
			this.precoTotal += preco.get(aux);
		}
		
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public ArrayList<String> getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(ArrayList<String> nomeProduto) {
		this.nomeProduto = nomeProduto;
	}	

  
}
