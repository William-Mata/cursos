package variaveis;

public class variavel_byte {

	public static void main(String[] args) {
		byte valor3;
		
		byte valor1 = 15;
		byte valor2 = 25;
		
		// cast explicito, o valor da operaçao de dois byte é um inteiro
		//ordem crescente dos inteiros: byte, short, inteiro, long
		valor3 = (byte) (valor1 + valor2);
		
		
		System.out.println("Valor 01: " + valor1);		
		System.out.println("Valor 02: " + valor2);		
		System.out.println("Valor 03: " + valor3);		
	}

}
