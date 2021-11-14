package EntradaSaidaDados;

import java.util.Scanner;

public class EntradaDadosSaida2 {

	public static void main(String[] args) {
		
		// Scanner para entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		// Saida de dados, será impreso digite seu nome.
		System.out.print("Digite seu nome: ");
		
		// classe que irá armazena o nome, que ira receber do scanner
		String nome = entrada.nextLine();
		
		// Saida de dados, será impreso digite sua idade.
		System.out.print("Digite sua idade: ");
				
		// classe que irá armazena a idade, que ira receber do scanner
		int idade = entrada.nextInt();
		
		// Saida de dados, será impreso digite seu peso.
		System.out.print("Digite seu peso: ");
				
		// classe que irá armazena o peso, que ira receber do scanner
		double peso = entrada.nextDouble();
		
		// Saida de dados, será impreso o nome armazenado na variavel.
		System.out.println("Seu nome é: " + nome);
		
		// Saida de dados, será impreso o idade armazenado na variavel.
		System.out.println("Sua idade é: "+ idade);
		
		// Saida de dados, será impreso o peso armazenado na variavel.
		System.out.println("Sua idade é: " + peso);
		
		
	}

}
