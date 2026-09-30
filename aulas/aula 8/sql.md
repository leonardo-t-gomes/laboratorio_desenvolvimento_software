```sql
create database BDAula01;

show databases;

use bdaula01;

CREATE TABLE pessoa(
id int auto_increment PRIMARY KEY,
nome varchar(50) NOT NULL,
sexo varchar(1) NOT NULL,
idioma varchar(10) NOT NULL
);

show tables;
DESC pessoa;

INSERT INTO pessoa (nome, sexo, idioma)
VALUES
("Ricardo", "M", "Português"),
("Rafael", "M", "Português"),
("Antony", "M", "Português"),
("Joe", "M", "Espanhol"),
("Mary", "F", "Inglês");

select * from pessoa;
````
