import java.util.Scanner;

public class Exercicio011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Desenvolva um programa no qual o usuário deverá informar o nome e o tipo
		 * de três animais de estimação. O programa deverá exibir na tela para o usuário 
		 * quantos Animais foram informados e seus tipos. Regras que deverão ser seguidas 
		 * para a implementação do código: 
		 * •Os únicos tipos de animais válidos são Cachorro, Gato, Peixe.
		 * •Caso seja informado um tipo diferente o programa deverá definir o tipo do animal como Peixe.
		 * •É obrigatório criar uma classe para representar o Animal. 
		 * •A classe deverá possuir dois dados privados (propriedades) para representar as características do animal. 
		 * •A classe deverá possuir métodos de acesso para permitir que o usuário armazene/leia os dados dos dois dados
		 * privados (propriedades). 
		 */
			
		Scanner entrada = new Scanner(System.in);
		
		Exercicio011Cachorro cachorro = new Exercicio011Cachorro();
		Exercicio011Peixe peixe = new Exercicio011Peixe();
		Exercicio011Gato gato = new Exercicio011Gato();
		
		int tipo;
		String[] animais = new String[3];
		String[] nomes = new String[3];
		
		for(int aux = 0; aux <= 2; aux++) {
			
			System.out.println("1 - Cachorro, 2 - Gato, 3 - Peixe.");
			System.out.print("Digite o tipo do " +(aux+1)+ "° animal: ");
			tipo = entrada.nextInt();
			
			switch(tipo) {
			case 1: 
				animais[aux] = "Cachorro";
				break;
			
			case 2:
				animais[aux] = "Gato";
				break;
				
			case 3:
			default:
				animais[aux] = "Peixe";
				break;
			}
				
			System.out.print("\nDigite o nome do "  +(aux+1)+ "° animal: ");
			nomes[aux] = entrada.next();
			
			System.out.println("\nA quantidade de animais até agora registrado foi: " + (aux+1) +"\n");
			System.out.print("Os tipo de animais registrado foram: ");
			
			for(int aju = 0; aju <= aux; aju++) {
				System.out.print(animais[aju]+ (animais[aju] == animais[aux] ? "." : ", "));
			}
			
			System.out.println("\n");			
		}
		
		for(int aux = 0; aux <= 2; aux++) {
			
			if(animais[aux] == "Cachorro") {
				cachorro.setNome(nomes[aux]);
			
			}else if(animais[aux] == "Gato") {
				gato.setNome(nomes[aux]);
			
			}else {
				peixe.setNome(nomes[aux]);
			}
		}
		
		
	System.out.println("Nome do cachorro: " + cachorro.getNome());
	System.out.println("Nome do gato: " + gato.getNome());
	System.out.println("Nome do peixe: " + peixe.getNome());
	
	entrada.close();
	}

}
