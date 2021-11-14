programa
{
	
	funcao inicio()
	{
	
		cadeia frutas[4]
		cadeia cestaLegumes[][] = {{"Cebola", "2,50"}, {"Cenoura", "3,00"}, {"chu chu", "2,00"}, {"cogumelo", "10,00"}}
		
		inteiro cont = 0

		frutas[0] = "Maca"
		frutas[1] = "Morango"
		frutas[2] = "Manga"
		frutas[3] = "Mamão"
		escreva("\nFora do laço")		
		escreva("\nNome de frutas")
		escreva("\n"+frutas[0])
		escreva("\n"+frutas[1])
		escreva("\n"+frutas[2])
		escreva("\n"+frutas[3]+"\n")
		

		escreva("\nNome de Legumes / Valores dos Legumes")
		escreva("\n"+cestaLegumes[0][0] + "         / " + cestaLegumes[0][1])
		escreva("\n"+cestaLegumes[1][0] + "        / " + cestaLegumes[1][1])
		escreva("\n"+cestaLegumes[2][0] + "        / " + cestaLegumes[2][1]+"\n")
			
		escreva("\nDentro do laço enquanto frutas")
		enquanto(cont <= 3){
			
			escreva("\n"+frutas[cont])
			cont++
			
		}
		
		cont = 0
			
		escreva("\nDentro do laço enquanto Legumes e Valores")
		enquanto(cont <= 3){
			escreva("\n"+cestaLegumes[cont][0] + "         / " + cestaLegumes[cont][1])
			cont++
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */