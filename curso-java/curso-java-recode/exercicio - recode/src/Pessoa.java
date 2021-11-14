
public class Pessoa {
	
	String nome;
	int idade;
	double altura, peso;
	char sexo;
	boolean casado;
	
	
	
	public Pessoa(String nome, int idade, double altura, double peso, char sexo, boolean casado) {
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
		this.casado = casado;
	}
	
	public void Informacoes() {
		
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
		System.out.println("Peso: " + this.peso);
		System.out.println("Sexo: " + this.sexo);
		System.out.println("Casado: " + this.casado);
	}
	
	public void Falar() {
		System.out.println("Hello Word!!!");
	}
	
	public void Andar() {
		System.out.println("Andando....");
	}
	
	public void Correr() {
		System.out.println("Correndo....");
	}
	
	public void Respirar() {
		System.out.println("Respirando....");
	}
	
}
