
<html>
<head>
    <title>Login Page |</title>
</head>
<body>
<h2>Login here</h2>
<br>

<p style="color: red">${error}</p>
<form action="/addUser/submitForm" method="post">
    <p><label>User Name : </label>
    <input type="text" name="name" placeholder="Enter Username here :" required/></p>
    <p><label>Password : </label>
    <input type="password" name="password" placeholder="Enter Password here :" required/></p>
    <p><label>Age : </label>
    <input type="text" name="age" placeholder="Enter Age here :" required/></p>
    <p><label>Email : </label>
    <input type="email" name="email" placeholder="Enter Salary here :" required/></p>
    <!--<p><label>Skill: </label></p>
    <p><select name="skill" multiple>
        <option value="java">core java</option>
        <option value="adv. java">adv. java</option>
        <option value="php">php</option>
        <option value=".net">.net</option>
        <option value="java script">java script</option>
        </select>
    </p>-->
    <p><input type="submit" value="Register"/>&nbsp;&nbsp;&nbsp;<input type="reset" value="Reset"/></p>
    <br/><p><a href="${pageContext.request.contextPath}/login">click here to login</a></p>
</form>
</body>
</html>