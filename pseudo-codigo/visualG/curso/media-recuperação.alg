algoritmo "semnome"
var
   N1, N2,RP, MF: Real
Procedimento Rec(var M, R, AP1, AP2: REAL)
Inicio
      Se (M >= 5)entao
         Escreval("-------------------------------------------")
         Escreval("VOCÊ FOI APROVADO")
         Escreval("SUA MÉDIA É ", M:2:2)
         Escreval("-------------------------------------------")
      SeNao (M < 5)entao
            Escreval("-------------------------------------------")
            Escreval("VOCE ESTÁ DE RECUPERAÇÃO")
            Escreval("SUA MÉDIA É ", M:2:2)
            Escreva("DIGITE AQUI SUA NOTA DE RECUPERAÇÃO: ")
            Leia(R)
            MF <- (AP1 + AP2 + R) / 2
            Se(M >= 5)entao
                Escreval("-------------------------------------------")
                Escreval ("VOCÊ FOI APROVADO")
                Escreval ("SUA MÉDIA É ", M:2:2)
                Escreval("-------------------------------------------")
            SeNao (M < 5)entao
                  Escreval("-------------------------------------------")
                  Escreval ("VOCÈ FOI REPROVADO")
                  Escreval ("SUA MÉDIA E ", M:2:2)
                  Escreval("-------------------------------------------")
            FimSE
      FimSe
FimProcedimento
inicio
      Escreva("DIGITE SUA PRIMEIRA NOTA: ")
      Leia(N1)
      Escreva("DIGITE SUA SEGUNDA NOTA: ")
      Leia(N2)
      MF <- (N1 + N2) / 2
      Rec(MF, N1, N2, RP)
fimalgoritmo
