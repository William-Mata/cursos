package string;

public class StringMetodos {

	public static void main(String[] args) {
		String nome = "WilliaM";
		
		// Ser� impreso a quantidade de caracteres dentro da string nome
		// metodo length e utilizado para se saber o tamanho das variaveis
		System.out.println("A quantidade de caracteres dentro da variavel nome �: " + nome.length());
		
		
		System.out.println();
		
		// Ser� impreso o primeiro e o ultimo caractere dentro da string nome
		// metodo charArt pega o caractere indicado pelo indice que deseja.
		System.out.println("O primeiro e o ultimo caractere da variavel nome �: '" + nome.charAt(0) +"' e '" + nome.charAt(6) +"'");

		System.out.println();
		
		// Ser� impreso os caracteres dentro da string nome em minusculo
		// metodo toLowerCase e utilizado para transforma todos os caracteres em minusculo 
		System.out.println("A variavel nome em minusculo �: " + nome.toLowerCase());
		
		System.out.println();
		
		// Ser� impreso os caracteres dentro da string nome em maiusculo
		// metodo toUpperCase e utilizado para transforma todos os caracteres em maiusculo 
		System.out.println("A variavel nome em minusculo �: " + nome.toUpperCase());
		
		
	}

}
