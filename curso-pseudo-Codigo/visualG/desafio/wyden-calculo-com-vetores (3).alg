algoritmo "Disciplinas-Wyden"
var
   nome:vetor [1..7] de Caractere
   ap1:vetor [1..7] de Real
   ap2:vetor [1..7] de Real
   ap3:vetor [1..7] de Real
   mfinal:vetor [1..7] de Real
   c:inteiro
inicio
      Para c <- 1 ate 7 faca
           Escreval("DISCIPLINA", c,"°")
           Escreval("==================")
           Escreva("Nome da Disciplina: ")
           Leia(nome[c])
           Escreva("Digite a primeira nota: ")
           Leia(ap1[c])
           Escreva("Digite a segunda nota: ")
           Leia(ap2[c])
           Escreva("Digite a terceira nota: ")
           Leia(ap3[c])
           mfinal[c]<-(ap1[c]*0.3)+(ap2[c]*0.3)+(ap3[c]*0.3)
           Escreval("=======================")
           Escreval( )
      FimPara

      LimpaTela
      Escreval("===========================")
      Escreval("     DISCIPLINAS WYDEN     ")
      Escreval("===========================")
      Para c <- 1 ate 7 faca
           Escreval("===============================================")
           Escreval(nome[c]:35,mfinal[c]:2:1)
           Escreval( )
           Se (mfinal[c] >= 5) entao
              Escreval("APROVADO")
           Senao
                Escreval("REPROVADO")
           FimSe
      FimPara
fimalgoritmo
