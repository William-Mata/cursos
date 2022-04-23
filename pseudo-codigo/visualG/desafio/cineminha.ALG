algoritmo "Cineminha"
var
   Ca: vetor[1..10] de caractere
   resp, c: inteiro
   S_N:caracter
Procedimento Cine()
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
            Cine()
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
            Se (Ca[resp] = "---")entao
              Escreval("Lugar Ocupado")
            Senao (resp = Ca[c]])entao
                 Ca[resp] <- "---"
                 Escreval("Sua Cadeira [B",resp,"], Foi Reservada Com Sucesso")
            FimSe
            Escreva("Quer Continuar [S/N]: ")
            Leia(S_N)
            limpatela
      Ate(S_N= "N")
fimalgoritmo