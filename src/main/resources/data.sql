DROP TABLE IF EXISTS customer;
CREATE TABLE customer (
    id   INT AUTO_INCREMENT PRIMARY KEY    ,
    company VARCHAR(128) NOT NULL,
	prename VARCHAR(128) NOT NULL,
	surname VARCHAR(128) NOT NULL,
	eMail VARCHAR(128) NOT NULL

);

INSERT INTO customer (company,prename,surname,eMail)VALUES ('Tosun Gmbh','Tosun','Ergun','etosun@gmail.com');

