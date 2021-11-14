package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {	
		
		System.out.print("Bom");
		System.out.println(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Sal�rio: %.1f %n", 1234.5678);
		
		/*
		 * Recebe informa��es digitadas no teclado.
		 */
		Scanner entrada =  new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		/*
		 * Passando um dado digitado pelo usuario para uma variavel String
		 */
		String nome =  entrada.nextLine();
		
		System.out.print("\nDigite o seu sobrenome: ");
		String sobrenome =  entrada.nextLine();
		
		System.out.print("\nDigite sua idade: ");
		int idade =  entrada.nextInt();
		
		System.out.print("\nDigite sua altura: ");
		double altura = entrada.nextDouble();
		
		
		System.out.printf("\nSeu nome e sobrenome � %s %s, %d Anos, sua altura � %.2f.", nome.toUpperCase(), sobrenome .toUpperCase(), idade, altura);;
		
		
		
		/*
		 * Fechando o Scanner 
		 * e necessario para n�o consumir recursos
		 * desnecessariamente, ap�s terminar a utiliza��o.
		 */
		entrada.close();
		
		
	}
}
