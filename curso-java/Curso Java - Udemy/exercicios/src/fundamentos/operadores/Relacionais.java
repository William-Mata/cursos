package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		System.out.println("Operadores Relacionais");
		System.out.println("\"a\" = " + a + " \"b\" = " + b);
		System.out.println("\"a\" � maior que \"b\": "+ (a>b));
		System.out.println("\"a\" � maior ou igual a \"b\": "+ (a>=b));
		System.out.println("\"a\" � menor que \"b\": " + (a<b));
		System.out.println("\"a\" � menor ou igual a \"b\": "+ (a<=b));
		System.out.println("\"a\" �  igual a \"b\": "+ (a==b));
		System.out.println("\"a\" � diferente de \"b\": "+ (a!=b));
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto: " + temDesconto);
	}

}
