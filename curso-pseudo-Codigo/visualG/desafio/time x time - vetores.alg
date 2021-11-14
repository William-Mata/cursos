algoritmo "semnome"
var
   time: vetor[1..3] de caractere
   res: caractere
   c, c1: inteiro
inicio
      Para c := 1 ate 3 faca
           Escreva("Digite o nome do time: ")
           Leia(time[c])
      FimPara
      
      Para c:=1 ate 3 faca
           Para c1:= 1 ate 3 faca
              Se(time[c] <> time [c1]) entao
                Escreval(time[c]:8," [] x [] ",time[c1])
              FimSe
           FimPara
      FimPara
fimalgoritmo