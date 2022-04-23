algoritmo "semnome"
var
   nome: caractere
   SoC:vetor [1..10] de caractere
   c,nomeC: inteiro
inicio
      nomeC:= 0
      Para c:= 1 ate 10 faca
      Escreva("digite seu nome: ")
      Leia(nome)
      Se (copia(Maiusc (nome),1,1) = "C")entao
         nomeC := nomeC +1
         SoC[nomeC] := nome
      FimSe
      FimPara
      LimpaTela
      Escreval("Listagem Final")
      Para c:= 1 ate nomeC faca
           EscrevaL(SoC[C])
      FimPara
fimalgoritmo
