
USE ABHINAV;

SELECT * FROM SYS.TABLES;

CREATE TABLE EMPL(
ID INT IDENTITY(1,1) PRIMARY KEY,
NAME VARCHAR(55)
);

/* 1.Add a column after creating the table */

ALTER TABLE EMPL
ADD TITLE VARCHAR(55);

SELECT * FROM EMPL;

/* 2.Adding more than one column after creating table */

ALTER TABLE EMPL
ADD AGE VARCHAR(3);

SELECT * FROM EMPL;

/* 3.Changing the datatypes of column after creating table */

ALTER TABLE EMPL
ALTER COLUMN AGE INT;

SELECT * FROM EMPL;

EXEC SP_HELP EMPL;

/* 4.Dropping one column */

ALTER TABLE EMPL
DROP COLUMN AGE;

EXEC SP_HELP EMPL;

/* 5.creating a table with Not Null and unique */
/* 8.creating table with primary key */

CREATE TABLE DEP(
ID INT IDENTITY(1,1) PRIMARY KEY,
NAME VARCHAR NOT NULL UNIQUE
);

EXEC SP_HELP DEP;

/* 6.Removing uniqueness from column */

ALTER TABLE DEP
DROP UQ__DEP__D9C1FA00794F2CC3;
EXEC SP_HELP DEP;


ALTER TABLE DEP
DROP PK__DEP__3214EC270F52CB12

EXEC SP_HELP DEP;


/* 7.Adding column with unique */

ALTER TABLE DEP
ADD USERNAME VARCHAR(55) UNIQUE;
EXEC SP_HELP DEP;


/* 9.Adding primary key to the existing column */

ALTER TABLE DEP
ADD PRIMARY KEY(ID);

EXEC SP_HELP DEP;

/* 12.Foreign key */

ALTER TABLE DEP
ADD E_ID INT FOREIGN KEY REFERENCES EMPL(ID);

SELECT * FROM DEP;



/* Problem statement- Store salary of each employees on monthly basis */

/*
CREATE TABLE SALARY(
TXN INT IDENTITY PRIMARY KEY,
FORWHICHMONTH DATETIME,
CREDITDATE DATETIME,
AMOUNT MONEY
);

CREATE TABLE BANK (
ACC_NO INT IDENTITY(10,1),
BANK_NAME VARCHAR(55),
);

CREATE TABLE EMPLOYEE(
EMP_ID INT IDENTITY(55,1),
NAME VARCHAR(55)
);
*/