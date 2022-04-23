algoritmo "semnome"
var
   I: INTEIRO
   N, PESADO: CARACTER
   P, Mai: Real
Procedimento DETECTOR()
Inicio
      LimpaTela
      Escreval("=================================")
      Escreval("       DETECTOR DE PESADO        ")
      Escreval("Maior peso até agora:",Mai," Kg"  )
      Escreval("=================================")
FimProcedimento
inicio
      DETECTOR()
      Para I:= 1 ate 5 faca
           Escreva("Digite o Nome: ")
           Leia(N)
           Escreva("Digite o peso de ", N,": ")
           Leia(P)
           Se (P > Mai) entao
              Mai := P
              PESADO := N
           FimSe
           DETECTOR()
           FimPara
      DETECTOR()
      Escreval("A pessoa mais pesada foi ",PESADO,", com:",Mai,"Kg" )
Fimalgoritmo
