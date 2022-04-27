package arrays;

import javax.swing.JOptionPane;

public class ArrayBidmensionalMatriz {

	public static void main(String[] args) {
		// declarando, instanciando e inicalizando uma matriz de inteiros
		// uns do modo para quando se sabe o valor que a matriz irá ter
		int matriz[][] = {{0,1,9,6},{5,4,8,9}};
		
		
		// declarando e instanciando uma matriz de inteiros
		// para quando se saber o a quantidade a quantidade de linha e colunas que
		// a matriz vai ter e não se sabe o valores que irão ter
		int matriz2[][] = new int[3][3];
		
		
		// declarando uma matriz de inteiros
		// para quando se sabe que ira utilizar uma matriz mais não se sabe quantas linhas e colunas ira ter e nem os valores.
		int[][] matriz3;
		
		// instanciando uma matriz de inteiros
		// aqui quando descobre a quantidade de linhas e colunas que ira ter.
		matriz3 = new int[2][2]; 
		
		
		// passando os dados para a matriz de forma manual
		
		matriz3[0][0] = 1;
		matriz3[0][1] = 2;
		matriz3[1][0] = 3;
		matriz3[1][1] = 4;
		
		
		
		System.out.println("Matriz Imprimindo os dados.");

		
		// percorrendo a matriz imprimindo todos os valores que foi inicializado 
		// o primeiro for percorre a linha da matriz	
		// o segundo for percorre a coluna da matriz
		for(int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j]+ "  |  ");
			}
			System.out.print("\n");
		}
		
			
		
		// preenchendo os valores da matriz2 de inteiros com entrada de valores pelo usuario.
		// o primeiro for percorre a linha da matriz	
		// o segundo for percorre a coluna da matriz
		for(int i = 0; i < matriz2.length; i++) {
			
			for (int j = 0; j < matriz2[i].length; j++){
				
				matriz2[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
				
			}
		}
		
		
		System.out.println();
		System.out.println("Matriz2 Imprimindo os dados.");

		// percorrendo a matriz2 imprimindo todos os valores digitados pelo o usuario.
		// o primeiro for percorre a linha da matriz
		// o segundo for percorre a coluna da matriz
		for(int i = 0; i < matriz2.length; i++) {
			
			for (int j = 0; j < matriz2[i].length; j++){
			
				System.out.print(matriz2[i][j]+ "  |  ");
			}
			System.out.print("\n");
		}
		
		
		
		System.out.println();
		System.out.println("Matriz3 Imprimindo os dados.");

		// percorrendo a matriz3 imprimindo todos os valores 
		// o primeiro for percorre a linha da matriz
		// o segundo for percorre a coluna da matriz
		for(int i = 0; i < matriz3.length; i++) {
			
			for (int j = 0; j < matriz3[i].length; j++){
			
				System.out.print(matriz3[i][j]+ "  |  " );				
			}
			System.out.print("\n");

		}
		
	

	}
	

}
