<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-08-19
  Time: 15:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en"><head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>APUD - Register</title>

    <!-- Custom fonts for this template-->
    <link href="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/css/sb-admin-2.min.css" rel="stylesheet">

</head>
<form:form method="post" action="/myregistration" modelAttribute="user">

<body class="bg-gradient-primary">

<div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
        <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
                <div class="col-lg-5 d-none d-lg-block "><img src="/resources/pic/APUD.png" class="image"></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                        </div>
                        <form class="user" onsubmit="return validate()">
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <form:input path="lastName" type="text" name="lastName" class="form-control"
                                                id="exampleInputLastName"
                                                aria-describedby="emailHelp" placeholder="Last Name"/>
                                    <form:errors path="lastName" cssClass="error" element="div"/>                                  </div>
                                <div class="col-sm-6">
                                    <form:input path="firstName" type="text" name="firstName" class="form-control"
                                                id="exampleInputFirstName"
                                                aria-describedby="emailHelp" placeholder="First name"/>
                                    <form:errors path="firstName" cssClass="error" element="div"/>                                </div>
                            </div>
                            <div class="form-group">
                                <form:input path="email" type="email" name="email" class="form-control" id="exampleInputEmail1"
                                            aria-describedby="emailHelp" placeholder="Email"/>
                                <form:errors path="email" cssClass="error" element="div"/>
                                <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.
                                </small>                         </div>
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">


                                    <form:input path="password" type="password" name="password" class="form-control"
                                                id="exampleInputPassword1" placeholder="Password"/>
                                    <form:errors path="password" cssClass="error" element="div"/>
                                    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
                                </div>
                                <div class="col-sm-6">
                                    <input type="password" class="form-control form-control-user" id="confirm_password" placeholder="Repeat Password">
                                </div>
                            </div>
                            <button style="margin-top: 10px" type="submit" class="btn btn btn-primary btn-block">Submit</button>

                            </a>
                            <hr>

                        </form>
                        <hr>
                        <div class="text-center">
                            <a class="small" href="/404">Forgot Password?</a>
                        </div>
                        <div class="text-center">
                            <a class="small" href="/mylogin">Already have an account? Login!</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </form:form>
</div>

<!-- Bootstrap core JavaScript-->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/jquery/jquery.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/resources/js/validate.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/js/sb-admin-2.min.js"></script>




</body>

    </html>











<%--
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
--%>
<%--
</html>--%>
