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
   <%-- <jsp:include page="../resources.jsp"></jsp:include>--%>
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/haibao-3.css">

    <script src="../js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="../js/bootstrap.js"></script>
    <script src="../js/util.js"></script>
    <%--<script language="javascript" type="text/javascript" src="../My97DatePicker/WdatePicker.js"></script>--%>
</head>
<style>
    #main1
    {
        height: 120%;
    }
    #main2,#main3
    {
        height: 70%;
    }
</style>
<body>
<form action="save" method="post">
<%--    <input type="hidden" name="id" value="${model.id}">--%>
    <input type="hidden" name="qaCheckTime" value="${model.QACheckTime}">
    <input type="hidden" name="qaCheckUser" value="${model.QACheckUser}">
    <input type="hidden" name="beginTime" value="${model.beginTime}">
    <input type="hidden" name="completionUser" value="${model.completionUser}">
    <input type="hidden" name="completionUserTeam" value="${model.completionUserTeam}">
    <input type="hidden" name="beginUser" value="${model.beginUser}">
    <input type="hidden" name="beginUserTeam" value="${model.beginUserTeam}">
    <input type="hidden" name="processId" value="${model.processId}">
    <input type="hidden" name="cardId" value="${model.cardId}">
    <input type="hidden" name="cardNo" value="${model.cardNo}">
    <input type="hidden" name="cardLineNo" value="${model.cardLineNo}">
    <input type="hidden" name="factId" value="${model.factId}">
    <input type="hidden" name="factName" value="${model.factName}">
    <input type="hidden" name="deptId" value="${model.deptId}">
    <input type="hidden" name="deptName" value="${model.deptName}">
    <input type="hidden" name="teamId" value="${model.teamId}">
    <input type="hidden" name="teamName" value="${model.teamName}">
    <input type="hidden" name="reportNo" value="${model.reportNo}">
    <input type="hidden" name="processName" value="${model.processName}" >


    <div class="main-top">
        <ul class="nav nav-tabs" role="tablist" id="myTabs">
            <li role="presentation" class="active"><a href="#wg" aria-controls="home" role="tab" data-toggle="tab">完工</a></li>
            <li role="presentation"><a href="#jyl" aria-controls="profile" role="tab" data-toggle="tab">节余料</a></li>
            <li role="presentation"><a href="#fl" aria-controls="profile" role="tab" data-toggle="tab">废料</a></li>
        </ul>
    </div>
    <div class="main-body">
        <div class="tab-content">
            <div role="tabpanel" class="tab-pane active" id="wg">
                <div class="main" id="main1">
                    <ul>
                        <li><h3>工艺卡号</h3>
                            <input type="text" name="cardNo" value="${model.cardNo}" readonly>


                            <%--<input type="hidden" name="">--%>
                        </li>

                        <li><h3>加工日期</h3> <input type="datetime-local" name="completionTime" id="data" ></li>
                        <li><h3>班别</h3>
                            <select>
                                <option value="白班">白班</option>
                                <option value="夜班">夜班</option>
                                <option value="中班">中班</option>

                            </select>
                        </li>
                        <li><h3>加工设备</h3>
                            <select name="machiningEquipment">

                                <c:forEach items="${equip}" var="map">
                                    <option value="${map.equipment}">${map.equipment}</option>
                                </c:forEach>
                            </select>
                        </li>
                        <li><h3>加工数量</h3>
                            <input type="text" name="completionQty" value="0">
                        </li>

                        <li><h3>加工重量</h3>
                            <input type="text" name="completionWeight" value="0">
                        </li>

                        <li><h3>加工规格</h3>
                            <input type="text" name="completionSPEC" >
                        </li>
                        <li><h3>摆放位置</h3>
                            <input type="text" name="cositionNo">
                        </li>
                        <li style="height: 120px;border-bottom: none;"><h3>备注</h3>
                         <br> <textarea cols="10" rows="3" name="comment"></textarea>
                        </li>
                    </ul>
                    <div style="height: 130px;"></div>
                </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="jyl">
                <div class="main" id="main2">
                    <ul>
                        <li><h3>节余料规格</h3>
                            <input type="text" name="surplusSPEC">
                        </li>
                        <li><h3>节余数量</h3>
                            <input type="text" name="surplusQty" value="0">
                        </li>
                        <li><h3>节余重量</h3>
                            <input type="text" name="surplusWeight" value="0">
                        </li>
                        <li><h3>摆放位置</h3>
                            <input type="text" name="surplusPositionNo" >
                        </li>
                    </ul>
                </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="fl">
                <div class="main" id="main3">
                    <ul>
                        <li><h3>废料规格</h3>
                            <input type="text" name="wasteSPEC">
                        </li>
                        <li><h3>废料数量</h3>
                            <input type="text" name="wasteQty" value="0">
                        </li>
                        <li><h3>废料重量</h3>
                            <input type="text" name="wasteWeight" value="0">
                        </li>
                    </ul>
                </div>
            </div>
        </div>

    </div>




<footer>
    <button type="submit"><img src="../img/rzxg.png" alt=""></button>
</footer>
</form>
</body>
</html>
<script>


    function initDate(ID)
    {
        var date=new Date().Format("yyyy-MM-ddThh:mm");
        /*alert(date.substring(0,16));*/
        $("#"+ID).val(date);
    }
    $(document).ready(function() {
        initDate("data");

       /* $(".main").height($(document.body).height()-55);
        $(".main").css("overflow-y","scroll");*/
    });

</script>
<style>
    #data
    {
        font-size: 1em!important;
    /*    font-weight: bold;*/
    }
</style>