<%--
  Created by IntelliJ IDEA.
  User: vikash
  Date: 3/11/17
  Time: 11:06 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>View All Cart</title>
    <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'bootstrap.css')}"/>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
    .itemDetail_body {
        color: black;
        width: 40%;
        height: 250px;
        text-align: center;
        float: left;
    }

    </style>
</head>

<body class="container" style="background: beige">
<div class="row" style="background-color:azure;">
    <div class="col-md-6"><h3><g:link action='sucess'
                                      style="text-decoration: blink;"><g:img dir="images" file="jft.png" width="70px" height="35px" /> %{--Hello, <sec:username/>--}%</g:link></h3></div>

    <div class="col-md-2" style="text-align: right; margin-bottom: 0%"><h3 class="btn btn-default"><g:link controller='product' action="sucess" style="text-decoration: blink;" >Home</g:link></h3></div>

    <div class="col-md-2" style="text-align: center; margin-bottom: 1%"><h3 class="btn btn-default"><g:link
            controller='product' action="allAddedCart" style="text-decoration: blink;">CART <b style="background-color: azure;padding: 3px; color: gold"> ${itemSize}</b></g:link></h3>
    </div>

    <div class="col-md-2" style="text-align: left; margin-bottom: 0%">
        <h3>
            <div class="dropdown">
                <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown"><sec:username/>
                    <span class="caret"></span></button>
                <ul class="dropdown-menu" style="min-width: 45%;">
                    <li> <g:link controller='logout' style="text-decoration: blink;" >logout </g:link></li>
                </ul>
            </div>
        </h3>
    </div>
</div>
</div>

<div class="jumbotron" style="background-color: beige ; width: 100%; height: auto">
    <g:each in="${addedCartlist}" status="i" var="item">
        <div >
            <div class="itemDetail_body" style="float: left">
                <p><g:img id="img" dir="images" file="${item.itemPic}" width="90%" height="90%"/></p>
            </div>
        <div class="itemDetail_body">
            <p>${item.itemName}</p>

            <p>Price : &#8377; ${item.itemPrice}</p>

            <p>${item.itemColor}</p>

            <p>${item.itemSize}</p>

            <p>${item.itemType}</p>
        </div>
        <g:link controller="product"
                action="deleteItemToCart" id="${item.itemName}"><button class="btn btn-denger">Delete</button></g:link>
        </div>
        <br clear="all">
        <hr>
    </g:each>
    <br>
    <br>
    <br>

    <div style="text-align: center; margin-bottom: 0%">
        <g:link controller="product" action="sucess"><button class="btn btn-active">Home</button></g:link>
        <g:link><button class="btn btn-primary">Make Payment</button></g:link>
    </div>
</div>

<div class="row" style="background-color:azure; margin-bottom: 10%">
    <h4 class="col-md-12" style="text-align: center">Created by @ Jellyfish Technologies 2017</h4>
</div>
</body>

</html>