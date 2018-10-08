<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/8/6
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/haibao-3.css">

    <script src="../js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
</head>
<script src="../js/util.js"></script>
<script>
    /*$(document).ready(function() {
        //initDate("data");

        $(".main").height($(document.body).height()-55);
        $(".main").css("overflow-y","scroll");
    });*/

</script>
<style>
    .main-body
    {
        margin-top: -50px;
    }
    .main
    {
        height: 100%;
    }
.save img
{
    width: 25%!important;
}
</style>
<body>
<div class="main-body">
<div class="main">
    <ul>
        <c:if test="${exinfo.size()>0}">
            <%--<li><h3>分厂名称</h3><div class="main_div">${exinfo.get(0).factName}</div></li>
            <li><h3>工序名称</h3><div class="main_div">${exinfo.get(0).processName}</div></li>
            <li><h3>车间</h3><div class="main_div">${exinfo.get(0).deptName}</div></li>
            <li><h3>班组</h3><div class="main_div">${exinfo.get(0).teamName}</div></li>--%>
            <li><h3>异常编号</h3><div class="main_div">${exinfo.get(0).exceptionNo}</div></li>
            <li><h3>分类编号</h3><div class="main_div">${exinfo.get(0).classificatNo}</div></li>
            <li><h3>分类名称</h3><div class="main_div">${exinfo.get(0).classificatName}</div></li>
            <li><h3>细类编号</h3><div class="main_div">${exinfo.get(0).fineClassNo}</div></li>
            <li><h3>细类名称</h3><div class="main_div">${exinfo.get(0).fineClassName}</div></li>
            <%--  <li><h3>报告人</h3><div class="main_div">${exinfo.get(0).reportUser}</div></li>
            <li><h3>报告时间</h3><div class="main_div">${exinfo.get(0).reportTime}</div></li>--%>
            <li><h3>处理人</h3><div class="main_div">${exinfo.get(0).dealUser}</div></li>
            <li><h3>处理时间</h3><div class="main_div">
                <c:if test="${exinfo.get(0).dealTime !='' && exinfo.get(0).dealTime!=null }">
                    <script>
                        document.write(new Date("${exinfo.get(0).dealTime}").Format("YYYY-MM-DD hh:mm:ss"));
                    </script>
                </c:if>
                    </div></li>
            <li><h3>关闭人</h3><div class="main_div">${exinfo.get(0).closeUser}</div></li>
            <li><h3>关闭时间</h3><div class="main_div">
                <c:if test="${exinfo.get(0).closeTime!='' && exinfo.get(0).closeTime!=null}">
                <script>
                    document.write(new Date("${exinfo.get(0).closeTime}").Format("YYYY-MM-DD hh:mm:ss"));
                </script>
                </c:if>
                    </div></li>
            <li><h3>关闭状态</h3><div class="main_div">
                <%--${exinfo.get(0).exceptionStatus}--%>
                <c:choose>
                    <c:when test="${exinfo.get(0).exceptionStatus==0}">未关闭</c:when>
                    <c:otherwise>关闭</c:otherwise>
                </c:choose>
            </div></li>
            <li style="height: 120px; border-bottom: none"><h3>异常描述</h3>
                <div style="word-wrap: break-word; word-break: normal;line-height: 20px;
   ">${exinfo.get(0).exceptionDesciption}</div></li>


        </c:if>

    </ul>
    <div style="height: 130px;"></div>
    <footer>
    <c:choose>
    <c:when test="${exinfo.size()>0 && exinfo.get(0).exceptionStatus==0 && exinfo.get(0).dealUser!='' && exinfo.get(0).dealUser!=null}">

    <button class="save button_info" onclick="location.href='close?id=${exinfo.get(0).id}'">
    <%--    <img src="../img/close.png" alt="">--%>关闭
    </button>

    </c:when>
        <c:otherwise>
            <button class="save button_info" disabled style="background: #dbdbdb !important;"><%--<img src="../img/close.png" alt="" >--%>关闭</button>

        </c:otherwise>
    </c:choose>
        <button class="exit button_info" onclick="location.href='../Main?ID=${WorkStep.id}'"><%--<img src="../img/backmain.png" alt="">--%>返回首页</button>
    </footer>
</div>
</div>
</body>
</html>
