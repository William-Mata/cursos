algoritmo "SuperContador"
var
   resp: Inteiro
inicio
    resp <- 3
    Repita
      Escreval(" ================= ")
      Escreval("[      MENU       ]")
      Escreval(" ================= ")
      Escreval("[  {1} DE 1 a 10  ]")
      Escreval("[  {2} De 10 a 1  ]")
      Escreval("[  {3} Sair       ]")
      Escreval(" ================= ")
      Leia(resp)
      Se (resp = 1)entao
         Escreval(" 1.. 2.. 3.. 4.. 5.. 6.. 7.. 8.. 9.. 10..")
      Senao (resp = 2)entao
            Escreval(" 10.. 9.. 8.. 7.. 6.. 5.. 4.. 3.. 2.. 1..")
      FimSe
    Ate(resp = 3)
    Escreval("Saindo...")
fimalgoritmo
