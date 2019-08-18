<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-08-14
  Time: 01:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>id</th>
        <th>username</th>
        <th>firstName</th>
        <th>lastName</th>
        <th>password</th>
        <th>enabled</th>
        <th>email</th>

    </tr>

    <c:forEach var="item" items="${users}">
        <tr>
            <td>${item.id}</td>
            <td>${item.username}</td>
            <td>${item.firstName}</td>
            <td>${item.lastName}</td>
            <td>${item.password}</td>
            <td>${item.enabled}</td>
            <td>${item.email}</td>
            <td><a href="delete/${item.id}">Delete</a> </td>
            <td><a href="edit/${item.id}">Edit</a> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
