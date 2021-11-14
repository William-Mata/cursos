import java.util.Scanner;

public class Exercicio010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Vamos criar um código Java que converta o total de uma compra internacional em dólares 
		 *(US$) para reais (R$). Iniciei duas variáveis double “soma” e “total”, depois inicie uma 
		 *variável chamada quantidade do tipo int, essa variável vai receber a quantidade de produtos 
		 *comprados. Declare um Array(Vetor) que irá receber os valores em dólares das mercadorias, e 
		 *armazenar a somatória das mercadorias na variável soma, A variável “total” deve receber o valor 
		 *de “soma” convertido para reais (US$ 1,00 = R$ 5,18.). Inicie uma variável String “mensagem” e 
		 *atribua um valor de acordo com o resultado da verificação usando o operador ternário seguindo os 
		 *condições: “total” maior que R$ 3000,00 – “Pagará 20% de imposto”. “total” menor ou igual a R$ 3000,00 
		 *– “Isento de imposto”. Imprima no console o valor “total” da compra junto com a “mensagem”.
		 */
	
			Scanner entrada = new Scanner(System.in);
			
			double soma = 0, total = 5.18;
			
			System.out.println("Digite a quantidade de produtos comprados: ");
			int qtdProdutos = entrada.nextInt(); 
			
			double[] valorDolares = new double[qtdProdutos];

			for(int aux = 0; aux < valorDolares.length; aux++) {
				System.out.println("Digite o valor do " + (aux+1) + " ° produto: ");
				valorDolares[aux] = entrada.nextDouble();
				soma += valorDolares[aux];
			}
			
			System.out.println("Valor total em Dolar é: " + soma);
			total *= soma;
			System.out.println("Valor total em Real é: " + total);
	
			String mensagem = total <= 3000 ? "Insento de impostos" : "Pagara 20% de Imposto"; 
			
			System.out.println(mensagem);

			entrada.close();
	}

}
