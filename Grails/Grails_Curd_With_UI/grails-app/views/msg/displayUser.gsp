<%--
  Created by IntelliJ IDEA.
  User: vikash
  Date: 27/10/17
  Time: 1:17 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title> User Information </title>
    <link rel="stylesheet" href="/untitled/static/css/bootstrap.css" type="text/css">
    <script src="/untitled/static/js/bootstrap.js"> </script>
</head>

<body class="container">
    <g:if test="${msg.equalsIgnoreCase("delete")}">
        <h2 class="form-control" style="color: red">${msg1}</h2>
    </g:if>
    <g:else>

<table>
    <tr>
        <th >Id : </th>
        <th class="form-control">${user?.id}</th>
    </tr>
    <tr>
        <th>Name : </th>
        <th class="form-control">${user?.name}</th>
    </tr>
    <tr>
        <th>Password : </th>
        <th class="form-control">${user?.pass}</th>
    </tr>
</table>
        <g:if test="${msg.equalsIgnoreCase("update")}">
            <h2 class="form-control" style="color: red">"You have Sucessfully Updated !!"</h2>
        </g:if>
        <g:else>
            <h2 class="form-control" style="color: red">You have Sucessfully Saved Object into the Database</h2>
        </g:else>
    </g:else>
<g:link action="create" class="btn btn-primary">New User</g:link>
<g:link action="displayAll" class="btn btn-primary">All User List</g:link>
</body>
</html>