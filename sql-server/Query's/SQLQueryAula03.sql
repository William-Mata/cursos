CREATE DATABASE CursoSqlServer -- COMANDO PARA CRIAR O BANCO DE DADOS
ON PRIMARY(
NAME = CursoSqlServer, --NOME DO BANCO DE DADOS
FILENAME='C:\SQL\CursoSqlServe.MDF', -- LOCAL ONDE O BANCO DE DADOS FICARA
SIZE=6MB, -- TAMANHO DO BANCO DE DADOS
MAXSIZE=15MB, -- TAMANHO M�XIMO DO BANCO DE DADOS
FILEGROWTH=10% -- TAMANHO AUMENTA DE 10 EM 10%
)

USE db_CursoSqlServer -- COMANDO PARA USAR O BANCO DE DADOS 

SP_HELPDB db_CursoSqlServer -- COMANDO PARA VER INFORMA��ES DO BANCO DE DADOS
