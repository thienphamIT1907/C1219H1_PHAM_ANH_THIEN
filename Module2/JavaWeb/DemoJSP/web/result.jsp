<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 06/04/2020
  Time: 8:44 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <%
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        int discount_percent = Integer.parseInt(request.getParameter("discount"));
        float discount = (float) (price * discount_percent * 0.01);
        float total = price - discount;

//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//        writer.println("<h1>Product description: " + description + "</h1>");
//        writer.println("<h1>Price: " + price + "</h1>");
//        writer.println("<h1>Discount percent: " + discount_percent + "</h1>");
//        writer.println("<h1>Discount: " + discount + "</h1>");
//        writer.println("<h1>Total: " + total + "</h1>");
//        writer.println("</html>");
    %>

    <h1>Product description: <%=description%></h1>
    <h1>Price: <%=price%></h1>
    <h1>Discount percent: <%=discount_percent%></h1>
    <h1>Discount: <%=discount%></h1>
    <h1>Total: <%=total%></h1>
</body>
</html>
