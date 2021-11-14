import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner dados = new Scanner(System.in);
		
		int anoTreta;
		
		System.out.print("Digite o ano que o Brasil foi Treta Campeão: ");
		anoTreta = dados.nextInt();
		
		switch(anoTreta) {
		
		case 1978:
			System.out.println("Você errou, tente novamente.");
			break;
		
		case 1994:
			System.out.println("Você acertou, parabéns!");
			break;
		
		case 1985: 
			System.out.println("Você errou, tente novamente.");
			break;
			
		case 2002:
			System.out.println("Você errou, tente novamente.");
			break;
			
		default:
			System.out.println("Opção inválida, tente novamente.");
			break;
		}
		
		dados.close();
	}

}
