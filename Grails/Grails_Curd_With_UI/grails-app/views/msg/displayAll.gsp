<%--
  Created by IntelliJ IDEA.
  User: vikash
  Date: 27/10/17
  Time: 1:28 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html xmlns="http://www.w3.org/1999/html">
<head>
    <title>All User List</title>
    <link rel="stylesheet" href="/untitled/static/css/bootstrap.css" type="text/css">
    <script src="/untitled/static/js/bootstrap.js"> </script>
</head>

<body class="container">
<p></p><p></p>
    <table class="table table-hover">
        <thead>
        <tr>
            <th>Id : </th>
            <th>Name : </th>
            <th>Job : </th>
            <th>Edit : </th>
            <th>Delete : </th>
        </tr>
        </thead>

        <g:each in="${userAllList}" var="user" status="i">
            <tbody>
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.pass}</td>
                <td><g:link action="Edit" class="btn btn-primary" id="${user.id}">Edit</g:link> </td>
                <td><g:link action="delete" class="btn btn-primary" id="${user.id}">Delete</g:link> </td>
            </tr>
            </tbody>
        </g:each>
    </table>
<g:link action="create" class="btn btn-primary" >Create New User</g:link>

</body>
</html>