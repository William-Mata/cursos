package Arrays;

public class StringValueOf {

	public static void main(String[] args) {
		String pessoa;
		double peso = 53.4;
		String nome = "William";
		int idade = 23;
		char sexo = 'H';
		boolean trabalhando = false;
		
		/*
		 * Recebendo uma string em uma string
		 */
		pessoa = nome + "\n";
		
		/*
		 * Imprimindo o valor da variavel pessoa após receber o valor da variavel 
		 * nome na variavel nomeIdade
		 */
		
		System.out.println("Pessoa já recebeu nome:\n");
		System.out.println(pessoa+ "\n");
		
		/*
		 * O metodo valueOf faz com que receba valores diferentes de String 
		 * Recebendo valor inteiro em uma variavel String 
		 */
		
		pessoa += String.valueOf(idade+ "\n");
		
		System.out.println("Pessoa recebeu nome e idade: \n");
		
		/*
		 * Imprimindo o valor da variavel pessoa após receber o valor da variavel 
		 * nome , idade na variavel nomeIdade
		 */
		
		System.out.println(pessoa + "\n");
		
		/*
		 * O metodo valueOf faz com que receba valores diferentes de String 
		 * Recebendo valor double em uma variavel String 
		 */
		
		pessoa += String.valueOf(peso + "\n");
		
		System.out.println("Pessoa recebeu nome, idade e peso: \n");
		
		/*
		 * Imprimindo o valor da variavel pessoa após receber o valor da variavel 
		 * nome, idade e peso na variavel pessoa
		 */
		
		System.out.println(pessoa + "\n");
		
		/*
		 * O metodo valueOf faz com que receba valores diferentes de String 
		 * Recebendo valor char em uma variavel String 
		 */
		
		pessoa += String.valueOf(sexo + "\n");
		
		System.out.println("Pessoa recebeu nome, idade, peso e sexo: \n");
		
		/*
		 * Imprimindo o valor da variavel pessoa após receber o valor da variavel 
		 * nome, idade, peso e sexo na variavel pessoa
		 */
		
		System.out.println(pessoa + "\n");
		
		
		/*
		 * O metodo valueOf faz com que receba valores diferentes de String 
		 * Recebendo valor boolean em uma variavel String 
		 */
		
		pessoa += String.valueOf(trabalhando + "\n");
		
		System.out.println("Pessoa recebeu nome, idade, peso, sexo e trabalhando: \n");
		
		/*
		 * Imprimindo o valor da variavel pessoa após receber o valor da variavel 
		 * nome, idade, peso e sexo na variavel pessoa
		 */
		
		System.out.println(pessoa + "\n");
		
		
	}

}
