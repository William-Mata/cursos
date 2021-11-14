Algoritmo "nota_media_alunos"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 17/04/2021
Var
// Seção de Declarações das variáveis 
nota, c, c2, media :inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   para c de 1 ate 10 faca

        escreva ("Digite a", c,"° nota: ")
        leia (nota)
        
        se ((nota <= 10) e (nota >= 0)) entao
        
           media <- media+nota

        senao
        
             escreval("Nota fora do padrão, digite uma nota de 0 à 10.")
             c2 <- c2+1
             
        fimse
        

   fimpara
   
   escreval ("A media das notas dos alunos foram de: ", media/(c-c2))
Fimalgoritmo