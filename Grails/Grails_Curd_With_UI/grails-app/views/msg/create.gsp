<%--
  Created by IntelliJ IDEA.
  User: vikash
  Date: 27/10/17
  Time: 2:21 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Create new User</title>
    <link rel="stylesheet" href="/untitled/static/css/bootstrap.css" type="text/css">
    <script src="/untitled/static/js/bootstrap.js"> </script>
</head>

<body class="container">
<form action="saveUser" class="form-inline" method="post">
        <div class="form-group">
                <h4 style="color: red">${msg}</h4>
        </div>
    <br>
        <div class="form-group">
            <label for="exampleInputName2">Name : </label>
            <input type="text" class="form-control" name="name" placeholder="Enter your Name : ">
        </div>
            <br>
        <div class="form-group">
            <label for="exampleInputName2">Job : </label>
            <input type="text" class="form-control" name="pass" placeholder="Enter Job : ">
        </div>
            <br>
        <div class="form-group">
            <input type="submit" class="btn btn-primary" value="ADD">
        </div>
    <g:link class="btn btn-primary" action="displayAll">All List</g:link>
</form>
</body>
</html>