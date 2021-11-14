algoritmo "semnome"
var
   n, s: Inteiro
   resp: caracter
inicio
      s <- 0
      resp <- "N"
      Repita
         Escreva("Digite aqui o valor: ")
         leia(n)
         s <- s + n
         Escreva("Você quer continuar [N/S]: ")
         Leia(resp)
      Ate (resp= "N")
      Escreval("O valor total da soma dos numeros é:",s)
fimalgoritmo
