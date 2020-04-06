<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 05/04/2020
  Time: 1:14 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Demo Discount Calculator</title>
  <style>
    #content {
      width: 450px;
      margin: 0 auto;
      padding: 0 20px 20px;
      background: white;
      border: 1px solid black;
    }

    label {
      width: 10em;
      padding-right: 1em;
      float: left;
    }

    #data input {
      float: left;
      width: 15em;
    }

  </style>
</head>
<body>
<div id="content">
  <h1>Product discount calculator</h1>
  <form action="/result.jsp" method="post">
    <div id="data">
      <label>Product Description</label>
      <label>
        <input type="text" name="description">
      </label><br>
      <label>Price</label>
      <label>
        <input type="text" name="price">
      </label><br>
      <label>Discount percent</label>
      <label>
        <input type="text" name="discount">
      </label><br>
      <label>
        <input type="submit" value="Click to Discount">
      </label><br>
    </div>
  </form>
</div>
</body>
</html>
