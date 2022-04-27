package arrays;

import java.util.Arrays;

public class ArrayFill {

	public static void main(String[] args) {
		int[] origem = {8,16,17,21,28,30};
		
		System.out.println("Valores antes do Fill");
		for(int i : origem) {
			
			System.out.println("valor: " + i);
			
		}
		
		
		// O metodo fill modifica alguns dos valores do vetor origem para o valor desejado.
		// no caso abaixo os valores do indice 2 ao 4 dentro do vetor origem será modificado para 10.
		Arrays.fill(origem, 2 , 4 , 10);
		
		System.out.println();
		System.out.println("Valores depois do Fill");
		for(int i : origem) {
			
			System.out.println("valor: " + i);
			
		}
		
		
		
		// O metodo fill modifica os valores do vetor origem para o valor desejado.
		// no caso abaixo todos os valores dentro do vetor origem será modificado para 10.
		Arrays.fill(origem, 10);
		
		
		System.out.println();
		System.out.println("Valores depois do Fill");
		for(int i : origem) {
			
			System.out.println("valor: " + i);
			
		}
	}

}
