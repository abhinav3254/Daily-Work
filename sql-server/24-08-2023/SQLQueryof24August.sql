

-- create database

create database aug24;
use aug24;

-- create table employee

create table employee(
emp_id int identity(1,1) primary key,
emp_name varchar(55),
emp_salary money,
emp_age int
);

alter table employee
add emp_city varchar(22);

-- insert data into employee table
insert into employee(emp_name,emp_salary,emp_age,emp_city)
values('john',44000,24,'kolkata west bengal'),
('rahul',22000,27,'raipur chattisgarh'),
('manoj',4500,19,'bhoapal madhya pradesh'),
('akul',5500,45,'indore madhya pradesh'),
('kushi',9900,19,'patna bihar'),
('krati',12000,21,'darbhanga bihar'),
('surbhi',11500,29,'vidisha madhya pradesh');

insert into employee(emp_name,emp_salary,emp_age,emp_city)
values('agista',44000,24,'ahemdabad gujrat');

insert into employee(emp_name,emp_salary,emp_age,emp_city)
values('madan lal',44000,24,'rann of kutch gujrat');

-- fetch all the data from the employee table

select * from employee;

-- •Update the salary of employee with EmployeeID 1 to 65000.

update employee
set emp_salary = 65000 where emp_id = 1;

select * from employee;

-- •Update the age of employee with EmployeeID 2 to 29 and also increase their salary to 58000.

update employee
set emp_age = 29 where emp_id = 2;

update employee
set emp_salary = 5800 where emp_id = 2;

select * from employee;

-- •Delete the employee record with EmployeeID 3 from the Employees table.

delete from employee
where emp_id = 3;

select * from employee;

-- •Delete all records from the EmployeeContacts table.

delete from employee;

select * from employee;

-- •Explain the difference between the TRUNCATE and DELETE commands.
 /* delete is used to delete the specific value from the table and trucate is used to empty whole table */

 -- •Retrieve the first 50% of employee data based on their names in ascending order.

select top 50 percent * from employee;

-- •Retrieve the names of employees whose names start with 'J'.

select * from employee where emp_name like 'j%';

-- •Retrieve the names of employees whose names end with 'n'.

select * from employee where emp_name like '%n';

-- •Retrieve the names of employees whose names contain the letter 'i' at any position.

select * from employee where emp_name like '%i%';

-- •Retrieve the names of employees whose names start with 'M' and end with 'l'.

select * from employee where emp_name like 'm%l';

-- •Retrieve the names of employees whose names have 'o' as the second character.

select * from employee where emp_name like '_o%';

-- •Retrieve the names of employees whose names do not start with 'J'.

select * from employee where emp_name not like 'j%';

-- date and time use 

alter table employee add dateofregister datetime;

-- update the whole date column with a single query

update employee set dateofregister = getdate();

select * from employee;

-- setting up default value on a column
alter table employee
add constraint df_emp_name
default 'this' for emp_name

-- inserting into employee

insert into employee(emp_salary,emp_age,emp_city,dateofregister)
values (15000,42,'kanpur uttar pradesh',getdate());

select * from employee;

-- add the check condition

alter table employee
add constraint ch_emp_sal
check (emp_salary>1000);

-- inserting the value into employee table

insert into employee(emp_name,emp_age,emp_salary,emp_city,dateofregister)
values('aakash',24,4499,'jhansi uttar pradesh',getdate());


insert into employee(emp_name,emp_age,emp_salary,emp_city,dateofregister)
values('naman yadav',24,99,'jhansi uttar pradesh',getdate());

-- fetch the values

select * from employee;

-- getting all the data in asc and desc order

select * from employee order by emp_salary asc;

select * from employee order by emp_salary desc;

select * from employee where emp_name like 'this';

select * from employee where emp_name not like 'this';

-- adding time stamp

alter table employee 
add last_update timestamp;

select * from employee;


-- create table prac_1 for practise

create table employee_contact(
id int identity(1,1) primary key,
emp_id int foreign key references employee(emp_id) on delete cascade,
emp_email varchar
);


-- create table customer

create table customer(
c_id int identity(1,1) primary key,
c_name varchar(55),
c_city varchar(55),
c_date datetime
);

-- creating table orders

create table orders(
o_id int identity(101,1) primary key,
c_id int foreign key references customer(c_id),
o_name varchar(55),
o_price money,
o_date datetime
);

-- inserting values in the table

insert into customer(c_name,c_city,c_date)
values('ajay','kolkata',getdate()),('rahul','delhi',getdate()),('naman','bhopal',getdate());

select * from customer;

insert into orders(c_id,o_name,o_price,o_date)
values (1,'pizza',44,getdate()),(2,'coca cola',40,getdate()),(3,'mango',255,getdate());


