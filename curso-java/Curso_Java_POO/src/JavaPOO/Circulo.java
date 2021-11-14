package JavaPOO;

public class Circulo extends Figura {
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}

	
	public double area() {
		double area = 0;
		area = 3.14 * this.raio *this.raio;	
		return area;
		
	}
}
