

-- creating database

create database aug29;

use aug29;


-- creating table user named as u1
create table u1(
id int identity(1,1) primary key,
u_name varchar(55),
u_gender varchar(6),
u_age int,
u_email varchar(55),
u_city varchar(55)
);

-- inserting values into u1 table

insert into u1 values ('rahul','male',28,'rahul@gmail.com','allahbad uttar pradesh');

insert into u1 
values ('manoj','male',22,'manoj@gmail.com','kanpur uttar pradesh'),
('somya','female',22,'somya@gmail.com','patna bihar'),
('ragini','female',19,'ragini@gmail.com','mothihari bihar');

-- getting all the values

select * from u1;

-- selecting all the users who are from bihar
select * from u1 where u1.u_city like '%bihar';


--  create table flights


create table f1(
f_id int identity(1,1) primary key,
f_name varchar(55),
travel_date datetime,
booking_date datetime,
flight_name varchar(55),
id int foreign key references u1(id) on delete cascade
);

-- drop column
alter table f1
drop column flight_name;

-- insert values into f1

insert into f1
values ('a112 hyd to del',getdate(),getdate(),1);


insert into f1
values ('a113 hyd to dbr',getdate(),getdate(),2);

insert into f1
values ('a114 dbr to ccu',getdate(),getdate(),3);


insert into f1
values ('a114 dbr to lko',getdate(),getdate(),4);


select * from f1;

-- join both the tables

select u1.u_name,u1.u_gender,f1.f_name,f1.travel_date from u1
join f1
on u1.id = f1.id;

-- now delete the user whose id is 1

select * from u1;
select * from f1;
-- on delete casade also deletes the flight information of the user
delete from u1 where u1.id = 1;



-- creating a function which returns sum of 2 number

create function sum_two(@num1 int,@num2 int)
returns int as begin
return @num1+@num2
end


-- getting sum of two numbers
select dbo.sum_two(10,2) as sum_two;


--right join 

select u1.*,f1.* from u1
right join f1
on u1.id = f1.id;

-- create table to search flight

create table f2(
id int identity(5555,1) primary key,
f_src varchar(10),
f_des varchar(10),
seats int,
travel_time int
);

insert into f2 values (
'hyd','dbr',180,2
);


insert into f2 values ('hyd','dbr',180,2),('pune','dbr',180,1),('bom','dbr',220,2),('maa','dbr',340,4),('vtz','dbr',200,1);

select * from f2;

select * from f2 where id = 5555;

select * from f2 where f2.f_src like '%hyd%' and f2.f_des like '%dbr%';

-- show all the tables commands
select * from sys.tables;

------------------------------------------------------------------- rollback starts from here

-- transaction

create table sample1(
id int identity(55,1) primary key,
s_name varchar(55),
s_city varchar(55)
);

-- insert values into sample1 table

begin transaction
insert into sample1 values ('raman','gurugram'),('akhil','taratala'),('naman','bhopal'),('ravi','patna');

insert into sample1 values ('suman','jhamshedpur'),('harsh','gaya'),('saurav','patna'),('manoj','sasaram');

drop table sample1;

select * from sample1;

rollback;

select * from sample1;


create table sample7(
id int identity(55,1) primary key,
s_name varchar(55),
s_city varchar(55)
);


begin transaction
insert into sample7 values ('raman','gurugram'),('akhil','taratala'),('naman','bhopal'),('ravi','patna');


insert into sample7 values ('suman','jhamshedpur'),('harsh','gaya'),('saurav','patna'),('manoj','sasaram');

select * from sample7;

drop table sample2

rollback;


create table sample4(
id int identity(1,1) primary key,
s_name varchar(55)
);

begin transaction
insert into sample4 values('lakhan');
insert into sample4 values ('narendra modi');

begin transaction
insert into sample4 values('rahul gandhi');

select * from sample4;

commit;

rollback;

select * from sample4;

-- roll back upto 
begin transaction
insert into sample4 values('manas');
save transaction s1
insert into sample4 values ('yashwant modi');
save transaction s2
insert into sample4 values('sonia gandhi');
save transaction s3

rollback transaction s2;
select * from sample4;

begin transaction
insert into sample4 values('somya');
save transaction s4
insert into sample4 values('ahana');
save transaction s5
insert into sample4 values('manu');
save transaction s6

select * from sample4;
rollback transaction s5;

select * from sample4;


-------------------------------------update 

-- creating table employee
create table employee(
emp_id int identity(8888,1) primary key,
emp_name varchar(55),
emp_address varchar(55),
emp_register date,
emp_gender varchar(10)
);

-- insert values into employee ();
insert into employee values ('rahul malhotra','sector -1 shanti niktan indore','2020-04-01','male');
insert into employee values ('sheetal kushwaha','road no 21 patna','2020-08-12','female');
-- getting all the employee
select * from employee;

-- creating table named as salary which will refer to each employee
create table salary (
s_id int identity(101,1) primary key,
s_credit_date date,
s_for_month date,
s_money money,
emp_id int foreign key references employee (emp_id)
);

-- storing values into the salary
insert into salary values (getdate(),'2023-07-31',31000,8888);
insert into salary values (getdate(),'2023-07-31',31000,8889);

insert into salary values ('2023-07-31 ','2023-06-30',31000,8888);
insert into salary values ('2023-07-31 ','2023-06-30',31000,8889);
-- getting all the values from the salary
select * from salary;

-- performing join on the tables 

select salary.s_for_month as month, salary.s_money as balance ,
employee.emp_name as 'Employee Name',employee.emp_gender as 'Employee Gender' from employee
join salary
on salary.emp_id = employee.emp_id where emp_gender like 'f%';


-- creating table emp_sal which will be update automatically
create table emp_sal(
id int identity(1,1) primary key,
emp_salary money,
emp_id int foreign key references employee(emp_id),
s_id int foreign key references salary(s_id)
);

-- creating trigger which will be linked to the emp_sal table
CREATE TRIGGER trInsertEmployee 
ON salary  
FOR INSERT  
AS  
BEGIN  
  Declare @Id int 
  Declare @IdEMP int
  Declare @SALEMP int
  SELECT @Id = s_id from salary
  SELECT @IdEMP = emp_id from employee
  SELECT @SALEMP = s_money from salary
  
  INSERT INTO emp_sal
  values (@SALEMP,@IdEMP,@Id)

  END  



select * from salary;
select * from employee;
select * from emp_sal;



-------- new self

create table student(
s_id int identity(1,1) primary key,
s_name varchar(55),
s_age int,
);

-- insert values into student
insert into student values ('naman',19),('raj',22);

select * from student;

create table register_course(
r_id int identity (11,1) primary key,
s_id int foreign key references student(s_id),
r_payment money,
r_course_name varchar(45),
course_dur int
);

insert into register_course values (1,3999,'dsa',6);
insert into register_course values (2,499,'java',2);
insert into register_course values (1,299,'python',1);
insert into register_course values (2,1299,'spring',8);

-- printing all the values
select * from register_course where s_id = 1;
select * from pay;

-- creating table pay which will store the values from the trigger
create table pay(
pay_id int identity(1,1) primary key,
s_id int foreign key references student(s_id),
r_id int foreign key references register_course(r_id),
date_r datetime
);

-- trigger
create trigger pay_trigger
on register_course
for insert 
as begin 
declare @sid int;
declare @rid int;
select @sid = s_id from student;
select @rid = r_id from register_course;
insert into pay
values (@sid,@rid,getdate())
end

