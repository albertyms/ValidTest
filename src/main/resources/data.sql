
DROP TABLE IF EXISTS person;

CREATE TABLE person (
    id int not null auto_increment,
    name varchar(55) not null,
    last_name varchar(15) not null,
    processing varchar(15),
    creation_date date,
    primary key (id)
);

INSERT INTO person (id,name,last_name,processing,creation_date) VALUES(1, 'albert1','medina1','false', NOW());
INSERT INTO person (id,name,last_name,processing,creation_date) VALUES(2, 'albert2','medina2','false', NOW());
INSERT INTO person (id,name,last_name,processing,creation_date) VALUES(3, 'albert3','medina3','false', NOW());