

-- creating database named as aug28

create database aug28;

use aug28;

-- creating table user
create table u1(
u_id int identity(1,1) primary key,
u_name varchar(55),
u_age int,
u_gender varchar(8)
);

insert into u1 values('narendra modi',55,'male'),('mamta banarjee',49,'female');
insert into u1 values('rahul',15,'male');
select * from u1;

-- creating table products

create table p1(
p_id int identity(11,1) primary key,
p_name varchar(55),
p_price money
);

insert into p1 values('shampoo',155),('handwash',99),('tang',85),('chura',30);

select * from u1;
select * from p1;

-- creating table cart
create table c1(
c_id int identity(51,1) primary key,
u_id int foreign key references u1(u_id),
p_id int foreign key references p1(p_id),
c_quantity int
);

insert into c1 values(1,11,2),(1,14,5),(2,12,1),(2,13,1);

select * from c1;


select * from u1;
select * from p1;
select * from c1;

-- join three tables
select u1.u_name,u1.u_gender,p1.p_name,p1.p_price,c1.c_quantity from c1
join u1
on c1.u_id = u1.u_id
join p1
on c1.p_id = p1.p_id;


-- creating view
create view three_joins as
select u1.u_name,u1.u_gender,p1.p_name,p1.p_price,c1.c_quantity from c1
join u1
on c1.u_id = u1.u_id
join p1
on c1.p_id = p1.p_id;

-- print view
select * from three_joins;

-- creating procedure as 

create procedure three_joins_p as
select u1.u_name,u1.u_gender,p1.p_name,p1.p_price,c1.c_quantity from c1
join u1
on c1.u_id = u1.u_id
join p1
on c1.p_id = p1.p_id;

-- printing values from procedure

exec three_joins_p


-- creating variable in sql

declare @name varchar(15);

-- initialize the variable here

set @name = 'abhinav';

select upper(@name) as upper_case;
select lower(@name) as lower_case;
select charindex('v',@name) as index_of_val;


-- iif (if and else condition in sql)
select *,iif(u1.u_age >20,'major','minor') as ans from u1;


-- create a function in sql

create function sum_method (@num1 int , @num2 int) 
returns int
as begin
return @num1+@num2
end;

select dbo.sum_method(11,12) as result;


-- creating substraction function in sql
create function subtract_custom(@num1 int,@num2 int) 
returns int
as begin 
return @num1-@num2
end;


-- executing the subtract_custom method
select dbo.subtract_custom(20,2) as sub_result;



-- creating function with month

create function date_sum(@num1 int,@num2 int,@month int)
returns int
as begin
return @num1+@num2+@month
end;

select dbo.date_sum(10,2,month(getdate())) as result;

select month(getdate());


-- create table named as car

create table car1(
c_id int identity(1,1) primary key,
c_name varchar(55),
c_year datetime
);

insert into car1 values ('bmw',getdate()),('supra',getdate()),
('nissan gtr',getdate()),('fortuner',getdate()),('ford f150',getdate()),('ford f350',getdate()),
('audi a8',getdate()),('ambassador',getdate());

select * from car1;

-- fubnction to get 
-- create function
create function get_car_details(@date int) 
returns table
as 
return select * from car1 where year(car1.c_year) = @date;


select * from dbo.get_car_details(year(getdate()));


-- creating table named as batch-1
create table b1(
b1_id int identity(1,1) primary key,
b1_name varchar(22),
b1_year int
);


-- inserting values into batch -1
insert into b1 
values ('arjun',year(getdate())),
('harsh',year(getdate())-1),
('rahul',year(getdate())-5),
('yash',year(getdate())-10);


-- creating table named as batch - 2 
create table b2(
b2_id int identity(1,1) primary key,
b2_name varchar(22),
b2_year int
);

-- inserting values into batch 2 table
insert into b2 
values ('param',year(getdate())),
('manas',year(getdate())-5),
('akhil',year(getdate())-3),
('chandu',year(getdate())-7);


-- reading all the values from table batch-1 and batch -2
select * from b1;
select * from b2;

-- selectting all the values from both the tables means join the table
select * from b1 union select * from b2;

-- creating function which joins two table
create function b1_b2_join()
returns table 
return select * from b1 union select * from b2

-- calling the fucntion
select * from dbo.b1_b2_join();

---------------------------------------------------------------------------------------------------------------------
-- customer table
create table customer1(
c_id int identity(1,1) primary key,
fisrt_name varchar(22),
last_name varchar(22)
);

insert into customer1 values ('mohan','sahu'),
('rohan','singh'),('raju','rastogi'),('john','doe');

select * from customer1;

-- staff table
create table staff1(
s_id int identity(1,1) primary key,
first_name varchar(22),
last_name varchar(22)
);

insert into staff1 values ('mandeep','saini'),('narendra','modi'),('rahul','gandhi'),('priyanka','wadra');

select * from staff1;


-- this function is getting values from customer1 and staff1 table
-- this function returns a table @contact which is created inside of it

create function udfContacts()
returns @contact table(
first_name varchar(22),
last_name varchar(22)
)
as begin 
insert into @contact
select first_name , last_name from staff1;

insert into @contact
select fisrt_name , last_name from customer1;


return;
end;

select * from dbo.udfContacts();


---------------------------------------------------------------------------------------------------------------------------

-- creating table into customer2
create table customer2(
c_id int identity(1,1) primary key,
c_name varchar(55),
c_date datetime,
c_city varchar(55)
);

-- inserting values from customer2
insert into customer2 values ('rahul',getdate(),'bhopal'),('manas',getdate(),'raipur'),('sagar',getdate(),'kanpur'),('manoj',getdate(),'indore');

-- getting all the values from customer2
select * from customer2;

