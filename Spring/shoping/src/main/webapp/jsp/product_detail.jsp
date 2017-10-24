<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Details |</title>
</head>
<body>
    <centre>
        <table ${obj}>
            <tr>
                <th> Product_Id : </th><td>${obj.id}</td>
            </tr>
            <tr>
                <th>Product_Name : </th><td>${obj.name}</td>
            </tr>
            <tr>
                <th>Product_Brand : </th><td>${obj.brand}</td>
            </tr>
            <tr>
                <th>Product_Price : </th><td>${obj.price}</td>
            </tr>
            <tr>
                <th> <a href="/index">Cart $ Continue</a></th>
                <th> <a href="/paymentform">Make Payment</a></th>
            </tr>
        </table>
    </centre>
</body>
</html>
