package Arrays;

public class CodigoAscii {

	public static void main(String[] args) {
		String nome = "William";
		int Ascii[] = new int[7] ;
		char caracteres[] = new char[7];
		int c = 0;
		
		
		/*
		 * O metodo codePointAt pega o codigo ASCII dos caracteres. 
		 * O exemplo abaixo estou transformando e passando para o array ASCII de inteiros.
		 */
		for(int i = 0 ; i < 7; i++) {
			Ascii[i]  = nome.codePointAt(i);

		}
		
		/*
		 * ALT+92 faz o '\'.
		 */
		
		/*
		 * Imprimindo todos os codigos dos caracters da variavel nome que foi passado para o vetor de inteiros.
		 */
		
		for(int j : Ascii) {
			c += 1;
			System.out.println("\nO codigo da " + c +"° letra da variavel nome é: " + j + "\n");

		}
		
		
		/*
		 * Transferindo os codigo Ascii para caracteres.
		 */
		for(int i = 0 ; i < 7; i++) {
			caracteres[i]= (char) Ascii[i];
		}
		
		/*
		 * Imprimindo todos os caracteres depois de transferir do codigo Ascii para caracteres.
		 */
		c = 0;
		for(char j : caracteres) {
			
			System.out.print("\nA letra referente ao codigos Ascii '" +Ascii[c]+ "' é: " + j + "\n");
			c += 1;
		}
		
		
		
	}

}
