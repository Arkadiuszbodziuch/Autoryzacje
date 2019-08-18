<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<form:form method="post" modelAttribute="car">

    <br><br>
    <label for="vin">VIN</label>
    <form:input path="vin" id="vin" type="text"/>
    <form:errors path="vin" element="div"></form:errors>
    <br><br>
    <label for="brand">brand</label>
    <form:input path="brand" id="brand" type="text"/>
    <form:errors path="brand" element="div"></form:errors>
    <br><br>
    <label for="model">model</label>
    <form:input path="model" id="model" type="text"/>
    <form:errors path="model" element="div"></form:errors>
    <br><br>
    <label for="course">course</label>
    <form:input  path="course" id="course" type="number"/>
    <form:errors path="course" element="div"></form:errors>
    <br><br>
    <label for="registrationNumber">registrationNumber</label>
    <form:input  path="registrationNumber" id="registrationNumber" type="text"/>
    <form:errors path="registrationNumber" element="div"></form:errors>
    <br><br>
    <label for="nip">nip</label>
    <form:input  path="nip" id="nip" type="number"/>
    <form:errors path="nip" element="div"></form:errors>



    <input type="submit" value="Submit">

</form:form>

</body>
</html>
