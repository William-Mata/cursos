Algoritmo "calcular_idade"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 17/04/2021
Var
// Seção de Declarações das variáveis 
idade_maior, idade, soma_maior_20 , c: inteiro
idade_media :real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   para c de 0 ate 4 faca
   
        escreva ("Digite a primeira idade: ")
        leia (idade)
        idade_media <- idade_media + idade
        
        se (idade > idade_maior) entao

             idade_maior <- idade

        fimse
        
        
        se (idade > 20) entao
        
           soma_maior_20 <- soma_maior_20 + 1

        fimse

   fimpara

   escreval
   escreval ("A maior idade digitada foi: ", idade_maior)
   escreval
   escreval ("A idade media é de: ", idade_media/5 :2:1)
   escreval
   escreval ("A quantidade de idade digitada maior que 20 anos foi de: ", soma_maior_20)

Fimalgoritmo