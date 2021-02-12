CREATE DATABASE ecommerce;

CREATE TABLE produtos(
	id int not null auto_increment,
    nome varchar(45),
    preco decimal(10,2) not null,
    estoque int not null,
    categoria varchar(45),
    PRIMARY KEY (id)
);

INSERT INTO produtos (nome, preco, estoque, categoria) VALUES ('Arroz', 20, 100, 'Comida');
INSERT INTO produtos (nome, preco, estoque, categoria) VALUES ('Feijao', 10, 100, 'Comida');
INSERT INTO produtos (nome, preco, estoque, categoria) VALUES ('Detergente', 5, 100, 'Limpeza');
INSERT INTO produtos (nome, preco, estoque, categoria) VALUES ('Candida', 4, 100, 'Limpeza');
INSERT INTO produtos (nome, preco, estoque, categoria) VALUES ('Carne', 49.90, 100, 'Comida');
INSERT INTO produtos (nome, preco, estoque, categoria) VALUES ('Pote Plastico', 8, 100, 'Plasticos');

SELECT * FROM produtos WHERE preco > 500;
SELECT * FROM produtos WHERE preco < 500;
SELECT * FROM produtos;
UPDATE produtos SET preco = 600 WHERE id = 5;
UPDATE produtos SET estoque = 150;