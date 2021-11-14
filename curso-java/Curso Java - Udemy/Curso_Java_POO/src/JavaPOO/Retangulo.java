package JavaPOO;

public class Retangulo extends Figura {
	private double base, altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	
	public double area() {
		double area = 0;
		area = this.base * this.altura;
		return area;
	}
}
