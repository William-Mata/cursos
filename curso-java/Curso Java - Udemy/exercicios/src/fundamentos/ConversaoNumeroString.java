package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		Integer numW1 = 10000;
		Double numW2 = 10000.00;
		Float numW3 = 10000.000f;
		Short numW4 = 1000;
		Byte numW5 = 100;
		
		int num1 = 20000;
		double num2 = 20000.00;
		float num3 = 200000.00f;
		short num4 = 2000;
		byte num5 = 127;
		
		/*
		 *  Convertendo Wapper Inteiro para String
		 * Convertendo inteiro para String
		 */
		String nums1 = numW1.toString();
		System.out.println("\nInteiro Wrapper: "+nums1);
		
		nums1 = Integer.toString(num1);
		System.out.println("inteiro primitivo: " +nums1);

		
		/*
		 * Convertendo Wapper Double para String
		 * Convertendo Primitivo double para String
		 */
		String nums2 = numW2.toString();
		System.out.println("\nDouble Wrapper: "+nums2);
		
		nums2 = Double.toString(num2);
		System.out.println("double primitivo: " +nums2);

		/*
		  * Convertendo Wapper Short para String
		 * Convertendo Primitivo short para String
		 */
		String nums3 = numW3.toString();
		System.out.println("\nFloat Wrapper: "+nums3);
		
		nums3 = Float.toString(num3);
		System.out.println("float primitivo: " +nums3);
		
		/*
		 * Convertendo Wapper Short para String
		 * Convertendo Primitivo short para String
		 */
		String nums4 = numW4.toString();
		System.out.println("\nShort Wrapper: " +nums4);
		
		nums4 = Short.toString(num4);
		System.out.println("short primitivo: " +nums4);
		
		
		/*
		 * Convertendo Wapper Byte para String
		 * Convertendo Primitivo byte para String
		 */
		String nums5 = numW5.toString();
		System.out.println("\nByte Wrapper: "+nums5);
		
		nums5 = Byte.toString(num5);
		System.out.println("byte primitivo: " +nums5);
	
		
	}
}
