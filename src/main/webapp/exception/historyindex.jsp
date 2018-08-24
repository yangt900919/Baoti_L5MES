<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/8/6
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
    <link rel="stylesheet" href="../css/cpindex.css">
    <script src="../js/jquery-3.3.1.min.js"></script>
</head>
<script>
    $(document).ready(function()
    {
        $("#month").val(${exceptionParam.type})
    });
    function query()
    {
        var type=$("#month").val();
       /* var startTime="";
        var endTime="";*/
        location.href="ExceptionFilterList?type="+type+"&processId=${WorkStep.id}&factId=${User.getFactID()}";
    }
</script>
<style>
    .content ul
    {
        margin-top: 0px !important;
    }
</style>
<body>
<div class="top">
    <div class="top-left">
        <select onchange="query()" id="month">
            <option value="1">一个月</option>
            <option value="3">三个月</option>
            <option value="6">半年</option>
            <option value="12">一年</option>
        </select>
    </div>
  <%--  <div class="top-right"></div>--%>
</div>
<%--<div class="clearfix" style="height: 20px"></div>--%>
<div style="height: 130px"></div>
<div class="content" >
        <ul>
            <c:forEach items="${exceptionList}" var="map">
                <li onclick="location.href='detail?ID=${map.id}'">
                    <div class="top-box">
                        <div class="right">
                            异常编号：${map.exceptionNo}

                        </div>
                        <div class="left">
                            <div class="right-top">异常分类：${map.classificatName}</div>
                            <div class="right-bottom">异常细类：${map.fineClassName}</div></div>
                    </div>
                    <div class="bottom-box">异常描述：${map.exceptionDesciption}</div>
                </li>
                <%-- <a href=""><li>
                     <div class="top-box">
                         <div class="right">
                             <div class="right-top">加工数量：20单位</div>
                             <div class="right-bottom">加工重量：20单位</div>
                         </div>
                         <div class="left">工序：工序内容</div>
                     </div>
                     <div class="bottom-box">生产顺号：12316883215646216031</div>
                 </li></a>--%>
            </c:forEach>
            <li style="background: none;border: none;height: 50px"></li>
        </ul>
    <%-- <div style="height: 180px;"></div>--%>

</div>
<footer>
    <button type="button" onclick="location.href='../Main?ID=${WorkStep.id}'"><img src="../img/backmain.png" alt=""></button>
</footer>
</body>
</html>
