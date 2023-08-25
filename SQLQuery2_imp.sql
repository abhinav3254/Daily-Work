use aug25;

--creating table student
create table s1(
s_id int identity(1,1) primary key,
s_name varchar(55)
);

insert into s1 values('ajay'),('rahul'),('vikash'),('mohan');

select * from s1;

-- creating table courses

create table c1(
c_id int identity(51,1) primary key,
c_name varchar(65)
);

insert into c1 values ('maths'),('science'),('english'),('hindi'),('ssc');

select * from c1;
-- create table enrollment
create table e1(
e_id int identity(11,1) primary key,
s_id int foreign key references s1(s_id),
c_id int foreign key references c1(c_id),
grades varchar(5)
);


select * from c1;
select * from s1;
select * from e1;

insert into e1 values(1,51,'a'),(1,52,'a'),(2,54,'b'),(2,55,'b');

select c_name,s_name,e1.grades from c1
join e1
on e1.c_id = c1.c_id
join s1 
on e1.s_id = s1.s_id where s1.s_id = 1;

/*
declare @no_credits int;
set @no_credits = 4;
select (@no_credits) as credit;

create function calculate_gpa(@student_id int)
case 
	when 
end;
*/

-- Create a function to calculate GPA
CREATE FUNCTION calculate_gpa (@student_id INT) RETURNS DECIMAL(4, 2)
BEGIN
    DECLARE @total_points DECIMAL(10, 2);
    DECLARE @total_credits INT;
    DECLARE @gpa DECIMAL(4, 2);

 

    SELECT @total_points = COALESCE(SUM(
        CASE grade
            WHEN 'A' THEN 4.0
            WHEN 'B' THEN 3.0
            WHEN 'C' THEN 2.0
            WHEN 'D' THEN 1.0
            WHEN 'F' THEN 0.0
            ELSE 0.0
        END), 0)
    FROM enrollments
    WHERE student_id = @student_id;

 

    SELECT @total_credits = COUNT(*)
    FROM enrollments
    WHERE student_id = @student_id;

 

    IF @total_credits > 0
        SET @gpa = @total_points / @total_credits;
    ELSE
        SET @gpa = 0.0;

 

    RETURN @gpa;
END;

