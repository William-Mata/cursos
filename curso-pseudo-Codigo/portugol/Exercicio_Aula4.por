programa
{
	
	funcao inicio()
	{
		cadeia informacoes[3][3] = {{"Joao", "SP", "(11) 99999-8888"}, {"Maria", "Ribeirao Preto", "(16) 98888-7777"}, {"Ana", "Manaus", "(92) 97777-6666"}}
		inteiro cont = 0
		

		enquanto (cont <= 2){
			escreva("\nNome:" + informacoes[cont][0] + ", Estado:" + informacoes[cont][1] + ", Celular:" + informacoes[cont][2])
			cont++
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */