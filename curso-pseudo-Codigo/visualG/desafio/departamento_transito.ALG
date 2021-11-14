Algoritmo "Departamento_transito"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 18/04/2021
Var
// Seção de Declarações das variáveis 
 qtd_acidente, ano_nasc, procedencia, qtd_menor_21 :inteiro
 qtd_mulher_cpt, mot_int_maior_60, mulher_maior_60, c : inteiro
 sexo :caractere
 porcentagem_menor_21 :real
 
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

   escreva("Quantidade de acidente que deseja cadastrar: ")
   leia (qtd_acidente)
   
   para c de 1 ate qtd_acidente faca
   
        escreval
        escreva("Digite o ano de nascimento: ")
        leia (ano_nasc)
        
        escreva("SEXO - 'M' para Masculino e 'F' para Femenino: ")
        leia (sexo)
        
        escreva("PROCEDÊNCIA: 0 - CAPITAL, 1 - INTERIOR E 2 - OUTRO ESTADO: ")
        leia(procedencia)
        
        se(2021 - ano_nasc < 21) entao
        
                qtd_menor_21 <- qtd_menor_21  +1
                
        fimse
        
        se((procedencia = 0) e (sexo = "F")) entao
        
            qtd_mulher_cpt <- qtd_mulher_cpt + 1

        fimse
        
        se((procedencia = 2) e (2021 - ano_nasc > 60)) entao
        
              mot_int_maior_60 <- mot_int_maior_60 + 1

        fimse
        
        se((2021 - ano_nasc > 60) e (sexo = "F")) entao
        
                mulher_maior_60 <- mulher_maior_60 + 1

        fimse

   fimpara
   
   escreval
   escreval("### Porcentagem motorista menores de 21 anos ###")
   porcentagem_menor_21 <- ((qtd_menor_21 / qtd_acidente) * 100)
   escreval("   ",porcentagem_menor_21 :2:2,"%")
   
   escreval
   escreval("### Quantidade de mulheres motoristas da capital ###")
   escreval("   ",qtd_mulher_cpt)
   escreval
   
   escreval
   escreval("### Quantidade de motoristas do interior com idade maior que 60 anos ###")
   escreval("   ",mot_int_maior_60)
   escreval

   escreval
   escreval("### Quantidade de mulheres motoristas com idade maior que 60 anos ###")
   escreval("   ",mulher_maior_60)
   escreval

Fimalgoritmo