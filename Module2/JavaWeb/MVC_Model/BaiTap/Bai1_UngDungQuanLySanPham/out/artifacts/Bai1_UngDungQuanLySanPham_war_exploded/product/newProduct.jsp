<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Create new product</title>
</head>
<body>
<h1 style="text-align: center">
    <a href="list">List all Product</a>
</h1>

<div align="center">
    <form action="create" method="post">
        <table border="1" cellpadding="5">
            <caption>Add new product</caption>
            <tr>
                <th>Product Id: </th>
                <c:if test = "${message != null}">
                    <p style="color: red;">
                        <c:out value="${message}"/>
                    </p>
                </c:if>
                <td><input type="text" name="id" size="45"></td>
            </tr>
            <tr>
                <th>Product name: </th>
                <td><input type="text" name="name" size="45" value="${product.getName()}"></td>
            </tr>
            <tr>
                <th>Product price: </th>
                <td><input type="text" name="price" size="45" value="${product.getPrice()}"></td>
            </tr>
            <tr>
                <th>Product description: </th>
                <td><input type="text" name="description" size="45" value="${product.getDescription()}"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Create"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
