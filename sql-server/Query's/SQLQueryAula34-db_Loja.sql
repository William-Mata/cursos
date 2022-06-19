-- BANCO LOJA
CREATE DATABASE db_Loja
ON PRIMARY(NAME = db_Loja,
FILENAME = 'C:\SQL\db_Loja.MDF',
SIZE = 10MB,
MAXSIZE = 15MB,
FILEGROWTH = 10%
)

-- TABELA CLIENTES
CREATE TABLE tbl_Clientes(
IdCliente SMALLINT PRIMARY KEY IDENTITY (100,1),
NomeCliente VARCHAR(25)NOT NULL,
CPF VARCHAR(15) UNIQUE NOT NULL
)

--TABELA PRODUTO
CREATE TABLE tbl_Produtos(
IdProduto SMALLINT PRIMARY KEY IDENTITY,
NomeProduto VARCHAR(25)NOT NULL,
PrecoProduto MONEY NOT NULL
)

-- TABELA COMPRAS
CREATE TABLE tbl_Compras(
ID_COMPRA SMALLINT PRIMARY KEY IDENTITY,
Quantidade SMALLINT,
IdProduto SMALLINT NOT NULL,
IdCliente SMALLINT NOT NULL
)

-- CONSTARINTS
ALTER TABLE tbl_Compras
ADD CONSTRAINT FK_ID_CLIENTE FOREIGN KEY (IdCliente)
REFERENCES tbl_Clientes

ALTER TABLE tbl_Compras
ADD CONSTRAINT FK_ID_PRODUTO FOREIGN KEY (IdProduto)
REFERENCES tbl_Produtos

-- DADOS DO CLIENTE
INSERT INTO tbl_Clientes (NomeCliente,CPF) VALUES ('ANDERSON',32003705805)
INSERT INTO tbl_Clientes (NomeCliente,CPF) VALUES ('ANDREA',41011103586)
INSERT INTO tbl_Clientes (NomeCliente,CPF) VALUES ('GABRIEL',22230150687)
INSERT INTO tbl_Clientes (NomeCliente,CPF) VALUES ('ALANA',85003204689)
INSERT INTO tbl_Clientes (NomeCliente,CPF) VALUES ('ELIZANGELA',66601204689)
INSERT INTO tbl_Clientes (NomeCliente,CPF) VALUES ('ANGELUZA',55589222235)
INSERT INTO tbl_Clientes (NomeCliente,CPF) VALUES ('CICERO',44486224978)

-- DADOS DOS PRODUTOS
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('PEDRIVER',20.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('TECLADO',35.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('MOUSE',25.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('HD500GB',200.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('SSD250GB',150.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('WEBCAN',30.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('DVD',5.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('CABO USB',50.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('CABO HDMT',60.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('PLACA DE VIDEO',600.00)
INSERT INTO tbl_Produtos (NomeProduto,PrecoProduto) VALUES ('PLACA DE REDE',100.00)


-- DADOS
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (3,100,1)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (2,102,3)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (4,101,9)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (3,101,8)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (1,106,5)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (3,103,7)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (5,105,5)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (1,100,10)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (2,104,1)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (5,104,3)
INSERT INTO tbl_Compras (Quantidade,IdCliente,IdProduto) VALUES (1,102,11)