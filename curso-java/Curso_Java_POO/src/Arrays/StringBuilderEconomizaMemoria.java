package Arrays;

public class StringBuilderEconomizaMemoria {

	public static void main(String[] args) {
		/*
		 * O StringBuilder ele economiza espaço de memoria, na manipulação de string
		 * Ele não cria varios objetos a cada modificação na String
		 * Ele reutiliza aquela mesma Declaração.
		 * Abaixo está as formas de utilizar o StringBuilder
		 */
		
		/*
		 * Essa forma incia a StringBuilder vazia, podendo adicionar caracteres a qualquer momento.
		 */
		StringBuilder string1 = new StringBuilder();
		/*
		 * Essa forma ele ja começã com um valor armazenado, mas pode ser mudado durante a execução do programa.
		 */
		StringBuilder string2 = new StringBuilder("qual quer coisa");
		/*
		 * Essa forma de iniciar define a capacidade de armazenamento de caracteres.
		 * Podendo ser modificado pois ele é dinamico.
		 */
		StringBuilder string3 = new StringBuilder(100);
		
		
		
		System.out.println(string1 + "\n");
		System.out.println(string2 + "\n");
		System.out.println(string3 + "\n");
	}

}
