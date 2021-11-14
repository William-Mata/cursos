algoritmo "semnome"
var
   W1, N1: INTEIRO
   
Funcao FATORIAL(RC: INTEIRO): INTEIRO
Var
   RS, CON: inteiro
inicio
      RS <- 1
      Para CON := 1 ATE RC FACA
           RS <- RS * CON
      FimPara
      Retorne RS
FimFuncao

inicio
      Escreva("DIGITE AQUI UM NÚMERO: ")
      Leia(W1)
      N1 <- FATORIAL(W1)
      Escreval("O Valor de",W1,"! e igual a ", N1)
fimalgoritmo
