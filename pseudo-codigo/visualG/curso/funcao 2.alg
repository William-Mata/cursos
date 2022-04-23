algoritmo "semnome"
var
   W1: INTEIRO
   N1: CARACTER
Funcao ImparOuPar(M9 :INTEIRO):CARACTER
Inicio
       Se (M9 % 2 = 0)entao
          RETORNE "PAR"
       SeNao (M9 % 2 = 1)entao
             RETORNE "IMPAR"
       FimSe
FimFuncao
inicio
      Escreval("DIGITE O VALOR: ")
      Leia(W1)
      N1:= ImparOuPar(M9)
      Escreval("O NÚMERO",W1,"DIGITADO É",N1)
fimalgoritmo
