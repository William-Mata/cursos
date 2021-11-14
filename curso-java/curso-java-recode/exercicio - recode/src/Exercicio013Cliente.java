public class Exercicio013Cliente {
	private String nome, cpf;
	int num = 1;
	double total;
	Exercicio013Pedidos pedido = new Exercicio013Pedidos();
	
	public Exercicio013Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		//this.pedido.setCodigo(num++); 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void informacoesPedido() {
		System.out.println("Nome do cliente: " + this.nome);
		System.out.println("CPF do cliente: " + this.cpf);
		System.out.println("Total das vendas: " + pedido.getPrecoTotal());
	}
	
	
}
