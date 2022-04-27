package java_poo.heranca.enum_;

public class Jogo {

	public static void main(String[] args) {
		Heroi heroi = new Heroi();
		Vilao vilao = new Vilao();
		
		
		heroi.andar(Direcao.NORTE);
		heroi.andar(Direcao.OESTE);
		heroi.andar(Direcao.LESTE);
		heroi.andar(Direcao.SUL);
//		heroi.andar(Direcao.SUL);
		heroi.atacar(vilao);
		heroi.power(vilao);
		
		vilao.power(heroi);
		vilao.atacar(heroi);

		
		
		
		heroi.status();
		vilao.status();
	}
}
