package string;

public class StringSubstring {

	public static void main(String[] args) {
		String nomeCompleto = "William de mata da silva";
		String nome = "";
		String sobreNome = "";
		String email = "william.xavante@gmail.com";
		String semDominio = "";
		
		/*
		 * O metodo substring pega parte do texto dentro da variavel e passa para outra variavel
		 * O metodo permite que você defina de qual indice começar até que indice terminar que você
		 * deseja pegar para armazenar na variavel.
		 * O exemplo abaixo irá armazenar apenas o primeiro nome que se encontra do indice 0 ao 7.
		 */
		nome = nomeCompleto.substring(0,7);
		
		System.out.println(nome);
		System.out.println();
		
		
		// para saber o tamanho da variavel, ou melhor a quantidade de caracteres dentro da variavel.
		System.out.println(nomeCompleto.length());
		System.out.println();	
		
		
		/*
		 * O metodo substring pega parte do texto dentro da variavel e passa para outra variavel
		 * O metodo permite que você defina de qual indice começar até que indice terminar que você
		 * deseja pegar para armazenar na variavel.
		 * O exemplo abaixo irá armazenar apenas o sobre nome que se encontra do indice 8 ao 24.
		 */
		sobreNome = nomeCompleto.substring(8, 24);
		System.out.println(sobreNome);
		System.out.println();
		
		
	
		
		/*
		 * O metodo substring pega parte do texto dentro da variavel e passa para outra variavel
		 * O metodo permite que você defina de qual indice começar até que indice terminar que você
		 * deseja pegar para armazenar na variavel.
		 * O exemplo abaixo irá armazenar apenas a parte do email sem o dominio.
		 */
		semDominio =  email.substring(email.indexOf(0) +1, email.indexOf("@"));
		System.out.println(semDominio);
		System.out.println();
	}

}
