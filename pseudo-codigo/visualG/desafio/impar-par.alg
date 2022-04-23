algoritmo "DETRAN"
var
   M, A, IMC: Real
inicio
      Escreval("--------------------------")
      Escreval("           IMC            ")
      Escreval("--------------------------")
      Escreva("DIGITE SEU PESO(KG): ")
      Leia(M)
      Escreva("DIGITE SUA ALTURA(M): ")
      Leia(A)
      IMC <- M / (A^2)
      Se (IMC < 17)entao
         Escreval (" MUITO ABAIXO DO PESO", " SEU IMC E", IMC)
      SeNao
         Se (IMC >=17) E (IMC <= 18.5)entao
            Escreval (" ABAIXO DO PESO", " SEU IMC E", IMC)
         SeNao
            Se (IMC >= 18.5) E (IMC <= 25)entao
               Escreval (" PESO IDEAL", " SEU IMC E", IMC)
            SeNao
               Se (IMC >= 25) E (IMC <= 30)entao
                  Escreval (" SOBREPESO", " SEU IMC E", IMC)
               SeNao
                  Se (IMC >= 30) E (IMC <= 35)entao
                     Escreval(" OBESIDADE", " SEU IMC E", IMC)
                  SeNao
                     Se (IMC >= 35) E (IMC <= 40)entao
                        Escreval(" OBESIDADE SEVERA", " SEU IMC E", IMC)
                     SeNao
                        Se (IMC > 40) entao
                           Escreval("OBSEIDADE MÓRBIA", " SEU IMC E", IMC)
                        SeNao

                        FimSe

                     FimSe

                  FimSe
                  
               FimSe

            FimSe

         FimSe

      FimSe
fimalgoritmo

