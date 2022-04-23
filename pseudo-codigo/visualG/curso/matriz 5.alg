algoritmo "Matriz-4"
var
   Mat: vetor [1..4, 1..4] de inteiro
  cont,w, n, resp: inteiro
Procedimento Matz()
Inicio
      Escreval("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/")
      Escreval("          MENU DE OPÇÕES           ")
      Escreval("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-")
      Escreval("[1] Mostrar a Matriz")
      Escreval("[2] Mostrar Diagonal Principal")
      Escreval("[3] Triangulo Superior")
      Escreval("[4] Triangulo Inferior")
      Escreval("[5] Sair")
      Escreva("OPÇÃO: ")
      Leia(resp)
FimProcedimento
inicio
      Matz()
      cont <- 1
      Para w := 1 ate 4 faca
           Para n := 1 ate 4 faca
                Mat[w,n] <- 1
           FimPara
      FimPara
      Para w:= 1 ate 4 faca
           Para n:= 1 ate 4 faca
                Se (cont <= 16)  entao
                   Mat[w,n] <- cont
                   cont := cont + 1
                FimSe
           FimPara
      FimPara
      Enquanto (resp < 5) faca
           Escolha resp
                   Caso 1
                        LimpaTela
                        Para w := 1 ate 4 faca
                             Para n := 1 ate 4 faca
                                  Escreva(Mat[w,n]:5)
                             FimPara
                             Escreval()
                        FimPara
                        Escreval()
                        Matz()
                   Caso 2
                        LimpaTela
                        Escreval(" ",Mat[1,1])
                        Escreval("    ",Mat[2,2])
                        Escreval("       ",Mat[3,3])
                        Escreval("          ",Mat[4,4])
                        Escreval()
                        Matz()
                   Caso 3
                        LimpaTela
                        Escreval(" ",Mat[1,2]:5, Mat[1,3]:5, Mat[1,4]:5)
                        Escreval("      ",Mat[2,3]:5, Mat[2,4]:5)
                        Escreval("           ",Mat[3,4]:5)
                        Escreval()
                        Escreval()
                        Escreval()
                        Matz()
                   Caso 4
                        LimpaTela
                        Escreval(Mat[2,1]:5)
                        Escreval(Mat[3,1]:5, Mat[3,2]:5)
                        Escreval(Mat[4,1]:5,Mat [4,2]:5,Mat [4,3]:5)
                        Escreval()
                        Matz()
           FimEscolha
     FimEnquanto
     LimpaTela
     Escreval("ENCERRANDO...")
fimalgoritmo
