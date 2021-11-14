import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double result = 0, num1, num2;
		
		
		
		System.out.print("Digite o primeiro número da divisão: ");
		num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo número da divisão: ");
		num2 = entrada.nextDouble();
		
		
		try {
			
			result = num1 / num2;
	
		} catch(Exception e) {
			
			System.out.print("O segundo número da divisão não pode ser 0.");
			
		} finally {
			
			System.out.println("Passou pelo try-catch-finaly");
			
		}
		
		System.out.print("O resultado da divisão de " 
		+ num1 + " / " + num2 + " = " + result);
			
		entrada.close();
		
	}
	
}
