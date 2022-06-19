CREATE VIEW vw_LivrosAutores -- CRIA A VIEW
AS SELECT l.NomeLivro AS Livro, -- COM AS COLUNAS Livro e Autor
a.NomeAutor AS Autor
FROM tbl_Livros AS l --
INNER JOIN tbl_Autores AS a ON l.IdAutor = a.IdAutor -- RETORNA AS CONSULTAR QUE TIVEREM CORRESPONDENCIA DE IDS


ALTER VIEW vw_LivrosAutores -- ALTERA A VIEW
AS SELECT l.NomeLivro AS Livro,
a.NomeAutor AS Autor,
l.PrecoLivro AS Preco -- FOI ADICIONADO A COLUNA Preco
FROM tbl_Livros AS l
INNER JOIN tbl_Autores AS a
ON a.IdAutor = l.IdAutor


DROP VIEW vw_LivrosAutores -- EXCLUI A VIEW

SELECT * FROM vw_LivrosAutores -- RETORNA OS REGISTROS DAS VIEWS