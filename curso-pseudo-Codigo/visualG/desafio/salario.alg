algoritmo "semnome"
var
   nome: Caracter
   sal, dep, nvsal: Real
inicio
      Escreva("Digite o Nome do Funcionario: ")
      Leia(nome)
      Escreva("Digite o Salario do Funcionario: ")
      Leia(sal)
      Escreva("Digite a Quantidade de Dependentes: ")
      Leia(dep)
      Escolha dep
              Caso 0
                   nvsal <- sal + (sal*6/100)
              Caso 1, 2
                   nvsal <- sal + (sal*12/100)
              Caso 3, 4
                   nvsal <- sal + (sal*18/100)
              Caso 5, 6
                   nvsal <- sal + (sal*24/100)
              Outrocaso
                   nvsal <- sal + (sal*30/100)
     FimEscolha
     Escreval("Sr ", nome, " Seu novo salario é de R$",nvsal)
fimalgoritmo

