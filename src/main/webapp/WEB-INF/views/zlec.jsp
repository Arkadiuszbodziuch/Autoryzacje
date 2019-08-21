<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-08-18
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>




    <form:form method="post" modelAttribute="zlec" >
    <label for="numberDMS">First numberDMS</label>
        <form:input path="numberDMS" id="numberDMS" type="text"/>
        <form:errors path="numberDMS" element="div"></form:errors>
    <br><br>
        Numer Rejestracyjny <input type="text" name="string">


    <input type="submit" value="Submit">
    </form:form>




</body>
</html>
