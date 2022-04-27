package java_poo.heranca;

public class Cliente {
	private String nome, CPF = "";
	
	
	public String getNome() {
		System.out.print("\nNome do cliente:  ");
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		System.out.print("\nCPF do cliente: ");
		return CPF;
	}
	public void setCPF(String cPF) {
		this.CPF = cPF;
	}
	
	

}
