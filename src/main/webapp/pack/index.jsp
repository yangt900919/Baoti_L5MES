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
    <script src="../js/util.js"></script>
</head>
<script>
    $(document).ready(function()
    {
        $("#month").val(${paParam.type})
    });
    function query()
    {
        var type=$("#month").val();
        var no=$("#packno").val();
        /* var startTime="";
         var endTime="";*/
        location.href="PackReportList?type="+type+"&factId=${User.getFactID()}&packNo="+no;
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
      <div class="top-right">
          <input type="text" id="packno" onblur="query()" value="${paparams.packNo}" placeholder="按箱号查询">
      </div>
</div>
<%--<div class="clearfix" style="height: 20px"></div>--%>
<div style="height: 130px"></div>
<div class="content" >
    <ul>
        <c:forEach items="${packlist}" var="map">
            <li onclick="location.href='detail?packNo=${map.packNo}'">
                <div class="top-box">

                    <div class="right">
                        <div class="right-top">箱号：${map.packNo}</div>
                        <div class="right-bottom">包装方式：${map.packType}</div></div>
                    <div class="left">
                        <div class="right-top">包装数量：${map.qty}</div>
                        <div class="right-bottom">包装重量：${map.weight}
                            <%--<script>
                                document.write(new Date("${map.packTime}").Format("YYYY-MM-DD hh:mm:ss"));
                            </script>--%>
                        </div>
                    </div>
                </div>
                <div class="bottom-box">
                    <div class="bottom-box-left">
                        包装汇报人：${map.packUser}
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                        包装时间：
                        <c:if test="${map.packTime !='' && map.packTime!=null }">
                            <script>
                                document.write(new Date("${map.packTime}").Format("YYYY-MM-DD hh:mm:ss"));
                            </script>
                        </c:if>
                    </div>
                    <div class="bottom-box-right">

                    </div>
                </div>
            </li>
        </c:forEach>
        <li style="background: none;border: none;height: 50px"></li>
    </ul>
    <%-- <div style="height: 180px;"></div>--%>

</div>
<footer>
    <c:if test="${savemsg!='' && savemsg!=null}">
        <div class="alert alert-success alert-dismissible " role="alert">
                ${savemsg}
        </div>
    </c:if>
    <button type="button" class="button_info" onclick="location.href='../Main?ID=${WorkStep.id}'"><%--<img src="../img/backmain.png" alt="">--%>返回首页</button>
</footer>
</body>
<style>
    .alert
    {

        width: 90% !important;
        /*        height: 50px;*/
        position: fixed;
        /*line-height: 50px;*/
        bottom: 50px;
        padding: 15px;
        margin-left: 5%;
        /*   display: none;*/
    }
    .alert-success {
        color: #3c763d;
        background-color: #dff0d8;
        border-color: #d6e9c6;
    }
</style>
<script>
    if($(".alert").length>0)
    {
        window.setTimeout(function(){
            $(".alert").css("display","none");
        },2000);
    }
</script>
</html>
