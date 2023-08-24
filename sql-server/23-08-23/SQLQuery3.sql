
use AUG23;

-- creating employee


create table employee(
emp_id int identity(1,1) primary key,
firstname varchar(55),
lastname varchar(55),
age int,
salary money
); 

-- creating a employee_contact

create table employee_contact(
contact_id int identity(199,1) primary key,
emp_id int foreign key references employee(emp_id),
email varchar(55),
phone varchar(20)
);

-- inserting the data 

insert into employee(firstname,lastname,age,salary)
values('Romin','Irani',28,23000),
('rahul','kamra',34,9000),
('ajay','nissar',45,8911),
('hemant','lohiya',23,8722),
('yash','dayal',77,78987),
('nissar','rahul',45,12345),
('naman','gupta',32,6543),
('himashu','desh pandey',29,90876);


insert into employee(firstname,lastname,age,salary)
values('kirtika','sonali',22,13000),
('kashish','ahuja',23,67000),
('anjali','hans',28,51000),
('radhika','sharma',18,9023),
('anshul','lomror',45,56000);

-- printing the data

select * from employee;


-- Update the salary of employee with EmployeeID 1 to 5.

update employee
set salary = 9999 where emp_id in(1,2,3,4,5);

select * from employee;

-- •Update the age of employee with EmployeeID 2 to 29 and also increase their salary to 1100.

update employee
set salary = (9999+1100) where emp_id in(2,3,4,5,7);

--printing the data

select * from employee;

-- Delete the employee record with EmployeeID 3 from the Employees table.


delete from employee where emp_id = 16;

select * from employee;

-- Delete all records from the EmployeeContacts table.


delete from employee;

-- printing the data

select * from employee;

-- Explain the difference between the TRUNCATE and DELETE commands.
/*
in truncate we can't roll back
in delete we can roll back
*/

-- Retrieve the first 50% of employee data based on their names in ascending order.

select * from employee;

select top 50 percent* from employee order by emp_id asc;

-- Retrieve the names of employees whose names start with 'J'.

select * from employee where firstname like  'j%';

select * from employee;


select * from employee where firstname like  'r%';

-- Retrieve the names of employees whose names end with 'n'.

select * from employee where firstname like '%n';

-- •Retrieve the names of employees whose names contain the letter 'i' at any position.

select * from employee where firstname like '%i%';

-- •Retrieve the names of employees whose names start with 'M' and end with 'l'.

select * from employee where firstname like 'm%l';

select * from employee;

select * from employee where firstname like 'r%n';

-- •Retrieve the names of employees whose names have 'o' as the second character.

select * from employee where firstname like '_o%';

-- Retrieve the names of employees whose names do not start with 'J'.

select * from employee where firstname not like 'j%';
