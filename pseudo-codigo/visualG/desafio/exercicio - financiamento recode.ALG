Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/09/2021
Var
   // Seção de Declarações das variáveis
   salario, financiamento : real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Escreva("Digite o valor de seu salario R$: ")
   leia(salario)

   Escreval()

   Escreva("Digite o valor de financimento desejado R$: ")
   leia(financiamento)

   se (salario * 5 >= financiamento)entao
      Escreval("O Financiamento foi concedido!")
   senao
      Escreval("Infelizmente o Financiamento não foi concedido.")
   fimse
Fimalgoritmo