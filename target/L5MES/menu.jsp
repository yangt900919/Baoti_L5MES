<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/7/23
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<html>
<head>
    <title></title>
    <jsp:include page="resources.jsp"></jsp:include>
    <link rel="stylesheet" type="text/css" href="css/menu.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
  <%--  <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="full-screen" content="yes">
    <meta name="x5-page-mode" content="app">--%>
</head>
<body>

<%--    <div class="page-left pad">
        <ul class="sidenav" >


            <li class="nav-item">

                <div class="nav-item-icon">
                   &lt;%&ndash; <img src="images/1.1.png" width="44%" height="51.8%">&ndash;%&gt;

                       <span class="glyphicon glyphicon-user"></span>

                <div class="nav-item-name"> ${User.username}</div></div>
            </li>
            <li class="nav-item nav-active"  >
<a href="${page}" target="myiframe">
                <div class="nav-item-icon ">
                    <span class="glyphicon glyphicon-home"></span>

                <div class="nav-item-name">首页</div></div>
</a>
            </li>
            <li class="nav-item " onclick="location.href='Loginout'">
                <div class="nav-item-icon">
                    <span class="glyphicon glyphicon-off"></span>
                   &lt;%&ndash; <img src="images/1.3.png" width="35%" height="23.7%">&ndash;%&gt;

                <div class="nav-item-name"> 退出登录</div></div>
            </li>
        </ul>
    </div>--%>
<%--    <div class="page-right pad">
        <nav class="navbar navbar-default">
            <div class="container-fluid">

                <ul class="nav navbar-nav">
                    <li id="menu_list">
                        <img alt="Brand"  src="img/121.png" >
                    </li>
                </ul>
                <div class="navbar-header">
                    &lt;%&ndash;<a class="navbar-brand" href="#">&ndash;%&gt;
                        <img alt="Brand" id="logo" src="img/logo.png"  >
                   &lt;%&ndash; </a>&ndash;%&gt;
                </div>
                    <ul class="nav navbar-nav navbar-right">
                        <li class="factName" id="factName">${User.factName}</li>

                    </ul>

            </div><!-- /.container-fluid -->
        </nav>
        <div class="page-content">
          &lt;%&ndash;  ${AccessInfo.access_token}&ndash;%&gt;
            <iframe id=iframe frameborder="0" src="${page}" scrolling="yes" name=myiframe>

            </iframe>
        </div>
    </div>--%>


    <header  class="phone">
        <img src="img/img_shouye_top.png" alt="" >



        <div class="leave">

        </div>
        <div class="info"><div class="user">${User.username}</div>
            <div id="factName">${User.factName}</div></div>


    </header>

    <iframe id=iframe frameborder="0" src="${page}" scrolling="yes" name=myiframe class="phone">

    </iframe>

   <%-- <div class="content phone">


        &lt;%&ndash;<ul>
            <li>
                <div class="list-top"><div class="dot"></div><h1>熔铸厂</h1></div>
                <p>铸锭的熔炼生产！</p>
            </li>
        </ul>&ndash;%&gt;

    </div>--%>

</body>
<script>
    $(document).ready(function() {

        /*alert($(document.body).width());
        alert($(document.body).height());
        alert($(document.body).outerHeight(true));*/
      /*  $(".nav-item-icon").css("padding-top",($(".nav-item").height()-$(".nav-item-icon").height())/2);
        $(".page-content").height($(".page-right").height()-$(".navbar").height());*/
        //alert( $(".page-right").height()-parseInt($('.page-content').css('margin'))*2-$(".navbar").height() );
       /* $("#iframe").height($(".page-content").height()-3);*/
        /*alert($(".navbar").height());*/
       /* $("#iframe").height($(".page-content").height());*/
       // $("#logo").css("padding-top",2);

       /* alert($("#factName").width());
        $(".user").css("margin-left",$("#factName").width()*-1);*/

       $("#iframe").height($(document.body).height());

    });
</script>
</html>
