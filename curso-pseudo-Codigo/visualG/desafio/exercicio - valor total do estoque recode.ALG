Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 04/10/2021
Var
   // Seção de Declarações das variáveis
   valorTotal, aux, mediaValor, totProduto :  inteiro
   valorCada : vetor[1..20] de inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreva("Digite a quantidade de produto em estoque: ")
   Leia(totProduto)
   
   para aux de 1 ate totProduto faca
        Escreva("O valor do ", aux, "° produto: ")
        Leia(valorCada[aux])
   
        valorTotal <- valorTotal + valorCada[aux]
   fimpara

   Escreval("O valor total do e")
Fimalgoritmo