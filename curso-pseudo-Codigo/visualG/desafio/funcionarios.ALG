Algoritmo "Funcionarios"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/04/2021
Var
// Seção de Declarações das variáveis 
funcionario :vetor[1..5] de caractere
c: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

 para c de 1 ate 5 faca
      escreva("Digite o nome do", c,"° funcionario: ")
      leia(funcionario[c])
 fimpara

 c <- 1
 escreval
 para c de 1 ate 5 faca
     escreval("O nome do", c,"° funcionario e: ", funcionario[c])
 fimpara

Fimalgoritmo