insert into orders(c_id,o_name,o_price,o_date)
values (1,'t shirt',122,getdate()),(2,'shoes',79,getdate()),(3,'ramen',255,getdate());

-- fetching all the data from the table

select * from orders;

-- join both the table

select c_name,o_name,o_price from orders
join customer
on customer.c_id = orders.c_id;

/************************************** Different Thing ***********************************************/
-- create table list as l1

create table l1(
id int identity(101,1) primary key,
name varchar(55),
price money
);

insert into l1 values('trimmer',799),('shaving cream',48),('coca cola',40),('moto g5',16000),('dell mouse',399);

select * from l1;

create table u1(
id int identity(1,1) primary key,
name varchar(55),
city varchar(55)
);

insert into u1 values ('harsh jha','kolkata'),('raja ravish kumar','patna');

select * from l1;
select * from u1;

create table u1_l1(
id_u1 int foreign key references u1(id),
id_l1 int foreign key references l1(id),
quantity int
);

insert into u1_l1 values (1,101,2),(1,105,1);

select * from l1;
select * from u1;
select * from u1_l1;

drop table u1_l1;
drop table u1,l1;

select * from sys.tables;

-- person table 

create table person1(
id int identity(1,1) primary key,
name varchar(55)
);

-- training table
create table t1(
t_id int identity(101,1) primary key,
t_name varchar(55),
p_id int foreign key references person1(id)
);

-- inserting value into person table

insert into person1 values('ajay'),('vijay'),('manoj'),('aakash');

select * from person1;

-- inserting values in training table

insert into t1 values('comms train',1) ,('java',1), ('python',1), ('comms traion',2);

select * from t1;

-- joining both of table
select name,t_name  from t1
join person1
on t1.p_id = person1.id;

-- t1 is in left and person1 is in right
select name,t_name  from t1
right join person1
on t1.p_id = person1.id;

-- left join t1 is in left and person is in right
select name,t_name from t1
left join person1
on t1.p_id = person1.id;

select * from t1;

alter table t1
drop constraint FK__t1__p_id__5AEE82B9

insert into t1(t_name) values('kotlin');



-- creating table products

create table p1(
p_id int identity(1,1) primary key,
p_name varchar(55),
p_category varchar(55),
p_price money
);

-- inserting values in p1 table

insert into p1(p_name,p_category,p_price)
values('keyboard','electronics',799),
('ps-5','electronics',89000),
('t-shirt','clothing',900),
('pant','clothing',1299),
('moto g5','electronics',18999),
('monitor','electronics',17999),
('hair gel','lifestyle',99);

select * from p1;

-- create table orders

create table o1(
o_id int identity(1,1) primary key,
p_id int,
customer_name varchar(99),
order_date datetime 
);

insert into o1(p_id,customer_name,order_date) 
values(1,'ajay',getdate()),
(1,'ajay',getDate()),
(1,'raman singh',getdate()),
(1,'kushi malhotra',getdate());

insert into o1(customer_name,order_date) 
values('rahul',getdate());

delete from o1 where o_id = 5;

select * from p1;

select * from o1;


update o1
set customer_name = 'gaurav' where o_id = 2;

select * from p1;
select * from o1;

-- Task 1:  Find out which products have been ordered by customers. 
-- Retrieve the product name, category, price, customer name, and order 
-- date for all the products that have been ordered. Include only the records
-- where there are matching orders for the products.

select p1.p_name,p1.p_category,p1.p_price,o1.customer_name,o1.order_date from p1
join o1
on p1.p_id = o1.p_id;

/*
Task 2: List all products, along with their product name, category, price,
and any available order information. Retrieve all product records, including
those that have not been ordered yet. Include order information if available.
*/

select p1.p_id,p1.p_name,p1.p_category,p1.p_price from p1
left join o1
on p1.p_id = o1.p_id;

/*
Task 3:  Display all orders made by customers, including those 
for products that are no longer available in the store. 
Retrieve the order ID, customer name, order date, product name, 
category, and price. Include all orders, and display product information if available.
*/

select * from o1;

select o_id,o1.customer_name,o1.order_date,p1.p_name,p1.p_category,p1.p_price from p1
right join o1
on p1.p_id = o1.p_id;


/********************************** selff pace **********************************/

create table salesperson(
s_id int identity(5001,1) primary key,
s_name varchar(55),
city varchar(55),
commission float
);

insert into salesperson values ('James Hoog','New York',0.15),
('Nail Knite','Paris',0.13),('Pit Alex','London',0.11),('Mc Lyon','Paris',0.14),
('Paul Adam','Rome',0.13),('Lauson Hen','San Jose',0.12);

select * from salesperson;

