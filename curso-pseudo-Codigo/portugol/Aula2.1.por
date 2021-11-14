//Autor William Mata 
/*
* Calcular a media do aluno e imprimir o valor 
* das notas, media e se foi aprovado ou não.
*/
programa
{
	
	funcao inicio()
	{
		real media, nota1, nota2, nota3, nota4
		
		cadeia aluno
		
		escreva("Digite o nome do aluno: ")
		leia(aluno)
		
		escreva("Digite a 1° nota: ")
		leia(nota1)
		
		escreva("Digite a 2° nota: ")
		leia(nota2)
		
		escreva("Digite a 3° nota: ")
		leia(nota3)
		
		escreva("Digite a 4° nota: ")
		leia(nota4)

		media = (nota1+nota2+nota3+nota4)/4
		
		/*
		 * Imprimir o valor das notas, media 
		 * e se foi aprovado ou não.
		 */
		se (media>=7) {
			
			escreva("As notas tirada pelo aluno \"" + 
			aluno + "\" foram: " + nota1 + ", " + nota2 + 
			", "+ nota3 + ", "+ nota4) 
			
			escreva("\nO aluno: " + aluno 
			+ ", tirou a média: " + media)
			
			escreva("\nParabéns o aluno \"" + 
			aluno + "\" foi aprovado!") 
		}
		senao{
			
			escreva("As notas tirada pelo aluno \"" + 
			aluno + "\" foram: " + nota1 + ", " + nota2 + 
			", "+ nota3 + ", "+ nota4)
			 
			escreva("\nO aluno: " + aluno 
			+ ", tirou a média: " + media)
			
			escreva("\nO aluno \"" + 
			aluno + "\" foi reprovado, você precisa estudar mais.") 
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */