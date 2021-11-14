package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
	
		System.out.println("\nTipo Boolean");
		/*
		 * Tipo Boolean aceita 
		 * apenas true ou false
		 */
		boolean h = true;
		System.out.println(h);
		boolean h1 = false;
		System.out.println(h1);

		
		System.out.println("\nTipo Char");
		/*
		 * Tipo char aceita valores
		 *  númericos de 0 a 9 entre ' ' 
		 *  e outros tipos de caracteres 
		 *  como letras e simbolos
		 */
		char a = '9';
		System.out.println(a);
		char a1 = 'a';
		System.out.println(a1);
		char a2 = 'A';
		System.out.println(a2);
		char a3 = '#';
		System.out.println(a3);

		System.out.println("\nTipo Byte");
		/*
		 * Tipo byte aceita
		 *  valores númericos de 127 a -128 
		 * e 1 caractere entre ' ', ele 
		 * resultara em um valor númerico, 
		 *  por exemplo 'a' = 97.
		 *  Byte = 1 byte
		 *  
		 */
		byte b = 127;
		System.out.println(b);
		byte b1 = -128;
		System.out.println(b1);
		byte b2 = 'a';
		System.out.println(b2);
		
		System.out.println("\nTipo Short");
		/*
		 * Tipo Short aceita
		 *  valores númericos de 32767 a -32768 
		 * e 1 caractere entre ' ', ele 
		 * resultara em um valor númerico, 
		 *  por exemplo 'a' = 97.
		 *  Short = 2 bytes
		 *  
		 */
		short c = 32767;
		System.out.println(c);
		short c1 = -32768;
		System.out.println(c1);
		short c2 = 'a';
		System.out.println(c2);

		System.out.println("\nTipo Inteiro");
		/*
		 * Tipo Int aceita
		 *  valores númericos de 99999999 a -99999999 
		 * e 1 caractere entre ' ', ele 
		 * resultara em um valor númerico, 
		 *  por exemplo 'a' = 97.
		 *  Int = 4 bytes
		 *  
		 */
		int d = 999999999;
		System.out.println(d);
		int d1 = -999999999;
		System.out.println(d1);
		int d2 = 'a';
		System.out.println(d2);
		
		
		System.out.println("\nTipo Long");
		/*
		 * Tipo Long aceita
		 *  valores númericos de 
		 *  9999999999999999L  a -999999999999999L 
		 * e 1 caractere entre ' ', ele 
		 * resultara em um valor númerico, 
		 *  por exemplo 'a' = 97.
		 *  Long = 8 bytes
		 *  
		 */
		long e = 99999999999999999L;
		System.out.println(e);
		long e1 = -999999999999999L;
		System.out.println(e1);
		long e2 = 'a';
		System.out.println(e2);
		
		
		System.out.println("\nTipo Float");
		/*
		 * Tipo Float aceita
		 *  valores númericos de 
		 *  Número muito grande  
		 * e 1 caractere entre ' ', ele 
		 * resultara em um valor
		 *  númerico de ponto flutuante, 
		 *  por exemplo 'a' = 97.0.
		 *  Float = 4 bytes
		 *  
		 */
		float f = 9999999999999999999999.99999999999f;
		System.out.println(f);
		float f1 = -9999999999999999999999.99999999999f;
		System.out.println(f1);
		float f2 = 'a';
		System.out.println(f2);
		
		System.out.println("\nTipo Double");
		/*
		 * Tipo Float aceita
		 *  valores númericos de 
		 *  Número muito grande  
		 * e 1 caractere entre ' ', ele 
		 * resultara em um valor
		 *  númerico de ponto flutuante, 
		 *  por exemplo 'a' = 97.0.
		 *  F = 8 bytes
		 *  
		 */
		float g = 9999999999999999999999.99999999999f;
		System.out.println(g);
		float g1 = -9999999999999999999999.99999999999f;
		System.out.println(g1);
		float g2 = 'a';
		System.out.println(g2);
	}

}
