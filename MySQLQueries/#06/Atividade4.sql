CREATE DATABASE cidade_das_carnes;

use cidade_das_carnes;

CREATE TABLE  tb_categoria(
	id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45),
    PRIMARY KEY (id)
);
CREATE TABLE tb_produto(
	id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45),
    preco DECIMAL(10,2),
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria (nome) VALUES ("Bovino");
INSERT INTO tb_categoria (nome) VALUES ("Suíno");
INSERT INTO tb_categoria (nome) VALUES ("Aves");
INSERT INTO tb_categoria (nome) VALUES ("Doces");

INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Costela de porco", 65, 2);
INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Picanha", 60, 1);
INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Frangão", 50, 3);
INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Doce de leite", 10, 4);

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome LIKE "%B%";
SELECT tb_produto.nome, tb_produto.preco, tb_categoria.nome
FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id;

SELECT tb_produto.nome, tb_produto.preco, tb_categoria.nome
FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id WHERE tb_categoria.nome = "Higiene";