<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/7/23
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
<%--
    <jsp:include page="resources.jsp"></jsp:include>--%>
   <link rel="stylesheet" type="text/css" href="css/login.css">

    <script type="text/javascript" src="js/jquery-3.3.1.js"></script>


</head>
<style>
 /*   .alert-warning {
        color: #8a6d3b;
     !*   background-color: #fcf8e3;
        border-color: #faebcc;*!
    }
    .alert {
        margin-left: 15px;
        !*margin: auto;
        padding: 15px;
      !*  margin-bottom: 5px;*!
        border: 1px solid ;
        border-radius: 4px;
        text-shadow: 0 1px 0 rgba(255,255,255,.2);
        -webkit-box-shadow: inset 0 1px 0 rgba(255,255,255,.25), 0 1px 2px rgba(0,0,0,.05);
        box-shadow: inset 0 1px 0 rgba(255,255,255,.25), 0 1px 2px rgba(0,0,0,.05);*!
        width: 65%;

    }*/

</style>
<script>

    $(document).ready(function()
    {
        if("${msg}"!=""&&"${msg}"!=null)
        {
            $("#usernameOrEmailAddress").attr("placeholder","${msg}");
            //$("#usernameOrEmailAddress").css("color","red");
        }
        else
        {
            $("#usernameOrEmailAddress").attr("placeholder","用户名或邮箱地址");
            //$("#usernameOrEmailAddress").css("color","#686868");
        }
    });

    addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){
        window.scrollTo(0,1);
    }
    function submitform()
    {
        var docElm = document.documentElement;

        //W3C
        if (docElm.requestFullscreen) {
            docElm.requestFullscreen();
        }
//FireFox
        else if (docElm.mozRequestFullScreen) {
            docElm.mozRequestFullScreen();
        }
//Chrome等
        else if (docElm.webkitRequestFullScreen) {
            docElm.webkitRequestFullScreen();
        }

        $("form").submit();
    }
//IE11
 /*   else if (elem.msRequestFullscreen) {
        elem.msRequestFullscreen();
    }*/
</script>
<style>
/*    #usernameOrEmailAddress:-moz-placeholder,  #usernameOrEmailAddress::-webkit-input-placeholder,  #usernameOrEmailAddress:-ms-input-placeholder
    {
        color: red;
    }*/
</style>
<body>
<div class="pad">
    <script>
       /* $(function () {

            /!*alert($(document.body).width());
            alert($(".pad").css("display"));*!/

            function distance(){
                var winWid = $(window).width();
                var winHei = $(window).height();
                var imgWid =$('.all img').outerWidth();
                var imgHei =$('.all img').outerHeight();
                var fomWid = $('.fom').outerWidth();
                $('.all img').css('height', imgWid*0.63);
                $('.container').css('margin-left', imgWid*0.25).css('margin-top', imgWid*(-0.43));

            }
            distance();
            window.onresize = function(){
                distance();
            }
        })*/
    </script>
</div>




<div class="all">

    <img src="img/bj2.jpg" alt="" style="width: 100%; height: 1200px; position: relative;" class="pad">
    <header class="phone">
        <img src="img/img_denglu_logo.png" alt="">
    </header>
    <div class="clearfix phone"></div>
    <div class="container ">
        <div class="content ">



        <form method="post" action="Login" class="fom" target="_top">
            <input type="text" class="form-control" id="usernameOrEmailAddress" name="usernameOrEmailAddress" placeholder="用户名或邮箱地址">
            <input type="password" class="form-control" id="password" name="password" placeholder="密码">
            <button class="phone" type="submit" ><img src="img/btn_denglu_denglu.png" alt="" width="80"></button>
        </form>
        </div>
    </div>


</div>
</body>
</html>
