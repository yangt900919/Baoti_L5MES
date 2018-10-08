<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/7/24
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"   %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Title</title>
    <jsp:include page="resources.jsp"></jsp:include>
    <link rel="stylesheet" type="text/css" href="css/main_sub.css">
</head>
<body class="container-fluid" >
<%--

<div class="page-box pad" align="center">

    <c:set var="begin" value="0"></c:set>
    <c:set var="end" value="0"></c:set>

    <c:if test="${factlist.size()%3==0}">
        <c:set var="end" value="${factlist.size()/3-1}"></c:set>
    </c:if>
    <c:if test="${factlist.size()%3!=0}">
        <c:set var="end" value="${(factlist.size()-factlist.size()%3)/3}"></c:set>
    </c:if>

    <c:forEach begin="${begin}" end="${end}" var="j">

<div class="box_line">

    <c:forEach begin="0" end="2" var="i">

    <c:choose>
        <c:when test="${i==factlist.size()%3 && j==end}">
        <div class="box-aside">
        </div>
        </c:when>
        <c:otherwise>
            <div class="box-aside" onclick="location.href='getWorkSteps?ID=${factlist[begin+i].id}&facname=${factlist[begin+i].displayName}'">
            <div class="box">
                <div class="box-head"><div class="circle"></div>${factlist[begin+i].displayName}</div>
                <div class="box-body">${factlist[begin+i].note}</div></div>
            </div>
        </c:otherwise>
    </c:choose>


    </c:forEach>
</div>
        <c:set var="begin" value="${begin+3}"></c:set>
    </c:forEach>
</div>
--%>


<div class="content phone">
    <ul>

        <c:forEach items="${factlist}" var="map">

            <li onclick="location.href='getWorkSteps?ID=${map.id}&facname=${map.displayName}'">
                <div class="title">
                    <div class="ico"><img src="img/${map.id}.png" /></div>
                    <div class="displayname"> <h1>${map.displayName}</h1></div>


                </div>
                <div class="tip">${map.note}</div>
            </li>

        </c:forEach>


    </ul>
</div>
<%--<footer class="phone">
    <button><img src="img/btn_shouye_lshbcx.png" alt=""></button>
</footer>--%>


</body>
<script>
    $(document).ready(function() {
        var width=$(".content li").width();
        /*alert(width*0.01);*/
        $(".content li").height(width*0.189);
    });
</script>
</html>
