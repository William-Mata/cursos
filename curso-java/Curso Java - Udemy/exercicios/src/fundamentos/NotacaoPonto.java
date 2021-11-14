package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
	
		String nome = "William de mata da silva x";
		
		/*
		 * coloca o conteudo
		 *  da variavel todo maiusculo
		 *  mas não modifica a variavel 
		 *  so acontecera isso na linha
		 *   que o metodo for chamado
		 */
		System.out.println("Upper Case");

		nome.toUpperCase();
		
		System.out.println(nome);
		
		System.out.println(nome.toUpperCase());
		
		
		/*
		 * substitui o conteudo por outro
		 * exemplo onde tiver um x 
		 * será substituido por , 23anos
		 *  segue o mesmo raciocinio
		 *  so funciona nessa linha
		*/
		System.out.println("Replace");

		nome.replace("x", ", 23 anos");
		
		System.out.println(nome);
		
		System.out.println(nome.replace("x", ", 23 anos"));

		
		/*
		 * Concatena um conteudo com outro
		 * seguindo a mesma logica de cima 
		 * apenas na linha
		 */
		
		System.out.println("Concact");

		nome.concat(", 23 anos!!!");
		
		System.out.println(nome);
		
		System.out.println(nome.concat(", 23 anos!!!"));
	}
}
