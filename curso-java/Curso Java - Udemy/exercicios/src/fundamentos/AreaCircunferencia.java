package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		// constante LETRA MAIUSCULA
		final double PI = 3.14159;
		
		// variavel letra minuscula
		double raio = 3.4;
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio* raio;
		
		System.out.println("�rea: " + area + " m2.");
	}
}
