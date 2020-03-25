DROP DATABASE IF EXISTS company_db;
CREATE DATABASE  company_db;
USE company_db;

CREATE TABLE products(
	id INT NOT NULL,
    name VARCHAR(50),
    image_url varchar(100),
    price DECIMAL(18,2),
    discount DECIMAL(18,2),
    stock DECIMAL(18,2),
    id_category INT,
    id_suppliers INT,
    description varchar(1000),
    
    CONSTRAINT pk_id PRIMARY KEY (id)
);

CREATE TABLE categories (
	id INT NOT NULL,
    name VARCHAR(50),
    description varchar(500),
    
    CONSTRAINT pk_id PRIMARY KEY (id)
);

CREATE TABLE suppliers(
	id INT NOT NULL,
    name VARCHAR(100),
    email VARCHAR(50),
    phone_number VARCHAR(20),
    address VARCHAR(500),
    
    CONSTRAINT pk_id PRIMARY KEY (id)
);

CREATE TABLE employees (
	id INT NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    phone_number VARCHAR(20),
    address VARCHAR(500),
    email VARCHAR(50),
    birthday DATETIME,
    
	CONSTRAINT pk_id PRIMARY KEY (id)
);

CREATE TABLE orders (
	id INT NOT NULL,
    created_date DATETIME,
    shipped_date DATETIME,
    status VARCHAR(50),
    description VARCHAR(1000),
    shipping_address VARCHAR(500),
    shipping_city VARCHAR(50),
    payment_type VARCHAR(20),
    id_customer INT,
    id_employee INT,
    
    CONSTRAINT pk_id PRIMARY KEY (id)
);

CREATE TABLE customers (
	id INT NOT NULL,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    phone_number VARCHAR(20),
    address VARCHAR(500),
    email VARCHAR(50),
    birthday DATE,
    
    CONSTRAINT pk_id PRIMARY KEY (id)
);

CREATE TABLE orderdetails (
	id INT NOT NULL,
    id_order INT,
    id_product INT,
    quantity DECIMAL(18,2),
    
    CONSTRAINT pk_id PRIMARY KEY (id)
);

ALTER TABLE products 
ADD CONSTRAINT fk_id_category FOREIGN KEY (id_category) REFERENCES categories (id),
ADD CONSTRAINT fk_id_suppliers FOREIGN KEY (id_suppliers) REFERENCES suppliers (id);

ALTER TABLE orderdetails
ADD CONSTRAINT fk_id_order FOREIGN KEY (id_order) REFERENCES orders (id),
ADD CONSTRAINT fk_id_product FOREIGN KEY (id_product) REFERENCES products (id);

ALTER TABLE orders
ADD CONSTRAINT fk_id_employee FOREIGN KEY (id_employee) REFERENCES employees (id),
ADD CONSTRAINT fk_id_customer FOREIGN KEY (id_customer) REFERENCES customers (id);








