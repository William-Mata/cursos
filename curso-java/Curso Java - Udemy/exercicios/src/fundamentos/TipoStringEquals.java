package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		// comparação de strings
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		
		// false pois está comparando o valor string com o objeto string
		System.out.println("2" == s1);
		
		// true pois está testando se o valor da variavel s1 que é "2" e == "2".
		System.out.println("2".equals(s1));
		
		// Scanner para receber informações do usuario pelo teclado.
		Scanner entrada = new Scanner(System.in);
		
		//vai armazena a informação digitado pelo usuario na variavel.
		String s2 = entrada.nextLine();
		/* .trim(); remove todos espaços em brancos, 
		mesmo assim o resultado será false, pois está comparando o valor
		 "2" com o objeto.
		*/
		System.out.println("2" == s2.trim());
		
		/*
		 * Aqui o resultado será true caso o valor digitado pelo usuario seja "2".
		 */
		System.out.println("2".equals(s2.trim()));
		
		// fecha a operação de recebe informações do usuario.
		entrada.close();
	}

}
