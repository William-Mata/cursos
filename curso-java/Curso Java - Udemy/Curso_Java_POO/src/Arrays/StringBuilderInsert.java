package Arrays;

public class StringBuilderInsert {

	public static void main(String[] args) {
		StringBuilder informacoes = new StringBuilder();
		Object pessoa = "pessoa";
		String nome = "william ";
		int idade = 23;
		double peso = 53.4d;
		float altura = 1.67f;
		char sexo[] = {'M', 'A', 'S', 'C', 'U', 'L', 'I', 'N', 'O'};
		boolean casado = true;
		char trabalhando = 'N';
		
		
		/*
		 * Inserindo um objeto em uma StringBuilder
		 * O metodo Insert e a forma de inserir dados ao StringBuilder
		 * O metodo permite que insira a partir de qual indice
		 *  deseja pegar os dados da variavel
		 *  abaixo ele começa do indice 0.
		 */
		informacoes.insert(0, "objeto: " +  pessoa + "\n"  );
		
		/*
		 * Inserindo uma String em uma StringBuilder
		 * O metodo Insert e a forma de inserir dados ao StringBuilder
		 * O metodo permite que insira a partir de qual indice
		 *  deseja pegar os dados da variavel
		 *  abaixo ele começa do indice 0.
		 */
		informacoes.insert(informacoes.length(), "nome: " +  nome + "\n"  );

		
		
		/*
		 * Inserindo um inteiro em uma StringBuilder
		 * O metodo Insert e a forma de inserir dados ao StringBuilder
		 * O metodo permite que escolha em qual indice
		 *  deseja inserir os dados na variavel informacoes
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.insert(informacoes.length(), "idade: " + idade + "\n"  );
		
		/*
		 * Inserindo um double em uma StringBuilder
		 * O metodo Insert e a forma de inserir dados ao StringBuilder
		 * O metodo permite que escolha em qual indice
		 *  deseja inserir os dados na variavel informacoes
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.insert(informacoes.length(), "peso: " + peso + "\n" );
		
		/*
		 * Inserindo um float em uma StringBuilder
		 * O metodo Insert e a forma de inserir dados ao StringBuilder
		 * O metodo permite que escolha em qual indice
		 *  deseja inserir os dados na variavel informacoes
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.insert(informacoes.length(), "altura: " + altura);
		
		
		/*
		 * Inserindo um vetor de boolean em uma StringBuilder
		 * O metodo Insert e a forma de inserir dados ao StringBuilder
		 * O metodo permite que escolha em qual indice
		 *  deseja inserir os dados na variavel informacoes
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.insert(informacoes.length(), "\ncasado: " + casado);
		
		
		/*
		 * Inserindo um vetor de char em uma StringBuilder
		 * O metodo Insert e a forma de inserir dados ao StringBuilder
		 * O metodo permite que escolha em qual indice
		 *  deseja inserir os dados na variavel informacoes
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.insert(informacoes.length(), "\ntrabalahando: " + trabalhando + "\n" + "sexo: ");
		
		
		/*
		 * Inserindo um vetor de char em uma StringBuilder
		 * O metodo Insert e a forma de inserir dados ao StringBuilder
		 * O metodo permite que escolha em qual indice
		 *  deseja inserir os dados na variavel informacoes
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.insert(informacoes.length(),  sexo );
		
		/*
		 * Imprimindo o StringBuilder, após recebe os dados da variavel nome.
		 */
		System.out.println(informacoes);
		
		
		
	}

}
