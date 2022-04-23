Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/09/2021
Var
   // Seção de Declarações das variáveis
   salario : real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreval("Digite seu salario para saber se você recebera o aumento: ")
   leia(salario)

   se(salario < 500)entao
      Escreval("Você recebera o aumento seu novo salario é: ", (salario + (salario*0.30)))
   senao
      Escreval("Você não recebera o aumento.")
   fimse

Fimalgoritmo