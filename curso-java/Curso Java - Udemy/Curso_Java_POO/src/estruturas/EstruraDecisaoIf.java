package estruturas;

import javax.swing.JOptionPane;

public class EstruraDecisaoIf {

	public static void main(String[] args) {
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de 1 a 12: ")); 
		
		
		if(mes == 1 ) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Janeiro ");
			
		} else if (mes == 2) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Fevereiro ");
	
		} else if (mes == 3) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Março ");
			
		} else if (mes == 4) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Abril ");
			
		} else if (mes == 5) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Maio ");
			
		} else if (mes == 6) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Junho ");
			
		} else if (mes == 7) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Julho ");
			
		} else if (mes == 8) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Agosto ");
			
		} else if (mes == 9) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Setembro ");
			
		} else if (mes == 10) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Outubro ");
			
		} else if (mes == 11) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Novembro ");
			
		}else if (mes == 12) {
			
			JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Dezembro ");
			
		}else {
			JOptionPane.showMessageDialog(null, "O número digitado não e válido para um mês.");

		}
		
		
	}

}
