/*
creating table demo_table
*/

create table demo_table(
id int IDENTITY primary key,
name varchar(55),
age int
);

/*Inserting value in DEMO_TABLE */

INSERT INTO DEMO_TABLE(name,age) values ('Ajay Vishwakarma',22);
INSERT INTO DEMO_TABLE(name,age) values ('Devgan',26);
INSERT INTO DEMO_TABLE(name,age) values ('Lokesh',32);
INSERT INTO DEMO_TABLE(name,age) values ('Raghavendra',45);
INSERT INTO DEMO_TABLE(name,age) values ('Mukesh',14);
INSERT INTO DEMO_TABLE(name,age) values ('Rakesh',86);
INSERT INTO DEMO_TABLE(name,age) values ('Pooja',22);
INSERT INTO DEMO_TABLE(name,age) values ('Priya',24);

INSERT INTO DEMO_TABLE(name,age) values ('RAJESH',45);
INSERT INTO DEMO_TABLE(name,age) values ('USMAN',78);
INSERT INTO DEMO_TABLE(name,age) values ('YASH',39);
INSERT INTO DEMO_TABLE(name,age) values ('KRITIKA',22);
INSERT INTO DEMO_TABLE(name,age) values ('LOWERENCE BISHNOI',22);



/* Printing all the data */

SELECT * from DEMO_TABLE;

/* DOING OPERATIONS */

SELECT * FROM DEMO_TABLE WHERE ID>5;

/* TRUNCATE TABLE */

TRUNCATE TABLE DEMO_TABLE;

/* DROP THE TABLE */


DROP TABLE DEMO_TABLE;

/* SELECTING ALL THE TABLES FROM THE DATABASES */

SELECT * FROM SYS.TABLES;


/* CREATING TABLE SIGNUP */

CREATE TABLE SIGNUP(
ID INT IDENTITY(5555,1) PRIMARY KEY,
NAME VARCHAR(55),
EMAIL VARCHAR(55),
PASSWORD VARCHAR(55),
ADDRESS VARCHAR(100),
PHONE VARCHAR(14),
BIRTHDATE DATE,
GENDER CHAR(1),
DTOFCREATION DATE
);


/* INSERT VALUES INTO SIGNUP TABLE */
INSERT INTO SIGNUP(NAME,EMAIL,PASSWORD,ADDRESS,PHONE,BIRTHDATE,GENDER,DTOFCREATION) 
VALUES ('AJAY RATHOR','AJAY@GMAIL.COM','1234','SECTOR-2 NEW DELHI','+91 9999444412','2000-11-02','M','2023-08-17'),
('MOHAN KUMAR','MOHAN@GMAIL.COM','1234','ROAD NUMBER 22 KOLKATA','+91 9999444412','2000-11-02','M','2023-08-17'),
('ROHAN KUMAR','ROHAN@GMAIL.COM','1234','TIKASI HILLS JHARKHAN','+91 9999444412','2000-11-02','M','2023-08-17'),
('SURESH KUMAR','SURESH@GMAIL.COM','1234','RING ROAD GT ROAD GAYA','+91 9999444412','2000-11-02','M','2023-08-17'),
('KRITIKA PASWAN','MOHAN@GMAIL.COM','1234','TANKER ROAD SECTOR-9 VARANSI U.P.','+91 9999444412','2000-11-02','M','2023-08-17'),
('UMESH KUMAR','UMESH@GMAIL.COM','1234','ARERA COLONY BHOPAL','+91 9999444412','2000-11-02','M','2023-08-17'),
('TUSHAR DESHPANDE','MOHAN@GMAIL.COM','1234','ROAD NUMBER 22 KOLKATA','+91 9999444412','2000-11-02','M','2023-08-17'),
('MOHAN KUMAR','MOHAN@GMAIL.COM','1234','ROAD NUMBER 22 KOLKATA','+91 9999444412','2000-11-02','M','2023-08-17');

/* GETTING ALL THE TABLE VALUES */

SELECT * FROM SIGNUP;

/* UPDATE TABLE DATA */

UPDATE SIGNUP
SET GENDER = 'F'
WHERE ID = 5559;
