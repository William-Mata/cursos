package fundamentos;

import java.util.Scanner;

public class DesafioCelsiusFahrenheit {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final double aumentar = 32;
		final double multiplicar = 1.8;
		double fahrenheit = 0;
		double celsius = 0;

		
		System.out.println("Digite o valor do Celsius: ");
		celsius = entrada.nextDouble();
		
		fahrenheit = (celsius * multiplicar) + aumentar;
		
		System.out.printf("O valor da conversão de Celsius (°C %.0f) por Fahrenheit é: °F %.0f",
				celsius, fahrenheit);
		
		entrada.close();
		

	}

}
