algoritmo "CalculoIdade"
var
   ano_nasc, ano_atual, idade: Real
inicio
      Escreva("Em que não estamos?: ")
      Leia(ano_atual)
      Escreva("Em que ano nasceu?: ")
      Leia(ano_nasc)
      idade <- ano_atual - ano_nasc
      Escreva("Sua idade é", idade, " anos")
      Se(idade > 18)entao
         Escreva(" e você atingiu maioridade")
      Senao(idade < 18) entao
            Escreva(", ainda e da menoridade")
      FimSe

fimalgoritmo
