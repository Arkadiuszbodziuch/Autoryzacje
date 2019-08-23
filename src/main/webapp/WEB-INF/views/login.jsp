<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: arkadiusz
  Date: 2019-08-21
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en"><head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>SB Admin 2 - Login</title>

    <!-- Custom fonts for this template-->
    <link href="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body class="bg-gradient-primary">



<form method="post" action="/mylogin">
    <c:if test="${param.error != null}">


    </c:if>
    <c:if test="${param.logout != null}">

    </div>

    </c:if>
    <c:if test="${param.success != null}">


    </c:if>
<div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Welcome Back!</h1>
                                </div>
                                <form class="user">
                                    <div class="form-group">
                                        <input type="text" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                                             placeholder="email">
                                               <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>

<%--
                                        <input type="email" name="email" class="form-control form-control-user" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Enter Email Address...">
--%>
                                    </div>
                                    <div class="form-group">

                                        <label for="exampleInputPassword1">Password</label>
                                        <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="Password">

<%--
                                        <input type="password" name="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Password">
--%>
                                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

                                    </div>
                                    <div class="form-group">
                                        <div class="custom-control custom-checkbox small">
                                            <input type="checkbox" class="custom-control-input" id="customCheck">
                                            <label class="custom-control-label" for="customCheck">Remember Me</label>
                                        </div>
                                    </div>
                                    <button style="margin-top: 10px" type="submit" class="btn btn btn-primary btn-block">
                                        Login</button>

                                    </a>
                                    <hr>

                                </form>
                                <hr>
                                <div class="text-center">
                                    <a class="small" href="/buldingPage">Forgot Password?</a>
                                </div>
                                <div class="text-center">
                                    <a class="small" href="/myregistration">Create an Account!</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>

    </div>

</div>

</form>

<!-- Bootstrap core JavaScript-->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/jquery/jquery.min.js"></script>
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="https://blackrockdigital.github.io/startbootstrap-sb-admin-2/js/sb-admin-2.min.js"></script>




</body></html>