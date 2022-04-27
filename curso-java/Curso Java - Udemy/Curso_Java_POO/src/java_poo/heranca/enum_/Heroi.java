package java_poo.heranca.enum_;

public class Heroi extends Jogador {
	
	boolean power(Jogador oponente) {
		boolean atacou = super.atacar(oponente) && super.atacar(oponente) && super.atacar(oponente);
		return atacou;
	}
}
