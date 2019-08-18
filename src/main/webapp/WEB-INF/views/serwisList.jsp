<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ars
  Date: 23.11.18
  Time: 10:03
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
        <th>name</th>
        <th>street</th>
        <th>city</th>
        <th>postcode</th>
        <th>nip</th>
        <th>enabled</th>

    </tr>

    <c:forEach var="item" items="${serwises}">
        <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.street}</td>
            <td>${item.city}</td>
            <td>${item.postcode}</td>
            <td>${item.nip}</td>
            <td>${item.enabled}</td>
            <td><a href="delete/${item.id}">Delete</a> </td>
            <td><a href="edit/${item.id}">Edit</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
