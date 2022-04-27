package entrada_saida_dados;

import javax.swing.JOptionPane;

public class SaidaDados3 {

	public static void main(String[] args) {
		String nome = "william";
		int idade = 23;
		boolean casado = true;
		float salario = 1040.50f;
		char sexo = 'H';
		
		//saida de dados atraves do JOptionPane
		JOptionPane.showMessageDialog( null , "nome: " + nome + "  \nidade: " + idade + 
				"  \nsexo: " + sexo  + " \ncasado: " + casado + " \nsalario: " + salario);
		
	}

}
