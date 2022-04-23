algoritmo "Matriz-4"
var
   Mat: vetor [1..4, 1..4] de inteiro
  soma,w, n, L2, C3: inteiro

inicio
      L2:= 1
      Para w := 1 ate 4 faca
           Para n := 1 ate 4 faca
             Escreva("Digite o valor da posição[",w,",",n,"]: ")
             Leia(Mat[w,n])
             Se (w = n)entao
                soma <- soma + Mat[w,n]
             FimSe
           FimPara
      FimPara
      Para w:= 1 ate 4 faca
             Escreva(Mat[w,3])
             Se (Mat[w,3] > C3)entao
               C3:= Mat[w,3]
             FimSe
      FimPara
      Para n:= 1 ate 4 faca
          L2:= L2 * Mat[2,n]
      FimPara
      Escreval()
      Escreval("*-*-*-*-*-*-*-*-*-*-*-*")
      Escreval("   MATRIZ DE 4°ORDEM   ")
      Escreval("*-*-*-*-*-*-*-*-*-*-*-*")
      Para w := 1 ate 4 faca
           Para n := 1 ate 4 faca
                Escreva(Mat[w,n]:5)
           FimPara
           Escreval()
      FimPara
      
      Escreval("A soma dos valores da diagonal é:",soma)
      Escreval("A multiplicação da segunda linha é:",L2)
      Escreval("O Maior numero da coluna 3 é:",C3)
fimalgoritmo