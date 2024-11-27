<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    <html>
        <head>
            <meta charset="UTF-8">
            <meta name="viewport"
                content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
            <meta http-equiv="X-UA-Compatible" content="ie=edge">
            <title>Create user</title>
            <!-- Latest compiled and minified CSS -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
            <!-- Latest compiled JavaScript -->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
            <link rel="stylesheet" href="/css/demo.css">
        </head>


        <body>
            <div class="container mt-5">
                <div class="row">
                    <!--  -->
                    <div class="col-md-6 col-12 mx-auto">
                        <h3>Create a user</h3>
                        <hr />
                        <form:form method="post" action="/admin/user/create1" modelAttribute="newUser">
                            <div class="mb-3">
                                <label class="form-label">Email:</label>
                                <form:input type="email" class="form-control" path="email" />
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Password:</label>
                                <form:input type="password" class="form-control" path="password" />
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Phone number:</label>
                                <form:input type="text" class="form-control" path="phone" />
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Full Name:</label>
                                <form:input type="text" class="form-control" path="fullName" />
                            </div>
                            <div class="mb-3">
                                <label class="form-label">Address:</label>
                                <form:input type="text" class="form-control" path="address" />
                            </div>
                            <button type="submit" class="btn btn-primary">Create</button>
                        </form:form>
                    </div>
                </div>
            </div>
        </body>
    </html>