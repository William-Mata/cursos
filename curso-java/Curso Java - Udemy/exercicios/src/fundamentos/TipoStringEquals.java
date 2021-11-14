package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		// compara��o de strings
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		
		// false pois est� comparando o valor string com o objeto string
		System.out.println("2" == s1);
		
		// true pois est� testando se o valor da variavel s1 que � "2" e == "2".
		System.out.println("2".equals(s1));
		
		// Scanner para receber informa��es do usuario pelo teclado.
		Scanner entrada = new Scanner(System.in);
		
		//vai armazena a informa��o digitado pelo usuario na variavel.
		String s2 = entrada.nextLine();
		/* .trim(); remove todos espa�os em brancos, 
		mesmo assim o resultado ser� false, pois est� comparando o valor
		 "2" com o objeto.
		*/
		System.out.println("2" == s2.trim());
		
		/*
		 * Aqui o resultado ser� true caso o valor digitado pelo usuario seja "2".
		 */
		System.out.println("2".equals(s2.trim()));
		
		// fecha a opera��o de recebe informa��es do usuario.
		entrada.close();
	}

}
