Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 29/09/2021
Var
// Seção de Declarações das variáveis 
kmMedio, distancia, hora: real
nome : caractere


Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
Escreval("Digite o nome do piloto: ")
leia(nome)

Escreval("Digite o tempo que o piloto levo para percorre a pista: ")
leia(hora)

Escreval("Digite a distancia da pista percorrida pelo piloto: ")
leia(distancia)

kmMedio <- distancia / hora

Escreval("A velocidade média de ", nome, " foi " , kmMedio,"KM/H")


Fimalgoritmo