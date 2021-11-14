package String;

public class RepaceString {

	public static void main(String[] args) {
		String email = "william.xavante@gmail.com";
		String email2 = "";
		String email3 = "";
		
		
		
		System.out.println();
		System.out.println(email);
		System.out.println();
		
		/* o metodo replace ele passa o valor de uma variavel para outra podendo fazer alterações na variavel antes de passa-la
			O exemplo abaixo ele irá substituir os pontos '.' por underline '_' encontrado dentro da variavel email e ira passa o
			 restante da variavel sem os pontos e com o underline no lugar dos pontos.
		*/
		email2 = email.replace('.', '_');
		
		System.out.println();
		System.out.println(email2);
		System.out.println();
		
		
		/* o metodo replace ele passa o valor de uma variavel para outra podendo fazer alterações na variavel antes de passa-la
		O exemplo abaixo ele irá tirar os pontos "." encontrado dentro da variavel email e ira passa o restante da variavel sem os pontos.
		 */
		email3 = email.replace(".", "");
	
		System.out.println();
		System.out.println(email3);
		System.out.println();


	}

}
