Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/10/2021
Var
// Seção de Declarações das variáveis 
  numeros : vetor[1..10] de inteiro
  aux, soma: inteiro
  

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   soma <- 0;

   para aux de 1 ate 10 passo 1 faca

   Escreval("Digite o ", aux ,"° número: ")
   Leia(numeros[aux])

   se ((numeros[aux] >=10) E (numeros[aux] <= 20)) entao
        soma <- soma + 1
   fimse
   
   fimpara


   Escreval("No intervalo de 10 a 20 foram digitados: ", soma)
   Escreval("Fora do intervalo de 10 a 20 foram digitados: ", (10-soma))
Fimalgoritmo