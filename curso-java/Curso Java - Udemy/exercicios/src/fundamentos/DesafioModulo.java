package fundamentos;

import java.util.Scanner;

public class DesafioModulo {

	public static void main(String[] args) {
		
		// Objeto Scanner recebe dados
		// System.in define de onde o dado vem que no caso dado de entrada teclado.
		Scanner entrada = new Scanner(System.in);
		
		//duas varias do tipo double que ir� receber dois valores digitados pelo usuario.
		Double num1 , num2, resultado;
		String operacao;
	
		
		System.out.println("Digite o 1� n�mero: ");
		//Ir� receber em num por meio do entrada o valor digitado pelo usuario.
		num1 = entrada.nextDouble();
		
		
		System.out.println("Digite o 2� n�mero: ");
		//Ir� receber em num por meio do entrada o valor digitado pelo usuario.
		num2 = entrada.nextDouble();

		
		
		
		System.out.println("Digite o tipo de opera��o \" - \" , \" + \" , \" * \" , \" / \" , \" % \"  :");
		operacao = entrada.next();
		operacao = operacao.equals("-")  ^ operacao.equals("+") ^ 
		operacao.equals("*")  ^  operacao.equals("/") ^ operacao.equals("%") ? 
		operacao : "Voc� precisa digitar uma das seguintes opera��es,  \" - \" , \" + \" , \" * \" , \" / \" , \" % \". " ;
		
		resultado = operacao.equals("-") ? num1 - num2 :  operacao.equals("+") ? 
		num1 + num2 : operacao.equals("*") ? num1 * num2 : operacao.equals("/") ? num1 / num2 : 
		operacao.equals("%") ?  num1 % num2 : 0;
		
		System.out.printf("%.2f  %s  %.2f  = %.2f" , num1, operacao, num2, resultado); 
		
		entrada.close();
		
	}

}
