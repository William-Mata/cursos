package java_poo.encapsulamento.desafio.carros;

public class Opala extends Carro{
		
	public Opala(int velMax) {
		super(velMax);
	}

	public void acelerar() {
		int aux = 0;
		do {
			aux++;
			if (this.velocidade < this.VEL_MAXIMA) {
				super.acelerar();
			}else {
				System.out.println("Você está em velocidade máxima!");
				break;
			}
			
		} while (aux < 3);
	}
}
