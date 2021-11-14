package String;

public class StringSplit {

	public static void main(String[] args) {
		String nomeCompleto  = "William de mata da silva";
		
		/*
		 * Metodo Split apaga todos os espaço e cria um vetor com parte do texto
		 * Como podemos ver no exemplo abaixo
		 */
		String[] nome =  nomeCompleto.split(" ");
		String[] sobreNome =  nomeCompleto.split(" ");
		
		System.out.println("NomeCompleto: " + nomeCompleto);
		System.out.println();
		System.out.println("Nome: " + nome[0]);
		System.out.println();
		System.out.println("Sobrenome " + sobreNome[4]);
		System.out.println();
	}

}
