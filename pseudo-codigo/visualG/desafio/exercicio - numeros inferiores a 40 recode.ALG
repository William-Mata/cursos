Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/10/2021
Var
// Seção de Declarações das variáveis 
numeros : vetor[1..10] de inteiro
aux, somaTotal :  inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...
aux <- 0
somaTotal <- 0

para aux de 1 ate 10 faca
     Escreva("Digite o ", aux, "° numero: ")
     Leia(numeros[aux])
     
     se (numeros[aux] < 40) entao

        somaTotal <- somaTotal + numeros[aux]

     fimse
fimpara

Escreval("O valor total da soma dos numeros inferiores a 40 é: ", somaTotal)
Fimalgoritmo