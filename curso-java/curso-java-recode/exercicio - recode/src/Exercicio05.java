import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Neste exemplo, devem ser armazenados o nome e o salário de 5 funcionários. 
		Após o cadastro destas informações, deverá ser digitado o índice
		de reajuste salarial para todos os funcionários. 
		O programa deverá calcular o novo salário e exibir todos os dados na tela.*/
		
		Scanner dados = new Scanner(System.in);
		int qtdVetor = 5;
		String[] nomes = new String[qtdVetor];
		double[] salario = new double[qtdVetor];
		double reajuste;
		
	
		
		System.out.print("Digite o valor do reajuste: ");
		reajuste = dados.nextDouble();
		reajuste = (reajuste/100);
		
		for(int i = 0; i < qtdVetor; i++) {
			
			System.out.print("Digite o nome do " + (i+1) + "° funcionario: ");
			nomes[i] = dados.next();
			
			System.out.print("Digite o salário do " + (i+1) + "° funcionario: ");
			salario[i] = dados.nextDouble();
		}
		
		System.out.println();
		
		for(int i = 0; i < qtdVetor; i++) {
			
			salario[i]+= salario[i] * reajuste;
			System.out.println("O funcionario " + nomes[i] + " teve seu salário ajustado para R$:" + salario[i]);
		}
		
		dados.close();
		
		
	}

}
