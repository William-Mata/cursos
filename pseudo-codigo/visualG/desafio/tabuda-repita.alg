algoritmo "semnome"
var
   cont, n, r, a: Inteiro

inicio
      cont <- 1
      Escreva("Qual tabuada deseja digite um número: ")
      Leia(n)
      Escreva("Ate onde deseja que a tabudada vá: ")
      Leia(a)
      Repita
            r <- cont * n
            Escreval(cont ," X", n, " =", r)
            cont <- cont + 1
      Ate (Cont > 10)
fimalgoritmo
