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
    <title>包装汇报</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no,minimal-ui">
   <script type="text/javascript" src="../js/jquery-3.3.1.min.js"></script>
    <link rel="stylesheet" href="../css/huibao.css">

</head>
<body>
<div class="clearfix"></div>
<div class="content">
    <div class="search">
        <form action="../complete/ProcessFlowCardAndChildensList">
            <input type="text" name="CardNO" id="CardNO" placeholder="请输入工艺号" value="${cardNo.CardNO}">
           <input type="hidden" name="stepID" value="${stepID}">
            <input type="hidden" name="url" value="pack/card">
            <button type="submit" >查询</button>
        </form>

    </div>
    <div class="clearfix"></div>
    <div class="main">
        <ul>
<c:if test="${workcard.processFlowCard.cardNo!=null && workcard.processFlowCard.cardNo!=''}">
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
    <%--<button onclick="location.href='create?stepID=${stepID}'"><img src="../img/btn_gongxu_txjgxx.png" alt=""></button>--%>
   <c:choose>
       <c:when test="${workcard.processFlowCard.cardNo!=null && workcard.processFlowCard.cardNo!=''}">
           <button class="wg" onclick="location.href='../pack/create?stepID=${cardNo.stepID}'"><img src="../img/bz.png" alt=""></button>
           <button class="yc" onclick="location.href='../exception/create?stepID=${cardNo.stepID}'"><img src="../img/yc.png" alt=""></button>
       </c:when>
       <c:otherwise>
           <button class="wg" style="background: #dbdbdb !important;" disabled><img src="../img/bz.png" alt=""></button>
           <button class="yc" style="background: #dbdbdb !important;" disabled><img src="../img/yc.png" alt=""></button>
       </c:otherwise>
   </c:choose>
        <button class="exit" onclick="location.href='../Main?ID=${WorkStep.id}'"><img src="../img/backmain.png" alt=""></button>
</footer>
</body>
</html>

