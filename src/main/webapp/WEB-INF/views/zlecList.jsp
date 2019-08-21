<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-08-20
  Time: 22:15
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
        <th>numberDMS</th>
        <th>numberFV</th>
        <th>nip_CFM</th>
        <th>nip_Serwis</th>
        <th>registrationNumber</th>
        <th>Vin</th>
        <th>brand</th>
        <th>course</th>
        <th>numberAut</th>


    </tr>

    <c:forEach var="item" items="${users}">
        <tr>
            <td>${item.id}</td>
            <td>${item.numberDMS}</td>
            <td>${item.numberFV}</td>
            <td>${item.nip_CFM}</td>
            <td>${item.nip_Serwis}</td>
            <td>${item.registrationNumber}</td>
            <td>${item.Vin}</td>
            <td>${item.brand}</td>
            <td>${item.course}</td>
            <td>${item.numberAut}</td>
            <td><a href="delete/${item.id}">Delete</a> </td>
            <td><a href="edit/${item.id}">Edit</a> </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
