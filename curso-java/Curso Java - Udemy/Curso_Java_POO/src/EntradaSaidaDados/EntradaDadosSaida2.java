package EntradaSaidaDados;

import java.util.Scanner;

public class EntradaDadosSaida2 {

	public static void main(String[] args) {
		
		// Scanner para entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		// Saida de dados, ser� impreso digite seu nome.
		System.out.print("Digite seu nome: ");
		
		// classe que ir� armazena o nome, que ira receber do scanner
		String nome = entrada.nextLine();
		
		// Saida de dados, ser� impreso digite sua idade.
		System.out.print("Digite sua idade: ");
				
		// classe que ir� armazena a idade, que ira receber do scanner
		int idade = entrada.nextInt();
		
		// Saida de dados, ser� impreso digite seu peso.
		System.out.print("Digite seu peso: ");
				
		// classe que ir� armazena o peso, que ira receber do scanner
		double peso = entrada.nextDouble();
		
		// Saida de dados, ser� impreso o nome armazenado na variavel.
		System.out.println("Seu nome �: " + nome);
		
		// Saida de dados, ser� impreso o idade armazenado na variavel.
		System.out.println("Sua idade �: "+ idade);
		
		// Saida de dados, ser� impreso o peso armazenado na variavel.
		System.out.println("Sua idade �: " + peso);
		
		
	}

}
