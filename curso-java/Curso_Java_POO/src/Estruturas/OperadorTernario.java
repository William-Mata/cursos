package Estruturas;

import javax.swing.JOptionPane;

public class OperadorTernario {

	public static void main(String[] args) {
		int nota = Integer.parseInt(JOptionPane.showInputDialog("Digite sua nota: "));
		String resultado;
		
		resultado = (nota >= 7) ? "Aprovado" : "Reprovado";
		
		JOptionPane.showMessageDialog(null, "Você está: "+resultado);
		
	}

}
