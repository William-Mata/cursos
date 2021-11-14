package fundamentos;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner salario = new Scanner(System.in); 
		
		double soma = 0;
		
		System.out.println("Digite o primeiro salario:  ");
		String salario1 = salario.next().replace(",", ".");
		System.out.println("Digite o segundo salario:  ");
		String salario2 = salario.next().replace(",", ".");
		System.out.println("Digite o terceiro salario:  ");
		String salario3 = salario.next().replace(",", ".");
		
		soma += Double.parseDouble(salario1);
		soma += Double.parseDouble(salario2);
		soma += Double.parseDouble(salario3);
		
		double salarioMedia = (soma/3);
		
		System.out.printf("A media dos 3 salarios são:  %.2f" , salarioMedia);
		
		
		salario.close();
	}
}
