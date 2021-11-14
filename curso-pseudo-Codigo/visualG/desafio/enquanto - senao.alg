algoritmo "ConversorDeMoedasEnquanto"
var
   qt, qt1: Inteiro
   re, do: Real
Procedimento Dolar(A,B,D,R : Real)
Inicio
      Enquanto (A <= B) faca
               Escreva("Qual valor em R$: ")
               Leia(R)
               D <- R/2.22
               Escreval("Você pode comprar U$:", D:4:2)
               A <- A + 1
      FimEnquanto
FimProcedimento
inicio
      Escreva("Quantas vezes deseja fazer a conversão: ")
      Leia(qt1)
      qt <- 1
      Dolar(qt, qt1, re, do)
fimalgoritmo
