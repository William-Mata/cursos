package java_poo.encapsulamento.desafio.carros;


public class Carro {
	protected int velocidade;
	protected final int VEL_MAXIMA;
	private boolean ligado;
	
	protected Carro(int velMax){
		VEL_MAXIMA = velMax;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	protected void acelerar() {
		if(this.ligado) {
			this.velocidade += 10;
		}else {
			System.out.println("Não é possível acelerar com o carro desligado.");
		}
	}
	
	public void frear() {
		if(this.ligado && velocidade >= 10) {
			this.velocidade -= 10;
		}
	}
	
	public void status() {
		System.out.println("Ligado: " + this.ligado + ", Velocidade: " + this.velocidade);		
	}
}
