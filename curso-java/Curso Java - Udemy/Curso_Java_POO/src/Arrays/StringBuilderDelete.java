package Arrays;

public class StringBuilderDelete {

	public static void main(String[] args) {
		StringBuilder email = new StringBuilder("william.xavante@gmail.com");
		
		System.out.println(email.length());
		
		System.out.println(email);
		
		
		/*
		 * O metodo delete permite apagar parte do texto encontrado no StringBuilder
		 * Podendo definir de qual indice at� qual indice ir� apagar.
		 * no exemplo abaixo irei apagar do @ at� o m do indice 15 ao 25.
		 */
		email.delete(15, 25);
		
		System.out.println(email);
		
		
		/*
		 * O metodo deleteCharAt permite apagar apenas um caractere do texto encontrado no StringBuilder
		 * Podendo definir de qual indice ir� apagar.
		 * no exemplo abaixo irei apagar o . entre o william.xavante que se encontra no indice 7.
		 */
		email.deleteCharAt(7);
		
		System.out.println(email);
		
		
		/*
		 * O metodo reverser reverte todo o encontrado no StringBuilder
		 *  passando o final para o inicio e inicio para o final
		 */
		email.reverse();
		
		System.out.println(email);
	
				
		System.out.println("\n Antes de Otimizar o StringBuilder\n");
		
		/*
		 * O metodo capacity ele verifica o espa�o que est� sendo utilizado naquele momento
		 * pelo String Builder
		 */
		System.out.println(email.capacity() + "\n");
		/*
		 * O metodo length ele verifica a quantidade de caracteres
		 *  que est� dentro do String Builder naquele momento
		 */
		System.out.println(email.length() + "\n");
		/*
		 * O metodo toString aprensenta os caracteres 
		 * que est�o dentro do StringBuilder naquele momento.
		 */
		System.out.println(email.toString() + "\n");
		
		System.out.println("\n Depois de Otimizar o StringBuilder\n");
		
		/*
		 * O metodo trimToSize elimina o espa�o que n�o est� sendo utilizado pela StringBuilder
		 * Reduzindo o uso de memoria.
		 */
		email.trimToSize();
		
		/*
		 * O metodo capacity ele verifica o espa�o que est� sendo utilizado naquele momento
		 * pelo String Builder
		 */
		System.out.println(email.capacity() + "\n");
		/*
		 * O metodo length ele verifica a quantidade de caracteres
		 *  que est� dentro do String Builder naquele momento
		 */
		System.out.println(email.length() + "\n");
		/*
		 * O metodo toString aprensenta os caracteres 
		 * que est�o dentro do StringBuilder naquele momento.
		 */
		System.out.println(email.toString() + "\n");

		


		
		
		
		
		
		
	}

}
