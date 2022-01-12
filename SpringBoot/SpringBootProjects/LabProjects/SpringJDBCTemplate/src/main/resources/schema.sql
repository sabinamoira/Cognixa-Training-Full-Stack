drop table books if exists;

create table books (
	id int(10) NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
	price numeric (15,2),
	PRIMARY KEY (id)	
);