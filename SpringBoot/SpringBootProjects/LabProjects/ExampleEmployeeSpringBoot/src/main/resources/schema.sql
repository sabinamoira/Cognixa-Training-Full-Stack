drop table emps if exists;

create table emps (
	id int(10) NOT NULL AUTO_INCREMENT,
	name varchar(100) NOT NULL,
	salary numeric (15,2),
	age int(10),
	PRIMARY KEY (id)	
);