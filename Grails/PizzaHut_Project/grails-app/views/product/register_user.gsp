<%--
  Created by IntelliJ IDEA.
  User: vikash
  Date: 1/11/17
  Time: 1:53 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Register Here</title>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'bootstrap.css')}">
    <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'style.css')}">
</head>

<body class="container">
<h3><g:link action="login_user" class="register">Log In Here</g:link></h3>
        <div class="loginBox">
            <img src="${resource(dir: 'images', file: 'user.png')}" alt="user" class="user" width="80px" height="80px">
            <h2 style="color: white"> Register Here </h2>
            <form action="save_user" method="post" class="form-inline" >
                <div class="form-group">
                    <label for="exampleInputEmail2" >User Name : </label>
                    <input type="text" class="form-control" name="username" placeholder="Enter Your Name" required autofocus>
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail2">Email : </label>
                    <input type="email" class="form-control" name="email" placeholder="Enter Valid Email_id" required autofocus>
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail2">Password : </label>
                    <input type="password" class="form-control" name="password" placeholder="**********" required autofocus>
                </div>
                <div class="form-group">
                    <label for="exampleInputEmail2">Address : </label>
                    <input type="text" class="form-control" name="address" placeholder="Enter Address" required autofocus>
                </div>

                <button type="submit" class="btn btn-primary">Submit</button>
                <button type="reset" class="btn btn-primary">Reset</button>
            </form>
        </div>
</body>
</html>