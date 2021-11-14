package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		/*
		 * Inferencia � cria uma variavel que n�o tenha o tipo explicito
		 * ou seja voc� n�o diz claramente de que tipo el� �,
		 *  mas o valor que voc� da a variavel torna ela da quele tipo.
		 *
		 *exemplo de uma variavel explicita:
		 * double a = 14.5; 
		 *  ela � explicita pq na declara��o
		 *  j� foi definido seu tipo
		 * 
		 * exemplo de uma variavel implicita
		 * var b = 14.5;
		 *  ela � implicita pq n�o est�
		 * claro que ela � uma variavel do tipo double.
		 * seu tipo so � definido ap�s atribuir um valor a ela e toda
		 * vez que declara uma variavel desse tipo e necessario inicializala
		 * ela n�o permite a mudan�a do tipo depois de inicializada 
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
