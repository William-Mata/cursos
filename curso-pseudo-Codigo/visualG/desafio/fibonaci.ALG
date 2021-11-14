Algoritmo "fibonaci"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/04/2021
Var
// Seção de Declarações das variáveis 
   anterior, atual, proximo, c: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
     anterior <-0
     atual <-1
     proximo <- 1
     
     escreva(atual)

     
     para c de 1 ate 9 faca
     proximo <- anterior + atual
     anterior <- atual
     atual <- proximo
     escreva(proximo)
     
     fimpara

Fimalgoritmo