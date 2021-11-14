algoritmo "semnome"
var
   N: Caracter
   C: Inteiro
inicio
      escreva("Digite seu nome: ")
      Leia(N)
      escreval("Total de letras que seu nome possui: ",Compr(N))
      escreval("Seu nome em Maiusculo fica: ",maiusc(N))
      escreval("Seu nome em Minusculo fica: ",minusc(N))
      escreval("A primeira letra do seu nome: ",copia(maiusc(N), 1, 1))
      escreval("A ultima letra do seu nome: ",copia(maiusc(N),compr(N),1))
      escreval("Seu nome tem a letra ",copia(maiusc(N),3,1)," na posição:", pos("L", maiusc (N)))
      escreval("O codigo da letra",copia(maiusc(N),3,1)," é:",asc("L"))
      escreval("A letra do codigo",asc("L")," é: ",carac(76))
      Para C:= Compr(N) Ate 1 passo -1 faca
           Escreva(copia(maiusc(N),C,1))
      FimPara

 fimalgoritmo
