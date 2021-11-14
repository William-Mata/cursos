Algoritmo "salario_saque"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/04/2021
Var
// Seção de Declarações das variáveis 
 salario, qtd_notas100, qtd_notas50, qtd_notas20, qtd_notas10, qtd_notas5 :inteiro
 qtd_notas2, qtd_notas200, qtd_notas_total: inteiro

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   escreva("Digite o seu salario para saque, apenas números inteiro: ")
   leia(salario)
   
   enquanto (salario > 0) faca
   
            se (salario >= 200) entao
               salario <- salario - 200
               qtd_notas200 <- qtd_notas200 + 1
            senao
            
               se (salario >= 100) entao
                  salario <- salario - 100
                  qtd_notas100 <- qtd_notas100 + 1
               senao
                  
                   se (salario >= 50) entao
                      salario <- salario - 50
                      qtd_notas50 <- qtd_notas50 + 1
                   senao

                        se (salario >= 20) entao
                           salario <- salario - 20
                           qtd_notas20 <- qtd_notas20 + 1
                        senao
                        
                              se (salario >= 10) entao
                                 salario <- salario - 10
                                 qtd_notas10 <- qtd_notas10 + 1
                              senao

                                    se (salario >= 5) entao
                                       salario <- salario - 5
                                       qtd_notas5 <- qtd_notas5 + 1
                                    senao
                                           se (salario >= 2) entao
                                              salario <- salario - 2
                                              qtd_notas2 <- qtd_notas2 + 1
                                           fimse
                                           
                                    fimse

                              fimse

                        fimse

                   fimse
                  
               fimse
               
            fimse
        
   fimenquanto

   qtd_notas_total <- (qtd_notas200 + qtd_notas100 + qtd_notas50 + qtd_notas20 + qtd_notas10 + qtd_notas5 + qtd_notas2)

   escreval
   escreval("A Quantidade de notas de 200 foram de: ", qtd_notas200)
   
   escreval
   escreval("A Quantidade de notas de 100 foram de: ", qtd_notas100)

   escreval
   escreval("A Quantidade de notas de 50 foram de: ", qtd_notas50)
   
   escreval
   escreval("A Quantidade de notas de 20 foram de: ", qtd_notas20)
   
   escreval
   escreval("A Quantidade de notas de 10 foram de: ", qtd_notas10)
   
   escreval
   escreval("A Quantidade de notas de 5 foram de: ", qtd_notas5)
   
   escreval
   escreval("A Quantidade de notas de 2 foram de: ", qtd_notas2)

   escreval
   escreval("A Quantidade de notas de total foram de: ", qtd_notas_total)
Fimalgoritmo