package java_poo.interfacee;

public class Mustang extends Carro implements Esportivo {

	Mustang(int velMax) {
		super(velMax);
	}
	
	public void acelerar() {
		int aux = 0;
		do {
			aux++;
			if (this.getVelocidade() < this.getVEL_MAXIMA()) {
				super.acelerar();
			}else {
				System.out.println("Você está em velocidade máxima!");
				break;
			}
			
		} while (aux < 4);
	}

	@Override
	public void nitro() {
		if((this.getVEL_MAXIMA() - this.getVelocidade()) >= 100 ) {			
			this.setVelocidade(this.getVelocidade() + 100);
		}else {
			this.setVelocidade(this.getVEL_MAXIMA());
			System.out.println("Você está em velocidade máxima!");
		}
	}

}
