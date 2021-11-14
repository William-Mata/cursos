algoritmo "semnome"
var
   vet: vetor [1..10] de inteiro
   w, n, a: inteiro
inicio
      Para w := 1 ate 10 faca
           Escreval("Digite o valor: ")
           Leia(vet[w])
      FimPara
      
      Para w := 1 ate 9 faca
           Para n := w+1 ate 10 faca
                Se (vet[w] > vet[n])entao
                 a <- vet [w]
                 vet [w] <- vet [n]
                 vet [n] <- a
                FimSe
           FimPara
      FimPara
      Para w := 1 ate 10 faca
           Escreva("{",vet[w],"}")
      FimPara
fimalgoritmo