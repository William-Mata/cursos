package arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ArraySort {

	public static void main(String[] args) {
		//esse vetor será orgazizado em ordem crescente pelo sort
		byte vetor [] = { 8, 3, 9, 4 , 12 , 30 , 16, 17, 13, 21, 17 , 28 ,30};
		
		String txt = "";
		
		// o metodo sort organiza os dados dentro do vetor em ordem crescente.
		// abaixo ele iria organizar apenas do indice 0 ao 10 dentro do vetor 
		Arrays.sort(vetor, 0, 9);
		
		for(int i : vetor) {
			
			txt += i + "\n";
		}
		
		JOptionPane.showMessageDialog(null,"Sort apenas dos indice 0 ao 10: \n" +txt);
		
		
		txt = "";
		
		// o metodo sort organiza os dados dentro do vetor em ordem crescente.
		Arrays.sort(vetor);
		
		for(int i : vetor) {
			
			txt += i + "\n";
		}
		
		JOptionPane.showMessageDialog(null,"Sort todos valores: \n" + txt);

	}

}
