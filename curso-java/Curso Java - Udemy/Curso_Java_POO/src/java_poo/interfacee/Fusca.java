package java_poo.interfacee;

public class Fusca extends Carro {

	Fusca() {
		super(150);
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
			
		} while (aux < 2);
	}
}
