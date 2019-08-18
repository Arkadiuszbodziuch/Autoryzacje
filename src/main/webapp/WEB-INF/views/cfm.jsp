<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="cfm">

    <<label for="name">name</label>
    <form:input path="name" id="name" type="text"/>
    <form:errors path="name" element="div"></form:errors>
    <br><br>
    <<label for="street">street</label>
    <form:input path="street" id="street" type="text"/>
    <form:errors path="street" element="div"></form:errors>
    <br><br>
    <<label for="city">city</label>
    <form:input path="city" id="city" type="text"/>
    <form:errors path="city" element="div"></form:errors>
    <br><br>
    <<label for="postcode">postcode</label>
    <form:input path="postcode" id="postcode" type="text"/>
    <form:errors path="postcode" element="div"></form:errors>
    <br><br>
    <<label for="nip">nip</label>
    <form:input path="nip" id="nip" type="text"/>
    <form:errors path="nip" element="div"></form:errors>
    <br><br>

    <input type="submit" value="Submit">

</form:form>
</body>
</html>
