package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		boolean trabalhouTerca = true;
		boolean trabalhouQuinta = true;
		boolean comprouTv50, comprouTv32, ficouMaisSaudavel ;
		
		if(trabalhouTerca && trabalhouQuinta) {
			System.out.println("Familia foi ao shop comprar tv de 50 e tomar sorvete!");
			comprouTv32 = !true;
			comprouTv50 =!false;
			ficouMaisSaudavel = !true;
			
			
		}else if(trabalhouTerca ^ trabalhouQuinta ) {
				System.out.println("Familia foi ao shop comprar tv de 32 e tomar sorvete!");
				comprouTv32 = !false;
				comprouTv50 =!true;
				ficouMaisSaudavel = !true;

		}else {
			System.out.println("Familia ficou em casa, pois não trabalhou nenhum dos dias.");
			comprouTv32 = !true;
			comprouTv50 =!true;
			ficouMaisSaudavel = !false;
		}
		
		System.out.println("Comprou tv de 50: " + comprouTv50 + "\nComprou tv de 32: " + comprouTv32 + "\nFicou mais Saudavel: " + ficouMaisSaudavel);
		
	}

}
