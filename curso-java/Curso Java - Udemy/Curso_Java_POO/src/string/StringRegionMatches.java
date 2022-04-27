package string;

public class StringRegionMatches {

	public static void main(String[] args) {
		boolean verdadeiroFalso;
		String nome1 = "William";
		String nome2 = "Maria";
		String nome3 = "WILLIAM";
		String nome4 = "william";
		
		
		
		System.out.println("      ### Primeiro Metodo de comparação 'regionMatches' com casesensitive ###");
		
		System.out.println();

		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 	
		 true e caso seja falso será false seram armazenados na variavel boolean verdadeiroFalso os valores. Será impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou não fica a escolha do programador na hora de realizar o comando
		 ele pode ou não diferencia maiusculo de minusculo. O metodo também pode indicar a partir de que indice começa 
		 a comparação da primeira variavel, e da segunda pode ser definido a partir de que indice começa a comparação e 
		 até qual será o ultimo indice a ser comparado, também podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		
		if( verdadeiroFalso =  nome1.regionMatches(false, 0, nome1, 0, 6)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 	
		 true e caso seja falso será false seram armazenados na variavel boolean verdadeiroFalso os valores. Será impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou não fica a escolha do programador na hora de realizar o comando
		 ele pode ou não diferencia maiusculo de minusculo. O metodo também pode indicar a partir de que indice começa 
		 a comparação da primeira variavel, e da segunda pode ser definido a partir de que indice começa a comparação e 
		 até qual será o ultimo indice a ser comparado, também podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if( verdadeiroFalso =  nome1.regionMatches(false, 0, nome2, 0, 6)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();


		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 	
		 true e caso seja falso será false seram armazenados na variavel boolean verdadeiroFalso os valores. Será impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou não fica a escolha do programador na hora de realizar o comando
		 ele pode ou não diferencia maiusculo de minusculo. O metodo também pode indicar a partir de que indice começa 
		 a comparação da primeira variavel, e da segunda pode ser definido a partir de que indice começa a comparação e 
		 até qual será o ultimo indice a ser comparado, também podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if(verdadeiroFalso =  nome1.regionMatches(false, 0, nome3, 0, 6)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome3+".");
		}
	
		System.out.println(verdadeiroFalso);
		System.out.println();
		
		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 	
		 true e caso seja falso será false seram armazenados na variavel boolean verdadeiroFalso os valores. Será impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou não fica a escolha do programador na hora de realizar o comando
		 ele pode ou não diferencia maiusculo de minusculo. O metodo também pode indicar a partir de que indice começa 
		 a comparação da primeira variavel, e da segunda pode ser definido a partir de que indice começa a comparação e 
		 até qual será o ultimo indice a ser comparado, também podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if( verdadeiroFalso =  nome1.regionMatches(false, 0, nome4, 1, 6)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		System.out.println("      ### Segundo Metodo de comparação 'regionMatches' sem o casesensitive ###");
		
		System.out.println();

		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 	
		 true e caso seja falso será false seram armazenados na variavel boolean verdadeiroFalso os valores. Será impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou não fica a escolha do programador na hora de realizar o comando
		 ele pode ou não diferencia maiusculo de minusculo. O metodo também pode indicar a partir de que indice começa 
		 a comparação da primeira variavel, e da segunda pode ser definido a partir de que indice começa a comparação e 
		 até qual será o ultimo indice a ser comparado, também podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		
		if( verdadeiroFalso =  nome1.regionMatches(true, 0, nome1, 0, 6)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 	
		 true e caso seja falso será false seram armazenados na variavel boolean verdadeiroFalso os valores. Será impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou não fica a escolha do programador na hora de realizar o comando
		 ele pode ou não diferencia maiusculo de minusculo. O metodo também pode indicar a partir de que indice começa 
		 a comparação da primeira variavel, e da segunda pode ser definido a partir de que indice começa a comparação e 
		 até qual será o ultimo indice a ser comparado, também podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if( verdadeiroFalso =  nome1.regionMatches(true, 0, nome2, 0, 6)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();


		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 	
		 true e caso seja falso será false seram armazenados na variavel boolean verdadeiroFalso os valores. Será impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou não fica a escolha do programador na hora de realizar o comando
		 ele pode ou não diferencia maiusculo de minusculo. O metodo também pode indicar a partir de que indice começa 
		 a comparação da primeira variavel, e da segunda pode ser definido a partir de que indice começa a comparação e 
		 até qual será o ultimo indice a ser comparado, também podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if(verdadeiroFalso =  nome1.regionMatches(true, 0, nome3, 0, 6)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome3+".");
		}
	
		System.out.println(verdadeiroFalso);
		System.out.println();
		
		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 	
		 true e caso seja falso será false seram armazenados na variavel boolean verdadeiroFalso os valores. Será impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou não fica a escolha do programador na hora de realizar o comando
		 ele pode ou não diferencia maiusculo de minusculo. O metodo também pode indicar a partir de que indice começa 
		 a comparação da primeira variavel, e da segunda pode ser definido a partir de que indice começa a comparação e 
		 até qual será o ultimo indice a ser comparado, também podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if( verdadeiroFalso =  nome1.regionMatches(true, 0, nome4, 0, 6)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
	}

}
