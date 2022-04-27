package string;

public class BuscaDeCaracters {

	public static void main(String[] args) {
		String nome = "William";
		
		// Será impreso o primeiro e o ultimo caractere dentro da string nome
		// metodo charArt pega o caractere indicado pelo indice que deseja e mostra qual caractere se encontra na quele indice.
		System.out.println("Os indices 0 e 6 estão os seguintes caracteres: '" + nome.charAt(0) +"' e '" + nome.charAt(6) +"'");
		System.out.println();
		
		
		
		
		/* Será impreso o primeiro e o ultimo caractere dentro da string nome
		   metodo indexOf proucura pelo caractere indicado entre as "" que deseja e mostra em que indice estão o caractere
		   ele começa a verificar como padrão do primeiro indice em diante podendo ser alterado para começar a verificar de outro indice.
		   Exemplo abaixo ele começa a pesquisa do indice padrão do indeice 0.
		*/
		System.out.println("A letra W e m se encontra nos indices: '" + nome.indexOf("W") +"' e '" + nome.indexOf("m"));
		System.out.println();
		
		
		/* Será impreso o primeiro e o ultimo caractere dentro da string nome
		  metodo indexOf proucura pelo caractere indicado entre as "" que deseja e mostra em que indice estão o caractere.
		   ele começa a verificar como padrão do primeiro indice em diante podendo ser alterado para começar a verificar de outro indice.
		   Exemplo abaixo com ele começando a pesquisar do indice 0 na primeira pesquisa e do indice 5 na segunda pesquisa.
		*/
		System.out.println("A letra W e m se encontra nos indices: '" + nome.indexOf("W",0) +"' e '" + nome.indexOf("m",5));
		System.out.println();
		
		
		/* Será impreso o primeiro e o ultimo caractere dentro da string nome
		   metodo lastIndexOf proucura pelo caractere indicado entre as "" que deseja e mostra em que indice estão o caractere
		   ele começa a verificar como padrão do ultimo indice podendo ser alterado para começar a verificar de outro indice.
		   Exemplo abaixo ele começa a pesquisa do indice padrão do ultimo indice.
		*/
		System.out.println("A letra W e m se encontra nos indices: '" + nome.lastIndexOf("W") +"' e '" + nome.lastIndexOf("m"));
		System.out.println();
		
		
		/* Será impreso o primeiro e o ultimo caractere dentro da string nome
		   metodo lastIndexOf proucura pelo caractere indicado entre as "" que deseja e mostra em que indice estão o caractere
		   ele começa a verificar como padrão do ultimo indice podendo ser alterado para começar a verificar de outro indice.
		   Exemplo abaixo ele começa a pesquisa do indice 4 na primeira pesquisa e na segunda pesquisa do indice 6.
		*/
		System.out.println("A letra W e m se encontra nos indices: '" + nome.lastIndexOf("W", 4) +"' e '" + nome.lastIndexOf("m", 6));
		System.out.println();
	
	}

}
