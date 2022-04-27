package arrays;

import javax.swing.JOptionPane;

public class Vetor4 {

	public static void main(String[] args) {
		String msg = "";
		
		int tamanho =  Integer.parseInt(JOptionPane.showInputDialog
				("Digite a quantidade de números que deseja armazenar: "));
		
		int valor[] = new int[tamanho];
		
		
		for(int i = 0; i < valor.length; i++) {
			String txt = JOptionPane.showInputDialog("Digite o " + (i+1) + "° valor: ");
			
			if(txt == null) {
				break;
			}else {
				valor[i] = Integer.parseInt(txt);
			}
		}
		
		for(int j : valor) {

			msg +=  j +  "\n";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
