package String;

public class StringTrim {

	public static void main(String[] args) {
		String email = "     william.xavante@gmail.com";
		String email2 = "";
		
		
		System.out.println();
		System.out.println(email);
		System.out.println();
		
		
		/*
		 * O metodo trim ele remove os espaços no começo das String
		 * O exemplo abaixo ele apaga todos os espaços no começo da variavel e repassa para o valor sem espaço 
		 * da variavel email para email2 
		 */
		email2 = email.trim();
		
		System.out.println();
		System.out.println(email2);
		System.out.println();
		
	}

}
