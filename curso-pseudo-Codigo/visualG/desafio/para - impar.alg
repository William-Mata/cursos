algoritmo "semnome"
var
  imp,cont, n, resp:inteiro
inicio
      resp <- 0
      imp <- 0
      Para cont <- 1 ate 5 faca
           Escreva("DIGITE AQUI UM VALOR: ")
           Leia(n)
           Se (n % 2 = 1) entao
              imp <- imp + n
                Se(n >= 0)e (n <= 10)entao
                   resp <- resp + 1
                Fimse
           FimSe
      FimPara
      Escreval("=========================================================")
      Escreval("Aqui estão a quantidade de valores entre 0 e 10: ", resp)
      Escreval("=========================================================")
      Escreval("A soma dos valores IMPARES são de:", imp)
      Escreval("========================================================")
fimalgoritmo
