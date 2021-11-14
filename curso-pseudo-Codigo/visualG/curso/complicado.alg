algoritmo "Cineminha"
var
   Ca: vetor[1..10] de caractere
   resp, c: inteiro
   S_N:caracter
Procedimento Lug()
Inicio
  Escreval("==========================")
  Escreval("   CADEIRAS DISPONIVEIS   ")
  Escreval("==========================")
FimProcedimento
inicio
      Para c := 1 ate 10 faca
           Ca[c]:= "B"
      FimPara
      
      Repita
            Lug()
            Para c:= 1 ate 10 faca
                Se(Ca[c] = "---")entao
                 Escreva("[---]")
                SeNao
                     Escreva("[",Ca[c],c,"]")
                FimSe
            FimPara
            Escreval()
            Escreva("Reserver a cadeira:B ")
            Leia(resp)
            Se (Ca[c] = Ca[resp])entao
             Ca[resp] <- "---"
            Senao
                 Escreval("Lugar Ocupado")
            FimSe
            Escreva("Quer Continuar [S/N]: ")
            Leia(S_N)
            limpatela
      Ate(S_N= "N")
fimalgoritmo