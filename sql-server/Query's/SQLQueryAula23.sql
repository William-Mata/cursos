SELECT * FROM tbl_Livros AS l
LEFT JOIN tbl_Autores AS a ON a.IdAutor = l.IdAutor -- RETORNA TODOS OS REGISTROS MESMO QUE N�O HAJA CORRESPOND�NCIA NA TABELA � DIREITA

SELECT * FROM tbl_Livros AS l 
RIGHT JOIN tbl_Autores AS a ON a.IdAutor = l.IdAutor -- RETORNA TODOS OS REGISTROS MESMO QUE N�O HAJA CORRESPOND�NCIA NA TABELA � ESQUERDA
WHERE a.IdAutor IS NULL -- RETORNA OS REGISTROS DA TABELA A DIREITA QUE O ID � NULL