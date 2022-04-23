Algoritmo "horas_segundos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 15/04/2021
Var
// Seção de Declarações das variáveis 
   t1, t2, horas, minutos ,segundos : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
 escreva ("Digite a hora: ")
 leia (horas)
 escreva ("Digite os minutos: ")
 leia (minutos)
 segundos <- ((minutos + horas * 60)* 60)
 escreva ("A quantidade de segundos das ", horas, ":", minutos, " é: ", segundos)

Fimalgoritmo