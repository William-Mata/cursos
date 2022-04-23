algoritmo "Creuza_problematica"
var
   valor_emprestimo, juros, valor_juros, valor_parcela, parcela: Real
inicio
      Escreva("Qual o valor do emprestimo: ")
      Leia(valor_emprestimo)
      juros <- (valor_emprestimo * 20) / 100
      valor_juros <- juros + valor_emprestimo
      Escreval("Valor do Emprestimo com Juros é: ", valor_juros)
      Escreval("Em quantas vezes deseja parcelar?: ")
      Leia(parcela)
      valor_parcela <- valor_juros / parcela
      Escreva("Valor da parcela vai ser R$: ", valor_parcela:4:1)
fimalgoritmo
