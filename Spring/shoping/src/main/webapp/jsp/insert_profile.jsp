<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product List |</title>
</head>
<body>
    <centre>
        <form method="post" action="/insertProfile" enctype="multipart/form-data">
        Product_Name :
            <input type="text" name="name"><br>
        Brand :
            <input type="text" name="brand"><br>
        Price :
            <input type="text" name="price"><br>
        Image :
            <input type="file" name="imagefile"><br>
            <input type="submit" name="Submit">
        </form
    </centre>
</body>
</html>