drop table salesperson;

select * from sys.tables;

-- create table staff

create table staff(
s_id int identity (5001,1) primary key,
name varchar(60),
city varchar(60),
email varchar(55),
username varchar(55),
password varchar(15),
last_update timestamp
);

-- insert values in staff

insert into staff(name,city,email,username,password) 
values('James Hoog','kolkata','james@gmail.com','james11','12');

insert into staff(name,city,email,username,password) 
values('Nick Rimando','kanpur','nick@gmail.com','nick11','12');


select * from staff;
-- create table customer

create table customer11(
c_id int identity(1001,1) primary key,
c_name varchar(55),
email varchar(55),
c_address varchar(55),
createdate datetime,
lastupdate timestamp
);


insert into customer11(c_name,email,c_address,createdate)
values ('Brad Davis','brad_davis@gmail.com','kolkata',GETDATE()),
('Graham Zusi','graham_zusi@gmail.com','indore',getdate());


select * from customer11;
-- create payment table

create table payment(
p_id int identity(222,1) primary key,
c_id int foreign key references customer11(c_id),
staff_id int foreign key references staff(s_id),
amount money,
payment_date datetime
);

insert into payment (c_id,staff_id,amount,payment_date)
values (1001,5001,566,getdate()),
(1002,5002,1799,getdate());

select * from payment;

-- 1 statement
-- customer information with payment id , amount and payment date

select customer11.c_name,customer11.c_address,customer11.email,payment.amount from customer11
join payment
on customer11.c_id = payment.c_id;

select customer11.*,payment.amount from customer11
left join payment
on customer11.c_id = payment.c_id;

--2 statment
-- show me the staff information with payment id and payment date

select staff.name,staff.city,payment.amount from staff
join payment
on staff.s_id = payment.staff_id;


select staff.*,payment.amount from staff
join payment
on staff.s_id = payment.staff_id;


-- create table tourist

create table tourist(
t_id int identity(5001,1) primary key,
t_name varchar(55),
t_country varchar(55)
);

insert into tourist values('James Hoog','usa'),('Nail Knite','japan'),('Pit Alex','england'),('Mc Lyon','australia');
insert into tourist values('Paul Adam','usa'),(' Lauson Hen ','usa'),('Nick Rimando','japan'),('Brad Davis','usa');

select * from tourist;

-- counting tourist country wise
select count(*) from tourist where t_country like 'usa';
select count(*) from tourist where t_country like 'japan';
select count(*) from tourist where t_country like 'england';
select count(*) from tourist where t_country like 'australia';

select * from tourist;

select count(*),t_country from tourist group by t_country;

 -- group by

 -- showing those country whose count is > 1
select count(*) as countryCount,t_country from tourist group by t_country having COUNT(*)>1;


--create table supplier
create table supplier(
s_id int identity(501,1) primary key,
s_name varchar(55)
);

-- insert values in supplier 
insert into supplier(s_name) values('rahul'),('mohan'),('ajay'),('krishna'),('naman');

select * from supplier;
-- create table product

create table product(
p_id int identity(101,1) primary key,
p_name varchar(55),
p_price money,
s_id int
);

insert into product values ('pen',45,501),('headphone',22,501),('keyboard',59,502);


insert into product values ('roof',2245,501),('2 bhk',9922,501),('bag',159,502);

select * from product;



select product.* , supplier.* from product
join supplier
on product.s_id = supplier.s_id and p_price>200;



select supplier.s_name from product
join supplier
on product.s_id = supplier.s_id and p_price>200;


-- exists() use
select supplier.s_name from supplier where
exists(select * from product where product.s_id = supplier.s_id and p_price>200);
-- inner query doesn't print anything just return true or flase and depending upon that outer query will decide




-- task is to create a duplicate table from the existing table

create table t2(
t1_id int identity(11,1) primary key,
t1_name varchar(55)
);

insert into t2 values('ajay'),('vijay'),('jagdish'),('mohan'),('jagan');

select * from t2;

-- new table automatically created and inserted into new_tab

select * into new_tab from t2;

select * from new_tab;

-- update the t2 table

insert into t2 values ('pen'),('mobile');

insert into t2 values ('shampoo'),('hair dryer');

select * from t2;

-- now update with the latest data

insert into new_tab (t1_name) select t1_name from t2 where t1_id>17;

select * from new_tab;

-- create the table

create table employee1(
id int identity(1,1) primary key,
name varchar(44)
);



select * from employee1;

insert into employee1 values('mohan'),('rohan'),('piyush'),('rahul');


-- if else in sql
select name,
case 
 when name = 'mohan' then 'it is me'
 when name = 'rohan' then 'friend'
 else 'dont know'
 end as identitier
 from employee1;