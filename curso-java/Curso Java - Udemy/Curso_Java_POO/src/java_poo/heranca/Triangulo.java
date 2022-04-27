package java_poo.heranca;

public class Triangulo extends Figura{
	private double base, altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	public double area() {
		double area = 0;
		area = (this.base * this.altura)*2;
		return area;
	}

}
