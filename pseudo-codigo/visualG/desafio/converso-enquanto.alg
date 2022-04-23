algoritmo "ConversorDeMoedasEnquanto"
var
   qt, qt1: Inteiro
   re, do: Real
inicio
      Escreva("Quantas vezes deseja fazer a conversão: ")
      Leia(qt1)
      qt <- 1
      Enquanto (qt <= qt1) faca
               Escreva("Qual valor em R$: ")
               Leia(re)
               do <- re/2.22
               Escreval("Você pode comprar U$:", do:4:2)
               qt <- qt + 1
      FimEnquanto
fimalgoritmo
