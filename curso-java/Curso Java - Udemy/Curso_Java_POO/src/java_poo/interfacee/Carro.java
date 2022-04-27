package java_poo.interfacee;


public class Carro {
	protected int velocidade;
	private boolean ligado;
	protected final int VEL_MAXIMA;
	
	Carro(int velMax){
		VEL_MAXIMA = velMax;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void acelerar() {
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
		System.out.println("Ligado: " + this.isLigado() + ", Velocidade: " + this.getVelocidade() + ", Velocida Maxima: " + this.getVEL_MAXIMA());		
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVEL_MAXIMA() {
		return VEL_MAXIMA;
	}
	
	
}