-- create table order1
create table order1(
p_id int identity(51,1),
p_name varchar(55),
p_price money,
c_id int foreign key references customer2(c_id)
);

-- inserting values from order1
insert into order1 values ('pizza',55,1),('burger',199,2),('razor',2,1),('keyboard',299,2);

select * from order1;

-- normal fetching of data
select  sum(p_price) as total_price from order1 where c_id = 1;


select customer2.c_name, sum(p_price) as total_price from order1 
join customer2 
on  order1.c_id = customer2.c_id group by customer2.c_name;

-- normally join the two table
select customer2.c_name,customer2.c_city,order1.p_name,order1.p_price from customer2
join order1
on order1.c_id = customer2.c_id;


-- final result what we need code 

select customer2.c_name, sum(order1.p_price) as total_price from order1 
join customer2 
on  order1.c_id = customer2.c_id group by customer2.c_name;


-- creating function for the same
create function total_price_fun()
returns table
return 
select customer2.c_name, sum(order1.p_price) as total_price from order1 
join customer2 
on  order1.c_id = customer2.c_id group by customer2.c_name;


select * from dbo.total_price_fun();


select order1.c_id,sum(order1.p_price) as total_bill_amount 
from order1 group by order1.c_id;
-------------------------------------------------- CTE (common table expression)
with c_p_total as 
(select order1.c_id,sum(order1.p_price) as total_bill_amount 
from order1 group by order1.c_id)

select customer2.c_name,c_p_total.total_bill_amount from customer2 
join c_p_total 
on c_p_total.c_id = customer2.c_id



select order1.c_id,sum(order1.p_price) as total_price from order1 group by c_id

-- second time revise of above code (CTE)
with temp_name as (select order1.c_id,sum(order1.p_price) as total_price from order1 group by order1.c_id)

select customer2.c_name,temp_name.total_price from customer2
join temp_name on temp_name.c_id = customer2.c_id;



-- partions

create table b4(
id int identity(1,1),
b_name varchar(55),
b_batch int default 1
);

insert into b4 (b_name) 
values ('rahul gandhi'),('narendra modi'),('nitish kumar'),('lalu yadav');

select * from b4;

create table b5(
id int identity(1,1),
b_name varchar(55),
b_batch int default 2
);


insert into b5 (b_name) 
values ('apj abdul kalam'),('atal bihari'),('rajnath kovind'),('pratibha patil');

select * from b5;

select * from b4;
select * from b5;



with combination as(select * from b4 union select * from b5)
select id,b_name , ROW_NUMBER() over(partition by b_batch order by b_batch) as rownumber from  combination ;


select * from b4 union select * from b5 order by b_batch;

with combination as(select * from b4 union select * from b5)
select id,b_name,b_batch, RANK() over(order by b_batch) as rank_num from  combination ;

-- dense_rank use case
with combination as(select * from b4 union select * from b5)
select id,b_name,b_batch, DENSE_RANK() over(order by b_batch) as DENSE_RANK_ from  combination 


--------------------------------------------------while Loop -----------------------------------------------------------------
-- while loop 


declare @counter int;
set @counter = 1;

while(@counter<11)
begin
print @counter;
set @counter = @counter + 1;
end

-- creating table u500 to insert 500 records
create table u500(
id int identity(1,1) primary key,
u_name varchar(55)
);

-- inserting 500 records into the table
declare @name int;
set @name = 1;

while (@name<501)
begin 
insert into u500 values ('name');
set @name = @name + 1;
end

select * from u500 where id = 500;


-- create table for pass and fail records

create table u10(
id int identity(1,1) primary key,
u_name varchar(55),
u_marks int
);



insert into u10 (u_name,u_marks) 
values ('manohar',55),
('raman',60),('sanajy',82),('ayush',90),('modi',87);


create function pass_fail_fun(@marks int) returns varchar(10)
as begin
declare @output varchar(10)
if (@marks>80)
set @output = 'pass'
else 
set @output = 'fail'
return @output
end


select * from u10;
select u10.id, u10.u_name,u10.u_marks,dbo.pass_fail_fun(u10.u_marks) as out_res from u10;



--select dbo.pass_fail_fun(60) as out_res;
/*
create table u11(
id int identity(1,1) primary key,
u_name varchar(55),
u_marks int,
u_p_f varchar(55) default 'fail'
);

insert into u11 (u_name,u_marks) 
values ('manohar',55),
('raman',60),('sanajy',82),('ayush',90),('modi',87);

select * from u11;

create function pass_fail_fun1(@marks int) returns varchar(10)
as begin
declare @output varchar(10)
if (@marks>80)
set @output = 'pass'
update table u11(u_p_f) values ('pass');
else 
set @output = 'fail'
return @output
end
drop table u11;
*/


create table u11(
id int identity(1,1) primary key,
u_name varchar(55),
u_marks int,
u_status varchar(6)
);


insert into u11 (u_name,u_marks) 
values ('manohar',55),
('raman',60),('sanajy',82),('ayush',90),('modi',87);

select * from u11;


declare @total_row int;
set @total_row  = count(u11.id) from u11; 

declare @count int;
set @count = 1;

while(@count<=@total_row)
begin 
declare @marks int;
set @marks = select u_marks from u11 where id = @count;
if (@marks<80)
update u11 set u_status = 'pass'  where id = @count
else 
update u11 set u_status = 'fail' where id = @count
end

select * from u11;


-------------------------------------------------------------------------------------------

declare @num int;
set @num = 0;
while (@num<16)
begin
-- declaring @num here bcz if 6 will be there it will continue move to top and not able to 
-- increment the value
set @num = @num+1
if (@num > 6 and @num<10)
continue;
print @num;
end;

