algoritmo "Matriz-1"
var
   w: vetor [1..3, 1..2] de inteiro
   l,c: inteiro
inicio
      Para l := 1 ate 3 faca
           Para c:= 1 ate 2 faca
           Escreva("Digite um valor para as posições[",l,",",c,"]: ")
           Leia(w[l,c])
           FimPara
      FimPara

      Escreval("================================")
      Para l:= 1 ate 3 faca
           Para c:= 1 ate 2 faca
                Escreval("[",l,",",c,"]: ",w[l,c])
           FimPara
      FimPara
fimalgoritmo