SELECT * FROM tbl_Livros

-- WITH TIES FAZ COM QUE RETORNE MAIS REGISTROS DO QUE FOI ESPECIFICADO NO TOP CASO TENHA ALGUM REGISTRO COM O MESMO VALOR 
SELECT TOP(3) WITH TIES NomeLivro, PrecoLivro FROM tbl_Livros 
ORDER BY PrecoLivro DESC


