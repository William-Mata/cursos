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
		 System.out.println("1� idade �: " + idade[0]);
		 System.out.println("1� nome �: " + nome[0]);
		 System.out.println("O sexo �: " + sexo[0]);
		 System.out.println();
		 System.out.println("2� idade �: " + idade[1]);
		 System.out.println("2� nome �: " + nome[1]);
		 System.out.println("O sexo �: " + sexo[1]);
		 System.out.println();
		 System.out.println("3� idade �: " + idade[2]);
		 System.out.println("3� nome �: " + nome[2]);
		 System.out.println("O sexo �: " + sexo[2]);
		 System.out.println();
		 System.out.println("4� idade �: " + idade[3]);
		 System.out.println("4� nome �: " + nome[3]);
		 System.out.println("O sexo �: " + sexo[3]);
		 System.out.println();
		 
	
		
		// modo mais facil para se ler um vetor atraves de um la�o de repeti��o
		// la�o de repeti��o com a variavel 'c' para contagem declarado no proprio la�o
		System.out.println("La�o de repeti��o");
		for (int c = 0 ; c <= 3; c++)  {
			
			System.out.println((c+1) + "� idade �: " + idade[c]);
			System.out.println((c+1) + "� nome �: " + nome[c]);
			System.out.println((c+1) + "�O sexo �: " + sexo[c]);
			System.out.println();
			
		}
		
		
		
	}

}
