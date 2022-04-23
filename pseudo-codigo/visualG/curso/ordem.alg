algoritmo "semnome"
var
vet: vetor [1..4] de inteiro
i, j, aux: inteiro
inicio
      Para i <- 1 ate 4 faca
           Escreva("Digite um valor: ")
           Leia(vet[i])
      FimPara

      Para i <- 1 ate 3 faca
           Para j <- i+1 ate 4 faca
                Se (vet [i] > vet[j]) entao
                   aux := vet[j]
                   vet[j]:= vet[i]
                   vet[i] := aux

                Fimse
           FimPara
      FimPara

      Para i <- 1 ate 4 faca
          Escreva("{",vet[i],"}")
      FimPara
fimalgoritmo
