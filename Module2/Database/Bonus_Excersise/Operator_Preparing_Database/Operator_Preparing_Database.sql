USE template_database;

-- "=":  Hien thi ho ten cua customer co salesRepEmployeeNumber la 1216
SELECT contactLastName, contactFirstName, salesRepEmployeeNumber  
FROM customers 
WHERE salesRepEmployeeNumber = 1216;

-- "<>":  Hien thi ho ten cua customer co salesRepEmployeeNumber khong phai 1216
SELECT contactLastName, contactFirstName, salesRepEmployeeNumber  
FROM customers 
WHERE salesRepEmployeeNumber <> 1216;

-- ">=": Hien thi email cua employees co do dai lon hon hoac bang 30 ki tu 
SELECT lastname, firstname, email
FROM employees
WHERE length(email) >= 30;

--  "<=": Hien thi email cua employees co do dai be hon hoac bang 20 ki tu 
SELECT lastname, firstname, email
FROM employees
WHERE length(email) <= 20;

-- "BETWEEN": Hien thi customer co customerNumber trong khoang tu 250 ~ 350
SELECT customerNumber, customerName
FROM customers
WHERE customerNumber BETWEEN 250 AND 350;

-- "LIKE": Hien thi employees co chu cai dau la A
SELECT firstname, lastname
FROM employees
WHERE firstname LIKE "A%";

-- "IN": Hien thi customer song o Berlin, Paris hoac London
SELECT contactFirstName, contactLastName, city 
FROM customers
WHERE city IN ("Berlin", "Paris", "London");

-- "AND": Hien thi customer co ten Renate la 247 va song o Germany
SELECT contactFirstName, contactLastName, customerNumber, country
FROM customers
WHERE contactFirstName = "Renate" AND country = "Germany" ;

-- "OR": Hien thi employees co extension la x102, x103 hoac x388
SELECT firstName, lastName, extension 
FROM employees
WHERE extension = "x102" OR extension = "x103" OR extension = "x388";

-- "NOT": Hien thi nhung don hang chua duoc ship
SELECT orderNumber, status
FROM orders
WHERE NOT status ="shipped";

-- "INNER JOIN" and "ORDER BY": Hien thi ho ten customers va so tien ho da thanh toan va sap xep giam dan theo tien thanh toan
SELECT customers.contactFirstName, customers.contactLastName, payments.amount
FROM customers
INNER JOIN payments
ON customers.customerNumber = payments.customerNumber
ORDER BY payments.amount DESC;

-- "GROUP BY": Hien thi so luong customer o moi thanh pho va sap xep giam gian
SELECT city, count(customerNumber) AS so_luong 
FROM customers
GROUP BY city ORDER BY so_luong DESC;

-- "HAVING": Hien thi tong so tien cua dong xe 1995 Honda Civic
SELECT productName, sum(buyPrice) AS total FROM products GROUP BY productName HAVING productName = "1995 Honda Civic";


















