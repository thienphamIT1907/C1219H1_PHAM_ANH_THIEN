-- Lay customerNumber, customerName, phone, paymentDate, amount tu bang customers va payments voi dieu kien cac khach hang so o Las Vegas

select customerNumber, customerName, phone, paymentDate, amount from customers innerjoin payments on customers.customerNumber = payments.customerNumber 
where city = "Las Vegas";

-- Tim tat ca don hang thuoc tung khach hang 
select customers.customerNumber, customers.customerName, orders.orderNumber, oders.status
from customers
left join orders;
on customers.customerNumber = orders.customerNumber

-- Tim tat ca khach hang chua dat sp nao ca
select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from customers
left join orders
on customers.customerNumber = orders.customerNumber
where orderNumber is null