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
   <%-- <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="full-screen" content="yes">
    <meta name="x5-page-mode" content="app">--%>
    <link rel="stylesheet" type="text/css" href=" assets/global/plugins/bootstrap/css/bootstrap.css" />
   <link rel="stylesheet" type="text/css" href="css/login.css">
    <%--  <link rel="stylesheet" type="text/css" href="css/phonLogin.css" media="screen and(max-width: 480px  )">--%>

    <script type="text/javascript" src="js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src=" assets/global/plugins/bootstrap/js/bootstrap.min.js"></script>
   <%-- <script language="JavaScript">
        if (window != top)
            top.location.href = location.href;
    </script>--%>
</head>

<script>

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
            <c:if test="${msg!=''&&msg!=null }">
                <script>
                    alert("${msg}");
                </script>
                <%--<div class="alert alert-danger alert-dismissible" role="alert">
                    <a type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></a>
                        ${msg }
                </div>--%>
            </c:if>
             <%--   <c:if test="${msg!=''&&msg!=null }">
                    <div class="alert alert-danger alert-dismissible" role="alert">
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                            ${msg }
                    </div>
                </c:if>--%>
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
