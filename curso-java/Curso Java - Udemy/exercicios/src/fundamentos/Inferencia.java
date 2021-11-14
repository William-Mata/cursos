package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		/*
		 * Inferencia é cria uma variavel que não tenha o tipo explicito
		 * ou seja você não diz claramente de que tipo elá é,
		 *  mas o valor que você da a variavel torna ela da quele tipo.
		 *
		 *exemplo de uma variavel explicita:
		 * double a = 14.5; 
		 *  ela é explicita pq na declaração
		 *  já foi definido seu tipo
		 * 
		 * exemplo de uma variavel implicita
		 * var b = 14.5;
		 *  ela é implicita pq não está
		 * claro que ela é uma variavel do tipo double.
		 * seu tipo so é definido após atribuir um valor a ela e toda
		 * vez que declara uma variavel desse tipo e necessario inicializala
		 * ela não permite a mudança do tipo depois de inicializada 
		 * assim como a explicita.
		 */
		
		
		// variavel implicita do tipo char
		var a = 'a';
		System.out.println(a);
		
		// variavel implicita do tipo double
		var b = 4.5;
		System.out.println(b);
		
		// variavel implicita do tipo inteiro
		var c = 4;
		System.out.println(c);

		// Objeto implicito do tipo String
		var d ="Texto";
		System.out.println(d);

	}
	
}
