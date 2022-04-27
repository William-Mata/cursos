package arrays;

public class Array3 {

	public static void main(String[] args) {
		int[] vetor = {1,2,3,4,5};
		
		
		// percorrendo o vetor de inteiro atraves do laço de repetição for
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("valor: " + vetor[i]);
		}
		
		System.out.println();
		
		//aqui os valores do vetor são passado para a variavel J
		//percorrendo o vetor atraves do forech forma mais rapida
		for(int j : vetor) {
			System.out.println("valor: " + j);
		}
	}

}
