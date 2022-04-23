algoritmo "semnome"
var
   g1, g2, pt: Real
inicio
      Escreval("--------------------")
      Escreval("     FLA X FLU      ")
      Escreval("--------------------")
      Escreva("DIGITE O PLACAR DE FLA: ")
      Leia(g1)
      Escreva("DIGITE O PLACAR DE FLU: ")
      Leia(g2)
      pt <- g1 - g2 abs
      Escreval("-------------------")
      Escreval("DIFRENÇA:",pt)
      Escolha pt
             Caso 0
                  Escreval("JOGO EMPATOU")
             Caso 1, 2, 3
                  Escreval("JOGO NORMAL")
             Caso 4 , 5, 6, 7, 8, 9, 10
                  Escreval("GOLEADA")
      FimEscolha
      
      Escreval("-------------------")
fimalgoritmo

