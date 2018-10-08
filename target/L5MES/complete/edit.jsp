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
<%--<script>
    $(document).ready(function ()
    {
        $(".btn-group").removeClass(".main div");
    });
</script>--%>
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

<c:choose>
    <c:when test="${equip.size()>0}">
                            <select name="machiningEquipment">
        <c:forEach items="${equip}" var="map">
            <option value="${map.equipment}">${map.equipment}</option>
        </c:forEach>
                            </select>
    </c:when>
    <c:otherwise>
        <input type="text" name="machiningEquipment">
    </c:otherwise>
</c:choose>


                        </li>
                        <li><h3>加工数量</h3>
                            <input type="text" name="completionQty" id="completionQty">
                        </li>

                        <li><h3>加工重量</h3>
                            <input type="text" name="completionWeight" id="completionWeight">
                        </li>

                        <li><h3>加工规格</h3>

                            <div class="btn-all">

                                <div class="btn-group" role="group">
                                    <button type="button" id="special_1" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        特殊字符
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li class="special1">Ø</li>
                                        <li class="special1">*</li>
                                        <li class="special1">~</li>
                                        <li class="special1">≧ </li>
                                        <li class="special1">≦ </li>
                                        <li class="special1">></li>
                                        <li class="special1">< </li>
                                        <li class="special1">- </li>
                                    </ul>
                                </div>
                            </div>
                            <input type="text" name="completionSPEC" id="completionSPEC">
                        </li>
                        <li><h3>摆放位置</h3>
                            <c:choose>
                                <c:when test="${positionlist.size()>0}">
                                    <select name="cositionNo">
                                        <c:forEach items="${positionlist}" var="map">
                                            <option value="${map.placeCode}">${map.placeCode}</option>
                                        </c:forEach>
                                    </select>
                                </c:when>
                                <c:otherwise>
                                    <input type="text" name="cositionNo">
                                </c:otherwise>
                            </c:choose>

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
                            <div class="btn-all">

                                <div class="btn-group" role="group">
                                    <button type="button" id="special_2" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        特殊字符
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li class="special2">Ø</li>
                                        <li class="special2">*</li>
                                        <li class="special2">~</li>
                                        <li class="special2">≧ </li>
                                        <li class="special2">≦ </li>
                                        <li class="special2">></li>
                                        <li class="special2">< </li>
                                        <li class="special2">- </li>
                                    </ul>
                                </div>
                            </div>
                            <input type="text" name="surplusSPEC" id="surplusSPEC">

                        </li>
                        <li><h3>节余数量</h3>
                            <input type="text" name="surplusQty" id="surplusQty" value="0">
                        </li>
                        <li><h3>节余重量</h3>
                            <input type="text" name="surplusWeight" id="surplusWeight" value="0">
                        </li>
                        <li><h3>摆放位置</h3>
                            <c:choose>
                                <c:when test="${positionlist.size()>0}">
                                    <select name="surplusPositionNo">
                                        <c:forEach items="${positionlist}" var="map">
                                            <option value="${map.placeCode}">${map.placeCode}</option>
                                        </c:forEach>
                                    </select>
                                </c:when>
                                <c:otherwise>
                                    <input type="text" name="surplusPositionNo" >
                                </c:otherwise>
                            </c:choose>

                        </li>
                    </ul>
                </div>
            </div>
            <div role="tabpanel" class="tab-pane" id="fl">
                <div class="main" id="main3">
                    <ul>
                        <li><h3>废料规格</h3>
                            <div class="btn-all">

                                <div class="btn-group" role="group">
                                    <button type="button" id="special_3" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        特殊字符
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu">
                                        <li class="special3">Ø</li>
                                        <li class="special3">*</li>
                                        <li class="special3">~</li>
                                        <li class="special3">≧ </li>
                                        <li class="special3">≦ </li>
                                        <li class="special3">></li>
                                        <li class="special3">< </li>
                                        <li class="special3">- </li>
                                    </ul>
                                </div>
                            </div>
                            <input type="text" name="wasteSPEC" id="wasteSPEC">
                        </li>
                        <li><h3>废料数量</h3>
                            <input type="text" name="wasteQty" id="wasteQty" value="0">
                        </li>
                        <li><h3>废料重量</h3>
                            <input type="text" name="wasteWeight" id="wasteWeight" value="0">
                        </li>
                    </ul>
                </div>
            </div>
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


    $('.special1').click(function () {
        var c = this.innerText;
        var a = $("#completionSPEC").val();
        a = a + c;
      //  alert(a);
       $("#completionSPEC").val(a);

    });

    $('.special2').click(function () {
        var c = this.innerText;
        var a = $("#surplusSPEC").val();
        a = a + c;
        $("#surplusSPEC").val(a);

    });

    $('.special3').click(function () {
        var c = this.innerText;
        var a = $("#wasteSPEC").val();
        a = a + c;
        $("#wasteSPEC").val(a);

    });

    function save()
    {
        var msg="";
        var cqty=$("#completionQty").val();
        var cweight=$("#completionWeight").val();
        var sqty=$("#surplusQty").val();
        var sweight=$("#surplusWeight").val();
        var wqty=$("#wasteQty").val();
        var wweight=$("#wasteWeight").val();

        if(cqty=="")
        {
            msg="请输入加工数量!";
        }
        else if(isNaN(cqty))
        {
            msg="请输入正确的加工数量!";
        }
        else if(cqty<=0)
        {
            msg="加工数量需大于0!";
        }
        else
        {
            if(cweight=="")
            {
                msg="请输入加工重量!"
            }
            else if(isNaN(cweight))
            {
                msg="请输入正确的加工重量!";
            }
            else if(cweight<=0)
            {
                msg="加工重量需大于0!";
            }
            else
            {
                if(sqty=="")
                {
                    msg="请输入节余数量!"
                }
                else if(isNaN(sqty))
                {
                    msg="请输入正确的节余数量!";
                }
                else if(sqty<0)
                {
                    msg="节余数量不能小于0!";
                }
                else
                {
                    if(sweight=="")
                    {
                        msg="请输入节余重量!"
                    }
                    else if(isNaN(sweight))
                    {
                        msg="请输入正确的节余重量!";
                    }
                    else if(sweight<0)
                    {
                        msg="节余重量不能小于0!";
                    }
                    else
                    {
                        if(wqty=="")
                        {
                            msg="请输入废料数量!"
                        }
                        else if(isNaN(wqty))
                        {
                            msg="请输入正确的废料数量!";
                        }
                        else if(wqty<0)
                        {
                            msg="废料数量不能小于0!";
                        }
                        else
                        {
                            if(wweight=="")
                            {
                                msg="请输入废料重量!"
                            }
                            else if(isNaN(wweight))
                            {
                                msg="请输入正确的废料重量!";
                            }
                            else if(wweight<0)
                            {
                                msg="废料重量不能小于0!";
                            }

                        }
                    }
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