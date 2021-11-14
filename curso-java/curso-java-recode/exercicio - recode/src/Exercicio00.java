import java.util.Scanner;

public class Exercicio00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int horasTrabalhadas, matricula;
		String nome;
		double salario, valorHora;

		System.out.println("Digite seu nome: ");
		nome = entrada.next();
		
		System.out.println("Digite o numero da sua matricula: ");
		matricula = entrada.nextInt();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextInt();
		
		System.out.println("Digite o valor recebido por hora: ");
		valorHora = entrada.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.printf("O funcionario " + nome + " com cadastrado na matricula " + matricula + ", recebe o salario de R$: %.2f%n ", salario);
	
		entrada.close();
	}

}
