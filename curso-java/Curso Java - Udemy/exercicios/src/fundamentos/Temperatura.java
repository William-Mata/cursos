package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		//Constantes
		final double DIVIDIR =    (5/9d)  ;
		final int MENOSGRAU = 32;
		
		//Variaveis
		double  fahrenheit = 86;
		double celsius = ((fahrenheit - MENOSGRAU) * DIVIDIR);
		
		System.out.println("O Resultado é: " + celsius + "° Celsius");

	}
}
