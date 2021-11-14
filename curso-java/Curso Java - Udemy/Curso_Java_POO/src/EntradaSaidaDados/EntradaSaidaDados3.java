package EntradaSaidaDados;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaSaidaDados3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		float salario;
		
		/* 
		 * JOptionpane por padrão recebe apenas dados do tipo String "texto", para armazenar outros 
		 * tipos e necessario converte para o valor desejado 
		*/
		
		// JOptionPane para entrada de dados
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
				
		// JOptionPane para entrada de dados, convertido para armazenar em uma variavel do tipo inteiro.
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		// JOptionPane para entrada de dados, convertido par armazenar em uma variavel do tipo float
		salario = Float.parseFloat(JOptionPane.showInputDialog("Digite seu salario"));
		
				
		// Saida de dados, será impreso o nome armazenado na variavel.
		System.out.println("Seu nome é: " + nome);
				
		// Saida de dados, será impreso o idade armazenado na variavel.
		System.out.println("Sua idade é: "+ idade);
				
		// Saida de dados, será impreso o peso armazenado na variavel.
		System.out.println("Sua idade é: " + salario);
		
		
	}

}
