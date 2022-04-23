algoritmo "semnome"
var
   C,W1, W2, N1, N2: INTEIRO
Funcao FIBONACCI(var V1, V2: INTEIRO): INTEIRO
Var
   V3: INTEIRO
inicio
       V3 := V1 + V2
       V1 := V2
       V2 := V3
       RETORNE V3
FimFuncao
   
inicio
      W1 <- 0
      Escreva(W1)
      W2 <- 1
      Escreva(W2)
      Para C:= 0 ate 7 faca
           N2 :=  FIBONACCI(W1, W2)
           Escreva(N2)
      FimPara
fimalgoritmo
