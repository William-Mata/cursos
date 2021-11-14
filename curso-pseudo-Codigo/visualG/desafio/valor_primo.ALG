Algoritmo "primo_ou_nao"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/04/2021
Var
// Seção de Declarações das variáveis 
   primo, c, num, soma: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   escreva("Digite um número: ")
   leia (num)
   
   para c de 1 ate num faca
   
        se(num % c = 0)entao
        
            soma <- soma + 1
            
        fimse

   fimpara
   
   se(soma = 2) entao
        escreva("O número", num," é primo")
   senao
        escreva("O número", num," não é primo")
   fimse

Fimalgoritmo