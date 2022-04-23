Algoritmo "teste_tres_numeros_iguais"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/04/2021
Var
// Seção de Declarações das variáveis 
num_iguais, n1, n2, n3 : inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva ("Digite o primeiro número: ")
   leia (n1)
   escreva ("Digite o segundo número: ")
   leia (n2)
   escreva ("Digite o terceiro número: ")
   leia (n3)
   
   se (n1 = n2) e ( n2 = n3)entao
      escreval("Os três numeros são iguais,",n1,",", n2," e", n3)
      escreval
      num_iguais <- num_iguais+3

   senao
        se (n1 = n2) ou (n1 = n3) ou (n2 = n3) entao
   
        se (n1 = n2) entao
           num_iguais <- num_iguais + 1
           escreval ("O primeiro número", n1, " é igual ao segundo ", n2)
           escreval
           fimse
      
           se(n1 = n3)entao
                 num_iguais <- num_iguais + 1
                 escreval ("O primeiro número", n1, " é igual ao terceiro ", n3)
                 escreval
           fimse

           se(n2 = n1)entao
                 num_iguais <- num_iguais + 1
                 escreval ("O segundo número", n2, " é igual ao primeiro ", n1)
                 escreval
           fimse
      
           se(n2 = n3)entao
                 num_iguais <- num_iguais + 1
                 escreval ("O segundo número", n2, " é igual ao terceiro ", n3)
                 escreval
           fimse
      
           se(n3 = n1)entao
                 num_iguais <- num_iguais + 1
                 escreval ("O terceiro número", n3, " é igual ao primeiro ", n1)
                 escreval
           fimse

           se(n3 = n2)entao
                 num_iguais <- num_iguais + 1
                 escreval ("O terceiro número", n3, " é igual ao segundo ", n2)
                 escreval
           fimse
      
           senao
                escreval("Os números",n1,",",n2,",",n3,", não são iguais!")
                escreval
           fimse
      fimse
           escreval
           escreval ("A quantidade de números digitados iguais foram de:", num_iguais)
   
Fimalgoritmo