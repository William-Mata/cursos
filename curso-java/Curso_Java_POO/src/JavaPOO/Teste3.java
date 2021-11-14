package JavaPOO;

public class Teste3 {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(9);
		Retangulo retangulo = new Retangulo(2,8);
		Triangulo triangulo = new Triangulo(2,8);
		Quadrado quadrado = new Quadrado(8);
		
		System.out.println(circulo.area());
		System.out.println(retangulo.area());
		System.out.println(triangulo.area());
		System.out.println(quadrado.area());
		
	}

}
