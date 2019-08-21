<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-08-21
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
DUpa
<form:form method="post" modelAttribute="zlec" >
    <label for="numberDMS">First numberDMS</label>
    <form:input path="numberDMS" id="numberDMS" type="text"/>
    <form:errors path="numberDMS" element="div"></form:errors>
    <br><br>


    <form:select path="actions" items="${actions}" >

    </form:select>


    <input type="submit" value="Submit">
</form:form>

</form>
</body>
</html>
