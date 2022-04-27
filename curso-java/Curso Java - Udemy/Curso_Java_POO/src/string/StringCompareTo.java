package string;

public class StringCompareTo {

	public static void main(String[] args) {
	
		int verdadeiroFalso1 = 0;
		String nome1 = "William";
		String nome2 = "Maria";
		String nome3 = "WILLIAM";
		String nome4 = "william";
		
		System.out.println("      ### Quarto Metodo de comparação 'compareTo' ###    ");
		
		System.out.println();
		
		/* 
		 * utilizando o metodo compareTo para comparar o conteudo dentro das duas variaveis caso seja verdadeiro resultara 		em um número igual a 0  e caso seja falso resultara em um número positivo ou negativo maior que 0 e menor que 0 e 		será armazenado na variavel inteiro verdadeiroFalso1 o valor. Será impreso uma mensagem diferente para cada 		caso e o valor resultante da comparação, seja igual a 0 então as duas variaveis tem conteudos iguais. O 		metodo compareTo e casesensitive ele diferencia 	maiusculo de minusculo. */
		
		verdadeiroFalso1 = nome1.compareTo(nome1);
				
		if(verdadeiroFalso1 == 0) {
			
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {

			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso1);
		
		System.out.println();
		
		
		/* 
		 * utilizando o metodo compareTo para comparar o conteudo dentro das duas variaveis caso seja verdadeiro resultara 		em um número igual a 0  e caso seja falso resultara em um número positivo ou negativo maior que 0 e menor que 0 e 		será armazenado na variavel inteiro verdadeiroFalso1 o valor. Será impreso uma mensagem diferente para cada 		caso e o valor resultante da comparação, seja igual a 0 então as duas variaveis tem conteudos iguais. O 		metodo compareTo e casesensitive ele diferencia 	maiusculo de minusculo. */
		
		verdadeiroFalso1 = 0;
		verdadeiroFalso1 = nome1.compareTo(nome2);
		
		if(verdadeiroFalso1 == 0) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso1);
		
		System.out.println();
		
		
		
		/* 
		 * utilizando o metodo compareTo para comparar o conteudo dentro das duas variaveis caso seja verdadeiro resultara 		em um número igual a 0  e caso seja falso resultara em um número positivo ou negativo maior que 0 e menor que 0 e 		será armazenado na variavel inteiro verdadeiroFalso1 o valor. Será impreso uma mensagem diferente para cada 		caso e o valor resultante da comparação, seja igual a 0 então as duas variaveis tem conteudos iguais. O 		metodo compareTo e casesensitive ele diferencia 	maiusculo de minusculo. */
		
		verdadeiroFalso1 = 0;
		verdadeiroFalso1 =  nome1.compareTo(nome3);
		
		if(verdadeiroFalso1 == 0) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome3+".");
		}
		
		System.out.println(verdadeiroFalso1);
		System.out.println();
		
		
		/* 
		 * utilizando o metodo compareTo para comparar o conteudo dentro das duas variaveis caso seja verdadeiro resultara 		em um número igual a 0  e caso seja falso resultara em um número positivo ou negativo maior que 0 e menor que 0 e 		será armazenado na variavel inteiro verdadeiroFalso1 o valor. Será impreso uma mensagem diferente para cada 		caso e o valor resultante da comparação, seja igual a 0 então as duas variaveis tem conteudos iguais. O 		metodo compareTo e casesensitive ele diferencia 	maiusculo de minusculo. */
		
		verdadeiroFalso1 = 0;
		verdadeiroFalso1 =  nome1.compareTo(nome4);
		
		if( verdadeiroFalso1 == 0) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso1);
		
		
		System.out.println();
		
		
		System.out.println("      ### Quinto Metodo de comparação 'compareToIgnoreCase' ###    ");
		
		System.out.println();
		
		/* 
		 * utilizando o metodo compareToIgnoreCase para comparar o conteudo dentro das duas variaveis caso seja verdadeiro 		resultara em um número igual a 0  e caso seja falso resultara em um número positivo ou negativo maior que 0 e 		menor que 0 e será armazenado na variavel inteiro verdadeiroFalso1 o valor. Será impreso uma mensagem 		diferente para cada caso e o valor resultante da comparação, seja igual a 0 então as duas variaveis tem conteudos 		iguais. O metodo compareToIgnoreCase não e casesensitive ele ignora a diferencia entre maiusculo e minusculo. */
		
		verdadeiroFalso1 = 0;
		verdadeiroFalso1 = nome1.compareToIgnoreCase(nome4);
		
		if(verdadeiroFalso1 == 0) {
			
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
			
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso1);
		
		System.out.println();
		
		
		/* 
		 * utilizando o metodo compareToIgnoreCase para comparar o conteudo dentro das duas variaveis caso seja verdadeiro 		resultara em um número igual a 0  e caso seja falso resultara em um número positivo ou negativo maior que 0 e 		menor que 0 e será armazenado na variavel inteiro verdadeiroFalso1 o valor. Será impreso uma mensagem 		diferente para cada caso e o valor resultante da comparação, seja igual a 0 então as duas variaveis tem conteudos 		iguais. O metodo compareToIgnoreCase não e casesensitive ele ignora a diferencia entre maiusculo e minusculo. */
		
		verdadeiroFalso1 = 0;
		verdadeiroFalso1 = nome1.compareToIgnoreCase(nome2);
		
		if(verdadeiroFalso1 == 0) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso1);
		
		System.out.println();
		
		
		
		/* 
		 * utilizando o metodo compareToIgnoreCase para comparar o conteudo dentro das duas variaveis caso seja verdadeiro 		resultara em um número igual a 0  e caso seja falso resultara em um número positivo ou negativo maior que 0 e 		menor que 0 e será armazenado na variavel inteiro verdadeiroFalso1 o valor. Será impreso uma mensagem 		diferente para cada caso e o valor resultante da comparação, seja igual a 0 então as duas variaveis tem conteudos 		iguais. O metodo compareToIgnoreCase não e casesensitive ele ignora a diferencia entre maiusculo e minusculo. */
		
		verdadeiroFalso1 = 0;
		verdadeiroFalso1 =  nome1.compareToIgnoreCase(nome3);
		
		if(verdadeiroFalso1 == 0) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome3+".");
		}
		
		System.out.println(verdadeiroFalso1);
		System.out.println();
		
		
		/* 
		 * utilizando o metodo compareToIgnoreCase para comparar o conteudo dentro das duas variaveis caso seja verdadeiro 		resultara em um número igual a 0  e caso seja falso resultara em um número positivo ou negativo maior que 0 e 		menor que 0 e será armazenado na variavel inteiro verdadeiroFalso1 o valor. Será impreso uma mensagem 		diferente para cada caso e o valor resultante da comparação, seja igual a 0 então as duas variaveis tem conteudos 		iguais. O metodo compareToIgnoreCase não e casesensitive ele ignora a diferencia entre maiusculo e minusculo. */
		
		verdadeiroFalso1 = 0;
		verdadeiroFalso1 =  nome1.compareToIgnoreCase(nome4);
		
		if( verdadeiroFalso1 == 0) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso1);
		
		
		System.out.println();
		

	}

}
