<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-08-19
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>APUD</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href='<c:url value="/resources/css/style.css"/>' rel="stylesheet" type="text/css">
    <script src="https://kit.fontawesome.com/c395dd8104.js"></script>

</head>
<body class="d-flex justify-content-center">
<div class="col-lg-2">
    <div style="margin-top: 150px">
        <div style="margin-top: 150px">
            <div class="margin-custom">
                <img src="https://bcassetcdn.com/preview/logodraft/a6130a3e-4261-4aad-b1da-74c4fce9813f/logo/large.png?fillmode=clip">
            </div>
            <form:form method="post" action="/myregistration" modelAttribute="user">
                <h1><p class="text-success">Registration <i class="fas fa-address-card"></i></p></h1>
                <div class="form-group">
                    <label for="exampleInputEmail1">Email</label>
                    <form:input path="email" type="text" name="email" class="form-control" id="exampleInputEmail1"
                                aria-describedby="emailHelp" placeholder="Email"/>
                    <form:errors path="email" cssClass="error" element="div"/>
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.
                    </small>
                </div>
                <div class="form-group">
                    <label for="exampleInputFirstName">First Name</label>
                    <form:input path="firstName" type="text" name="firstName" class="form-control"
                                id="exampleInputFirstName"
                                aria-describedby="emailHelp" placeholder="First name"/>
                    <form:errors path="firstName" cssClass="error" element="div"/>
                </div>
                <div class="form-group">
                    <label for="exampleInputLastName">Last Name</label>
                    <form:input path="lastName" type="text" name="lastName" class="form-control"
                                id="exampleInputLastName"
                                aria-describedby="emailHelp" placeholder="Last Name"/>
                    <form:errors path="lastName" cssClass="error" element="div"/>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">Password</label>
                    <form:input path="password" type="password" name="password" class="form-control"
                                id="exampleInputPassword1" placeholder="Password"/>
                    <form:errors path="password" cssClass="error" element="div"/>
                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

                    <button style="margin-top: 10px" type="submit" class="btn btn btn-primary btn-block">Submit</button>
                </div>
            </form:form>
        </div>

    </div>
</div>
</body>
</html>