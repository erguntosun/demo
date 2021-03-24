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


INSERT INTO customer (company,prename,surname)VALUES ('Tosun Gmbh','Tosun','Ergun');
INSERT INTO customer (company,prename,surname)VALUES ('Basak Gmbh','Tosun','Basak');

INSERT INTO project (customer,titel,startdate,enddate)VALUES ('Ergun','Herr','01.01.2022','10.10.2022');
INSERT INTO project (customer,titel,startdate,enddate)VALUES ('Basak','Frau','01.01.2022','10.10.2022');

