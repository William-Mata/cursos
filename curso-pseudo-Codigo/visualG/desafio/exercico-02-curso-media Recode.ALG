Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 01/10/2021
Var
// Seção de Declarações das variáveis 
notas : vetor [1..5] de real
aux : inteiro
media : real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   escreval("=========== Notas dos alunos ============")
   Para aux de 1 ate 5 faca
          escreva("Digite a nota do",aux,"° aluno: ")
          leia(notas[aux])
   fimpara

   Para aux de 1 ate 5 faca
        media <- media + notas[aux]
   fimpara
   
   media <- media / 5
   escreval("A media dos alunos é:", media)
Fimalgoritmo