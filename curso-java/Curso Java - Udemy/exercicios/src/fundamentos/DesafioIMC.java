package fundamentos;

import java.util.Scanner;

public class DesafioIMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double altura, peso, imc;
		String tipo;
		
		System.out.println("Digite sua altura: ");
		altura = entrada.nextDouble();
		
		System.out.println("Digite seu peso: ");
		peso = entrada.nextDouble();

		imc = peso / (altura*altura) ;
		
		tipo = imc < 18.5 ? "Magreza" : imc < 24.9 ?
		"Normal" : imc < 30.0 ? "Sobrepeso" : imc > 30.0 ?
		"Obesidade" : "Valor Invalido."; 
		
		System.out.printf("O valor do seu IMC � %.2f (kg/m�)  e seu tipo � %s.", imc, tipo );
		
		entrada.close();
	}

}
