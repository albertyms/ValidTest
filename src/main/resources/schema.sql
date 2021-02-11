DROP TABLE IF EXISTS person;

CREATE TABLE person (
    id int not null auto_increment,
    name varchar(55) not null,
    last_name date,
    process varchar(15),
    creation_date date,
    primary key (id)
);
