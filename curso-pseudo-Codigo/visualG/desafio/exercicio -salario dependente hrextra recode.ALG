Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/09/2021
Var
   // Seção de Declarações das variáveis
   salario, salarioNovo, valorHrExtra : real
   horaExtra, qtdDependentes : real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreval("Digite o valor do seu salario: ")
   leia(salario)

   Escreval("Digite a quantidade de horas extras: ")
   leia(horaExtra)

   Escreval("Digite a quantidade de dependentes: ")
   leia(qtdDependentes)
   
   valorHrExtra <- (salario / 220)+((salario / 220) * 0.50)

   salarioNovo <- (salario+(horaExtra*valorHrExtra)+(qtdDependentes*120))

   Escreval("O salario, com os dependentes, horas extras do mês e de R$:", salarioNovo)


Fimalgoritmo