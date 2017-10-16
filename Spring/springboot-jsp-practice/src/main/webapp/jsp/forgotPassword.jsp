<html>
<head>
    <title>Login Page |</title>
</head>
<body>
<h2>Forgot Password |</h2>
<br>
<p style="color: red">${error}</p>
<form action="/forgotPassword/submitform" method="post">
    <table border="1" cellspacing="2" cellpadding="2">
        <tr>
            <th><label>UserName : </label></th>
            <th><input type="email" name="email" placeholder="Enter Email_Id :" required/></th>
        </tr>
        <tr>
            <th><label>New Password : </label></th>
            <th><input type="password" name="password" placeholder="Enter new password :" required/></th>
        </tr>
        <tr>
            <th><label>Conform Password : </label></th>
            <th><input type="password" name="password1" placeholder="Enter conform password :" required/></th>
        </tr>
        <tr>
            <th><input type="submit" value="Submit"/></th>
            <th><a href="${pageContext.request.contextPath}/addUser">Register Here</a></th>
        </tr>
        <tr>
            <th colspan="2"><a href="${pageContext.request.contextPath}/login">Login Here</a> </th>
        </tr>
    </table>
</form>
</body>
</html>