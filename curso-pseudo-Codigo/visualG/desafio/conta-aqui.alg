algoritmo "QuantoQuerContar"
var
  salto, num, valor: Real
inicio
      Escreva("Digite aqui até número que deseja ser contador: ")
      Leia(num)
      Escreva("Quer conta de quanto em quanto? ")
      Leia(salto)
      valor <- 0
      Enquanto (valor <= num) faca
           Escreval(valor)
           valor <- valor + salto
      FimEnquanto
      Escreval("Termei de conta", valor)
fimalgoritmo
