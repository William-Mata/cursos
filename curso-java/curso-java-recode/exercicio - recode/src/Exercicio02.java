import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Scanner dados = new Scanner(System.in);
				
				double imc, altura, peso;
				
				System.out.print("Digite sua altura: ");
				altura = dados.nextDouble();

				System.out.print("\nDigite seu peso: ");
				peso = dados.nextDouble();
				
				imc = peso / (altura * altura);
				
				if(imc < 18.5) {
				
					System.out.printf("Abaixo do peso, seu IMC é: %.2f%n ", imc);
					
				}else if((imc >= 18.5) && (imc <= 24.9)) {
				
					System.out.printf("Peso Normal, seu IMC é: %.2f%n ", imc);
						
				}else if((imc >= 25) && (imc <= 29.9)) {
					
					System.out.printf("Sobrepeso, seu IMC é: %.2f%n ", imc);
					
				}else if((imc >= 30) && (imc <34.9)) {
					
					System.out.printf("Obesidade Grau I, seu IMC é: %.2f%n ", imc);
					
				}else if((imc >= 35) && (imc <= 39.9)) {
					
					System.out.printf("Obesidade Grau II, seu IMC é: %.2f%n ", imc);
					
				}else {
					
					System.out.printf("Obesidade Grau III ou Mórbida, seu IMC é: %.2f%n ", imc);
					
				}
				
				dados.close();			
			}

	}
