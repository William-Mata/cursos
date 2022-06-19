SELECT (SELECT 'William') AS SubConsulta -- RETORNA UMA SUB CONSULTA

SELECT Resultado.Cliente, SUM(Resultado.Total) AS Total FROM -- QUERY E OS ATRIBUTOS
(SELECT cl.NomeCliente AS Cliente,
 pr.NomeProduto AS Produto,
 pr.PrecoProduto AS Preco,
 co.Quantidade, (PrecoProduto * Quantidade) AS Total -- SUB QUERY
	FROM tbl_Compras AS co
	INNER JOIN tbl_Clientes AS cl
	ON cl.IdCliente = co.IdCliente
	INNER JOIN tbl_Produtos AS pr
	ON pr.IdProduto = co.IdProduto
) AS Resultado -- RESULTADO DA SUB QUERY
GROUP BY Resultado.Cliente
ORDER BY Total

SELECT * FROM tbl_Clientes
SELECT * FROM tbl_Compras
SELECT * FROM tbl_Produtos