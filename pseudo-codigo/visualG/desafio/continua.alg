algoritmo "Analisador_de_valores"
var
  par, s, resp, cont, qt5 , nu:inteiro
  m: real
inicio
      PARA cont:= 1 ate 5 faca
           Escreva("Digite aqui o",cont,"° valor: ")
           leia(resp)
           s := s + resp
           Se (resp % 2 = 0) entao
              par := par + resp
           FimSe
           Se (resp % 5 = 0) entao
                 qt5 := qt5 + 1
           Senao(resp % 5 = 1)entao
                     nu := nu + 1
           FimSe
      FimPARA
      m <- s / 5
      Escreval("=======================================================")
      Escreval(" A Soma Total dos Valores é:", s)
      Escreval(" A Média Entre os Valores é:", m)
      Escreval(" A Total de Números Divididos por 5 é:", qt5)
      Escreval(" O Total de Números Nulos Divisiveis por 5 é:", nu)
      Escreval(" A soma dos valores pares é:", par)
      Escreval("=======================================================")
fimalgoritmo
