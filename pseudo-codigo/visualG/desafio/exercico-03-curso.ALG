Algoritmo "Exercicio - 03"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/09/2021
Var
   // Seção de Declarações das variáveis

   poupanca, fundo, valor, tipoInvestimento, valorComInvestimento : real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   poupanca <-0.05
   fundo <-0.10



   Escreva("Digite 1 para  poupanca e 2 para fundo: ")
   Leia(tipoInvestimento)
   Escreval()
   Escreva("Digite o valor que deseja Investir: ")
   Leia(valor)
   Escreval()

   Se((tipoInvestimento = 1) OU (tipoInvestimento = 2))entao

      Se(tipoInvestimento = 1)entao

      valorComInvestimento <- valor + (valor * poupanca)

      Escreval("O seu saldo com o investimento na Poupança é: ", valorComInvestimento)

      Senao Se(tipoInvestimento = 2)entao

      valorComInvestimento <- valor + (valor * fundo)
      Escreval("O seu saldo com o investimento noFundo de Renda Fixa é: ", valorComInvestimento)
       
      Fimse

   Senao
        Escreval("Tipo de investimento Inválido")
   FimSe
'

Fimalgoritmo