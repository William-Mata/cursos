package java_poo.interfacee;

public class Pista {

	public static void main(String[] args) {
			Opala opala = new Opala(180);
			Fusca fusca = new Fusca();
			Mustang mustang = new Mustang(220);
			
			
			System.out.println("\nFusca");
			fusca.ligar();
			fusca.acelerar();
			fusca.acelerar();
			fusca.acelerar();
			fusca.acelerar();
			fusca.acelerar();
			fusca.acelerar();
			fusca.acelerar();
			fusca.acelerar();
			fusca.status();
			
			
			System.out.println("\nOpala");
			opala.ligar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			opala.status();			
			
			
			System.out.println("\nMustang");
			mustang.ligar();
			mustang.nitro();
			mustang.acelerar();
			mustang.acelerar();
			mustang.nitro();
			mustang.status();
	}

}
