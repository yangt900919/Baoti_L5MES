<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/8/6
  Time: 15:22
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
    <script src="../js/util.js"></script>
</head>


<%--<script>
    $(document).ready(function() {
        //initDate("data");

        $(".main").height($(document.body).height()-20);
        $(".main").css("overflow-y","scroll");
    });

</script>--%>
<style>
    .main-body
    {
        margin-top: -50px;
    }
    .main
    {
        height: 150%;
    }

</style>
<body>
<div class="main-body">
    <div class="main">
<ul>
<c:if test="${painfo.size()>0}">

    <li>  <h3>产品名称</h3><div>${painfo.get(0).productName}</div></li>
    <li>  <h3>规格</h3><div>${painfo.get(0).SPEC}</div></li>
    <li>  <h3>补充规格</h3><div>${painfo.get(0).itemModelMore}</div></li>
    <li>  <h3>牌号</h3><div>${painfo.get(0).brandName}</div></li>
    <li>  <h3>技术标准</h3><div>${painfo.get(0).techStdNo}</div></li>
    <li>  <h3>合同号</h3><div>${painfo.get(0).contractNo}</div></li>
    <li>  <h3>箱号</h3><div>${painfo.get(0).packNo}</div></li>
    <li>  <h3>包装方式</h3><div>${painfo.get(0).packType}</div></li>
    <li>  <h3>工艺卡号</h3><div>${painfo.get(0).cardNo}</div></li>
    <li>  <h3>生产任务编号</h3><div>${painfo.get(0).workNo}</div></li>
    <li>  <h3>包装数量</h3><div>${painfo.get(0).qty}</div></li>
    <li>  <h3>包装重量</h3><div>${painfo.get(0).weight}</div></li>
    <li>  <h3>摆放区号</h3><div>${painfo.get(0).positionNo}</div></li>
    <li>  <h3>包装时间</h3><div>
        <c:if test="${painfo.get(0).packTime !='' && painfo.get(0).packTime!=null }">
            <script>
                document.write(new Date("${painfo.get(0).packTime}").Format("YYYY-MM-DD hh:mm:ss"));
            </script>
        </c:if>
    </div></li>
    <li>  <h3>包装汇报人</h3><div>${painfo.get(0).packUser}</div></li>
    <li><h3>备注</h3><div>${painfo.get(0).comment}</div></li>
</c:if>
</ul>
<div style="height: 130px;"></div>
    </div></div>
<footer>
    <button type="button" onclick="location.href='../Main?ID=${WorkStep.id}'"><img src="../img/backmain.png" alt=""></button>
</footer>

</body>
</html>
