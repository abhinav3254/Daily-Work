
-- creating database named as aug25
create database aug25;

use aug25;
-- create a tabled named as users

create table users(
u_id int identity(1,1) primary key,
u_name varchar(55),
u_address varchar(55),
u_age int
);

-- insert values into users table

insert into users 
values('nikhil namdev','south pargana street kolkata new bengal',67),
('rahul malhotra','sky tower near road number 21 kolkata west bengal',45),
('ajay yadav','kushi bakery near gumbaj road patna bihar',22),
('harsh shastri','shivaji nagar, arera colony bhopal madhya pradesh',33);

select * from users;

-- getting all the users from bengal
select * from users where u_address like '%bengal%'

alter table users
add constraint df_name
default 'hello' for u_name;

insert into users (u_address,u_age)
values('south pargana street motihari bihar',67);

select * from users;

select * from users order by u_age asc;

select * from users order by u_age desc;

-- creating another table named orders

create table orders(
o_id int identity(22,1) primary key,
o_name varchar(55),
o_price money,
o_quantity int,
o_city varchar(55),
u_id int foreign key references users(u_id)
);

-- inserting values into orders table
insert into orders
values('pizza',339,1,'kolkata',1),
('burger',79,2,'varanasi',2),
('chiken tikka masala',155,1,'sasaram bihar',3),
('chiken lollipop',122,1,'bhoapl',4);

-- getting all the values from the orders table
select * from orders;

-- join both the tabless
select orders.*,users.* from users
join orders
on orders.u_id = users.u_id;

-- getting all the values from the users table
select * from users;

-- join both the tables and selecting only few columns
select users.u_name,users.u_address,orders.o_name,orders.o_city,orders.o_price from users
join orders
on orders.u_id = users.u_id where orders.o_price >300;

--filter using address
select users.u_name,users.u_address,orders.o_name,orders.o_city,orders.o_price from users
join orders
on orders.u_id = users.u_id where users.u_address like '%bihar%';

-- left join 

--drop foreign key
alter table orders
drop constraint FK__orders__u_id__4CA06362;

select * from users;
select * from orders;

-- inserting values into users table
insert into users values('kabir singh','south mumbai maharastra',29);

-- inserting into orders table
insert into orders(o_name,o_price,o_quantity,o_city)
values('coca cola 750ml',40,1,'dehradun uttrakhand');

-- left join

select users.u_name,users.u_address,orders.o_name,orders.o_price from users
left join orders
on users.u_id = orders.u_id;

-- right join

select users.u_name,users.u_address,orders.o_name,orders.o_price from users
right join orders
on users.u_id = orders.u_id;


-- group by
select count(*) as ageWiseData,users.u_age from users group by users.u_age ;

-- exists use 
-- in this case as we can see that there is no order greater than 1000 it returns false
-- and it returns false so external statement is also not executed
select users.u_name from users where exists(select * from orders where orders.o_price>10000);


-- exists use 
-- in this case as we can see that there is order greater than 100 it returns true
-- and it returns true so external statement is also executed
select users.u_name from users where exists(select * from orders where orders.o_price>100);


-- problem 1

-- creating customer1 table
create table customer1(
cust_id int identity(1,1) primary key,
cust_name varchar(55),
cust_address varchar(55)
);


insert into customer1 values('narendra modi','gujrat'),('lalu yadav','bihar'),('yogi adityanath','uttar pradesh'),('nitish kumar','bihar');

select * from customer1;
-- creating product1 table
create table product1(
p_id int identity(11,1) primary key,
p_name varchar(55),
p_price money
);


insert into product1 values('coca cola 750 ml',40),('fortuner',4000000),('thar',200000),('activa',99999);

select * from customer1;
select * from product1;
-- creating order1 table
create table order1(
o_id int identity(55,1) primary key,
p_id int foreign key references product1(p_id),
cust_id int foreign key references customer1(cust_id),
quantity int
);


-- getting all the values
select * from customer1;
select * from product1;
select * from order1;

-- join three tables
select order1.quantity, customer1.cust_name,product1.p_name,product1.p_price from order1
join customer1
on customer1.cust_id = order1.cust_id
join product1
on product1.p_id = order1.p_id;

-- creating view for three join tables
create view threeJoin as 
select order1.quantity, customer1.cust_name,product1.p_name,product1.p_price from order1
join customer1
on customer1.cust_id = order1.cust_id
join product1
on product1.p_id = order1.p_id;


-- calling the veiw
select * from threeJoin;


-- stored procedure
create procedure spanme as 
select order1.quantity, customer1.cust_name,product1.p_name,product1.p_price from order1
join customer1
on customer1.cust_id = order1.cust_id
join product1
on product1.p_id = order1.p_id;


