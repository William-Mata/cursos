SELECT * FROM tbl_Autores
WHERE NomeAutor LIKE 'W%' -- SELECIONA OS REGISTRO QUE COME�AM COM W, % FAZ REFERENCIA A N CARACTERES

SELECT * FROM tbl_Autores
WHERE SobreNome LIKE '%A' -- SELECIONA OS REGISTRO QUE TERMINAM COM A  

SELECT * FROM tbl_Autores 
WHERE SobreNome LIKE 'MAT_' -- SELECIONA OS REGISTRO QUE TENHA OS MESMO CARACTERES E MAIS UM OUTRO QUE COMPLETE A PALAVRA,
-- _ FAZ REFERENCIA A UM UNICO CARACTERE

SELECT * FROM tbl_Autores 
WHERE SobreNome LIKE '_ATA' 

SELECT * FROM tbl_Autores 
WHERE SobreNome LIKE 'MAT[A-O]' -- SELECIONA OS REGISTRO QUE TENHA OS MESMO CARACTERES E MAIS UM OUTRO NO INTERVALO 
--ESPECIFICADO E QUE COMPLETE A PALAVRA, [] FAZ REFERENCIA A UM UNICO CARACTERE EM UM INTERVALO ESPECIFICO

SELECT * FROM tbl_Autores 
WHERE SobreNome LIKE 'MAT[^O-Z]' -- SELECIONA OS REGISTRO QUE TENHA OS MESMO CARACTERES E MAIS UM OUTRO QUE N�O ESTEJA NO INTERVALO 
--ESPECIFICADO E QUE COMPLETE A PALAVRA, [^] FAZ REFERENCIA A UM UNICO CARACTERE EM UM INTERVALO ESPECIFICO

SELECT * FROM tbl_Autores
WHERE NomeAutor NOT LIKE 'W%' -- SELECIONA OS REGISTRO QUE N�O COME�AM COM W, % FAZ REFERENCIA A N CARACTERES

SELECT * FROM tbl_Autores 
WHERE SobreNome NOT LIKE 'MAT_' -- SELECIONA OS REGISTRO QUE N�O TENHA OS MESMO CARACTERES E MAIS UM OUTRO QUE COMPLETE A PALAVRA,
-- _ FAZ REFERENCIA A UM UNICO CARACTERE

SELECT * FROM tbl_Autores 
WHERE SobreNome NOT LIKE 'MAT[A-O]' -- SELECIONA OS REGISTRO QUE N�O TENHA OS MESMO CARACTERES E MAIS UM OUTRO NO INTERVALO 
--ESPECIFICADO E QUE COMPLETE A PALAVRA, [] FAZ REFERENCIA A UM UNICO CARACTERE EM UM INTERVALO ESPECIFICO

SELECT * FROM tbl_Autores 
WHERE SobreNome NOT LIKE 'MAT[^O-Z]' -- SELECIONA OS REGISTRO QUE N�O TENHA OS MESMO CARACTERES E MAIS UM OUTRO QUE N�O ESTEJA NO INTERVALO 
--ESPECIFICADO E QUE COMPLETE A PALAVRA, [^] FAZ REFERENCIA A UM UNICO CARACTERE EM UM INTERVALO ESPECIFICO
