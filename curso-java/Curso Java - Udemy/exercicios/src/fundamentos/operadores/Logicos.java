package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
	
		//bolean condicao1 true e condicao2 false
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		
		/* 
		 * Operador logico && para ser verdadeiro
		 * todas as condições precisa ser veridadeiras.
		*/
		System.out.println(condicao1 && condicao2);
		
		/* 
		 * Operador logico || para ser verdadeiro
		 * e necessario que uma ou as duas seja verdadeira.
		*/
		System.out.println(condicao1 || condicao2);
		/* 
		 * Operador logico ^ para ser verdadeiro
		 * e necessario que apenas uma seja verdadeira.
		*/
		System.out.println(condicao1 ^ condicao2);
		/* 
		 * Operador logico ! para ser verdadeiro a condição 
		 * tem que ser falsa, para ser falso a condição tem 
		 * que ser verdadeira.
		*/
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		
		
		// Tabela Verdade E - &&
		System.out.println("\nTabela verdade E - &&");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		// Tabela Verdade OU - ||
		System.out.println("\nTabela verdade OU - ||");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		// Tabela Verdade OU execlusivo - ^
		System.out.println("\nTabela verdade OU Exclusivo - ^");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// Tabela Verdade Negação !
		System.out.println("\nTabela Negação - !");
		System.out.println(!true);
		System.out.println(!false);
	
		
		
		
	}
}
