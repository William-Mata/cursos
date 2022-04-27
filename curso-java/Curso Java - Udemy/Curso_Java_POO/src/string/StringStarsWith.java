package string;

public class StringStarsWith {

	public static void main(String[] args) {
		boolean verdadeiroFalso;
		String nome1 = "William";
		String nome2 = "Maria";
		String nome3 = "WILLIAM";
		String nome4 = "william";
		
		
		
		System.out.println("      ### Primeiro Metodo de comparação 'startsWith' ###");
		
		System.out.println();

		
		/* utilizando o metodo startsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo. 
		 E possivel definir de qual indice ele vai começar a verificar na variavel nome1.*/
		if( verdadeiroFalso = nome1.startsWith(nome1)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		/* utilizando o metodo startsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo *
		 E possivel definir de qual indice ele vai começar a verificar na variavel nome1.*/
		if( verdadeiroFalso = nome1.startsWith(nome2)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();


		/* utilizando o metodo startsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo 
		 E possivel definir de qual indice ele vai começar a verificar na variavel nome1.*/
		if(verdadeiroFalso =  nome1.startsWith(nome3)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome3+".");
		}
	
		System.out.println(verdadeiroFalso);
		System.out.println();
		
		
		/* utilizando o metodo startsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo 
		E possivel definir de qual indice ele vai começar a verificar na variavel nome1.*/
		if( verdadeiroFalso =  nome1.startsWith(nome4, 0)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		/* utilizando o metodo startsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo
		 E possivel definir de qual indice ele vai começar a verificar na variavel nome1.*/
		if( verdadeiroFalso =  nome1.startsWith("illiam", 1)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + "illiam.");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + "illiam.");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		System.out.println("      ### Segundo Metodo de comparação 'endsWith' ###");
		
		System.out.println();

		
		/* utilizando o metodo endsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo
		 Ele verifica se o final da variavel nome1 tenha o mesmo conteudo da comparação*/
		if( verdadeiroFalso = nome1.endsWith(nome1)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome1 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome1+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
		/* utilizando o metodo endsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo
		 Ele verifica se o final da variavel nome1 tenha o mesmo conteudo da comparação*/
		if( verdadeiroFalso = nome1.endsWith(nome2)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome2 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome2+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();


		/* utilizando o metodo endsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo
		 Ele verifica se o final da variavel nome1 tenha o mesmo conteudo da comparação*/
		if(verdadeiroFalso =  nome1.endsWith(nome3)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome3 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome3+".");
		}
	
		System.out.println(verdadeiroFalso);
		System.out.println();
		
		
		/* utilizando o metodo endsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo
		 Ele verifica se o final da variavel nome1 tenha o mesmo conteudo da comparação*/
		if( verdadeiroFalso =  nome1.endsWith(nome4)) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + nome4 +".");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + nome4+".");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		/* utilizando o metodo endsWith para comparar o conteudo dentro das duas variaveis caso seja verdadeiro será 		
		 * armazenado true e caso seja falso seram armazenados na variavel boolean verdadeiroFalso os valores. 
		 * Será impreso uma mensagem diferente caso seja verdadeiro ou falso e o conteudo que está dentro de cada variavel.
		 o metodo startsWith e casesensitive ele diferencia maiusculo de minusculo
		 Ele verifica se o final da variavel nome1 tenha o mesmo conteudo da comparação*/
		if( verdadeiroFalso =  nome1.endsWith("illiam")) {
			System.out.println("As duas variaveis contém o mesmo conteudo: " + nome1 +", " + "illiam.");
		}else {
			System.out.println("Os conteudos das variaveis são diferentes: " + nome1 + ", " + "illiam.");
		}
		
		System.out.println(verdadeiroFalso);
		
		System.out.println();
		
		
	}

}
