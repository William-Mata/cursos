import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		int tabuada, aux;
		
		
		System.out.println("Digite o número da tabuada que deseja ver: ");
		tabuada = dados.nextInt();
		
		
		aux = 1;
		
		while(aux <= 10) {
			
			System.out.println(tabuada + " X " + aux + " = " + (tabuada * aux));
			aux++;
		}
		
		
		
		do {
			
			aux++;
			System.out.println(tabuada + " X " + aux + " = " + (tabuada * aux));
			
		}while(aux < 20);
		
		
		for(int i = 20; i <=30; i++) {
			
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		
		}
		
		dados.close();

	}

}
   