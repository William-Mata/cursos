package java_poo.encapsulamento.desafio;

import java_poo.encapsulamento.desafio.carros.Fusca;
import java_poo.encapsulamento.desafio.carros.Opala;

public class Pista {

	public static void main(String[] args) {
			Opala opala = new Opala(180);
			Fusca fusca = new Fusca();
			
			
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
			
			opala.ligar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			opala.acelerar();
			
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			opala.frear();
			
			opala.status();
	}

}
