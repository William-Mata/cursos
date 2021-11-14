package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		java.lang.String nome = "William";
		java.lang.String sobrenome = " de mata da silva";
		
		/*
		 * Metodo .charAt(indice);
		 * Pega um caractere da variavel String 
		 * utilizando o indice.
		 */
		System.out.println(nome.charAt(0));
		
		/*
		 * Metodo .concat("valor a ser concatenado")
		 * Concat soma dois valores de uma String
		 */
		System.out.println(nome.concat(sobrenome));
	
		/*
		 * Metodo .toUpperCase()
		 * coloca todo valor dentro da variavel 
		 * String em maiusculo
		 */
		System.out.println(nome.toUpperCase()+sobrenome.toUpperCase());
	

		/*
		 * Metodo .toLowerCase()
		 * coloca todo valor dentro da variavel 
		 * String em minusculo
		 */
		System.out.println(nome.toLowerCase()+sobrenome.toLowerCase());
	
	
		/*
		 * Metodo .startsWith(")
		 * Verifica se começa com
		 * a letra ou palavra dentro do " ";
		 */
		System.out.println(nome.startsWith("W"));
	
		/*
		 * Metodo .endsWith(")
		 * Verifica se termina com
		 * a letra ou palavra dentro do " ";
		 */
		System.out.println(nome.endsWith("m"));
	
		/*
		 * Metodo .length(")
		 * Verifica a quantidade de caracteres
		 * dentro da variavel.
		 */		
		System.out.println(nome.length());
		
		
		/*
		 * Metodo .equals(")
		 * Verifica se o conteudo da variavel são iguais.
		 */		
		System.out.println(nome.equals(sobrenome));
		
		
		/*
		 * Metodo .equalsIgnoreCase(")
		 * Verifica se o conteudo da variavel são iguais.
		 * Ignorando se são maiusculo ou minusculo
		 */		
		System.out.println(nome.equalsIgnoreCase(sobrenome));
		
		var nome2 = "Maria";
		var sobrenome2 = "Ferreira";
		var idade = 23;
		var salario = 12345.987;
		
		
	 System.out.printf("O Senhor(a) %s %s tem %d anos e recebe R$: %.2f.", nome2, sobrenome2, idade, salario);
		
	 
	 String frase = String.format("O Senhor(a) %s %s tem %d anos e recebe R$: %.2f.", nome2, sobrenome2, idade, salario);
		
	System.out.println("\n"+frase);	
	}	
	
}
