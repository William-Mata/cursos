package string;

public class StringConcat {

	public static void main(String[] args) {
		String nome = "william";
		String sobreNome = " de mata da silva";
		String nomeCompleto = "";
		
		
		/*
		 * Outro Metodo para juntar duas variaveis String
		 */
		nomeCompleto = nomeCompleto.concat(nome+sobreNome);
		
		System.out.println("### Nome ###");
		System.out.println(nome);
		System.out.println();
		
		System.out.println("### Sobrenome ###");
		System.out.println(sobreNome);
		System.out.println();
		
		System.out.println("### Nome completo ###");
		System.out.println(nomeCompleto);
		System.out.println();
		
		
		
		
	}

}
