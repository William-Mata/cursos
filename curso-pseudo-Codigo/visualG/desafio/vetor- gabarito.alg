algoritmo "semnome"
var
   gabarito: vetor [ 1..5] de Caractere
   nome: vetor [1..3] de Caractere
   resp: vetor [1..5] de Caractere
   aluno: vetor [1..3] de Real
   c, c1: Inteiro
   mt: Real
inicio
      Escreval("========================")
      Escreval("    GABARITO DA PROVA   ")
      Escreval("========================")
      Para c1 := 1 ate 5 faca
           Escreva("Digite aqui a",c1,"° Questão: ")
           Leia(gabarito[c1])
           gabarito[c1] := Maiusc(gabarito[c1])
      FimPara
      
      LimpaTela
      Para c:= 1 ate 3 faca
           LimpaTela
           Escreval("=====================")
           Escreval("  Correção da Prova  ")
           Escreval("=====================")
           Escreva("Aluno ",c,": ")
           Leia(nome[c])
           Para c1:= 1 ate 5 faça
                Escreva("Questoes",c1," :")
                Leia(resp[c1])
                resp[c1] <- maiusc(resp[c1])
                Se(resp[c1] = gabarito[c1])entao
                   aluno[c] <- aluno[c] + 2
                FimSe
           FimPara
      FimPara
      LimpaTela
      Escreval("======================")
      Escreval("     NOTAS FINAIS     ")
      Escreval("======================")
      Para c := 1 ate 3 faca
           Escreval(nome[c], aluno[c]:4:2)
           mt <- mt + aluno[c]
      FimPara
       mt <- mt/3
      Escreval("======================")
      Escreva("A MÉDIA DA TURMA FOI:",mt:4:2)
      
fimalgoritmo