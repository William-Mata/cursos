package variaveis;

public class variavel_inteiro {

	public static void main(String[] args) {
		// ordem crescente dos inteiros: byte, short, inteiro, long
		
		int valor1 = 15;
		int valor2 = 25;
		int valor3, valor4;
		
		
		valor3 = valor1 + valor2;
		
		
		System.out.println("Valor 01: " + valor1);		
		System.out.println("Valor 02: " + valor2);		
		System.out.println("Valor 03: " + valor3);
		
		// valor 16 em decimal
		valor4 = 16;
		System.out.println("Valor 04 - decimal: " + valor4);
		
		// valor 16 em octal
		valor4 = 020;
		System.out.println("Valor 04 - octal: " + valor4);
		
		// valor 16 em hexadecimal
		valor4 = 0x10;
		System.out.println("Valor 04 - hexadecimal: " + valor4);
		
		// valor 16 em binario 
		valor4 = 0b0001_0000;
		System.out.println("Valor 04 - binario: " + valor4);
		
		
	}

	
}
