<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/8/4
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
    <script src="../js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../css/cpindex.css">
    <script src="../js/util.js"></script>
</head>
<script>

    $(document).ready(function()
    {
        $("#month").val(${cpparams.type});
        $("#type").val(${cpparams.classtype});
    });

    function query()
    {
        var type=$("#month").val();
        var classtype=$("#type").val();
        var url="";
        if(classtype==0)
        {
           url="WorkReportList?&type="+type;
        }
        else  if(classtype==1)
        {
            url="WorkReportListByTeam?teamId=${User.teamID}&type="+type;
        }
        else  if(classtype==2)
        {
            url="WorkReportListByProcess?processId=${WorkStep.id}&type="+type;
        }
       // alert(url);
        location.href=url+"&factId=${User.factID}&classtype="+classtype;
    }
</script>
<style>
    .content ul{
        margin-top: 0px!important;
    }

    select
    {
        height: 100%;
        width: 100%;
        border: none;
        font-size: 1em;

        /*  appearance:none;
          -moz-appearance:none;
          -webkit-appearance:none;*/
        border:none;
        background: none !important;
        color: #3c98ff;
        outline: none;
        padding-left: 40%;
    }
    @media screen and (max-width: 480px) {
        select
        {
            height: 100%;
            width: 100%;
            border: none;
            font-size: 0.8em;

            /*  appearance:none;
              -moz-appearance:none;
              -webkit-appearance:none;*/
            border:none;
            background: none !important;
            color: #3c98ff;
            outline: none;
            padding-left: 30%;
        }
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
    <div class="top-right" onchange="query()">
        <select id="type">
           <%-- <option value="0">按分厂查询</option>--%>
            <option value="1">按班组查询</option>
            <option value="2">按工序查询</option>
        </select>
    </div>
    <%--  <div class="top-right"></div>--%>
</div>
<%--<div class="clearfix" style="height: 20px"></div>--%>
<div style="height: 130px"></div>

<div class="content">


    <ul>
        <c:forEach items="${completelist}" var="map">
        <li onclick="location.href='detail?ID=${map.id}'">
            <div class="top-box">

                <div class="right">工序：${map.processName}</div>
                <div class="left">
                    <div class="right-top">汇报人：${map.completionUser}</div>
                    <div class="right-bottom">汇报时间：
                    <script>
                        document.write(new Date("${map.completionTime}").Format("YYYY-MM-DD hh:mm:ss"));
                    </script>
                    </div>
                </div>
            </div>
            <div class="bottom-box">生产顺号：${map.cardNo}</div>
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
