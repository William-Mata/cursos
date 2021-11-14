package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		int a = 5, b = 3;
		double c = 5.5 , d= 3.3;
	
		System.out.println("Operações com valores Inteiros");
		System.out.println("O resultado da soma é: " + (a + b));
		System.out.println("O resultado da subtração é: " + (a - b));
		System.out.println("O resultado da multiplicação é: " + (a * b));
		System.out.println("O resultado da divisão é: " + (a / b));
		System.out.println("O resultado do resto da divisão é: " + (a%b) );
		
		System.out.println("\nOperações com valores Reais");
		System.out.println("O resultado da soma é: " + (c + d));
		System.out.println("O resultado da subtração é: " + (c - d));
		System.out.println("O resultado da multiplicação é: " + (c * d));
		System.out.println("O resultado da divisão é: " + (c / d));
		System.out.println("O resultado do resto da divisão é: " + (c % d) );
		
	}
	
}
