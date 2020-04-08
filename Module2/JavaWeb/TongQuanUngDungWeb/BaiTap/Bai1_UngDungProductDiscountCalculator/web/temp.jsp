<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 08/04/2020
  Time: 9:26 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>
        Bạn đã bị hack :
        <%
            String money = request.getParameter("price");
            out.print(money);
        %>
    </h1>
</body>
</html>
