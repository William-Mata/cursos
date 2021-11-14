Algoritmo "Exercicio-Prof-Aula01-Recode"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/09/2021
Var
   // Seção de Declarações das variáveis
   n1, n2: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreva("Digite o primeiro numero: ")
   leia(n1)

   Escreva("Digite o segundo numero: ")
   leia(n2)

   se (n1 = n2) entao

      escreval("Os valores são iguais ", n1, " e ", n2, ".")

   senao

      se (n1 > n2) entao

         escreval(n1, " é maior que ", n2)

      senao
      
         escreval(n2, " é menor que ", n1)

      fimse

   fimse
Fimalgoritmo