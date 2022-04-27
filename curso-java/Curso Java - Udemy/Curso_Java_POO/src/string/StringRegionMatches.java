package string;

public class StringRegionMatches {

	public static void main(String[] args) {
		boolean verdadeiroFalso;
		String nome1 = "William";
		String nome2 = "Maria";
		String nome3 = "WILLIAM";
		String nome4 = "william";
		
		
		
		System.out.println("      ### Primeiro Metodo de compara��o 'regionMatches' com casesensitive ###");
		
		System.out.println();

		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 	
		 true e caso seja falso ser� false seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou n�o fica a escolha do programador na hora de realizar o comando
		 ele pode ou n�o diferencia maiusculo de minusculo. O metodo tamb�m pode indicar a partir de que indice come�a 
		 a compara��o da primeira variavel, e da segunda pode ser definido a partir de que indice come�a a compara��o e 
		 at� qual ser� o ultimo indice a ser comparado, tamb�m podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		
		if( verdadeiroFalso =  nome1.regionMatches(false, 0, nome1, 0, 6)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 	
		 true e caso seja falso ser� false seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou n�o fica a escolha do programador na hora de realizar o comando
		 ele pode ou n�o diferencia maiusculo de minusculo. O metodo tamb�m pode indicar a partir de que indice come�a 
		 a compara��o da primeira variavel, e da segunda pode ser definido a partir de que indice come�a a compara��o e 
		 at� qual ser� o ultimo indice a ser comparado, tamb�m podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if( verdadeiroFalso =  nome1.regionMatches(false, 0, nome2, 0, 6)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();


		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 	
		 true e caso seja falso ser� false seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou n�o fica a escolha do programador na hora de realizar o comando
		 ele pode ou n�o diferencia maiusculo de minusculo. O metodo tamb�m pode indicar a partir de que indice come�a 
		 a compara��o da primeira variavel, e da segunda pode ser definido a partir de que indice come�a a compara��o e 
		 at� qual ser� o ultimo indice a ser comparado, tamb�m podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if(verdadeiroFalso =  nome1.regionMatches(false, 0, nome3, 0, 6)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome3+".");
		}
	
		System.out.println(verdadeiroFalso);
		System.out.println();
		
		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 	
		 true e caso seja falso ser� false seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou n�o fica a escolha do programador na hora de realizar o comando
		 ele pode ou n�o diferencia maiusculo de minusculo. O metodo tamb�m pode indicar a partir de que indice come�a 
		 a compara��o da primeira variavel, e da segunda pode ser definido a partir de que indice come�a a compara��o e 
		 at� qual ser� o ultimo indice a ser comparado, tamb�m podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if( verdadeiroFalso =  nome1.regionMatches(false, 0, nome4, 1, 6)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		System.out.println("      ### Segundo Metodo de compara��o 'regionMatches' sem o casesensitive ###");
		
		System.out.println();

		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 	
		 true e caso seja falso ser� false seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou n�o fica a escolha do programador na hora de realizar o comando
		 ele pode ou n�o diferencia maiusculo de minusculo. O metodo tamb�m pode indicar a partir de que indice come�a 
		 a compara��o da primeira variavel, e da segunda pode ser definido a partir de que indice come�a a compara��o e 
		 at� qual ser� o ultimo indice a ser comparado, tamb�m podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		
		if( verdadeiroFalso =  nome1.regionMatches(true, 0, nome1, 0, 6)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 	
		 true e caso seja falso ser� false seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou n�o fica a escolha do programador na hora de realizar o comando
		 ele pode ou n�o diferencia maiusculo de minusculo. O metodo tamb�m pode indicar a partir de que indice come�a 
		 a compara��o da primeira variavel, e da segunda pode ser definido a partir de que indice come�a a compara��o e 
		 at� qual ser� o ultimo indice a ser comparado, tamb�m podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if( verdadeiroFalso =  nome1.regionMatches(true, 0, nome2, 0, 6)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();


		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 	
		 true e caso seja falso ser� false seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou n�o fica a escolha do programador na hora de realizar o comando
		 ele pode ou n�o diferencia maiusculo de minusculo. O metodo tamb�m pode indicar a partir de que indice come�a 
		 a compara��o da primeira variavel, e da segunda pode ser definido a partir de que indice come�a a compara��o e 
		 at� qual ser� o ultimo indice a ser comparado, tamb�m podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if(verdadeiroFalso =  nome1.regionMatches(true, 0, nome3, 0, 6)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome3+".");
		}
	
		System.out.println(verdadeiroFalso);
		System.out.println();
		
		
		/* utilizando o metodo regionMatches para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 	
		 true e caso seja falso ser� false seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso
		 uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		 o metodo regionMatches pode ser casesenstive ou n�o fica a escolha do programador na hora de realizar o comando
		 ele pode ou n�o diferencia maiusculo de minusculo. O metodo tamb�m pode indicar a partir de que indice come�a 
		 a compara��o da primeira variavel, e da segunda pode ser definido a partir de que indice come�a a compara��o e 
		 at� qual ser� o ultimo indice a ser comparado, tamb�m podemos ignorar o casesensitive 
		 utilizando o comando 'true' antes do indice da primeira variavel. */
		if( verdadeiroFalso =  nome1.regionMatches(true, 0, nome4, 0, 6)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
	}

}
