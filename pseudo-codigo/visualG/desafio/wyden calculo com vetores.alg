algoritmo "Disciplinas-Wyden"
var
   nome:vetor [1..7] de Caractere
   ap1:vetor [1..7] de Real
   ap2:vetor [1..7] de Real
   ap3:vetor [1..7] de Real
   mfinal:vetor [1..7] de Real
   c:inteiro
inicio
      nome[1] <- "Algoritmos"
      nome[2] <- "Calculo"
      nome[3] <- "informatica"
      nome[4] <- "Empreendedorismo"
      nome[5] <- "Estudo,...Emprendendorismo"
      nome[6] <- "Carreira,... Trabalho em Equipe"
      nome[7] <- "Temas"
      Para c <- 1 ate 7 faca
           Escreval("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-")
           Escreval("DISCIPLINA ",maiusc(nome[c]))
           Escreval("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-")
           Escreval()
           Escreva("Digite a nota da AP1: ")
           Leia(ap1[c])
           Escreva("Digite a nota da AP2: ")
           Leia(ap2[c])
           Escreva("Digite a nota da AP3: ")
           Leia(ap3[c])
           mfinal[c]<-(ap1[c]*0.3)+(ap2[c]*0.3)+(ap3[c]*0.4)
           Escreval("=======================")
           Escreval()
      FimPara

      LimpaTela
      Escreval("===========================")
      Escreval("     DISCIPLINAS WYDEN     ")
      Escreval("===========================")
      Para c <- 1 ate 7 faca
           Escreval()
           Escreval("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/")
           Escreval()
           Escreva(maiusc(nome[c]):35,mfinal[c]:2:1)
           Se (mfinal[c] > 4.9) entao
              Escreva("[APROVADO]")
           Senao  (mfinal[c] <= 4.9)
                Escreva(" [REPROVADO] ")
           FimSe
      FimPara
fimalgoritmo
