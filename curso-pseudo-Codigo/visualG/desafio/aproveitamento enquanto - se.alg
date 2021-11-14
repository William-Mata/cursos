algoritmo "semnome"
var
   qt,cont: inteiro
   nota, melhor_nota: real
   nome, melhor_nome: caracter
inicio
      Escreval("==================")
      Escreval("       WYDEN      ")
      Escreval("==================")
      Escreva("Quantos alunos tem: ")
      Leia(qt)
      cont <- 1
      Enquanto (cont <= qt)faca
          Escreval("---------------")
          Escreval("ALUNO", cont,"°")
          Escreva("NOME DO ALUNO: ")
          Leia(nome)
          Escreva("NOTA: ")
          Leia(nota)
          cont <- cont + 1
          Se (nota > melhor_nota)entao
            melhor_nota <- nota
            melhor_nome <- nome
          FimSe
      FimEnquanto

      Escreval("O melhor aproveitamento foi de ", melhor_nome," com a nota " , melhor_nota:2:2)
fimalgoritmo
