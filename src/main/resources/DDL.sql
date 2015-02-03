create table EMAIL
(
 	id integer not null primary key,
	primaryEmail varchar(200),
	secondaryEmail varchar(200)
);

create table ACCOUNT
(
 	id integer not null primary key,
	username varchar(60),
	password varchar(60)
);

insert into EMAIL (id,primaryEmail,secondaryEmail) values(10000,'a@a.com','a1@a.com');
	