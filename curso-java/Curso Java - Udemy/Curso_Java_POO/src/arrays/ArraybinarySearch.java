package arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArraybinarySearch {

	public static void main(String[] args) {

		
		// esse � o vetor que ser� pesquisado o valor digitado pelo usuario
		byte vetor [] = {0, 3, 4, 8, 9, 12 , 16, 17, 17, 21, 28 ,30};
		
		
		// aqui ser� recebido o valor que o usuario quer que pesquise no vetor
		byte valor = Byte.parseByte(JOptionPane.showInputDialog("Digite o valor a ser pesquisado: "));
		
		
		// aqui ser� pesquisado o valor que foi digitado acima dentro do vetor e depois sera passado 
		// a posi��o para a variavel resultado, para isso o vetor precisa est� com os valores armazenado 
		// organizado como est�.
		int resultado = Arrays.binarySearch(vetor, valor);
		
		
		if(resultado >0) {
			// aqui ser� apresentado uma mensagem com o valor do indice que armazena o valor digitado pelo usuario.
			JOptionPane.showMessageDialog(null, "O indice onde est� armazenado o valor �:  " + resultado);	
		}
		else {
			JOptionPane.showMessageDialog(null, "O valor '" + valor + "', n�o foi encontrado dentro do vetor.");
		}
		
		
	}

}
