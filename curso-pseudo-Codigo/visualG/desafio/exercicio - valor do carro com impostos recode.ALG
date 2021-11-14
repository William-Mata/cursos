Algoritmo "Exercicio - 02"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/09/2021
Var
// Seção de Declarações das variáveis 
valorFab, imposto, valorDistri, valorConsumidor : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
valorDistri <- 0.28
imposto <- 0.45



Escreva("Digite o valor de Fabrica do Veiculo: ")
Leia(valorFab)
Escreval()

valorConsumidor <-  valorFab + (valorFab * imposto) + (valorFab * valorDistri)

Escreval("Valor final para o consumidor: ", valorConsumidor)

Fimalgoritmo