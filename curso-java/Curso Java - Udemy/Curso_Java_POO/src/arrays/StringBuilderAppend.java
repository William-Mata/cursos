package arrays;

public class StringBuilderAppend {

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
		 * O metodo append e a forma de inserir dados ao StringBuilder
		 * O metodo append sempre insere os dados no final 
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.append( "objeto: " +  pessoa + "\n" );
		
		/*
		 * Inserindo uma String em uma StringBuilder
		 * O metodo append e a forma de inserir dados ao StringBuilder
		 * O metodo append sempre insere os dados no final 
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.append( "nome: " +  nome + "\n"  );

		
		
		/*
		 * Inserindo um inteiro em uma StringBuilder
		 * O metodo append e a forma de inserir dados ao StringBuilder
		 * O metodo append sempre insere os dados no final 
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.append( "idade: " + idade + "\n"  );
		
		/*
		 * Inserindo um double em uma StringBuilder
		 * O metodo append e a forma de inserir dados ao StringBuilder
		 * O metodo append sempre insere os dados no final 
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.append( "peso: " + peso + "\n" );
		
		/*
		 * Inserindo um float em uma StringBuilder
		 * O metodo append e a forma de inserir dados ao StringBuilder
		 * O metodo append sempre insere os dados no final 
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.append( "altura: " + altura +"\n");
		
		
		/*
		 * Inserindo um boolean em uma StringBuilder
		 * O metodo append e a forma de inserir dados ao StringBuilder
		 * O metodo append sempre insere os dados no final 
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice  
		 */
		informacoes.append( "casado: " + casado + "\n");
		
		
		/*
		 * Inserindo um char em uma StringBuilder
		 * O metodo append e a forma de inserir dados ao StringBuilder
		 * O metodo append sempre insere os dados no final 
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.append( "trabalahando: " + trabalhando + "\n" + "sexo: ");
		
		
		/*
		 * Inserindo um vetor de char em uma StringBuilder
		 * O metodo append e a forma de inserir dados ao StringBuilder
		 * O metodo append sempre insere os dados no final 
		 *  abaixo ele começa a inserir novos dados a partir do ultimo indice 
		 */
		informacoes.append(sexo );
		
		/*
		 * Imprimindo o StringBuilder, após recebe os dados da variavel nome.
		 */
		System.out.println(informacoes);
	}

}
