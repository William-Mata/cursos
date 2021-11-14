Algoritmo "imprimir_numero_maior_10"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/04/2021
Var
// Seção de Declarações das variáveis 
   numero: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva ("Digite um valor inteiro: ")
   leia (numero)
   
   se (numero >= 10) entao
      escreval ("O valor do número é: " , numero)
      escreval ("O valor digitado foi maior ou igual a 10.")
   senao
        se((numero >= 5) e (numero < 10))entao
                  escreval ("O valor do número é: " ,numero)
                  escreval ("O valor digitado foi menor que 10 e maior que 5.")
        senao
             escreval ("O valor do número é: ", numero)
             escreval ("O valor digitado foi menor que 5.")
        fimse
   fimse

Fimalgoritmo