Algoritmo "FATORIAL"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/04/2021
Var
// Seção de Declarações das variáveis 
   num, resultado , fat, c: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Digite um número para realizar a fatoração: ")
   leia(num)
   fat <- 1
   
   para c de num ate 1 passo -1 faca
        fat <- fat * c
        escreva(c, "X")
   fimpara
   
   escreval
   escreval(fat)


Fimalgoritmo