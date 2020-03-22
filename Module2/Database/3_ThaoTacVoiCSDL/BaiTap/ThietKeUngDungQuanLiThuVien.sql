drop database if exists library_manager_db;
create database library_manager_db;
use library_manager_db;
	
create table Students (
	student_number nvarchar(15) not null,
    student_name nvarchar(50) not null,
    address nvarchar(500) not null,
    email nvarchar(50) not null,
    image nvarchar(50) not null
);


