<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/8/2
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
    <%-- <jsp:include page="../resources.jsp"></jsp:include>--%>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/haibao-3.css">

    <script src="../js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
</head>
<script>
  $(document).ready(function()
  {
      $("#classificatName").val($("#classificatNo").find("option:selected").text());
      $("#fineClassName").val($("#fineClassNo").find("option:selected").text());
      <%--if(${exType.size()>0})--%>
      <%--{--%>
          $("#fineClassDesciption").val($("#fineClassNo").find("option:selected").attr("title"));
      // }
  });
    function getfineClass()
    {
        $("#classificatName").val($("#classificatNo").find("option:selected").text());

        $.ajax
        ({
            type: "get",
            url: "ExType",
            data: "ClassificatNo=" +$("#classificatNo").val(),
            contentType: "application/json; charset=UTF-8",
            dataType: "json",
            success: function (result) {
                $("#fineClassNo").empty();
                for(var i=0;i<result.length;i++)
                {
                    $("#fineClassNo").append("<option value='"+result[i].fineClassNo+"' title='"+result[i].fineClassDesciption+"'>"+result[i].fineClassName+"</option>")
                }
                $("#fineClassName").val($("#fineClassNo").find("option:selected").text());
                $("#fineClassDesciption").val($("#fineClassNo").find("option:selected").attr("title"));
            },
            error: function (result, data) {
                // alert(data);
            }
        });
    }

    function getfineClassName() {
        $("#fineClassName").val($("#fineClassNo").find("option:selected").text());
        $("#fineClassDesciption").val($("#fineClassNo").find("option:selected").attr("title"));
    }
</script>
<script>
   /* $(document).ready(function() {
        //initDate("data");

        $(".main").height($(document.body).height()-55);
        $(".main").css("overflow-y","scroll");
    });
*/
</script>
<style>
    .main-body
    {
margin-top: -50px;
    }
    .main
    {
        height: 79%;
    }
</style>
<body>
<form action="save" method="post">
    <input type="hidden" name="id" value="${model.id}">
    <input type="hidden" name="reportTime" value="${model.reportTime}">
    <input type="hidden" name="dealTime" value="${model.dealTime}">
    <input type="hidden" name="closeTime" value="${model.closeTime}">
    <input type="hidden" name="dealUser" value="${model.dealUser}">

    <input type="hidden" name="closeUser" value="${model.closeUser}">
    <input type="hidden" name="exceptionStatus" value="${model.exceptionStatus}">
    <input type="hidden" name="factId" value="${model.factId}">
    <input type="hidden" name="factName" value="${model.factName}">
    <input type="hidden" name="processId" value="${model.processId}">
    <input type="hidden" name="processName" value="${model.processName}">
    <input type="hidden" name="cardId" value="${model.cardId}">
    <input type="hidden" name="cardNo" value="${model.cardNo}">
    <input type="hidden" name="deptId" value="${model.deptId}">
    <input type="hidden" name="deptName" value="${model.deptName}">
    <input type="hidden" name="teamId" value="${model.teamId}">
    <input type="hidden" name="teamName" value="${model.teamName}">
    <input type="hidden" name="reportUser" value="${model.reportUser}">
    <div class="main-body">
    <div class="main">
        <ul>

             <input type="hidden" name="exceptionNo">
            <li><h3>异常分类</h3>
                <select name="classificatNo" id="classificatNo" onchange="getfineClass()">
                    <c:forEach items="${exClass}" var="map">
                        <option value="${map.classificatNo}">${map.classificatName}</option>
                    </c:forEach>

                </select>
                <input type="hidden" name="classificatName" id="classificatName" >
            </li>
            <li><h3>异常细类</h3>
                <select name="fineClassNo" id="fineClassNo" onchange="getfineClassName()">
                    <c:forEach items="${exType}" var="map">
                        <option value="${map.fineClassNo}" title="${map.fineClassDesciption}">${map.fineClassName}</option>
                    </c:forEach>

                </select>
                <input type="hidden" name="fineClassName" id="fineClassName">
            </li>
            <li >
                <h3>异常细类描述</h3>
                <input type="text" name="fineClassDesciption" id="fineClassDesciption" disabled style="background: none">
            </li>
            <li style="height: 120px;border-bottom: none;"><h3>异常描述</h3>
                <textarea cols="10" rows="3" name="exceptionDesciption" ></textarea>
            </li>


        </ul>

    </div>
    </div>
    <footer>
        <button type="submit"><img src="../img/rzxg.png" alt=""></button>
    </footer>
</form>
</body>
</html>
