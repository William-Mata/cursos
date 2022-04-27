package java_poo.heranca.enum_.desafio;

public class Opala extends Carro{
		
	Opala(int velMax) {
		super(velMax);
	}

	public void acelerar() {
		int aux = 0;
		do {
			aux++;
			if (this.velocidade < this.VEL_MAXIMA) {
				super.acelerar();
			}else {
				System.out.println("Voc� est� em velocidade m�xima!");
				break;
			}
			
		} while (aux < 3);
	}
}
