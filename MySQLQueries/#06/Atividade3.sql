CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

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

INSERT INTO tb_categoria (nome) VALUES ("Cosméticos");
INSERT INTO tb_categoria (nome) VALUES ("Cuidados");
INSERT INTO tb_categoria (nome) VALUES ("Higiene");
INSERT INTO tb_categoria (nome) VALUES ("Remédios");

INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Ranitidina", 40, 4);
INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Creme Hidratante", 60, 2);
INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Lenço Umidecido", 10, 3);
INSERT INTO tb_produto (nome, preco, categoria_id) VALUES ("Maquiagem", 55, 1);

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome LIKE "%B%";
SELECT tb_produto.nome, tb_produto.preco, tb_categoria.nome
FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id;

SELECT tb_produto.nome, tb_produto.preco, tb_categoria.nome
FROM tb_produto INNER JOIN tb_categoria ON tb_produto.categoria_id = tb_categoria.id WHERE tb_categoria.nome = "Higiene";



