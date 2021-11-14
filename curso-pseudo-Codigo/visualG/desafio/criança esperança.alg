algoritmo "Criança Esperança"
var
   valor, D: Real
inicio
      Escreval ("-----------------------------------")
      Escreval ("         CRIANÇA ESPERANÇA         ")
      Escreval ("-----------------------------------")
      Escreval ("MUITO OBRIGADO POR AJUDAR")
      Escreval ("DIGITE [1] PARA DOAR R$ 10")
      Escreval ("DIGITE [2] PARA DOAR R$ 25")
      Escreval ("DIGITE [3] PARA DOAR R$ 50")
      Escreval ("DIGITE [4] PARA OUTROS VALOR")
      Escreval ("DIGITE [5] PARA CANCELAR")
      Escreva ("DIGITE A OPÇÃO: ")
      Leia(D)
      Escolha D
              Caso 1
                   VALOR <- 10
              Caso 2
                   VALOR <- 25
              Caso 3
                   VALOR <- 50
              Caso 4
                   Escreva("DIGITE O VALOR QUE DESEJA DOAR: ")
                   Leia(valor)
              Caso 5
                   VALOR <- 0

      FimEscolha
      Escreval("-----------------------------")
      Escreval("SUA DOAÇÃO FOI DE R$", VALOR)
      Escreval("MUITO OBRIGADO!!!")
      Escreval("-----------------------------")
fimalgoritmo
