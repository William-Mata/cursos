package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args ) {
		int a = 3;
		int b = 6;
	
		
		
		System.out.println("Operadores de Atribui��o");
		System.out.println("\n\"a\" = " + a + " \"b\" = " + b);
		System.out.println("\nPr� incremento ++a: " + (++a));
		System.out.println("\nP�s incremento a++: " + (a++));
		System.out.println("\nPr� decremento --b: " + (--b));
		System.out.println("\nP�s decremento b--: " + (b--));
		
		
		System.out.println("\nSoma a+= b: " + (a+=b));
		System.out.println("\nSubtra��o a-= b: " + (a-=b));
		System.out.println("\nMultiplica��o a*=: " + (a*=b));
		System.out.println("\nDivis�o a/=: " + (a/=b));
		System.out.println("\nResto da divis�o a%=: " + (a%=b));
	}
	
	
}
