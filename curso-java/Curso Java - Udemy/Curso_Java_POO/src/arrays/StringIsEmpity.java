package arrays;

public class StringIsEmpity {

	public static void main(String[] args) {
		String nome = "william";
		String vazia = "";
		boolean vaziaFalsoVerdadeiro;
		
		
		/*
		 * O metodo verifica se a String contem algum dado 
		 * caso contenha ela retorna false caso n�o tenha ela retorna true
		 * O exemplo abaixo est� verificando se a variavel nome contem dados
		 * � ira imprimir uma mensagem e ou true ou false caso esteja vazia
		 */
		if(vaziaFalsoVerdadeiro = nome.isEmpty()) {
			
			System.out.println(vaziaFalsoVerdadeiro + "\n");
			
			System.out.println("A variavel est� vazia.\n");
			
		}else {
			
			System.out.println(vaziaFalsoVerdadeiro + "\n");

			System.out.println("A variavel cont�m dados: " + nome + "\n");
		}
		
		/*
		 * O metodo verifica se a String contem algum dado 
		 * caso contenha ela retorna false caso n�o tenha ela retorna true
		 * O exemplo abaixo est� verificando se a variavel vazia contem dados
		 * � ira imprimir uma mensagem e ou true ou false caso esteja vazia
		 */
		if(vaziaFalsoVerdadeiro = vazia.isEmpty()) {
			
			System.out.println(vaziaFalsoVerdadeiro + "\n");

			System.out.println("A variavel est� vazia.\n");
			
		}else {
			
			System.out.println(vaziaFalsoVerdadeiro + "\n");

			System.out.println("A variavel cont�m dados: " + nome + "\n");
		}
	}

}
