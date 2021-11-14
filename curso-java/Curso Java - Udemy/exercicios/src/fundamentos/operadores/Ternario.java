package fundamentos.operadores;

public class Ternario {
	public static void main(String[ ] args) {
		
		int a = 5;
		int b = 10;
		
		double media = 7.6;
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado2 = temDesconto ? "Sim." : "Não.";
		
		System.out.printf("Tem desconto? %s", resultado2 + "\n");
		
		String resultado = media >= 7.0  ? "Aprovado" : "Recuperação";
	
		String verdadeiroFalso = a >= b ? "Verdadeiro" : "Falso";
		
		System.out.println("Veridadeiro ou Falso: " + verdadeiroFalso);
		
		System.out.println("Aluno status: " + resultado);
		
		
	}
}
