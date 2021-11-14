Algoritmo "Exercicio02-Prof-Aula01-Recode"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/09/2021
Var
   // Seção de Declarações das variáveis
   altura, peso, IMC: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   Escreva("Digite a sua altura: ")
   leia(altura)

   Escreva("Digite o seu peso: ")
   leia(peso)

   IMC <- (peso / (altura^2))

   se(IMC <18.5)entao

      escreval("Seu IMC é: ", IMC , ", você está abaixo do peso.")

   senao

      se((IMC >= 18.5) E (IMC <= 24.9))entao

         escreval("Seu IMC é: ", IMC , ", você está com o peso normal.")

      senao

         se((IMC >= 25) e (IMC <= 29.9))entao

            escreval("Seu IMC é: ", IMC , ", você está com sobrepeso.")

         senao

            se((IMC >= 30) e (IMC <= 34.9)) entao

               escreval("Seu IMC é: ", IMC , ", você está com Obesidade Grau I.")

            senao

               se((IMC >= 35) e (IMC <= 39.9))entao

                  escreval("Seu IMC é: ", IMC , ", você está com Obesidade Grau II.")

               senao

                  se(IMC >= 40)

                     escreval("Seu IMC é: ", IMC , ", você está com sobrepeso.")

                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
   
Fimalgoritmo