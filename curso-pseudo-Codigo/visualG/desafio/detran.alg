algoritmo "DETRAN"
var
   idade, ano_atual, ano_nasc: Real
inicio
      Escreval("--------------------------")
      Escreval(" DEPARTAMENTO DE TRANSITO ")
      Escreval("--------------------------")
      
      Escreva("Digite aqui o Ano Atual: ")
      Leia(ano_atual)
      Escreva("Digite aqui o Ano em que Nasceu: ")
      Leia(ano_nasc)
      idade <- ano_atual - ano_nasc
      Escreval(" ")
      Escreval("----------STATUS----------")
      Escreval("SUA IDADE É", idade)
      Se (idade > 18) entao
         Escreval("ESTÁ APTO A TIRAR CNH")
         Escreval("--------------------------")
         Escreval(" ")
      SeNao (idade < 18) entao
           Escreval("ESTÁ INAPTO A TIRAR A CNH")
           Escreval("--------------------------")
           Escreval(" ")
      FimSe
      

fimalgoritmo
