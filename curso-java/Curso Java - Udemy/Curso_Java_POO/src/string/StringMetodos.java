package string;

public class StringMetodos {

	public static void main(String[] args) {
		String nome = "WilliaM";
		
		// Será impreso a quantidade de caracteres dentro da string nome
		// metodo length e utilizado para se saber o tamanho das variaveis
		System.out.println("A quantidade de caracteres dentro da variavel nome é: " + nome.length());
		
		
		System.out.println();
		
		// Será impreso o primeiro e o ultimo caractere dentro da string nome
		// metodo charArt pega o caractere indicado pelo indice que deseja.
		System.out.println("O primeiro e o ultimo caractere da variavel nome é: '" + nome.charAt(0) +"' e '" + nome.charAt(6) +"'");

		System.out.println();
		
		// Será impreso os caracteres dentro da string nome em minusculo
		// metodo toLowerCase e utilizado para transforma todos os caracteres em minusculo 
		System.out.println("A variavel nome em minusculo é: " + nome.toLowerCase());
		
		System.out.println();
		
		// Será impreso os caracteres dentro da string nome em maiusculo
		// metodo toUpperCase e utilizado para transforma todos os caracteres em maiusculo 
		System.out.println("A variavel nome em minusculo é: " + nome.toUpperCase());
		
		
	}

}
