package variaveis;

public class variavel_short {

	public static void main(String[] args) {
		short valor3;
		
		short valor1 = 15;
		short valor2 = 25;
		
		// ordem crescente dos inteiros: byte, short, inteiro, long
		// cast implicito, o valor da operaçao de dois byte é um inteiro
		valor3 = (byte) (valor1 + valor2);
		
		
		System.out.println("Valor 01: " + valor1);		
		System.out.println("Valor 02: " + valor2);		
		System.out.println("Valor 03: " + valor3);		

	}

}
