import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * Usando fundamentos básicos e de operadores relacionais da linguagem Java,
		 *  desenvolva um código com duas variáveis: String “nome”, int “idade” e atribua
		 *   valores à essas variáveis. Agora, utilizando a função System.out.print(),
		 *    imprima o conteúdo de “nome”, junto com o resultado da verificação: 
		 * “idade” maior ou igual 18 – true. “idade” menor que 18 – false.
		 *  Preferencialmente usar a IDE Eclipse para desenvolver os códigos.
		 */
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		String nome;
		
		
		System.out.println("Digite o seu nome: ");
		nome = entrada.next();
		
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("Nome: " + nome +  ", Idade: " + idade + ", Maior de idade: " + (idade >= 18 ? "Verdadeiro" : "Falso"));
		
		entrada.close();
		


	}

}
