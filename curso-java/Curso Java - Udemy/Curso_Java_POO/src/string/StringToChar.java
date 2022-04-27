package string;

public class StringToChar {

	public static void main(String[] args) {
		String nome = "william";
		char nome1[] = new char[8];
		
		
		System.out.println("Antes de passar, variavel nome");
		System.out.println();
		System.out.println(nome);
		System.out.println();
		
		System.out.println("Antes de passar, variavel nome1");
		System.out.println();
		System.out.println(nome1);
		System.out.println();
		
		
		/*
		 * Metodo toCharArray transfere o string para um vetor de char
		 * Exemplo abaixo passei uma string com 7 caracteres para um vetor com 8 indices.
		 */
		nome1 = nome.toCharArray();
		
		
		System.out.println("Depois de passar, variavel nome");
		System.out.println();
		System.out.println(nome);
		System.out.println();
		
		System.out.println("Depois de passar, variavel nome1");
		System.out.println();
		System.out.print(nome1[0]);
		System.out.print(nome1[1]);
		System.out.print(nome1[2]);
		System.out.print(nome1[3]);
		System.out.print(nome1[4]);
		System.out.print(nome1[5]);
		System.out.print(nome1[6]);
		System.out.println();
		
	}

}
