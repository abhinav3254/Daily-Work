

CREATE DATABASE QUESTION1;

USE QUESTION1;

-- BANK TABLE

CREATE TABLE BANK(
ACC_NUMBER INT IDENTITY(1001,1) PRIMARY KEY,
BANK_NAME VARCHAR(55) NOT NULL,
BANK_IFSC VARCHAR(55) NOT NULL,
AMOUNT MONEY NOT NULL,
CITY VARCHAR(25),
LAST_UPDATE TIMESTAMP
);

-- INSERT VALUES INTO BANK

INSERT INTO BANK(BANK_NAME,BANK_IFSC,AMOUNT,CITY) 
VALUES('AXIS BANK','AXIS0123456',2400,'KOLKATA');

SELECT * FROM BANK;

-- SECOND PERSON

CREATE TABLE PERSON(
ID INT IDENTITY(11,1) PRIMARY KEY,
P_NAME VARCHAR(55) NOT NULL,
P_CITY VARCHAR(22) NOT NULL,
P_GENDER VARCHAR(11) NOT NULL,
P_MOBILE VARCHAR(14) NOT NULL,
P_EMAIL VARCHAR(55) NOT NULL,
P_WORKING_DAY INT NOT NULL,
ACC_NUMBER INT FOREIGN KEY REFERENCES BANK(ACC_NUMBER),
REGISTER_DATE DATETIME
);



-- INSERT VALUES IN PERSON TABLE

INSERT INTO PERSON(P_NAME,P_CITY,P_GENDER,P_MOBILE,P_EMAIL,P_WORKING_DAY,ACC_NUMBER,REGISTER_DATE)
VALUES('AAYUSH KUMAR','KOLKATA','MALE','+91 1234567890','AAYUSH@GMAIL.COM',31,1001,GETDATE());

SELECT * FROM PERSON;

-- CREATING ATTENDANCE 

CREATE TABLE ATTENDANCE(
P_ID INT FOREIGN KEY REFERENCES PERSON(ID),
IN_TIME DATETIME NOT NULL,
OUT_TIME DATETIME NOT NULL
);

-- INSERT INTO ATTENDANCE

INSERT INTO ATTENDANCE(P_ID,IN_TIME,OUT_TIME)
VALUES(11,'2023-08-23 08:45:21',GETDATE());

SELECT * FROM ATTENDANCE;

-- CREATING SALARY 

CREATE TABLE SALARY(
TXN INT IDENTITY(555,1) PRIMARY KEY,
AMOUNT_CREDIT MONEY,
FOR_MONTH DATETIME,
CREDIT_DATE DATETIME,
P_ID INT FOREIGN KEY REFERENCES PERSON(ID),
LAST_UPDATE TIMESTAMP,
ACC_NO INT FOREIGN KEY REFERENCES BANK(ACC_NUMBER)
);

INSERT INTO SALARY(AMOUNT_CREDIT,FOR_MONTH,CREDIT_DATE,P_ID,ACC_NO)
VALUES(34000,'2023-07-31',GETDATE(),11,1001);

SELECT * FROM SALARY;
