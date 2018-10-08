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
    .main-body
    {
        margin-top: -50px;
    }
    .main
    {
        height: 130%;
    }
</style>
<body>
<form action="save" method="post">
<%--    <input type="hidden" name="id" value="${model.id}">--%>
    <%--<input type="hidden" name="PackNo" value="${model.packNo}">--%>
    <input type="hidden" name="workID" value="${model.workID}">
    <input type="hidden" name="cardId" value="${model.cardId}">
    <input type="hidden" name="cardNo" value="${model.cardNo}">
    <input type="hidden" name="workNo" value="${model.workNo}">
    <input type="hidden" name="factId" value="${model.factId}">
    <input type="hidden" name="factName" value="${model.factName}">
    <input type="hidden" name="deptId" value="${model.deptId}">
    <input type="hidden" name="deptName" value="${model.deptName}">
    <input type="hidden" name="teamId" value="${model.teamId}">
    <input type="hidden" name="teamName" value="${model.teamName}">
    <input type="hidden" name="packUser" value="${model.packUser}">
    <input type="hidden" name="packUserTeam" value="${model.packUserTeam}" >


    <div class="main-body">
        <div class="main">
            <ul>
              <li>  <h3>产品名称</h3><input type="text" name="productName" readonly value="${model.productName}"></li>
                <li>  <h3>规格</h3><input type="text" name="spec" readonly value="${model.SPEC}"></li>
                <li>  <h3>补充规格</h3><input type="text" name="itemModelMore" readonly value="${model.itemModelMore}"></li>
                <li>  <h3>牌号</h3><input type="text" name="brandName" readonly value="${model.brandName}"></li>
                <li>  <h3>技术标准</h3><input type="text" name="techStdNo" readonly value="${model.techStdNo}"></li>
                <li>  <h3>合同号</h3><input type="text" name="contractNo" readonly value="${model.contractNo}"></li>
                <li><h3>箱号</h3> <input type="text" name="PackNo" id="PackNo" ></li>
                <li><h3>包装方式</h3>
                    <select name="packType">
                        <option value="塑料布">塑料布</option>
                        <option value="铁丝捆">铁丝捆</option>
                        <option value="麻布">麻布</option>
                        <option value="木板夹">木板夹</option>
                        <option value="木托">木托</option>
                        <option value="钢托">钢托</option>
                        <option value="木箱">木箱</option>
                        <option value="铁箱">铁箱</option>
                        <option value="纤维板夹">纤维板夹</option>
                        <option value="钙塑箱">钙塑箱</option>
                        <option value="瓦楞纸">瓦楞纸</option>
                        <option value="复合纸">复合纸</option>
                        <option value="钢带">钢带</option>
                    </select>
                </li>
                <li><h3>包装时间</h3> <input type="datetime-local" name="packTime" id="data" ></li>
                <li><h3>摆放区号</h3>
              <c:choose>
                  <c:when test="${positionlist.size()>0}">
                      <select name="positionNo">
                          <c:forEach items="${positionlist}" var="map">
                              <option value="${map.placeCode}">${map.placeCode}</option>
                          </c:forEach>
                      </select>
                  </c:when>
                  <c:otherwise>
                      <input type="text" name="positionNo">
                  </c:otherwise>
              </c:choose>
                </li>
                <li><h3>数量</h3> <input type="text" name="qty" id="qty" ></li>
                <li><h3>重量</h3> <input type="text" name="weight" id="weight" ></li>
                <li style="height: 120px;border-bottom: none;"><h3>备注</h3>
                    <br> <textarea cols="10" rows="3" name="comment"></textarea>
                </li>
            </ul>
            <div style="height: 130px;"></div>
        </div>
    </div>




<footer>

    <div class="alert alert-warning alert-dismissible " role="alert">

    </div>

    <button type="button" class="save button_info" onclick="save()"><%--<img src="../img/rzxg.png" alt="">--%>保存</button>
    <button type="button" class="exit button_info" onclick="location.href='../Main?ID=${WorkStep.id}'"><%--<img src="../img/backmain.png" alt="">--%>返回首页</button>
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

    function save()
    {
        var msg="";
        var cqty=$("#qty").val();
        var cweight=$("#weight").val();
        var PackNo=$("#PackNo").val();
        if(PackNo=="")
        {
            msg="请输入箱号!";
        }
else {
        if(cqty=="")
        {
            msg="请输入数量!";
        }
        else if(isNaN(cqty))
        {
            msg="请输入正确的数量!";
        }
        else if(cqty<=0)
        {
            msg="数量需大于0!";
        }
        else
        {
            if(cweight=="")
            {
                msg="请输入重量!"
            }
            else if(isNaN(cweight))
            {
                msg="请输入正确的重量!";
            }
            else if(cweight<=0)
            {
                msg="重量需大于0!";
            }
        }
        }

        if(msg=="")
        {
            $(".alert").css("display","none");
            $("form").submit();
        }
        else
        {
            $(".alert").css("display","block");
            $(".alert").text(msg);
        }
    }


</script>
<style>
    #data
    {
        font-size: 1em!important;
        /*    font-weight: bold;*/
    }
    .alert
    {
        margin: auto;
        margin-bottom: 1%;
        width: 90% !important;
        display: none;
    }

</style>