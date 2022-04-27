package string;

public class BuscaDeCaracters {

	public static void main(String[] args) {
		String nome = "William";
		
		// Ser� impreso o primeiro e o ultimo caractere dentro da string nome
		// metodo charArt pega o caractere indicado pelo indice que deseja e mostra qual caractere se encontra na quele indice.
		System.out.println("Os indices 0 e 6 est�o os seguintes caracteres: '" + nome.charAt(0) +"' e '" + nome.charAt(6) +"'");
		System.out.println();
		
		
		
		
		/* Ser� impreso o primeiro e o ultimo caractere dentro da string nome
		   metodo indexOf proucura pelo caractere indicado entre as "" que deseja e mostra em que indice est�o o caractere
		   ele come�a a verificar como padr�o do primeiro indice em diante podendo ser alterado para come�ar a verificar de outro indice.
		   Exemplo abaixo ele come�a a pesquisa do indice padr�o do indeice 0.
		*/
		System.out.println("A letra W e m se encontra nos indices: '" + nome.indexOf("W") +"' e '" + nome.indexOf("m"));
		System.out.println();
		
		
		/* Ser� impreso o primeiro e o ultimo caractere dentro da string nome
		  metodo indexOf proucura pelo caractere indicado entre as "" que deseja e mostra em que indice est�o o caractere.
		   ele come�a a verificar como padr�o do primeiro indice em diante podendo ser alterado para come�ar a verificar de outro indice.
		   Exemplo abaixo com ele come�ando a pesquisar do indice 0 na primeira pesquisa e do indice 5 na segunda pesquisa.
		*/
		System.out.println("A letra W e m se encontra nos indices: '" + nome.indexOf("W",0) +"' e '" + nome.indexOf("m",5));
		System.out.println();
		
		
		/* Ser� impreso o primeiro e o ultimo caractere dentro da string nome
		   metodo lastIndexOf proucura pelo caractere indicado entre as "" que deseja e mostra em que indice est�o o caractere
		   ele come�a a verificar como padr�o do ultimo indice podendo ser alterado para come�ar a verificar de outro indice.
		   Exemplo abaixo ele come�a a pesquisa do indice padr�o do ultimo indice.
		*/
		System.out.println("A letra W e m se encontra nos indices: '" + nome.lastIndexOf("W") +"' e '" + nome.lastIndexOf("m"));
		System.out.println();
		
		
		/* Ser� impreso o primeiro e o ultimo caractere dentro da string nome
		   metodo lastIndexOf proucura pelo caractere indicado entre as "" que deseja e mostra em que indice est�o o caractere
		   ele come�a a verificar como padr�o do ultimo indice podendo ser alterado para come�ar a verificar de outro indice.
		   Exemplo abaixo ele come�a a pesquisa do indice 4 na primeira pesquisa e na segunda pesquisa do indice 6.
		*/
		System.out.println("A letra W e m se encontra nos indices: '" + nome.lastIndexOf("W", 4) +"' e '" + nome.lastIndexOf("m", 6));
		System.out.println();
	
	}

}
