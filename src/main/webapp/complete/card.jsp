<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/7/28
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
    <title>完工汇报</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
   <script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
<%--    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">--%>
    <link rel="stylesheet" href="../css/huibao.css">

</head>
<body>
<div class="clearfix"></div>
<div class="content">
    <div class="search">
        <form action="ProcessFlowCardAndChildensList">
            <input type="text" name="CardNO" id="CardNO" placeholder="请输入工艺号" value="${cardNo.CardNO}">
           <input type="hidden" name="stepID" value="${stepID}">
            <input type="hidden" name="url" value="complete/card">
            <button type="submit" >查询</button>
        </form>

    </div>
    <div class="clearfix"></div>
    <div class="main">
        <ul>
<c:if test="${workcard.processFlowCard.cardNo!=null && workcard.processFlowCard.cardNo!='' && User.factID==workcard.processFlowCard.deptID}">
                <li><h2>工序卡号</h2><p>${workcard.processFlowCard.cardNo}</p></li>
                <li><h2>合同号</h2><p>${workcard.processFlowCard.contractNo}</p></li>
            <li><h2>任务编号</h2><p>${workcard.processFlowCard.wordNo}</p></li>
                <li><h2>产品名称</h2><p>${workcard.processFlowCard.itemName}</p></li>
                <li><h2>产品规格</h2><p>${workcard.processFlowCard.itemModel}</p></li>
                <li><h2>数量</h2><p>${workcard.processFlowCard.qty}</p></li>
                <li><h2>重量</h2><p>${workcard.processFlowCard.weight}</p></li>
                <li><h2>执行标准</h2><p>${workcard.processFlowCard.techStdNo}</p></li>

</c:if>

        </ul>
    </div>
<div class="hidden"></div>
</div>
<footer>

    <c:if test="${workcard.processFlowCard.cardNo!=null && workcard.processFlowCard.cardNo!=''&& User.factID!=workcard.processFlowCard.deptID}">
        <div class="alert alert-warning alert-dismissible " role="alert">
无权查看其他分厂的工艺流转卡信息！
        </div>
    </c:if>

    <%--<button onclick="location.href='create?stepID=${stepID}'"><img src="../img/btn_gongxu_txjgxx.png" alt=""></button>--%>
   <c:choose>
       <c:when test="${workcard.processFlowCard.cardNo!=null && workcard.processFlowCard.cardNo!='' && User.factID==workcard.processFlowCard.deptID}">
           <button class="wg button_info" onclick="location.href='create?stepID=${WorkStep.id}'"><%--<img src="../img/wg.png" alt=""></button>--%>完工汇报
           <button class="yc button_info" onclick="location.href='../exception/create?stepID=${WorkStep.id}'"><%--<img src="../img/yc.png" alt="">--%>异常汇报</button>
       </c:when>
       <c:otherwise>
           <button class="wg button_info" style="background: #dbdbdb !important;" disabled><%--<img src="../img/wg.png" alt="">--%>完工汇报</button>
           <button class="yc button_info" style="background: #dbdbdb !important;" disabled><%--<img src="../img/yc.png" alt="">--%>异常汇报</button>
       </c:otherwise>
   </c:choose>
        <button class="exit button_info" onclick="location.href='../Main?ID=${WorkStep.id}'"><%--<img src="../img/backmain.png" alt="">--%>返回首页</button>
</footer>
</body>
<style>
    .alert
    {
        margin: auto;
        margin-bottom: 1%;
        width: 90% !important;
 /*    height: 50px;
        line-height: 50px;*/
        border-radius: 2px;
        padding: 15px;
    }
    .alert-warning {
        color: rgb(138, 109, 59);
        background-color: rgb(252, 248, 227);
        border-color: rgb(249, 230, 204);
    }
</style>
</html>

