algoritmo "semnome"
var
N1, N2, N3: Real
inicio
      Escreva("Digite a primeira nota: ")
      Leia(N1)
      Escreva("Digite a segunda nota: ")
      Leia(N2)
      N3 <- (N1+N2)/2
      Escreval("MÉDIA: ",N3:2:1)
      Se (N3 >= 9.0) e (N3 <= 10.0)entao
         Escreval("APROVEITAMENTO: A")
      senao
           Se (N3 >= 8.0) e (N3 < 9.0)entao
              Escreval("APROVEITAMENTO: B")
           senao
                Se (N3 >= 7.0) e (N3 < 8.0)entao
                   Escreval("APROVEITAMENTO: C")
                senao
                     Se (N3 >= 6.0) e (N3 < 7.0)entao
                        Escreval("APROVEITAMENTO: D")
                     senao
                          Se (N3 >= 5.0) e (N3 < 6.0)entao
                             Escreval("APROVEITAMENTO: F")
                          senao
                          
                          Fimse
                     Fimse
                Fimse
           FimSe
      FimSe
fimalgoritmo
