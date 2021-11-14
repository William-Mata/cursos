package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args ) {
		int a = 3;
		int b = 6;
	
		
		
		System.out.println("Operadores de Atribuição");
		System.out.println("\n\"a\" = " + a + " \"b\" = " + b);
		System.out.println("\nPré incremento ++a: " + (++a));
		System.out.println("\nPós incremento a++: " + (a++));
		System.out.println("\nPré decremento --b: " + (--b));
		System.out.println("\nPós decremento b--: " + (b--));
		
		
		System.out.println("\nSoma a+= b: " + (a+=b));
		System.out.println("\nSubtração a-= b: " + (a-=b));
		System.out.println("\nMultiplicação a*=: " + (a*=b));
		System.out.println("\nDivisão a/=: " + (a/=b));
		System.out.println("\nResto da divisão a%=: " + (a%=b));
	}
	
	
}
