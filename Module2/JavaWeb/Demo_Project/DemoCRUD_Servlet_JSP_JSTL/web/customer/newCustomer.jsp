<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Create new customer</title>
</head>
<body>
    <h1 style="text-align: center">
        <a href="list">List all Customer</a>
    </h1>

    <div align="center">
        <form action="create" method="post">
            <table border="1" cellpadding="5">
                <caption>Add new customer</caption>
                <tr>
                    <th>Customer Id: </th>
                    <c:if test = "${message != null}">
                        <p style="color: red;">
                            <c:out value="${message}"/>
                        </p>
                    </c:if>
                    <td><input type="text" name="id" size="45"></td>
                </tr>
                <tr>
                    <th>Customer name: </th>
                    <td><input type="text" name="name" size="45" value="${customer.getName()}"></td>
                </tr>
                <tr>
                    <th>Customer phone: </th>
                    <td><input type="text" name="phone" size="45" value="${customer.getPhone()}"></td>
                </tr>
                <tr>
                    <th>Customer email: </th>
                    <td><input type="text" name="email" size="45" value="${customer.getEmail()}"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Create"></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
