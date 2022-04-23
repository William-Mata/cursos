Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 05/10/2021
Var
   // Seção de Declarações das variáveis
   resultado, num: inteiro
   altura, peso, IMC : real
   operacao : inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   operacao <- 3;

   enquanto operacao > 2 faca
   
      Escreval("======= Menu de Operações =======")
      Escreval("Digite 0 - Fechar, 1 - IMC, 2 - Fatorial")

      Escreva("Escolha a Operação deseja: ")
      Leia(operacao)


      escolha(operacao)

      caso 0
         escreval("O programa foi finalizado")

      caso 1
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

      caso 2

         Escreva("Digite o numero do fatorial que deseja ver: ")
         leia(num)

         Escreva("Fatorial de",num,": ")

         resultado <- num * (num - 1)
         escreva(num," X ")

         enquanto num > 1 faca

            num <- num - 1

            se num >= 2 entao
               resultado <- resultado * (num-1)
               escreva(num," X ")


            senao num = 1 entao
               resultado <- resultado * num
               escreva(num, " = ", resultado)

            fimse

         fimenquanto

      outrocaso
         escreval("Operação inválida.")

      fimescolha
      escreval()
   fimenquanto
Fimalgoritmo