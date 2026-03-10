CREATE DATABASE bdEstoque
GO
USE bdEstoque

CREATE TABLE tbCliente(
	idCliente INT PRIMARY KEY IDENTITY (1,1),
	nomeCliente VARCHAR (50),
	cpfCliente CHAR (11),
	emailCliente VARCHAR (40),
	sexoCliente CHAR (1),
	dataNascCliente SMALLDATETIME
);

CREATE TABLE tbFornecedor(
	idFornecedor INT PRIMARY KEY IDENTITY (1,1),
	nomeFornecedor VARCHAR (50),
	contatoFornecedor VARCHAR (40)
);

CREATE TABLE tbVenda(
	idVenda INT PRIMARY KEY IDENTITY (1,1),
	dataVenda SMALLDATETIME,
	valorTotalVenda	MONEY,
	idCliente INT NOT NULL FOREIGN KEY
	REFERENCES tbCliente(idCliente)
);

CREATE TABLE tbFabricante(
	idFabricante INT PRIMARY KEY IDENTITY (1,1),
	nomeFabricante VARCHAR (50),
);

CREATE TABLE tbProduto(
	idProduto INT PRIMARY KEY IDENTITY (1,1),
	descricaoProduto VARCHAR (150),
	valorProduto MONEY,
	quantidadeProduto INT,
	idFabricante INT FOREIGN KEY REFERENCES tbFabricante (idFabricante),
	idFornecedor INT FOREIGN KEY REFERENCES tbFornecedor (idFornecedor)
);
CREATE TABLE tbItensVenda(
	idItensVenda INT PRIMARY KEY IDENTITY (1,1),
	quantidadeItensVenda INT,
	subTotalItensVenda INT,
	idVenda INT FOREIGN KEY REFERENCES tbVenda (idVenda),
	idProduto INT FOREIGN KEY REFERENCES tbProduto (idProduto)
);
	INSERT INTO tbCliente
	(nomeCliente, cpfCliente, emailCliente, sexoCliente, dataNascCliente)
	VALUES
	('Amando José Santana', '12345678900', 'amandojsantana'