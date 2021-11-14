algoritmo "semnome"
var
   MiD: vetor [1..4, 1..4] de inteiro
   w, n: inteiro
inicio
      Para w := 1 ate 4 faca
           Para n := 1 ate 4 faca
                Se (w = n) entao
                  MiD[w,n] := 1
                Senao
                     MiD[w,n]:= 0
                FimSe
            FimPara
      FimPara
      Escreval("-/-/-/-/-/-/-/-/-/-")
      Escreval("  MATRIZ 4° ORDEM  ")
      Escreval("/-/-/-/-/-/-/-/-/-/")
      Para w := 1 ate 4 faca
           Para n := 1 ate 4 faca
                Escreva(MiD[w,n]:4)
            FimPara
            Escreval()
      FimPara
fimalgoritmo