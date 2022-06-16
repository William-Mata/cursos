SELECT a.IdAutor, NomeLivro, PrecoLivro, NomeAutor, SobreNome  FROM tbl_Livros as l
INNER JOIN tbl_Autores as a  -- JUNTA OS REGISTROS DA TABELA ONDE OS CAMPOS COMPARADOS FOREM IGUAIS
ON a.IdAutor = l.IdAutor -- CAMPO DE COMPARAÇÃO 
 