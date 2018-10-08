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
    <script>
        /*alert($("#factName",parent.document));*/
        var size=${workStepsList.size()};
     /*   alert(size);*/
        if(size>0)
        {
            var text="${workStepsList[0].deptName}";
            $("#factName",parent.document).text(text);
        }
        else
        {
            $("#factName",parent.document).text("");
        }

        if(${workStepsList.size()}==0)
        {
            alert("当前工厂无工序!");
            location.href="javascript:history.go(-1)";

        }

    </script>
</head>
<body class="container-fluid" >
<c:if test="${workStepsList.size()>0}">
<%--<div class="page-box pad" align="center">

    <c:set var="begin" value="0"></c:set>
    <c:set var="end" value="0"></c:set>

    <c:if test="${workStepsList.size()%3==0}">
        <c:set var="end" value="${workStepsList.size()/3-1}"></c:set>
    </c:if>
    <c:if test="${workStepsList.size()%3!=0}">
        <c:set var="end" value="${(workStepsList.size()-workStepsList.size()%3)/3}"></c:set>
    </c:if>

    <c:forEach begin="${begin}" end="${end}" var="j">

<div class="box_line">

    <c:forEach begin="0" end="2" var="i">

    <c:choose>
        <c:when test="${i==workStepsList.size()%3 && j==end}">
        <div class="box-aside">
        </div>
        </c:when>
        <c:otherwise>
            <div class="box-aside">
            <div class="box">
                <div class="box-head"><div class="circle"></div>${workStepsList[begin+i].workingProcedureName}</div>
                <div class="box-body">${workStepsList[begin+i].workingProcedureDescription}</div></div>
            </div>
        </c:otherwise>
    </c:choose>


    </c:forEach>
</div>
        <c:set var="begin" value="${begin+3}"></c:set>
    </c:forEach>
</div>--%>

<div class="content phone">


    <ul>



        <c:forEach items="${workStepsList}" var="map">

                <li onclick="location.href='Main?ID=${map.id}'">
                    <div class="title">
                        <%--<div class="ico"></div>--%>
                        <div class="displayname">  <h1>${map.operName}</h1></div>
                    </div>
                    <div class="tip">${map.operDescription}</div>

                </li>

        </c:forEach>


    </ul>
</div>
</c:if>
</body>
<script>
    $(document).ready(function() {
        var width=$(".content li").width();
        /*alert(width*0.01);*/
        $(".content li").height(width*0.189);

      /*  alert($("#factName").width());
        $(".user").css("margin-left",$("#factName").width()*-1);*/
    });
</script>
</html>
<style>
    h1
    {
        padding-left: 0px !important;
    }
</style>