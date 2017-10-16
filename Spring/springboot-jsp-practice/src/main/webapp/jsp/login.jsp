<html>
<head>
    <title>Login Page |</title>
</head>
<body>
<h2>Login here</h2>
<br>
<p style="color: red">${error}</p>
<form action="/welcome" method="post">
    <table border="1" cellspacing="2" cellpadding="2">
        <tr>
            <th><label>UserName : </label></th>
            <th><input type="text" name="user" placeholder="Enter user name :" required/></th>
        </tr>
        <tr>
            <th><label>Password : </label></th>
            <th><input type="password" name="pass" placeholder="Enter password here :" required/></th>
        </tr>
        <tr>
            <th><input type="submit" value="Login"/></th>
            <th><a href="${pageContext.request.contextPath}/forgotPassword">Forgot Password</a> </th>
        </tr>
        <tr>
            <th colspan="2"><a href="${pageContext.request.contextPath}/addUser">Register Here</a></th>
        </tr>
    </table>
</form>
</body>
</html>