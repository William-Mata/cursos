algoritmo "f"
var
   n1, n2, cont:inteiro
   fib:real
Procedimento Fibonacci(Var a,b : inteiro)
Inicio
      Escreva(a,b)
      a := a + b
      b := b + a
FimProcedimento

inicio
      n1 := 0
      n2 := 1
      
      Para cont := 1 ate 5 faca
           Fibonacci(n1,n2)
      FimPara
      
      fib := n1 / n2
      Escreval("\nA DIVISÃO DOS DOIS ULTIMOS NÚMEROS FIBONACCI É: " ,fib:2:6)
fimalgoritmo
