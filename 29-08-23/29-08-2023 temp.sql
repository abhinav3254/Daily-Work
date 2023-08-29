
create database temp;

use temp;

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


insert into u10 (u_name,u_marks) 
values ('ravi',85),
('kusum',77),('naina',99),('gutam',78),('harshit',23);

select * from u10;

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

