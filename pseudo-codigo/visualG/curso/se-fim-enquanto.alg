algoritmo "semnome"
var
   cont, inc, fim: Inteiro
inicio
      Escreval("============================")
      Escreval("   CONTADOR INTELIGENTE     ")
      Escreval("============================")
      Escreva("INICIO: ")
      Leia(inc)
      Escreva("FIM: ")
      Leia(fim)
      Escreval("============================")
      Escreval("         CONTANDO           ")
      Escreval("============================")
      cont <- inc
      Se (inc > fim)entao
         Enquanto (cont >= fim)faca
                  Escreva(cont, "...")
                  cont <- cont - 1
         FimEnquanto
      Senao (inc < fim)entao
            Enquanto (cont <= fim)faca
                     Escreva(cont,"...")
                     cont <- cont + 1
            FimEnquanto
      FimSe
FimAlgoritmo
