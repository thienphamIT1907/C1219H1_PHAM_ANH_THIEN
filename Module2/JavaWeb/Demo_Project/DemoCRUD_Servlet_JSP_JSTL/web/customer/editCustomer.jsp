<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Edit customer</title>
</head>
<body>
<h1 style="text-align: center">
    <a href="list">List all Customer</a>
</h1>

<div align="center">
    <form action="update" method="post">
        <table border="1" cellpadding="5">
            <caption>Edit customer</caption>
            <tr>
                <td><input type="hidden" name="id" size="45" value="${customerEdit.getId()}"></td>
            </tr>
            <tr>
                <th>Customer name: </th>
                <td><input type="text" name="name" size="45" value="${customerEdit.getName()}"></td>
            </tr>
            <tr>
                <th>Customer phone: </th>
                <td><input type="text" name="phone" size="45" value="${customerEdit.getPhone()}"></td>
            </tr>
            <tr>
                <th>Customer email: </th>
                <td><input type="text" name="email" size="45" value="${customerEdit.getEmail()}"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
