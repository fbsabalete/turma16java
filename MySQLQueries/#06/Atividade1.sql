CREATE DATABASE db_generation_game_online;
use db_generation_game_online;
CREATE TABLE tb_personagens(
	id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    poder_ataque INT,
    poder_defesa INT,
    vitalidade INT,
    magia INT,
    classe_id BIGINT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (classe_id) REFERENCES tb_classes(id)
);
CREATE TABLE tb_classes(
	id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    tipo VARCHAR(45) NOT NULL,
    atributo VARCHAR(45) NOT NULL,
    PRIMARY KEY (id)
);
INSERT INTO tb_classes (nome, tipo, atributo) VALUES ("Mago", "Mágico", "Magia");
INSERT INTO tb_classes (nome, tipo, atributo) VALUES ("Arqueiro", "Ranger", "Agilidade");
INSERT INTO tb_classes (nome, tipo, atributo) VALUES ("Guerreiro", "Melee", "Força");
INSERT INTO tb_classes (nome, tipo, atributo) VALUES ("Cavaleiro", "Melee", "Força");
INSERT INTO tb_classes (nome, tipo, atributo) VALUES ("Feiticeiro", "Mágico", "Magia");

INSERT INTO tb_personagens(nome, poder_ataque, poder_defesa, vitalidade, magia, classe_id) VALUES ("Fernando", 1500, 2200, 3, 5, 3);
INSERT INTO tb_personagens(nome, poder_ataque, poder_defesa, vitalidade, magia, classe_id) VALUES ("Jean", 1000, 2500, 7, 3, 1);
INSERT INTO tb_personagens(nome, poder_ataque, poder_defesa, vitalidade, magia, classe_id) VALUES ("Kewin", 1800, 2500, 3, 5, 2);
INSERT INTO tb_personagens(nome, poder_ataque, poder_defesa, vitalidade, magia, classe_id) VALUES ("Marcelo", 1999, 5000, 3, 5, 5);
INSERT INTO tb_personagens(nome, poder_ataque, poder_defesa, vitalidade, magia, classe_id) VALUES ("Marcia", 500, 600, 3, 5, 4);
INSERT INTO tb_personagens(nome, poder_ataque, poder_defesa, vitalidade, magia, classe_id)  VALUES ("Maria", 1200, 1000, 3, 2, 3);
INSERT INTO tb_personagens(nome, poder_ataque, poder_defesa, vitalidade, magia, classe_id) VALUES ("Lucas", 3000, 3000, 5, 2, 2);
INSERT INTO tb_personagens(nome, poder_ataque, poder_defesa, vitalidade, magia, classe_id) VALUES ("Ronaldo", 2000, 1000, 3, 5, 2);

SELECT * FROM tb_personagens WHERE poder_ataque > 2000;
SELECT * FROM tb_personagens WHERE poder_defesa BETWEEN 1000 AND 2000;
SELECT * FROM tb_personagens WHERE nome LIKE "%c%";
SELECT tb_personagens.nome, poder_ataque, poder_defesa, tb_classes.nome, tb_classes.tipo, tb_classes.atributo 
	FROM tb_personagens 
	INNER JOIN tb_classes ON classe_id = tb_classes.id;
    
SELECT tb_personagens.nome, poder_ataque, poder_defesa, tb_classes.nome, tb_classes.tipo, tb_classes.atributo 
	FROM tb_personagens 
	INNER JOIN tb_classes ON classe_id = tb_classes.id WHERE tb_classes.nome = "Arqueiro";


