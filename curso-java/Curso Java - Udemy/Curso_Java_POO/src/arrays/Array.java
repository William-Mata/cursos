package arrays;

public class Array {

	public static void main(String[] args) {
		// declarando, instanciando e inicalizando um array de char
		char[] sexo =  {'M', 'F', 'F', 'M'};
		
		
		// declarando e instanciando um array de String
		String[] nome = new String[4];
		
		// declarando um array de inteiros
		int[] idade;
		
		// instanciando o array
		idade = new int[4]; 
		
		// inicializando um array de inteiros
		idade[0] = 23;
		idade[1] = 23;
		idade[2] = 54;
		idade[3] = 32;
		
		
		// inicializando um array de inteiros
		nome[0] = "william";
		nome[1] = "maria";
		nome[2] = "solange";
		nome[3] = "alex";
		
		// modo classico para se ler um vetor
		 System.out.println("Modo classico");
		 System.out.println("1° idade é: " + idade[0]);
		 System.out.println("1° nome é: " + nome[0]);
		 System.out.println("O sexo é: " + sexo[0]);
		 System.out.println();
		 System.out.println("2° idade é: " + idade[1]);
		 System.out.println("2° nome é: " + nome[1]);
		 System.out.println("O sexo é: " + sexo[1]);
		 System.out.println();
		 System.out.println("3° idade é: " + idade[2]);
		 System.out.println("3° nome é: " + nome[2]);
		 System.out.println("O sexo é: " + sexo[2]);
		 System.out.println();
		 System.out.println("4° idade é: " + idade[3]);
		 System.out.println("4° nome é: " + nome[3]);
		 System.out.println("O sexo é: " + sexo[3]);
		 System.out.println();
		 
	
		
		// modo mais facil para se ler um vetor atraves de um laço de repetição
		// laço de repetição com a variavel 'c' para contagem declarado no proprio laço
		System.out.println("Laço de repetição");
		for (int c = 0 ; c <= 3; c++)  {
			
			System.out.println((c+1) + "° idade é: " + idade[c]);
			System.out.println((c+1) + "° nome é: " + nome[c]);
			System.out.println((c+1) + "°O sexo é: " + sexo[c]);
			System.out.println();
			
		}
		
		
		
	}

}
