drop database if exists car_sales;
create database car_sales;
use car_sales;

create table customers (
	customerNumber int not null,
    customerName nvarchar(50) not null,
    contactLastName nvarchar(50) not null,
    contactFirstName nvarchar(50) not null,
    phone nvarchar(50) not null,
    addressLine1 nvarchar(50) not null,
    addressLine2 nvarchar(50) not null,
    city nvarchar(50) not null,
    state nvarchar(50) not null,
    postalCode nvarchar(50) not null,
    country nvarchar(50) not null,
    creditLimit float,
    salesRepEmployeeNumber int not null,
    
    constraint primary key (customerNumber),
    foreign key (salesRepEmployeeNumber) references employees(salesRepEmployeeNumber)
);

create table orders (
	orderNumber int not null,
    orderDate date not null,
    requiredDate date not null,
    shippedDate date,
    status nvarchar(15) not null,
    comment text,
    quantityOrdered int not null,
    priceEach float,
    
    constraint primary key (orderNumber),
    constraint foreign key (customerNumber) references customers(customerNumber)
);

create table payments (
	customerNumber int not null,
    checkNumber nvarchar(50) not null,
    paymentDate date not null,
    amount float not null,
    
    constraint primary key (customerNumber),
    constraint foreign key (customerNumber) references customers(customerNumber)
);

create table products (
	productCode nvarchar(15) not null,
    productName nvarchar(70) not null,
    productScale nvarchar(10) not null,
    productVendor nvarchar(50) not null,
    productDescription text not null,
    quantityInStock int not null,
    buyPrice float not null,
    MSRP float not null,
    productLine nvarchar(50) not null,
    
    constraint primary key (productCode),
    foreign key (productLine) references productlines(productline)
);

create table productlines (
	productLine nvarchar(50) not null,
    textDescription text,
    image nvarchar(50),
    
    constraint primary key (productLine)
);

create table employees (
	employeeNumber int not null,
    lastName nvarchar(50) not null,
    firstName nvarchar(50) not null,
    email nvarchar(100) not null,
    jobTitle nvarchar(50) not null,
    reportTo int not null,
	officeCode nvarchar(10) not null,
    salesRepEmployeeNumber int not null,
    
    constraint primary key (employeeNumber),
    foreign key (reportTo) references employees(employeeNumber),
    foreign key (officeCode) references offices(officeCode)
);

create table offices (
	officeCode nvarchar(10) not null,
    city nvarchar(50) not null,
    phone nvarchar(50) not null,
    addressLine1 nvarchar(50) not null,
    addressLine2 nvarchar(50) not null,
    state nvarchar(50),
    postalCode nvarchar(15) not null,
    
    constraint primary key (officeCode)
);

create table orderDetails (
	productCode nvarchar(15) not null,
    orderNumber int not null,
    
    primary key (productCode),
    foreign key (productCode) references products(productCode),
    foreign key (orderNumber) references orders (orderNumber)
);