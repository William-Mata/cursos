Algoritmo "Exercicio-Aula-01-Recode"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/09/2021
Var
   // Seção de Declarações das variáveis
   aprovado, recuperacao : logico

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreval("Digite verdadeiro se o aluno foi aprovado e falso se o aluno não foi aprovado: ")
   leia(aprovado)

   Escreval()

   Escreval("Digite verdadeiro se o aluno está de recuperação e falso se o aluno não está de recuperação: ")
   leia(recuperacao)

   Escreval()
   
   Se(aprovado)entao
   
        se(recuperacao)entao

         Escreval("Você ficou de recuperação por isso so irá viajar, não ira ganhar a bicicleta")

        senao

         Escreval("Você foi aprovado sem recuperação, vai viajar e ganhar a bicicleta!!!")

        Fimse

   Senao
   
        Escreval("Você foi reprovado, não irá viajar e nem ganhar a bicicleta")

   Fimse

Fimalgoritmo