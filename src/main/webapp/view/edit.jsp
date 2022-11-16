<%--
  Created by IntelliJ IDEA.
  User: AAdmin
  Date: 11/14/2022
  Time: 2:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<div align="center">
  <form action="/edit" method="post">
    <h1>Create Product</h1>
    <table>
      <tr>
        <td>Nhập id</td>
        <td><input name="id" value="${toan.id}" readonly></td>
      </tr>
      <tr>
        <td>Nhập name</td>
        <td><input name="name" value="${toan.name}"></td>
      </tr>
      <tr>
        <td>Nhập img</td>
        <td><input name="img" value="${toan.img}"></td>
      </tr>
      <tr>
        <td>Nhập price</td>
        <td><input name="price" value="${toan.price}"></td>
      </tr>
    </table>
    <button type="submit">Submit</button>
  </form>
</div>
</body>
</html>


