SELECT * FROM Escritorio
WHERE idEscritorio = 26

UPDATE Escritorio -- ALTERA O VALOR DA TABELA
SET isAtivo = 0 -- ALTERA APENAS O CAMPO INFORMADO COM O VALOR INFORMADO
WHERE idEscritorio = 26 -- ONDE O ID FOR IGUAL AO INFORMADO


UPDATE Escritorio 
SET isAtivo = 0 , nomeEscritorio = 'Procon C6' -- ALTERA OS DOIS CAMPOS INFORMADOS PODENDO TER 'N' CAMPOS DE ACORDO COM OS CAMPOS DO REGISTRO
WHERE idEscritorio = 26