package arrays;

public class StringIsEmpity {

	public static void main(String[] args) {
		String nome = "william";
		String vazia = "";
		boolean vaziaFalsoVerdadeiro;
		
		
		/*
		 * O metodo verifica se a String contem algum dado 
		 * caso contenha ela retorna false caso não tenha ela retorna true
		 * O exemplo abaixo está verificando se a variavel nome contem dados
		 * É ira imprimir uma mensagem e ou true ou false caso esteja vazia
		 */
		if(vaziaFalsoVerdadeiro = nome.isEmpty()) {
			
			System.out.println(vaziaFalsoVerdadeiro + "\n");
			
			System.out.println("A variavel está vazia.\n");
			
		}else {
			
			System.out.println(vaziaFalsoVerdadeiro + "\n");

			System.out.println("A variavel contém dados: " + nome + "\n");
		}
		
		/*
		 * O metodo verifica se a String contem algum dado 
		 * caso contenha ela retorna false caso não tenha ela retorna true
		 * O exemplo abaixo está verificando se a variavel vazia contem dados
		 * É ira imprimir uma mensagem e ou true ou false caso esteja vazia
		 */
		if(vaziaFalsoVerdadeiro = vazia.isEmpty()) {
			
			System.out.println(vaziaFalsoVerdadeiro + "\n");

			System.out.println("A variavel está vazia.\n");
			
		}else {
			
			System.out.println(vaziaFalsoVerdadeiro + "\n");

			System.out.println("A variavel contém dados: " + nome + "\n");
		}
	}

}
