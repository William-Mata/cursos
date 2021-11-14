Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/10/2021
Var
   // Seção de Declarações das variáveis
   resultado ,num : inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreva("Digite o numero do fatorial que deseja ver: ")
   leia(num)

   Escreva("Fatorial de",num,": ")

   resultado <- num * (num - 1)
   escreva(num," X ")

   enquanto num > 1 faca

      num <- num - 1

      se num >= 2 entao
         resultado <- resultado * (num-1)
         escreva(num," X ")


      senao num = 1 entao
         resultado <- resultado * num
         escreva(num, " = ", resultado)

      fimse



   fimenquanto


Fimalgoritmo