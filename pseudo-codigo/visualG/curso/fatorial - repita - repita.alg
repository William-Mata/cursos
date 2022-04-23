algoritmo "Fatorial"
var
   cont, n, f: inteiro
   resp: caracter
inicio
   resp <- "N"
   Repita
      Escreva("Digite aqui o número do fatorial: ")
      Leia(n)
      cont <- n
      f <- 1
      Repita
            f <- f * cont
            cont <- cont - 1
      Ate(cont = 0)
      Escreval("O fatorial de", n, " é: ", f:1:3)
      Escreva("Quer continuar? [S/N]: ")
      Leia(resp)
      LimpaTela
   Ate(resp = "N")
fimalgoritmo
