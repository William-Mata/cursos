algoritmo "Para- Par"
var
   cont, resp, par, n: inteiro
inicio
      Escreva("Digite um valor: ")
      Leia(n)
      Se(n%2=1)entao
        n <- n - 1
      Fimse
      par <-0
      Para cont <- n ate 0 passo -2 faca
           Escreval(cont)
           par <- par + 1
      FimPara
      Escreval("A Quantidade de numeros pares são de:", par)
fimalgoritmo
