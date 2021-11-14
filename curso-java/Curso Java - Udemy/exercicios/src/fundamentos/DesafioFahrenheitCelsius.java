package fundamentos;

import java.util.Scanner;

public class DesafioFahrenheitCelsius {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final double diminuir = 32;
		final double dividir = 1.8;
		double fahrenheit;
		double celsius = 0;

		
		System.out.println("Digite o valor do Fahrenheit: ");
		fahrenheit = entrada.nextDouble();
		
		celsius = (fahrenheit - diminuir) / dividir;
		
		System.out.printf("O valor da conversão de Fahrenheit (°F %.0f) por Celsius é: °C %.2f",
				fahrenheit, celsius);
		
		entrada.close();
		
		
	}

}
