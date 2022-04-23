Algoritmo "salario_novo_bonus"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 16/04/2021
Var
// Seção de Declarações das variáveis 
   nome :caractere
   anos :inteiro
   salario_novo, salario_antigo, bonus :real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
    escreva ("Digite seu nome: ")
    leia (nome)
    escreva ("Digite quantos anos você trabalha na empresa: ")
    leia (anos)
    escreva ("Digite seu salario para ser calculado o novo valor: ")
    leia (salario_antigo)
    
    se(anos >= 5) entao

            bonus <- 0.2 * salario_antigo
            salario_novo <- bonus + salario_antigo
            
    senao

         bonus <- 0.1 * salario_antigo
         salario_novo <- bonus + salario_antigo
         
    fimse
    
    escreval ("Sr(a)", nome)
    escreval ("Seu salario antigo é:", salario_antigo)
    escreval ("Seu salario novo é:", salario_novo)
    escreval ("Seu bonus foi de:", bonus)
    

Fimalgoritmo