CREATE DATABASE recursos_humanos;

USE recursos_humanos;

CREATE TABLE funcionarios(
	id int not null auto_increment,
    nome varchar(45),
    cargo varchar(45),
    salario decimal(10,2),
    email varchar(45),
    PRIMARY KEY (id)
);

INSERT INTO funcionarios (nome, cargo, salario, email) VALUES ('Fernando', 'Analista', 2400, 'email@email.com');
INSERT INTO funcionarios (nome, cargo, salario, email) VALUES ('Carolina', 'Programadora', 2300, 'email@email.com');
INSERT INTO funcionarios (nome, cargo, salario, email) VALUES ('Lucas', 'Professor', 3000, 'email@email.com');
INSERT INTO funcionarios (nome, cargo, salario, email) VALUES ('Daniele', 'Aluna', 1000, 'email@email.com');
INSERT INTO funcionarios (nome, cargo, salario, email) VALUES ('Rafael', 'Professor', 3000, 'email@email.com');

SELECT * FROM funcionarios WHERE salario >= 2000;
SELECT * FROM funcionarios WHERE salario < 2000;

UPDATE funcionarios SET salario = 1500 WHERE id = 1;