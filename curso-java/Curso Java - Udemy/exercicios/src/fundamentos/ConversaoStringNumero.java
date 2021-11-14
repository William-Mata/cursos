package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String numero = JOptionPane.showInputDialog("Digite um número a ser convertido: ");
		
		
		/*
		 * Passando String para inteiro
		 */
		int numInt = Integer.parseInt(numero);
		System.out.println("Inteiro: " +numInt);
		
		/*
		 * Passando String para byte
		 */
		byte numByte = Byte.parseByte(numero);
		System.out.println("Byte: " +numByte);
		
		
		/*
		 * Passando String para short
		 */
		short numShort = Short.parseShort(numero);
		System.out.println("Short: " +numShort);
		
		/*
		 * Passando String para double
		 */
		double numDouble = Double.parseDouble(numero);
		System.out.println("Double: " +numDouble);
		
		/*
		 * Passando String para short
		 */
		float numFloat = Float.parseFloat(numero);
		System.out.println("Float: " +numFloat);
		
		
	}

}
