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
		escreva("As notas tirada pelo aluno \"" + aluno + "\" foram: " + nota1 + ", " + nota2 + ", "+ nota3 + ", "+ nota4) 
		
		escreva("\n")
		escreva("O aluno: " + aluno 
		+ ", tirou a média: " + media)



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */