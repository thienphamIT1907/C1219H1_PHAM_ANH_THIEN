<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Edit product</title>
</head>
<body>
<h1 style="text-align: center">
    <a href="list">List all Product</a>
</h1>

<div align="center">
    <form action="update" method="post">
        <table border="1" cellpadding="5">
            <caption>Edit product</caption>
            <tr>
                <td><input type="hidden" name="id" size="45" value="${productEdit.getId()}"></td>
            </tr>
            <tr>
                <th>Product name: </th>
                <td><input type="text" name="name" size="45" value="${productEdit.getName()}"></td>
            </tr>
            <tr>
                <th>Product price: </th>
                <td><input type="text" name="price" size="45" value="${productEdit.getPrice()}"></td>
            </tr>
            <tr>
                <th>Product description: </th>
                <td><input type="text" name="description" size="45" value="${productEdit.getDescription()}"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
