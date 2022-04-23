algoritmo "WYDEN"
var
   AP1, AP2, AP3, MF: REAL
Procedimento SomaNotas(var A, B, C, D: Real)
Inicio
      Se (MF > 5)entao
         Escreval("-----------------")
         Escreval("APROVADO ")
         Escreval("SUA MÉDIA É", MF)
         Escreval("-----------------")
      SeNao (MF < 5)entao
            Escreval("-----------------")
            Escreval("REPROVADO ")
            Escreval("SUA MÉDIA É", MF)
            Escreval("-----------------")
            Escreval(" ")
      FimSe
FimProcedimento
inicio
      Escreval("-----------------")
      Escreval(" FACULDADE WYDEN ")
      Escreval("-----------------")
      Escreva("DIGITE A NOTA DA AP1: ")
      Leia(AP1)
      Escreva("DIGITE A NOTA DA AP2: ")
      Leia(AP2)
      Escreva("DIGITE A NOTA DA AP3: ")
      Leia(AP3)
      MF <- (AP1*0.3) + (AP2*0.3) + (AP3*0.4)
      SomaNotas(AP1, AP2, AP3, MF)
fimalgoritmo
