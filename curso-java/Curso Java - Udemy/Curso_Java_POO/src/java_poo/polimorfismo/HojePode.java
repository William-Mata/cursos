package java_poo.polimorfismo;

public class HojePode {

	public static void main(String[] args) {
		
		Comilao comilao = new Comilao(55.0);
		Pizza pCamar�o = new Pizza(1.2);
		Hamburg hDuplo = new Hamburg(0.5);
		Sorvete sGGChocolate = new Sorvete(0.8);
		

		comilao.comer(pCamar�o);
		comilao.comer(hDuplo);
		comilao.comer(sGGChocolate);
		
		System.out.println(comilao.getPeso());
		
	}

}
