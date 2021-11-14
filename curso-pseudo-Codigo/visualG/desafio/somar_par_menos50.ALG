Algoritmo "soma_par_menor_50"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 17/04/2021
Var
// Seção de Declarações das variáveis 
num, somapar, somaimpar, cont: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   cont <-0
   
   para cont de 1 ate 10 faca
   
   escreva("Digite um número para ser somado: ")
   leia(num)
   
   se ((num < 50 ) e (num % 2 = 1)) entao
          somaimpar <- somaimpar + num
          escreval
          escreval ("O número digitado foi impar: ", num)
          escreval ("A soma de números impares é: ", somaimpar)
          escreval
   senao

        se((num < 50) e (num % 2 = 0)) entao
                somapar <- somapar + num
                escreval
                escreval ("O número digitado foi par", num)
                escreval ("A soma de números pares é: ", somapar)
                escreval
        senao
             escreval
             escreval ("Número muito alto para ser somado, digite outro número.")
             escreval
        fimse
   fimse
   
   fimpara

   escreval ("A soma total dos números impares foi de: ", somaimpar)
   escreval ("A soma total dos números pares foi de: ", somapar)
Fimalgoritmo