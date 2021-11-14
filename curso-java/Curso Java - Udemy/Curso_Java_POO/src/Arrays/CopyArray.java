package Arrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] origem = {1,2,3,5,6};
		int[] destino1 = new int[8];
		int[] destino2 = new int[5];
		int[] destino3 = new int[6];
		int[] destino4 = new int[9];
		
		System.out.println("Antes de copiar para o vetor destino1");
		System.out.println();
		
		for(int i = 0; i < destino1.length; i++) {
			
			System.out.println("Destino " + i + ": " +  destino1[i]);
			
		}
		
		//copiando os dados de um array para o outro, do array origem para o destino1 copiando 3 elemento e passando
		// para as posições a parti do indice 2 de origem para o a parti do indice 2 de destino
		System.arraycopy(origem, 2, destino1, 2, 3);
		
		System.out.println();
		System.out.println("Depois de copiar para o vetor destino1");
		System.out.println();
		// lendo o vetor destino1 depois de copiar os dados do vetor origem para o vetor destino1
		for(int i = 0; i < destino1.length; i++) {
			
			System.out.println("Destino " + i +  ": " + destino1[i]);
			
		}
		
		
		System.out.println();
		System.out.println("Antes de copiar para o vetor destino2");
		System.out.println();
		// lendo o vetor destino2 antes de copiar os dados do vetor origem para o vetor destino2
		for(int i = 0; i < destino2.length; i++) {
			
			System.out.println("Destino "+ i + ": " + destino2[i]);
			
		}
		
		
		//copiando os dados de um array para o outro, do array origem para o destino2 copiando todos os elemento 
		System.arraycopy(origem, 0, destino2, 0, 5);
		
		System.out.println();
		System.out.println("Depois de copiar para o vetor destino2");
		System.out.println();
		// lendo o vetor destino2 depois de copiar os dados do vetor origem para o vetor destino2
		for(int i = 0; i < destino2.length; i++) {
			
			System.out.println("Destino " + i +  ": " + destino2[i]);
			
		}
		
		
		
		System.out.println();
		System.out.println("Antes de copiar para o vetor destino3");
		System.out.println();
		// lendo o vetor destino3 antes de copiar os dados do vetor origem para o vetor destino3
		for(int i = 0; i < destino3.length; i++) {
			
			System.out.println("Destino " + i + ": "+ destino3[i]);
			
		}
		
		
		
		// copiando o array atraves da classe arrays utilizando o copyof
		// copiando os dados de um array para o outro, do array origem para o destino3 copiando todos os elemento 
		// so que desse modo ele começa do indice 1 e vai até a quantidade que foi definida de elemento a copiar
		// ele altera a quantidade de elementos do vetor também para a quantidade de elementos que está sendo copiado
		destino3 = Arrays.copyOf(origem, 5);
	
		System.out.println();
		System.out.println("Depois de copiar para o vetor destino3");
		System.out.println();
		// lendo o vetor destino3 depois de copiar os dados do vetor origem para o vetor destino3
		for(int i = 0; i < destino3.length; i++) {
					
			System.out.println("Destino " + i +  ": " + destino3[i]);
					
		}
		
		
		
		System.out.println();
		System.out.println("Antes de copiar para o vetor destino4");
		System.out.println();
		// lendo o vetor destino4 antes de copiar os dados do vetor origem para o vetor destino4
		for(int i = 0; i < destino4.length; i++) {
			
			System.out.println("Destino " + i + ": "+ destino4[i]);
			
		}
		
		
		
		// copiando o array atraves da classe arrays utilizando o copyofrange
		// copiando os dados de um array para o outro, do array origem para o destino4 copiando todos os elemento 
		// so que desse modo ele começa do indice definido de inicio e vai até o indice que foi definido como final 
		// ele altera a quantidade de elementos do vetor também para a quantidade de elementos que está sendo copiado
		destino4 = Arrays.copyOfRange(origem, 0, 1  );
	
		System.out.println();
		System.out.println("Depois de copiar para o vetor destino4");
		System.out.println();
		// lendo o vetor destino4 depois de copiar os dados do vetor origem para o vetor destino4
		for(int i = 0; i < destino4.length; i++) {
					
			System.out.println("Destino " + i +  ": " + destino4[i]);
					
		}
	}

}
