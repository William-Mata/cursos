Algoritmo "Aula 02 - Estrutura Condicionais"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/09/2021
Var
   // Seção de Declarações das variáveis
   num1, num2 : inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   num1 <- 5
   num2 <- 10


   Escreval("Estrutura Condicionais - SE - SENAO")
   se((num1 > num2) E (num2 > num1))entao

      Escreval(num1, num2)

   senao se((num1 < num2) OU (num2 > num1)) entao

      Escreval(num2, num1)

   fimse

   Escreval()

   Escreval("Estrutura Condicionais - Escolha - Caso")
   Escolha(num1)

   caso 1
      Escreval("1 - Verdadeiro")

   caso 3
      Escreval("3 - Verdadeiro")

   caso 5
        Escreval("5 - Verdadeiro")
    fimescolha
Fimalgoritmo