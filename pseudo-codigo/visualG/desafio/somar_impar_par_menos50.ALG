Algoritmo "soma_impar_par_menor_50"
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
   escreva("Digite um número para ser somado: ")
   leia(num)
   
   para cont de 1 ate num faca
   
   se (cont % 2 = 1) entao
   
          somaimpar <- somaimpar + cont
          escreval
          escreval ("O número soma foi impar: ", cont)
          escreval ("A soma de números impares é: ", somaimpar)
          escreval
          
   senao(cont % 2 = 0)
   
        somapar <- somapar + cont
        escreval
        escreval ("O número somado foi par", cont)
        escreval ("A soma de números pares é: ", somapar)
        escreval
        
   fimse
   
   fimpara

   escreval ("A soma total dos números impares foi de: ", somaimpar)
   escreval ("A soma total dos números pares foi de: ", somapar)
Fimalgoritmo