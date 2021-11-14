package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		
		System.out.println("Operadores Relacionais");
		System.out.println("\"a\" = " + a + " \"b\" = " + b);
		System.out.println("\"a\" é maior que \"b\": "+ (a>b));
		System.out.println("\"a\" é maior ou igual a \"b\": "+ (a>=b));
		System.out.println("\"a\" é menor que \"b\": " + (a<b));
		System.out.println("\"a\" é menor ou igual a \"b\": "+ (a<=b));
		System.out.println("\"a\" é  igual a \"b\": "+ (a==b));
		System.out.println("\"a\" é diferente de \"b\": "+ (a!=b));
		
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto: " + temDesconto);
	}

}
