<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hiển thị danh sách khách hàng</title>
    <style>
        body {
            width: 80%;
            margin: 0 auto;
        }
        
    </style>
</head>
<body>
<%!
    public static class Customer {
        private String hoTen;
        private String ngaySinh;
        private String diaChi;
        private String anh;
        
        public Customer() {
        }
        
        public Customer(String hoTen, String ngaySinh, String diaChi, String anh) {
            this.hoTen = hoTen;
            this.ngaySinh = ngaySinh;
            this.diaChi = diaChi;
            this.anh = anh;
        }
        
        public String getHoTen() {
            return hoTen;
        }
        
        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }
        
        public String getNgaySinh() {
            return ngaySinh;
        }
        
        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }
        
        public String getDiaChi() {
            return diaChi;
        }
        
        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }
        
        public String getAnh() {
            return anh;
        }
        
        public void setAnh(String anh) {
            this.anh = anh;
        }
    }
%>
<%!
    Customer customer1 = new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "anh1.jpg");
    Customer customer2 = new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "anh2.jpg");
    Customer customer3 = new Customer("Nguyễn Thái Hoà", "1983-05-22", "Nam Định", "anh3.jpg");
    Customer customer4 = new Customer("Trần Đăng Khoa", "1983-01-19", "Hà Tây", "anh4.jpg");
    Customer customer5 = new Customer("Nguyễn Đình Thi", "1983-12-13", "Đà Nẵng", "anh5.jpg");


%>

<%
    ArrayList<Customer> customerArrayList = new ArrayList<>();
    customerArrayList.add(customer1);
    customerArrayList.add(customer2);
    customerArrayList.add(customer3);
    customerArrayList.add(customer4);
    customerArrayList.add(customer5);
    
    request.setAttribute("arrayList", customerArrayList);
%>

<div id="container">
    <h1>Danh sách khách hàng</h1>
    <table border="1px solid black">
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        
        <c:forEach items="${arrayList}" var="listItem">
            <tr>
                <td>${listItem.hoTen.toString()}</td>
                <td>${listItem.ngaySinh.toString()}</td>
                <td>${listItem.diaChi.toString()}</td>
                <td><img src="./images/${listItem.anh.toString()}" alt="anh" width="20%"></td>
            </tr>
        </c:forEach>
    
    </table>
</div>
</body>
</html>
