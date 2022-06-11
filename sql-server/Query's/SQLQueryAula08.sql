SELECT * FROM tbl_Autores -- BUSCA TODOS OS DADOS DA TABALE

INSERT INTO tbl_Autores (IdAutor, NomeAutor, SobreNome) -- INSERI NOVOS REGISTROS NA TABELA
VALUES (1, 'WILLIAM', 'MATA'), -- VARIOS VALORES DE UMA SO VEZ
(2, 'WALACE', 'MATA'),
(3, 'ALEX', 'MATA'), 
(4, 'NINA', 'FERREIRA'), 
(5, 'SOLANGE', 'MATA') 


SELECT * FROM tbl_Editoras

INSERT INTO tbl_Editoras (NomeEditora)
VALUES ('GLOBO'), ('SARAIVA'), ('CASA DO CODIGO'), ('THE NEW YORK TIME')

SELECT * FROM tbl_Livros

INSERT INTO tbl_Livros (NomeLivro, ISBN, DataPublicacao, PrecoLivro, IdAutor, IdEditora)
VALUES ('C#', 312312321, GetDate(), 70.50, 4, 4),
('HTML', 4124213123, GetDate(), 88.99, 5, 1),
('ANGULAR JS', 4123123312, GetDate(), 80.00, 1, 3),
('BOOTSTRAP', 9785224455, GetDate(), 99.90, 2, 2)
