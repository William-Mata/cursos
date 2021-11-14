package Estruturas;

import javax.swing.JOptionPane;

public class EstruturaDecisaoSwitch {

	public static void main(String[] args) {
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de 1 a 12: ")); 
		
		
		switch (mes) {
			
		case 1: JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Janeiro ");
		break;	
		
		case 2:	JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Fevereiro ");
		break;	
		
		case 3: JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Março ");
		break;	
		
		case 4:	JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Abril ");
		break;	
		
		case 5:	JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Maio ");
		break;	
		
		case 6:	JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Junho ");
		break;
		
		case 7:	JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Julho ");
		break;		
		
		case 8:	JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Agosto ");
		break;	
		
		case 9:	JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Setembro ");
		break;
		
		case 10: JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Outubro ");
		break;
		
		case 11: JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Novembro ");
		break;
		
		case 12: JOptionPane.showMessageDialog(null, "O " + mes + "° mês é:  Dezembro ");
		break;
		
		default: JOptionPane.showMessageDialog(null, "O número digitado não e válido para um mês.");
		break;

		}
	}

}
