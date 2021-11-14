package fundamentos;

import java.util.Scanner;

public class DesafioCalculoTriangulo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double altura = 0, base = 0, area = 0;
		
		System.out.println("Digite o valor da base do triângulo: ");
		base = entrada.nextDouble();

		System.out.println("Digite o valor da altura do triângulo: ");
		altura = entrada.nextDouble();
		
		area = (base * altura) / 2;
		
		System.out.printf("O valor da área do triângulo é: %.2f ", area);

	}
	
}
