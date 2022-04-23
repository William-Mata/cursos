Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/09/2021
Var
// Seção de Declarações das variáveis 
valorVendas, salarioNovo : real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

Escreval("Digite o valor total das vendas feitas: ")
leia(valorVendas)

salarioNovo <- 1200 + (valorVendas * 0.15)

Escreval("Seu salario esse mês e de R$", salarioNovo, " você recebeu uma comisão de 15% em cima do valor total de vendas no mês.")

Fimalgoritmo