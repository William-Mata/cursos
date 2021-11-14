package fundamentos;

public class ConversaoPrimitivos1 {
	public static void main(String[] args) {
		
	
		double idadeMeses = 23.7; 
 		System.out.println(idadeMeses);
		/*
		 * Como o tipo primitivo double pode armazenar
		 *  valores de ponto flutuante e maiores que inteiro 
		 *  quando necessario passar um valor de double
		 *   para inteiro é preciso fazer um cast ou seja dizer
		 *   que está ciente de que pode perder dados.
		 *   o exemplo abaixo e um cast (int ) antes
		 *    da variavel double, note que temos 23.7 no double
		 *    quando passado para inteiro teremos apenas 23.
		 */
		int idade3 = (int) idadeMeses;
		
		System.out.println(idade3);
		
		int idade = 23;
		
		System.out.println(idade);
		
		/*
		 * Como o tipo primitivo inteiro
		 *  pode armazenar valor maiores que o short
		 *  quando necessario passar um valor de inteiro
		 *   para short é preciso fazer um cast ou seja dizer
		 *   que está ciente de que pode perder dado.
		 *   o exemplo abaixo é um cast (short) antes
		 *    da variavel inteiro.
		 */
		short idade2 = (short) idade;
	
		System.out.println(idade2);
	}

}
