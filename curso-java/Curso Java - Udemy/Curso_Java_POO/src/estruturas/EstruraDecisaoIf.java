package estruturas;

import javax.swing.JOptionPane;

public class EstruraDecisaoIf {

	public static void main(String[] args) {
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o n?mero de 1 a 12: ")); 
		
		
		if(mes == 1 ) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Janeiro ");
			
		} else if (mes == 2) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Fevereiro ");
	
		} else if (mes == 3) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Mar?o ");
			
		} else if (mes == 4) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Abril ");
			
		} else if (mes == 5) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Maio ");
			
		} else if (mes == 6) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Junho ");
			
		} else if (mes == 7) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Julho ");
			
		} else if (mes == 8) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Agosto ");
			
		} else if (mes == 9) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Setembro ");
			
		} else if (mes == 10) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Outubro ");
			
		} else if (mes == 11) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Novembro ");
			
		}else if (mes == 12) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "? m?s ?:  Dezembro ");
			
		}else {
			JOptionPane.showMessageDialog(null, "O n?mero digitado n?o e v?lido para um m?s.");

		}
		
		
	}

}
