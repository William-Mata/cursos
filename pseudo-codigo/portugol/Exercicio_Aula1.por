programa
{
	
	funcao inicio()
	{
		real mediaVenda, vendaJaneiro, vendaFevereiro, vendaMarco, vendaAbril
		cadeia vendedor
		escreva("Digite o nome do vendendor: ")
		leia(vendedor)
		escreva("Digite o valor total das vendas de Janeiro: ")
		leia(vendaJaneiro)
		escreva("Digite o valor total das vendas de Fevereiro: ")
		leia(vendaFevereiro)
		escreva("Digite o valor total das vendas de Março: ")
		leia(vendaMarco)
		escreva("Digite o valor total das vendas de Abril: ")
		leia(vendaAbril)

		mediaVenda = (vendaJaneiro+vendaFevereiro+vendaMarco+vendaAbril)/4
		escreva("Os valores das vendas realizadas pelo vendedor \""
		+ vendedor + "\" foram: " + vendaJaneiro + ", "
		+ vendaFevereiro + ", "+ vendaMarco + ", "+ vendaAbril) 
		escreva("\n")
		escreva("O vendedor: " + vendedor 
		+ ", tem a média de vendas de: " + mediaVenda)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 803; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */