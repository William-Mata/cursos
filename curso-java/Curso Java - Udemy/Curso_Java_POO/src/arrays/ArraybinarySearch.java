package arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArraybinarySearch {

	public static void main(String[] args) {

		
		// esse é o vetor que será pesquisado o valor digitado pelo usuario
		byte vetor [] = {0, 3, 4, 8, 9, 12 , 16, 17, 17, 21, 28 ,30};
		
		
		// aqui será recebido o valor que o usuario quer que pesquise no vetor
		byte valor = Byte.parseByte(JOptionPane.showInputDialog("Digite o valor a ser pesquisado: "));
		
		
		// aqui será pesquisado o valor que foi digitado acima dentro do vetor e depois sera passado 
		// a posição para a variavel resultado, para isso o vetor precisa está com os valores armazenado 
		// organizado como está.
		int resultado = Arrays.binarySearch(vetor, valor);
		
		
		if(resultado >0) {
			// aqui será apresentado uma mensagem com o valor do indice que armazena o valor digitado pelo usuario.
			JOptionPane.showMessageDialog(null, "O indice onde está armazenado o valor é:  " + resultado);	
		}
		else {
			JOptionPane.showMessageDialog(null, "O valor '" + valor + "', não foi encontrado dentro do vetor.");
		}
		
		
	}

}