-- executing procedure
exec spanme;

-- create table u2() as users2 table

create table u2(
u_id int identity(1,1) primary key,
u_name varchar(55),
u_address varchar(55),
u_age int
);

insert into u2 values('kamlesh vishkarama','sector -2 bhopal shanti nikatan',18);

select * from u2;

-- creating procedure
create procedure u2_show as 
select * from u2;

-- getting values using procedure
exec u2_show;

-- creating procedure for inserting values

create procedure u2_insert as 
insert into u2 values('naina agarwal','darbhanga bihar',21);

-- calling insert procedure
exec u2_insert;

exec u2_show;


-- charindex function in sql

select charindex('a','abhinav') as char_position;
select charindex('b','abhinav') as char_position;
select charindex('h','abhinav') as char_position;
select charindex('i','abhinav') as char_position;
select charindex('n','abhinav') as char_position;


--create variable 
declare @varname varchar(55);
declare @cust_name varchar(55)
-- set the value to the variable
set @varname = 'customer';
set @cust_name = 'abhinav';
-- now to the operation
select charindex('c',@varname) as char_position;
select charindex('a',@cust_name) as new_char;


/*
68.Concat
69.Lower, replace and trim
70.Length , numeric function, floor,celing,square
71.Datediff
72.Date format ,datename
73.getdays
74.other date functionality
*/
select CONCAT('sql',' server');

select lower('ABHINAV');

select UPPER('abhinav');

select replace('abhinav','n','o');

select TRIM('@gmail.com' from ' abhinav@gmail.com')

select count(*) from customer1;

select * from customer1;

select max(p_price) from aug25.dbo.product1 as expensive_item;

select min(p_price) from product1 as least_val;

select getdate() as today;

select CEILING(13.24325) as round_off;

select SQUARE(5) as square_value;

SELECT DATEDIFF(year, '2017/08/25', '2011/08/25') AS yeardiff;
SELECT DATEDIFF(month, '2017/08/25', '2011/08/25') AS monthdiff;

-- getting day difference
select DATEDIFF(day, '2023/01/11', getdate()) as daydiff;
select DATEDIFF(day, '2000/09/03', '2023/01/11') as to_end_me;
select DATEDIFF(day, '2000/09/03', getdate()) as dob_diff;


/*_______________________________________________________________________________________________________________*/


-- insert 1 million data into the table
Create Table Employees27(
Id int primary key identity,
[Name] nvarchar(50),
Email nvarchar(50),
Department nvarchar(50)
);



Go
SET NOCOUNT ON
Declare @counter int = 1
While(@counter <= 1000000)
Begin
Declare @Name nvarchar(50) = 'ABC ' + RTRIM(@counter)
Declare @Email nvarchar(50) = 'abc' + RTRIM(@counter) + '@pragimtech.com'
Declare @Dept nvarchar(10) = 'Dept ' + RTRIM(@counter)
Insert into Employees27 values (@Name, @Email, @Dept)
Set @counter = @counter +1
If(@Counter%100000 = 0)
Print RTRIM(@Counter) + ' rows inserted'
End


select * from Employees27;

select * from Employees27 where id = 1900;

select * from Employees27 where id  = 20000 or id = 21000;

/************************TYPE CASTING****************************************/

-- type casting from float to int
select cast(122.122222 as int);


declare @name1 varchar(55);
set @name1 = 'abhinav';
select cast (@name1 as text);

-- create table u2
create table u3(
id int identity(1,1) primary key,
name text
);

insert into u3 values ('rahul',79);
insert into u3 values ('naman',55);

select * from u3;


select CAST(name as varchar) as type_casting from u3 ;


-- iif in sql (kind of if else)

alter table u3
add marks float;

update u3
set marks = 90;

select * from u3;

select *,IIF(u3.marks>80,'pass','fail') as result_pass_fail from u3;

-- if numeric it returns 1 else 0
select ISNUMERIC(5567) as ans_ok;

--if numeric it returns 1 else 0
select ISNUMERIC('ab') as ans_ok;

select * from u3;
select sum(marks) as ans from u3;


declare @n1 int;
declare @n2 int;
set @n1 = -1;
set @n2 = 1;
select sum(@n1+@n2) as sum_two;



-- creating function in sql

create function sum_custom(@num1 int,@num2 int)
returns varchar(55)
as begin 
return @num1+@num2
end


select dbo.sum_custom(10,20) as result;

-- creating table
create table m1(
id int identity(1,1) primary key,
name_p varchar(55),
maths int,
science int
);

-- inserting values
insert into m1 values('ajay',80,80),('suresh',90,60);
--getting all the values
select * from m1;
-- using function inside select table command
select name_p,dbo.sum_custom(maths,science) as ans_to from m1;