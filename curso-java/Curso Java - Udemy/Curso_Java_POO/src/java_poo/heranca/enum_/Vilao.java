package java_poo.heranca.enum_;

public class Vilao extends Jogador {
	
	boolean power(Jogador oponente) {
		boolean atacou = super.atacar(oponente) && super.atacar(oponente);
		return atacou;
	}

}
