algoritmo "NúmeroPrimo"
var
   n, cont: Inteiro
inicio
      cont <- 2
      Escreva("Digite aki até que número deseja contar: ")
      Leia(n)
      Repita
            Se (n % cont = 0)entao
               Escreval("O número", n ," que você digitou e PAR")
            Senao (n % cont = 1)entao
                  Escreval("O número que", n ," você digitou e IMPAR")
            FimSe
      Ate(cont = cont)
fimalgoritmo
