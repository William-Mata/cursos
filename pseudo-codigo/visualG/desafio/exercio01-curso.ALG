Algoritmo "Exercicio - 01"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/09/2021
Var
// Seção de Declarações das variáveis 
valor, desconto, valorComDesconto : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
desconto <- 0.25

Escreva("Digite o valor do produto: ")
Leia(valor)
Escreval()

valorComDesconto <- valor - valor * desconto

Escreval("Valor com desconto de 25%: ", valorComDesconto)

Fimalgoritmo