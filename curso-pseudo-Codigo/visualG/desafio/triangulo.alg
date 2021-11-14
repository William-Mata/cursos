algoritmo "triangulos"
var
   L1, L2, L3: Real
   EQ, ES, TRI: Logico
inicio
      Escreva ("Insira o 1° lado do Triângulo: ")
      Leia (L1)
      Escreva ("Insira o 2° lado do Triângulo: ")
      Leia (L2)
      Escreva ("Insira o 3° lado do Triângulo: ")
      Leia (L3)
      TRI <- (L1<L2+L3) E (L2<L1+L3) E (L3<L1+L2)
      EQ <- (L1=L2) E (L2=L3)
      ES <- (L1<>L2) E (L2<>L3)E (L1<>L3)
      Escreval("Pode formar um TRIÂNGULO?", TRI)
      Escreval("O Triângulo é EQUILATERO?", EQ)
      Escreval("O Triângulo é ESCALENO?", ES)
fimalgoritmo
