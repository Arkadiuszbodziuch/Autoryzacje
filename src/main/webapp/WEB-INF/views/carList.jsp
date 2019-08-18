<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-08-14
  Time: 01:03
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
        <th>vin</th>
        <th>brand</th>
        <th>model</th>
        <th>course</th>
        <th>enabled</th>
    </tr>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td>${car.id}</td>
            <td>${car.vin}</td>
            <td>${car.brand}</td>
            <td>${car.model}</td>
            <td>${car.course}</td>
            <td>${car.registrationNumber}</td>
            <td>${car.enabled}</td>
            <td>${car.nip}</td>
            <td><a href="delete/${car.id}">Delete</a> </td>
            <td><a href="edit/${car.id}">Edit</a> </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
