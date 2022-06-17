CREATE TABLE tbl_Produtos
(codProduto smallint, NomeProduto varchar(20), Quantidade smallint, Preco money, Total AS (Preco * Quantidade)) -- CAMPO CALCULADO, TOTAL RECEBERA O VALOR DA MULTIPLICAÇÃO AUTOMATICAMENTE QUANDO FOR INSERIDO DADOS NO REGISTRO

SELECT * FROM tbl_Produtos

INSERT INTO tbl_Produtos 
VALUES (125, 'TECLADO', 5, 15.50), -- TOTAL TERA 77.50
 (120, 'MOUSE', 5, 10.00), -- TOTAL TERA 50.00
 (50, 'PENDRIVE', 5, 25.00), -- TOTAL TERA 125.00
 (75, 'PC', 5, 2500.00) -- TOTAL TERA 12500.00

 SELECT SUM(Total) FROM tbl_Produtos