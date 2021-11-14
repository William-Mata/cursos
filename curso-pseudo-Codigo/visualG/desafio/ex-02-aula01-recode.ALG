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

   Escolha (IMC) entao

   caso (<18.5)

      escreval("Seu IMC é: ", IMC , ", você está abaixo do peso.)

   caso (>=18.5 e <= 24.9)

      escreval("Seu IMC é: ", IMC , ", você está com o peso normal.)

   caso (>=25 e <= 29.9)

      escreval("Seu IMC é: ", IMC , ", você está com sobrepeso.)

   caso (>=30 e <= 34.9)

      escreval("Seu IMC é: ", IMC , ", você está com Obesidade Grau I.)

   caso (>=35 e <= 39.9)

      escreval("Seu IMC é: ", IMC , ", você está com Obesidade Grau II.)

   caso (>=40)

      escreval("Seu IMC é: ", IMC , ", você está com sobrepeso.)

   fimescolha
   
Fimalgoritmo