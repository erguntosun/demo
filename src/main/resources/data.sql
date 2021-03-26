DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
    id   INT AUTO_INCREMENT PRIMARY KEY    ,
    company VARCHAR(128) NOT NULL,
	prename VARCHAR(128) NOT NULL,
	surname VARCHAR(128) NOT NULL
--	mail VARCHAR(128) NOT NULL
);

DROP TABLE IF EXISTS project;
CREATE TABLE project (
    id   INT AUTO_INCREMENT PRIMARY KEY    ,
    customer VARCHAR(128) NOT NULL,
	titel VARCHAR(128) NOT NULL,
	startdate VARCHAR(128) NOT NULL,
	enddate VARCHAR(128) NOT NULL
);

DROP TABLE IF EXISTS user;
CREATE TABLE user (
    id   INT AUTO_INCREMENT PRIMARY KEY    ,
    username VARCHAR(128) NOT NULL,
	password VARCHAR(128) NOT NULL,
	lastName VARCHAR(128) NOT NULL,
    firstName VARCHAR(128) NOT NULL,
    address VARCHAR(128) NOT NULL,
	role VARCHAR(128) NOT NULL
);


INSERT INTO customer (company,prename,surname)VALUES ('Tosun Gmbh','Tosun','Ergun');
INSERT INTO customer (company,prename,surname)VALUES ('Basak Gmbh','Tosun','Basak');

INSERT INTO project (customer,titel,startdate,enddate)VALUES ('Ergun','Herr','01.01.2022','10.10.2022');
INSERT INTO project (customer,titel,startdate,enddate)VALUES ('Basak','Frau','01.01.2022','10.10.2022');

INSERT INTO user (username,password,lastName,firstName,address,role)VALUES ('oykut','pass1234','Tosun','Oyku','Portougisestr No 1 BNA','ADMIN');
INSERT INTO user (username,password,lastName,firstName,address,role)VALUES ('cagant','pass1234','Tosun','Cagan','Baumstr No 1 Berlin','CONTROLLER');
INSERT INTO user (username,password,lastName,firstName,address,role)VALUES ('aliveli','pass1234','Ali','Veli','Herrstr. No 1 Bonn','EMPLOYEE');
