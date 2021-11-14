import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2;
		double valor1, valor2, valorTotal;
		String peca1, peca2;
		
		System.out.print("\nDigite o nome da primeira pe�a: ");
		peca1 = entrada.next();
		
		System.out.print("\nDigite o codigo da primeira pe�a: ");
		cod1 = entrada.nextInt();
		
		System.out.print("\nDigite o valor da primeira pe�a: ");
		valor1 = entrada.nextDouble();
		
		System.out.print("\nDigite a quantida da primeira pe�a: ");
		qtd1 = entrada.nextInt();
		
		System.out.print("\nDigite o nome da segunda pe�a: ");
		peca2 = entrada.next();
		
		System.out.print("\nDigite o codigo da segunda pe�a: ");
		cod2 = entrada.nextInt();
		
		System.out.print("\nDigite o valor da segunda pe�a: ");
		valor2 = entrada.nextDouble();
		
		System.out.print("\nDigite a quantida da segunda pe�a: ");
		qtd2 = entrada.nextInt();

		valorTotal = (qtd1 * valor1) + (qtd2 * valor2);
		
		System.out.println("  Nome   ||    Codigo   ||  Quantidade  || Valor Unidade ||  Valor Total   ");
		System.out.println(  peca1 + " || " + cod1 + " || " + " || " + qtd1 + " || " + valor1 + " || " + valor1*qtd1);
		System.out.println(  peca2 + " || " + cod2 + " || " + " || " + qtd2 + " || " + valor2 + " || " + valor2*qtd2);
		
		System.out.printf("O valor total da compra �: %.2f%n ", valorTotal);
		
		entrada.close();
	}

}
