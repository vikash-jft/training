<%--
  Created by IntelliJ IDEA.
  User: vikash
  Date: 27/10/17
  Time: 1:39 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edit User</title>
    <link rel="stylesheet" href="/untitled/static/css/bootstrap.css" type="text/css">
    <script src="/untitled/static/js/bootstrap.js"> </script>
</head>

<body class="container">
<g:form action="updateUser" class="form-inline" method="post">
    <label> Id : </label>
    <p><input type="number" class="form-control" name="id" value="${user.id}" readonly></p>
    <label> Name : </label>
    <p><input type="text" class="form-control" name="name" value="${user.name}"></p>
    <label> Job : </label>
    <p><input type="text" class="form-control" name="password" value="${user.pass}"></p>

    <input type="submit" class="btn btn-primary" value="Update">
</g:form>
<g:link action="create" class="btn btn-primary">Create New User</g:link>
</body>
</html>