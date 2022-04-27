package string;

public class String1 {

	public static void main(String[] args) {
		
		char arrayDeChar[] = {'W', 'I', 'L', 'L', 'I', 'A', 'M'};
		
		// modo 1 de instancia a classe string
		String nome = "william";
		
		// modo 2 de instancia a classe string
		String sobrenome = new String("mata");
		
		// modo 3 de instancia a classe string
		String nome2 = new String();
		
		// modo 4 de instancia a classe string
		String nome3 = new String(nome);
		
		// modo 4 de instancia a classe string
		// recebe o array de char;
		String nome4 = new String(arrayDeChar);

		
		// modo 5 de instancia a classe string
		// recebe o array de char;
		// começa a partir da posição 2 e pega 3 valores do array de char.
		String nome5 = new String(arrayDeChar, 2 , 3);
		
		
		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(nome2);
		System.out.println(nome3);
		System.out.println(nome4);
		System.out.println(nome5);
		
	}

}
