Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/09/2021
Var
// Seção de Declarações das variáveis 
totalPresta, qtdPaga, valorPresta, totalPago, restoDivida: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval("Digite a quantidade de parcelas do consórcio: ")
leia(totalPresta)

Escreval("Digte o valor das parcelas do consórcio: ")
leia(valorPresta)

Escreval("Digite a quantidade paga até o momento: ")
leia(qtdPaga)

totalPago <- qtdPaga * valorPresta

restoDivida <- (totalPresta - qtdPaga) * valorPresta

Escreval("O valor total pago até o momento é de R$", totalPago, " o valor restante a pagar é de R$",restoDivida,".")


Fimalgoritmo