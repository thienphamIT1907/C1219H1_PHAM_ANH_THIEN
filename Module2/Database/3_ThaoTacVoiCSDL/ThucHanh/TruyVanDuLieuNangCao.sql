select productCode, productName, buyprice, quantityInStock from products;
where buyprice > 56.76 and quantityInStock > 10;

-- Lay productcode, productname, buyprice tu bang products
-- Lay textdescription tu bang productlines
-- Dieu kien: Gia mua nam trong khoan 1000 - 2000

select productcode, productname, buyprice from products
inner join productlines
on products.productlines = productlines.productline
where buyprice > 56.76 and buyprice < 95.59

-- hien thi ra cac san pham co loai san pham la classic cars hoac nha cung cap la 'Min Lin Diecast'

select productcode, productname, buyprice, quatityinstock, productvendor, productline
from product
where productline = "Classic Cars" or productvendor = "Min Lin Diecast"