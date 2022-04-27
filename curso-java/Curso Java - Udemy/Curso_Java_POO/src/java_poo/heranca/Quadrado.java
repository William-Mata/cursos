package java_poo.heranca;

public class Quadrado extends Figura{
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double area() {
		double area = 0;
		area = this.lado * this.lado;
		return area;
	}
}
