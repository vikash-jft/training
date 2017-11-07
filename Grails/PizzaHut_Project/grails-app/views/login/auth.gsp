<%--
  Created by IntelliJ IDEA.
  User: vikash
  Date: 1/11/17
  Time: 1:17 PM
--%>


<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'bootstrap.css')}">
    <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'style.css')}">
</head>
<body class="container">
    <h3><g:link controller="product" action="register_user" class="register">Register</g:link></h3>

<div class="head">
    <h1 style="color: gold">WELCOME TO PIZZA HUT</h1>
</div>
    <div class="loginBox">
        <img src="${resource(dir: 'images', file: 'user.png')}" alt="user" class="user" width="80px" height="80px">
        <h2 style="color: white"> Log In Here </h2>
        <p><br></p>
        <g:if test='${flash.message}'>
            <p style="text-align: left; color: red;">${flash.message}</p>
        </g:if>
        <form  action='${postUrl}' method='POST' id='loginForm' class='cssform' autocomplete='off'>
            <p>
                <label for='username'><g:message code="springSecurity.login.username.label"/>:</label>
                <input type='text' class='text_' name='j_username' id='username' required autofocus/>
            </p>

            <p>
                <label for='password'><g:message code="springSecurity.login.password.label"/>:</label>
                <input type='password' class='text_' name='j_password' id='password' required autofocus/>
            </p>

            %{--<p id="remember_me_holder">
                <input type='checkbox' class='chk' name='${rememberMeParameter}' id='remember_me' <g:if test='${hasCookie}'>checked='checked'</g:if>/>
                <label for='remember_me'><g:message code="springSecurity.login.remember.me.label"/></label>
            </p>
--}%
            <p>
                <input type='submit' id="submit" class="btn btn-primary" value='${message(code: "springSecurity.login.button")}'/>
                <input type='reset' id="Reset" class="btn btn-primary" />
            </p>
        </form>

        %{--<h3><g:link controller="product" action="forgot_password" style="margin-left: 10%">Forgot Password</g:link></h3>--}%
    </div>
</body>
</html>