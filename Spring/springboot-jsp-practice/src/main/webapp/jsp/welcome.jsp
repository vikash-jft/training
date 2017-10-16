<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Welcome |</title>
</head>
<body>
<h2>welcome ${user}</h2>
<a href="${pageContext.request.contextPath}/EditUser">Profile</a>&nbsp;&nbsp;&nbsp;&nbsp;
<a href="${pageContext.request.contextPath}/logout">Logout</a>
</body>
</html>