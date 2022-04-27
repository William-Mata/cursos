package java_poo.polimorfismo;

public class Comilao {

	private double peso;

	protected Comilao(double peso) {
		setPeso(peso);
	}

	protected void comer(Comida comida) {
		setPeso(getPeso() + comida.getPeso());
	}

	protected void comer(Pizza pizza) {
		setPeso(getPeso() + pizza.getPeso());
	}

	protected void comer(Sorvete sorvete) {
		setPeso(getPeso() + sorvete.getPeso());
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}

}
