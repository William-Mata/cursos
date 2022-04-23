Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/09/2021
Var
// Seção de Declarações das variáveis 
anoAtual, anoNascimento : inteiro
nome : caractere

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
anoAtual <- 2021

Escreval("Digite seu nome: ")
leia(nome)

Escreval("Digite seu ano de nascimento: ")
leia(anoNascimento)

Escreval(nome, " você tem ",(anoAtual - anoNascimento), " anos.")

Fimalgoritmo