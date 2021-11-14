import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 *Desenvolva um código em Java que comece com a declaração de duas variáveis
		 *do tipo double, “acumulador” e “media”. Em “acumulador” deverá ser atribuída
		 *a soma de três notas que serão digitadas pelo usuário, usando uma instância
		 *da classe Scanner. O código deverá gerar a média das notas e depois, usando
		 *a condicional if, o programa precisa verificar em que faixa o aluno ficou e
		 *imprimir no console a mensagem de acordo com a tabela abaixo: “media”
		 *acima de 6 – “APROVADO DIRETO”; “media” entre 5 e 6, incluindo 5 e 6 - 
		 *“APROVADO COM RECUPERAÇÃO”; “media” abaixo de 5 – “REPROVADO”; 
		 * 
		 */
		Scanner entrada = new Scanner(System.in);
		
		double acumulador, media;
		
		System.out.println("Digite a primeira nota: ");
		acumulador = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		acumulador+= entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		acumulador+= entrada.nextDouble();
		
		media = acumulador / 3;
		
		if(media > 6) {
			System.out.println("Media: " + media + ", APROVADO DIRETO");
			
		}else if((media >= 5) && (media <= 6)) {
			System.out.println("Media: "+ media + ", APROVADO COM RECUPERAÇÃO.");
			
		}else if(media < 5) {
			System.out.println("Media: " + media + ", REPROVADO.");
		}
	
		entrada.close();
	}

}
