package string;

public class StringEquals {

	public static void main(String[] args) {
		boolean verdadeiroFalso;
		String nome1 = "William";
		String nome2 = "Maria";
		String nome3 = "WILLIAM";
		String nome4 = "william";
		
		
		
		System.out.println("      ### Primeiro Metodo de compara��o 'equals' ###");
		
		
		// utilizando o metodo equals para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 		armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo equals e casesensitive ele diferencia maiusculo de minusculo 
		if( verdadeiroFalso = nome1.equals(nome1)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		// utilizando o metodo equals para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 		armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo equals e casesensitive ele diferencia maiusculo de minusculo 
		if( verdadeiroFalso = nome1.equals(nome2)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();


		// utilizando o metodo equals para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 		armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo equals e casesensitive ele diferencia maiusculo de minusculo 
		if(verdadeiroFalso =  nome1.equals(nome3)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome3+".");
		}
	
		System.out.println(verdadeiroFalso);
		System.out.println();
		
		
		// utilizando o metodo equals para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 		armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo equals e casesensitive ele diferencia maiusculo de minusculo 
		if( verdadeiroFalso =  nome1.equals(nome4)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		System.out.println("      ### Segundo Metodo de compara��o 'equalsIgnoreCase' ###");
		
		
		// utilizando o metodo equalsIgnoreCase para comparar o conteudo dentro das duas variaveis caso seja verdadeiro 		ser�  armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo equalsIgnoreCase ignora a diferen�a entre maiusculo e minusculo 
		if( verdadeiroFalso = nome1.equalsIgnoreCase(nome1)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		// utilizando o metodo equalsIgnoreCase para comparar o conteudo dentro das duas variaveis caso seja verdadeiro 		ser�  armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo equalsIgnoreCase ignora a diferen�a entre maiusculo e minusculo 
		if( verdadeiroFalso = nome1.equalsIgnoreCase(nome2)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		// utilizando o metodo equalsIgnoreCase para comparar o conteudo dentro das duas variaveis caso seja verdadeiro 		ser�  armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo equalsIgnoreCase ignora a diferen�a entre maiusculo e minusculo 
		if(verdadeiroFalso =  nome1.equalsIgnoreCase(nome3)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome3+".");
		}
		
		System.out.println(verdadeiroFalso);
		System.out.println();
		
		
		// utilizando o metodo equalsIgnoreCase para comparar o conteudo dentro das duas variaveis caso seja verdadeiro 		ser�  armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo equalsIgnoreCase ignora a diferen�a entre maiusculo e minusculo 
		if( verdadeiroFalso =  nome1.equalsIgnoreCase(nome4)) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		System.out.println("      ### Terceiro Metodo de compara��o '==' ###    ");
		
		System.out.println();
		
		// utilizando o metodo '==' para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 		armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo '==' e casesensitive ele diferencia maiusculo de minusculo 
		if( verdadeiroFalso = nome1 == nome1) {
				System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
				System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome1+".");
		}
				
		System.out.println(verdadeiroFalso);
				
		System.out.println();
				
				
		// utilizando o metodo '==' para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 		armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo '==' e casesensitive ele diferencia maiusculo de minusculo 
		if( verdadeiroFalso = nome1 == nome2) {
				System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
				System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome2+".");
		}
				
		System.out.println(verdadeiroFalso);
				
		System.out.println();


				
		// utilizando o metodo '==' para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 		armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo '==' e casesensitive ele diferencia maiusculo de minusculo 
		if(verdadeiroFalso =  nome1 == nome3) {
				System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
				System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome3+".");
		}
			
		System.out.println(verdadeiroFalso);
		System.out.println();

				
		// utilizando o metodo equals para comparar o conteudo dentro das duas variaveis caso seja verdadeiro ser� 		armazenado
		// true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. Ser� impreso uma 		mensagem
		// diferente caso seja verdadeiro ou falso e o conteudo que est� dentro de cada variavel.
		// o metodo equals e casesensitive ele diferencia maiusculo de minusculo 
		if( verdadeiroFalso =  nome1 == nome4) {
			System.out.println("As duas variaveis cont�m o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis s�o diferentes: " + nome1 + ", " + nome4+".");
		}
				
		System.out.println(verdadeiroFalso);
				
				
		System.out.println();
		
	
	}
	

}
