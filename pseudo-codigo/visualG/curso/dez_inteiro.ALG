Algoritmo "dez_inteiro"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/04/2021
Var
// Seção de Declarações das variáveis 
   num, num_par :vetor [1..10] de inteiro
   maior_valor, menor_valor, qtd_maior_media, c :inteiro
   media :real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
   menor_valor <- 1
   
   para c de 1 ate 10 faca
        escreva("Digite o",c,"° valor: ")
        leia (num[c])
        
        media <- media + num[c]
        
        se (num[c] > maior_valor) entao
        
           maior_valor <- num[c]

        fimse
        
        se (num[c] < menor_valor)entao
        
           menor_valor <- num[c]

        fimse
        
        se (num[c] % 2 = 0)entao

           num_par[c] <- num[c]
           
        fimse
        
   fimpara

   media <- media/10
   
   c <-1
   escreval("### Números Digitados ###")
   
   para c de 1 ate 10 faca
   
       escreva(num[c],",")
       
   fimpara
   
   escreval
   c <-1
   escreval("### Números pares ###")
   
   para c de 1 ate 10 faca

       escreva(num_par[c],",")

   fimpara
   
   escreval
   escreval("### Maior Valor Entre os Números ###")
   
   escreva(maior_valor)
   
   escreval
   escreval("### Menor Valor Entre os Números ###")

   escreva(menor_valor)
   
   escreval
   escreval("### Media Dos Valores Digitados ###")

   escreva(media)
   
   escreval
   escreval("### Maior Valores Que a Media  ###")
   c <- 1

   para c de 1 ate 10 faca

      se (num[c] > media) entao

        qtd_maior_media <- qtd_maior_media + 1

        escreva(num[c],",")
        
      fimse

   fimpara

   escreval
   escreval("### Quantos Valores Maior Que a Media  ###")
   
   escreva(qtd_maior_media)

Fimalgoritmo