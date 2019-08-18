<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ars
  Date: 23.11.18
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="user">
    <label for="firstNameId">First Name</label>
    <form:input path="firstName" id="firstNameId" type="text"/>
    <form:errors path="firstName" element="div"></form:errors>
    <br><br>
    <label for="lastNameId">Last Name</label>
    <form:input path="lastName" id="lastNameId" type="text"/>
    <form:errors path="lastName" element="div"></form:errors>
    <br><br>
    <label for="emailId">Email</label>
    <form:input path="email" id="emailId" type="email"/>
    <form:errors path="email" element="div"></form:errors>
    <br><br>
    <label for="passwordId">Password</label>
    <form:input path="password" id="passwordId" type="text"/>
    <form:errors path="password" element="div"></form:errors>
    <br><br>
    <label for="usernameID">User Name</label>
    <form:input path="username" id="usernameID" type="text"/>
    <form:errors path="username" element="div"></form:errors>
    <br><br>
    <label for="id">ID</label>
    <form:input path="id" id="id" type="text"/>
    <form:errors path="id" element="div"></form:errors>
    <br><br>
    <label for="enabled">enabled</label>
    <form:input  path="enabled" id="enabled" type="number"/>
    <form:errors path="enabled" element="div"></form:errors>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
