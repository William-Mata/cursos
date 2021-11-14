algoritmo "ContasNegativas"
var
   n,cont,tn: inteiro
inicio
      cont <- 0
      n <- 0
      tn <- 0
      Repita
            Escreva("Digite aqui o número: ")
            Leia(n)
            Se (n < 0)entao
               tn <- tn + 1
            FimSe
            cont <- cont + 1
      Ate(cont = 5)

      Escreval("Total de números negativos é: ",tn)
fimalgoritmo
