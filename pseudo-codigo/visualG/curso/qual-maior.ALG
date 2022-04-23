Algoritmo "Qual_dos_dois_maior"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/04/2021
Var
// Seção de Declarações das variáveis 
   num1, num2, maior: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
     escreva ("Digite o primeiro número: ")
     leia (num1)
     escreva ("Digite o segundo número: ")
     leia (num2)
     
     se num1 > num2 entao
        escreva ("O primeiro número",num1, " é maior que o número", num2)
     senao
          se num2 > num1 entao
                  escreva ("O segundo número",num2, " é maior que o número" , num1)
          senao
               escreva ("Os números são iguais: ", num1, " e ", num2)
          fimse
     fimse

Fimalgoritmo