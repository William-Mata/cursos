package java_poo.heranca.enum_;

public class Jogador {
	int x;
	int y;
	int life;

	Jogador(){
		this.life = 100;
		this.x = 0;
		this.y = 0;
	}
	
	
	boolean atacar(Jogador oponente) {
		
		if((oponente.life > 0) && (Math.abs(this.x - oponente.x) == 1 || Math.abs(this.x - oponente.x) == 0) 
				&& (Math.abs(this.y - oponente.y) == 1 || Math.abs(this.y - oponente.y) == 0)) {
			oponente.life -= 10;
			return true;
		}else {
			System.out.println("Não foi possivel atacar, aproxime-se do outro jogador.");
			return false;
		}
		
	}
	
	public void andar(Direcao direcao) {
	
		if(direcao == Direcao.NORTE) {
			if(y > 0) {
				y--;				
			}else {
				System.out.println("Jogada inválida, jogue novamente.");
			}
		}else if(direcao == Direcao.SUL) {
			y++;
		}else if(direcao == Direcao.LESTE) {
			x++;
		}else if(direcao == Direcao.OESTE) {
			if(x > 0) {
				x--;				
			}else {
				System.out.println("Jogada inválida, jogue novamente.");
			}
		}
		
	}
	
	public void status() {
		System.out.println("O jogador se encontra na posição (" + x +", " + y + ") e sua vida é " + life);
	}

}
