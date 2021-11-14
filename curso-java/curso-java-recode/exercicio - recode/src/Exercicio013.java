import java.util.Scanner;

public class Exercicio013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie um programa em que o usuário possa cadastrar o pedido de um cliente. 
		 * Para implementar esse programa você deverá seguir as seguintes regras: 
		 *•O usuário deverá informar para o programa nome e cpf do cliente para iniciar o método construtor com esses dados; 
		 *•É obrigatório criar/utilizar uma classe para representar o cliente; 
		 *•O nome e o cpf do cliente informados pelo usuário deverão ser representados na classe como propriedades,
		 *além de duas outras propriedades, com o uso do ArrayList<>, para representar a descrição dos produtos e o 
		 *preço de cada produto;
		 *•A cada nova instância da classe cliente, a propriedade código do pedido deve ser atribuído automaticamente 
		 *com incremento de +1; 
		 *•O objeto deverá possuir uma propriedade para exibir o valor total do pedido;
		 *•O objeto deverá possuir um método que faça o cálculo do total do pedido, e outro que liste os dados do cliente 
		 *(nome e cpf), código do pedido, produtos do pedido com o preço, e valor total do pedido, como em um orçamento. 
		 */
		
		Scanner entrada = new Scanner(System.in);
		String nome, cpf;
		
		
		//Exercicio013Pedidos pedidos1 = new Exercicio013Pedidos();
		
		System.out.println("Digite o nome do cliente: ");
		nome = entrada.next();
		
		System.out.println("Digite o cpf do cliente");
		cpf = entrada.next();
			
		//Exercicio013Cliente cliente = new Exercicio013Cliente(nome, cpf);		
		
		entrada.close();
	
	}

}
