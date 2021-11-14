package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		
		/*
		 * Wrappers são objetos dos tipos primitivos.
		 * Wrappers númericos
		 */
		Byte  b = 100;
		System.out.println("Wrapper Byte: "+b + "\n");
		
		Short s = 1000;
		System.out.println("Wrapper Short: "+s + "\n");
		
		Integer i = 10000;
		System.out.println("Wrapper Inteiro: " + i + "\n");
		
		Long l = 1000000l;
		System.out.println("Wrapper Long: "+l + "\n");
				
		Double d =  8222.5;
		System.out.println("Wrapper Double: "+d + "\n");
		
		Float f =  98222.5f;
		System.out.println("Wrapper Float: "+f + "\n");
		
		
		/*
		 * Wrappers caractere e boolean
		 */
		Character c =  'W';
		System.out.println("Wrapper Double: "+c + "\n");
		
		Boolean bo =  true;
		System.out.println("Wrapper Boolean: "+bo + "\n");
	}
}
