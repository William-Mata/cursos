package Estruturas;

import javax.swing.JOptionPane;

public class EstruturaDecisaoSwitch {

	public static void main(String[] args) {
		
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de 1 a 12: ")); 
		
		
		switch (mes) {
			
		case 1: JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Janeiro ");
		break;	
		
		case 2:	JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Fevereiro ");
		break;	
		
		case 3: JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Mar�o ");
		break;	
		
		case 4:	JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Abril ");
		break;	
		
		case 5:	JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Maio ");
		break;	
		
		case 6:	JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Junho ");
		break;
		
		case 7:	JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Julho ");
		break;		
		
		case 8:	JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Agosto ");
		break;	
		
		case 9:	JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Setembro ");
		break;
		
		case 10: JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Outubro ");
		break;
		
		case 11: JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Novembro ");
		break;
		
		case 12: JOptionPane.showMessageDialog(null, "O " + mes + "� m�s �:  Dezembro ");
		break;
		
		default: JOptionPane.showMessageDialog(null, "O n�mero digitado n�o e v�lido para um m�s.");
		break;

		}
	}

}
