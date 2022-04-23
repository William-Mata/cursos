algoritmo "semnome"
var
 RespCor, f, m, qt, idade: inteiro
  RespSexo, Resp: Caracter
inicio
      f <- 0
      m <- 0
      Repita
            Escreval("=========================")
            Escreval("    SELETOR DE PESSOAS   ")
            Escreval("=========================")
            Escreva("Qual o Sexo [M/F]: ")
            leia(RespSexo)
            Escreva("Qual sua idade: ")
            Leia(idade)
            Escreval("Qual sua cor do cabelo")
            Escreval("=========================")
            Escreval("[1] PRETO")
            Escreval("[2] CASTANHO")
            Escreval("[3] LOIRO")
            Escreval("[4] RUIVO")
            Leia(RespCor)
            Se (RespSexo = "M") e (idade > 18) e (RespCor = 2)entao
               m <- m + 1
            Senao
                 Se(RespSexo = "F") e (idade >= 25)e (idade <= 30) e (RespCor = 3)entao
                    f <- f + 1
                 SeNao
                 FimSe
            Fimse
            Escreval("Quer Continunar [S/N/]: ")
            Leia(Resp)
      Ate( Resp = "N")
      Escreval("Total de homems com mais de 18 anos e cabelos castahos é:", m)
      Escreval("Total de mulheres com mais de 25 anos e cabelos loiros é:", f)
      
fimalgoritmo
