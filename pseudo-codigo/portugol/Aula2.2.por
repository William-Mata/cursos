/*Autor: William Mata
 * Programa Menu de plataformas Streams.
 */
programa
{	
	funcao inicio()
	{
		inteiro menu

		escreva("
		Escolha uma das opção abaixo.
		1 - Abrir Netflix
		2 - Abrir Amazon Prime
		3 - Abrir Goblo Play
		4 - Abrir Youtube
		5 - Sair
		Digite a opção que deseja: ")

		leia(menu)

		escolha (menu){
			
			caso 1: escreva("Abrindo Netflix") pare
			
			caso 2: escreva("Abrindo Amazon Prime") pare
			
			caso 3: escreva("Abrindo Goblo Play") pare
			
			caso 4: escreva("Abrindo Youtube") pare
			
			caso 5: escreva("Saindo do Menu") pare
			
			caso contrario: escreva("[Atenção] Você deve escolher uma das opções.") pare
		}
	
			
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */