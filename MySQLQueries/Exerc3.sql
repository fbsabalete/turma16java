CREATE DATABASE db_registro_escola;

CREATE TABLE alunos(
	id int not null auto_increment,
    nome varchar(45) not null,
    turma varchar(45),
    melhor_materia varchar(45),
    media_notas double,
    PRIMARY KEY (id)
);

INSERT INTO alunos (nome, turma, melhor_materia, media_notas) VALUES ('Fernando', '3D', 'Microcontroladores', 8.5);
INSERT INTO alunos (nome, turma, melhor_materia, media_notas) VALUES ('Jean', '3A', 'PHP', 9.0);
INSERT INTO alunos (nome, turma, melhor_materia, media_notas) VALUES ('Lucas', '3F', 'DB', 10);
INSERT INTO alunos (nome, turma, melhor_materia, media_notas) VALUES ('Raphael', '3G', 'Biologia', 6.0);
INSERT INTO alunos (nome, turma, melhor_materia, media_notas) VALUES ('Lucca', '3D', 'Filosofia', 6.5);

SELECT * FROM alunos WHERE media_notas >= 7;
SELECT * FROM alunos WHERE media_notas < 7;

UPDATE alunos SET media_notas = 8.5 WHERE id = 4;