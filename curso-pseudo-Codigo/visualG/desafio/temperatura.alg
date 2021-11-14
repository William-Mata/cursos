algoritmo "IMPOSTO"
var
   imposto, valor_produto: Real
inicio
      Escreva("Digite o valor do produto: ")
      Leia(valor_produto)
      imposto <- (valor_produto * 60) / 100
      Escreva("O valor do imposto sobre", valor_produto, " e de U$: ", imposto:5:1)

fimalgoritmo
