<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product List |</title>
<style>
.div {
    background-color:grey;
    width:300px;
    border:2px solid red;
    height:200px;
    color:white;
    text-align:center;
    float:left;
   }
a{
    margin-top:100px;
    color:pink;

}
</style
</head>
<body>
    <centre>
        <c:forEach items="${obj}" var="temp">
            <div class="div">
                ${temp.name}
                <div class="img">
                    <img src="/uploaded_files${temp.image}" alt="Smiley face" height="150" width="200">
                </div>

                <a href="product_detail/${temp.id}">Details</a>
            </div>

        </c:forEach >

    <br><br clear="all"><br>
        <h3><a href="/insert_profile" style="color:red">Insert Product</a></h3><br><br><br>
    </centre>

</body>
</html>
