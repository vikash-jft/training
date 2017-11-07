<%--
  Created by IntelliJ IDEA.
  User: vikash
  Date: 2/11/17
  Time: 11:45 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Item Details</title>
    <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'bootstrap.css')}"/>
    <style>
    .itemDetail_body{
        color: black;
        width: 40%;
        text-align: center;
        float: left;
        font-size: larger;
    }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body class="container" style="background: beige">
<div class="row" style="background-color:azure;">
    <div class="col-md-6"><h3><g:link action='sucess' style="text-decoration: blink;" ><g:img dir="images" file="jft.png" width="70px" height="35px" /> %{--Hello, <sec:username/>--}%</g:link></h3></div>
    <div class="col-md-2" style="text-align: right; margin-bottom: 0%"><h3 class="btn btn-default"><g:link controller='product' action="sucess" style="text-decoration: blink;" >Home</g:link></h3></div>
    <div class="col-md-2" style="text-align: center; margin-bottom: 1%"><h3 class="btn btn-default"><g:link controller='product' action="allAddedCart" style="text-decoration: blink;" >CART <b style="background-color: azure;padding: 3px; color: gold"> ${itemSize}</b></g:link></h3></div>
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

<div style="width: 100%;height: 70%">
    <div class="col-md-12" style="text-align: right">
        <h3>
            <p></p>
        </h3>
    </div>

    <g:each in="${itemDetail}" status="i" var="item"  >
        <div >
            <div class="itemDetail_body" style="float: left">
                <p><g:img dir="images" file="${item.itemPic}" style="width: 200px;height: 250px" /></p>
            </div>
            <div class="itemDetail_body">
                <p><br></p>

                <p>${item.itemName}</p>
                <p>Price : &#8377; <b id="price"> ${item.itemPrice} </b></p>
                <p>${item.itemColor}</p>
                <p>${item.itemSize}</p>
                <p>${item.itemType}</p>
                <div >
                    <button onclick="fun('sub')">-</button>
                    <button ><b id="quantity">1</b></button>
                    <button onclick="fun('plus')">+</button>
                </div>
                <p></p>
                <div style="margin-bottom: 10%">
                    <g:link controller="product" action="addtocart" id="${item.id}"><button class="btn btn-active">Add To Cart</button></g:link>
                    <g:link ><button class="btn btn-primary">Make Payment</button></g:link>
                </div>
            </div>
        </div>
        <br clear="all">
    </g:each>
</div>
<div class="row" style="background-color:azure">
    <h4 class="col-md-12" style="text-align: center">Created by @ Jellyfish Technologies 2017</h4>
</div>
</body>
<script>
      let p=document.getElementById('price').innerHTML
    function fun(opt) {
        if(opt == 'plus'){
            q=document.getElementById("quantity").innerHTML
            document.getElementById("quantity").innerHTML = 1+parseInt(q);
            document.getElementById('price').innerHTML=parseInt(p)*(parseInt(q)+1)
            return
        }
        else if(opt == 'sub') {
            q = document.getElementById("quantity").innerHTML
            if (parseInt(q) > 1) {
                document.getElementById("quantity").innerHTML = parseInt(q) - 1;
                document.getElementById('price').innerHTML=parseInt(p)*(parseInt(q)-1)
                return quantity
            }
            else {
                alert("you can't decrese less than 1 Item!!! ")
                return 1;
            }
            return
        }
    }
</script>
</html>