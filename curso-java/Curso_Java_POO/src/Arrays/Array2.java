package Arrays;

import javax.swing.JOptionPane;


public class Array2 {

	public static void main(String[] args) {
		String[] nome = new String[4];
		
		
		for(int c = 0; c < nome.length; c++ ) {
			
			nome[c] = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		}
			
		for(int c = 0; c< nome.length; c++) {
		
			System.out.println("Seu nome é: " +nome[c]);
			
		}
	}

}
