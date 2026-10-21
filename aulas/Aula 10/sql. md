````sql
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

create TABLE veiculo (
id int AUTO_INCREMENT PRIMARY KEY,
modelo VARCHAR(30),
placa VARCHAR(7),
id_pessoa int NOT NULL,
FOREIGN KEY (id_pessoa) REFERENCES pessoa(id)
);
```
