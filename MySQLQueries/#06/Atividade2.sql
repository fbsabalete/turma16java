CREATE DATABASE db_pizzaria_legal;
use db_pizzaria_legal;
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

INSERT INTO tb_categoria (nome) VALUES ("Salgada");
INSERT INTO tb_categoria (nome) VALUES ("Doce");

INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Frango com Catupiry", 40, 1);
INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Banana", 35, 2);
INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Pepperoni", 50, 1);
INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Chocolate com morango", 45, 2);
 
SELECT * FROM tb_produto WHERE preco > 45;

SELECT * FROM tb_produto WHERE preco between 29 AND 60;
SELECT * FROM tb_produto WHERE nome LIKE "%c%";
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id;
SELECT tb_produto.nome, tb_produto.preco, tb_categoria.nome FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id WHERE tb_categoria.nome = "Salgada";

