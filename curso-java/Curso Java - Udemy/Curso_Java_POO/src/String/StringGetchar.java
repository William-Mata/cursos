package String;

public class StringGetchar {

	public static void main(String[] args) {
		
		String nomeCompleto = "WILLIAM DE MATA DA SILVA";
		char arrayDeChar[] = new char[7];
		char arrayDeChar2[] = new char[4];
		
		
		// O metodo getChars passa os caracteres que est� dentro da variavel nomeCompleto e passa para um vetor de char
		// no exemplo abaixo ir� pegar do indice 0 at� o 7 e passar para o arrayDeChar
		nomeCompleto.getChars(0, 7, arrayDeChar, 0);	
		
		
		// Esse la�o pega cada caractere do array de char e ir� imprimir no terminal
		for(char c :  arrayDeChar) {
			System.out.print(c);
		}
		
		System.out.println();
		
		// O metodo getChars passa os caracteres que est� dentro da variavel nomeCompleto e passa para um vetor de char
		// no exemplo abaixo ir� pegar do indice 11 at� o 15 e passar para o arrayDeChar2
		nomeCompleto.getChars(11, 15, arrayDeChar2, 0);
		
				
		// Esse la�o pega cada caractere do array de char e ir� imprimir no terminal
		for(char c :  arrayDeChar2) {
		
			System.out.print(c);
			
		}
	}

}
