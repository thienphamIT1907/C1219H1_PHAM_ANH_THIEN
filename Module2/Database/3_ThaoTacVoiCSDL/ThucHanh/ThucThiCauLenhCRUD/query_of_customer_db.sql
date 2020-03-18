use classicmodels;

select * 
from classicmodels.customers;

select customernumber, contactlastname, contactfirstname, phone, city 
from customers;

-- hien thi thong tin cua tat ca khach hang co ten Peter va song o Melbourne
select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
where contactfirstname = 'Peter' and city = 'Melbourne';

-- hien thi thong tin khach hang co chua ki tu "A/a"
select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
where contactfirstname like '%A%';

-- hien thi thong tin khach hang co trong ma 103 den 125
select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
where customernumber between 103 and 125;

-- hien thi thong tin khach hang dang o usa, france, spain
select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
where city in ('USA', 'France', 'Spain');

-- hien thi thong tin khach hang theo thu tu a-z
select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
order by contactfirstname asc;

-- hien thi 10 khach hang dau tien theo thu tu a-z cua ten
select customernumber, contactlastname, contactfirstname, phone, city 
from customers 
order by contactfirstname desc limit 10;

-- dem so khach hang song o france
select count(country) as 'number_customer_live_at_France' 
from customers 
where city = 'France' ;

insert into customers (customernumber, customername, contactfirstname, contactlastname, phone, addressline1, city, country) 
values (500, 'AgileLead', 'Lan', 'Trần', '0978822683', 'Hàm Nghi', 'Hà Nội', 'Việt Nam' );

update customers 
set customername = 'Baane Mini Imports'
where customernumber = 103;

delete from customers
where city = 'Nantes';







