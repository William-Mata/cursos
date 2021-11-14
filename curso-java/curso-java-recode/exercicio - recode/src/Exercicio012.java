import java.util.Scanner;

public class Exercicio012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Utilizando conceitos do paradigma de programação orientada a objetos,
		 * implemente uma class em Java, chamada “Pessoa” e em seguida desenvolva 
		 * um código no qual o usuário informe o nome e idade de três pessoas e o 
		 * programa deve armazenar esses dados em instâncias da classe “Pessoa”. 
		 * Após isso, deve ocorrer uma verificação para saber qual pessoa tem a 
		 * maior idade e imprimir no console o nome dessa pessoa. 
		 * Crie ao menos dois métodos na classe “Pessoa”.
		 */
		Scanner entrada = new Scanner(System.in);
		
		Exercicio012Pessoa pessoa = new Exercicio012Pessoa();
		Exercicio012Pessoa pessoa1 = new Exercicio012Pessoa();
		Exercicio012Pessoa pessoa2 = new Exercicio012Pessoa();
		
		for(int aux = 0; aux <= 2; aux++) {
			
			System.out.println("Digite o nome da " + (aux+1) + "° pessoa: ");
			if(aux == 0) {
				pessoa.setNome(entrada.next());
			
			}else if(aux == 1) {
				pessoa1.setNome(entrada.next());
			
			}else if(aux == 2) {
				pessoa2.setNome(entrada.next());
			}
			
			System.out.println("Digite a idade da " + (aux+1) + "° pessoa: ");
			if(aux == 0) {
				pessoa.setIdade(entrada.nextInt());
			
			}else if(aux == 1) {
				pessoa1.setIdade(entrada.nextInt());;
			
			}else if(aux == 2) {
				pessoa2.setIdade(entrada.nextInt());
				
			}		
		}
		
		if((pessoa.getIdade() > pessoa1.getIdade()) && (pessoa.getIdade() > pessoa2.getIdade())) {
			
			System.out.println(pessoa.getNome() + " é a pessoa mais velha." );
		
		}else if((pessoa1.getIdade() > pessoa.getIdade()) && (pessoa1.getIdade() > pessoa2.getIdade())) {
			
			System.out.println(pessoa1.getNome() + " é a pessoa mais velha." );
		
		}else if((pessoa2.getIdade() > pessoa1.getIdade()) && (pessoa2.getIdade() > pessoa.getIdade())) {
			
			System.out.println(pessoa2.getNome() + " é a pessoa mais velha." );
		}
		
		
		entrada.close();
	}

}
