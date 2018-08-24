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
    #main1
    {
        height: 110%;
    }
    #main2,#main3
    {
        height: 75%;
    }
</style>
<body>
<c:if test="${coinfo.size()>0}">
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
                    <li><h3>汇报编号</h3><div>${coinfo.get(0).reportNo}</div></li>
                    <li><h3>工艺卡号</h3><div>${coinfo.get(0).cardNo}</div></li>
                    <li><h3>加工设备</h3><div>${coinfo.get(0).machiningEquipment}</div></li>
                    <li><h3>加工数量</h3><div>${coinfo.get(0).completionQty}</div></li>
                    <li><h3>加工重量</h3><div>${coinfo.get(0).completionWeight}</div></li>
                    <li><h3>加工规格</h3><div>${coinfo.get(0).completionSPEC}</div></li>
                    <li><h3>摆放位置</h3><div>${coinfo.get(0).positionNo}</div></li>
                    <%--<li><h3>开工时间</h3><div>
                        <c:if test="${coinfo.get(0).beginTime!='' && coinfo.get(0).beginTime!=null}">
                            <script>
                                document.write(new Date("${coinfo.get(0).beginTime}").Format("YYYY-MM-DD hh:mm:ss"));
                            </script>
                        </c:if>

                    </div></li>
                    <li><h3>开工人</h3><div>${coinfo.get(0).beginUser}</div></li>
                    <li><h3>开工人班组</h3><div>${coinfo.get(0).beginUserTeam}</div></li>--%>
                    <li><h3>加工时间</h3><div>
                        <c:if test="${coinfo.get(0).completionTime!='' && coinfo.get(0).completionTime!=null}">

                            <script>

                                document.write(new Date("${coinfo.get(0).completionTime}").Format("YYYY-MM-DD hh:mm:ss"));
                            </script>
                        </c:if>
                    </div></li>
                    <li><h3>加工人</h3><div>${coinfo.get(0).completionUser}</div></li>
                    <li><h3>加工人班组</h3><div>${coinfo.get(0).completionUserTeam}</div></li>
                    <li><h3>QA检查时间</h3><div>
                        <c:if test="${coinfo.get(0).QACheckTime!='' && coinfo.get(0).QACheckTime!=null}">
                            <script>
                                document.write(new Date("${coinfo.get(0).QACheckTime}").Format("YYYY-MM-DD hh:mm:ss"));
                            </script>
                        </c:if>
                    </div></li>
                    <li><h3>QA检查人</h3><div>${coinfo.get(0).QACheckUser}</div></li>
                    <li><h3>备注</h3><div>${coinfo.get(0).comment}</div></li>
                </ul>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="jyl">
            <div class="main" id="main2">
                <ul>
                    <li><h3>节余料规格</h3><div>${coinfo.get(0).surplusSPEC}</div></li>
                    <li><h3>节余数量</h3><div>${coinfo.get(0).surplusQty}</div></li>
                    <li><h3>节余重量</h3><div>${coinfo.get(0).surplusWeight}</div></li>
                    <li><h3>摆放位置</h3><div>${coinfo.get(0).surplusPositionNo}</div></li>
                </ul>
            </div>
        </div>
        <div role="tabpanel" class="tab-pane" id="fl">
            <div class="main" id="main3">
                <ul>
                    <li><h3>废料规格</h3><div>${coinfo.get(0).wasteSPEC}</div></li>
                    <li><h3>废料数量</h3><div>${coinfo.get(0).wasteSPEC}</div></li>
                    <li><h3>废料重量</h3><div>${coinfo.get(0).wasteWeight}</div></li>
                </ul>
            </div>
        </div>
    </div>
</div>

</c:if>
</body>
</html>
