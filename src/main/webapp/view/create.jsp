<%--
  Created by IntelliJ IDEA.
  User: AAdmin
  Date: 11/14/2022
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="/create" method="post" enctype="multipart/form-data">
        <h1>Create Product</h1>
        <table>
            <tr>
                <td>Nhập id</td>
                <td><input name="id" placeholder="nhập id"></td>
            </tr>
            <tr>
                <td>Nhập name</td>
                <td><input name="name" placeholder="nhập name"></td>
            </tr>
            <tr>
                <td>Nhập img</td>
                <td><input name="imgFile" placeholder="nhập img" type="file"></td>
            </tr>
            <tr>
                <td>Nhập price</td>
                <td><input name="price" placeholder="nhập price"></td>
            </tr>
        </table>
        <button type="submit">Submit</button>
    </form>
</div>
</body>
</html>
