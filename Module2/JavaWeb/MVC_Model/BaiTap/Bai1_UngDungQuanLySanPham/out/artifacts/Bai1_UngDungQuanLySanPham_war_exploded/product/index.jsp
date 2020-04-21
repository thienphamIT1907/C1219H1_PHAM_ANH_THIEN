<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Product Management</title>
</head>
<body>
<h1 style="text-align: center">Product Management</h1>
<h2 style="text-align: center">
    <a href="new">Add New Product</a>
    <a href="list">List Product</a>
</h2>

<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List Product</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Description</th>
            <th>Action</th>
        </tr>
        <c:forEach var="product" items="${productList}">
            <tr>
                <td><c:out value="${product.getId()}"/></td>
                <td><c:out value="${product.getName()}"/></td>
                <td><c:out value="${product.getPrice()}"/></td>
                <td><c:out value="${product.getDescription()}"/></td>
                <td>
                    <a href="edit?id=<c:out value='${product.getId()}'/>">Edit</a>
                    <a href="delete?id=<c:out value='${product.getId()}'/>">Delete</a>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
