algoritmo "semnome"
var
   W, N: INTEIRO
Procedimento SOMA(var A, B: INTEIRO)
Inicio
      A := A + 1
      B := B + 2
      Escreval("Valor de A:", A)
      Escreval("Valor de B:", B)
      EscrevaL("A SOMA dos valores é:", A + B)
FimProcedimento
inicio
      W := 12
      N := 8
      SOMA(W, N)
      Escreval("Valor de W:", W)
      Escreval("Valor de N:", N)
      Escreval("Valor de W + N:",W+N)
fimalgoritmo
