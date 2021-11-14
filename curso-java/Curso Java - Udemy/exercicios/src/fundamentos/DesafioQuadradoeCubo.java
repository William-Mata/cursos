package fundamentos;
import java.util.Scanner;

public class DesafioQuadradoeCubo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número para calcular o quadrado e cubo: ");
		double num = entrada.nextDouble();
		
		double cubo = 0, quadrado = 0;
		
		quadrado = Math.pow(num, 2);
		cubo = Math.pow(num, 3);
		
		System.out.printf("O valor ao quadrado do número (%.0f) é:  %.0f \n", num, quadrado );
		
		
		System.out.printf("O valor ao cubo do número (%.0f) é:  %.0f \n", num, cubo );
	
		entrada.close();
	}
	
}
