algoritmo "semnome"
var
   W: vetor[1..7] de inteiro
   C,PAR,IMPAR: inteiro
inicio
      PAR <- 0
      IMPAR <- 0
      Para C:= 1 ate 7 faca
           escreva("Digite o",C,"° valor: ")
           leia(W[C])
      FimPara
      Escreval("=======================================")
      Para C:=1 ate 7 faca
         Se (W[C] % 2 = 0)entao
            PAR:= PAR + 1
            Escreval("O Valor PAR está na posição",c)
         SeNao (W[C] % 2 = 1) entao
            IMPAR:= IMPAR +1
            Escreval("Valor IMPAR está na posição",c)
         FimSe
      FimPara
      Escreval("=======================================")
      Escreval("Você digitou",PAR," números PARES.")
      Escreval("Voce digitou",IMPAR," números IMPARES.")
fimalgoritmo
