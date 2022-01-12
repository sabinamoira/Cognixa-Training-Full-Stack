drop table BOOKS if exists;

CREATE TABLE BOOKS
(
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(100) NOT NULL,
    price numeric(15,2) DEFAULT NULL,
    PRIMARY KEY (id)
);

