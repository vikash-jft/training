<%--
  Created by IntelliJ IDEA.
  User: vikash
  Date: 1/11/17
  Time: 3:32 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>sucess</title>
    <link rel="stylesheet" type="text/css" href="${resource(dir: 'css', file: 'bootstrap.css')}"/>
    %{--<link rel="stylesheet" href="${resource(dir: 'js', file: 'bootstrap.js')}">--}%
    <style>
        #homeBody{
            width: 100%;
            height: 70%;
        }
        #item{
            background-color: azure;
            width: 25%;
            height: 300px;
            border: 10px solid white;
            text-align: center;
            color: black;
            float: left;
            margin: 0;
            margin-top: 10px;
            margin-bottom: 10px;
            padding: 0;
        }
        #item:hover{
            /*font-size: larger;*/
            text-align: center;
            border-bottom-left-radius: 30%;
            background-color: white;
            text-decoration: blink;

        }
        a:hover{
            text-decoration: blink;
        }
        #img{
            margin: 0%;
            padding: 0%;
        }
        p{
            margin-top: 2%;
            margin-bottom: 2%;
        }
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

    <body class="container" style="background: beige">
            <div class="row" style="background-color:azure;">
                <div class="col-md-1"><h3><g:link action='sucess' style="text-decoration: blink" > <g:img dir="images" file="jft.png" width="70px" height="40px" /> %{--Hello, <sec:username/>--}%</g:link></h3></div>
                <div class="col-lg-5" style="margin-top: 25px;">
                    <g:form controller="product" action="sucess">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search for..." name="search" value="${search}">
                        <span class="input-group-btn">
                            <input type="submit" class="btn btn-default" >Go!</input>
                        </span>
                    </div><!-- /input-group -->
                    </g:form>
                </div>
                <div class="col-md-2" style="text-align: right; margin-bottom: 0%"><h3 class="btn btn-default"><g:link controller='product' action="sucess" style="text-decoration: blink;" >Home</g:link></h3></div>
                <div class="col-md-2" style="text-align: center; margin-bottom: 2%"><h3 class="btn btn-default"><g:link controller='product' action="allAddedCart" style="text-decoration: blink;" >CART <b style="background-color: azure;padding: 3px; color: gold"> ${itemSize}</b></g:link></h3></div>
                <div class="col-md-2" style="text-align: left; margin-bottom: 0%;">
                   <h3>
                       <div class="dropdown">
                            <button class="btn btn-default dropdown-toggle" type="button" data-toggle="dropdown" style="width: "><sec:username/>
                                <span class="caret"></span></button>
                            <ul class="dropdown-menu" style="min-width: 45%;">
                                <li> <g:link controller='logout' style="text-decoration: blink;" >logout </g:link></li>
                            </ul>
                        </div>
                   </h3>
                </div>
            </div>

    <div id="homeBody">
        <g:each in="${allItem}" status="i" var="BusinessInstance"  >
            <g:link controller="product" action="itemDetail" id="${BusinessInstance.id}">
                <div class="row" id="item">
                    <p> ${BusinessInstance.itemName}</p>
                    <g:img id="img" dir="images" file="${BusinessInstance.itemPic}" width="70%" height="65%"/>
                    <p style="text-decoration: blink">&#8377; ${BusinessInstance.itemPrice}</p>
                    <g:link controller="product" action="addtocart" id="${BusinessInstance.id}" class="btn btn-default">Add To CART</g:link>
                </div>
            </g:link>
        </g:each>
    </div>
<br clear="all">
<div class="row" style="text-align: center;">
    <ul class="pagination" style="margin: 5px; text-align: center;">
        <li><g:paginate total="${itemInstanceCount ?: 0}" /></li>
    </ul>
</div>

<div class="row" style="background-color:azure; margin-bottom: 10px">
    <h4 class="col-md-12" style="text-align: center">Created by @ Jellyfish Technologies 2017</h4>
</div>
</body>
</html>