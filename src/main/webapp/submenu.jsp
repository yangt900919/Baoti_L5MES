<%--
  Created by IntelliJ IDEA.
  User: Yang
  Date: 2018/7/28
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <jsp:include page="resources.jsp"></jsp:include>
    <link rel="stylesheet" href="css/main.css">
</head>
<body>
<div class="main-box">
    <ul>
        <c:choose>
            <c:when test="${WorkStep.operName.equals('包入')}">
                <li><a href="pack/index?stepID=${WorkStep.id}"><img src="img/bzhb.png" alt="" class=" special"></a></li>
            </c:when>
            <c:otherwise>
                <li><a href="complete/index?stepID=${WorkStep.id}"><img src="img/btn-2.png" alt="" class=" special"></a></li>

            </c:otherwise>
        </c:choose>
        <li><a href="exception/create?stepID=${WorkStep.id}"><img src="img/btn-1.png" alt="" class=" special"></a></li>
        <c:choose>
            <c:when test="${WorkStep.operName.equals('包入')}">
                <li><a href="pack/PackReportList?factId=${User.getFactID()}&packNo=&type=1"><img
                        src="img/bzls.png" alt=""></a></li>
            </c:when>
            <c:otherwise>
                <li><a href="complete/WorkReportList?factId=${User.getFactID()}&steptID=${WorkStep.id}&type=1"><img
                        src="img/btn-4.png" alt=""></a></li>
            </c:otherwise>
        </c:choose>

        <li><a href="exception/ExceptionFilterList?processId=${WorkStep.id}&type=1&factId=${User.getFactID()}"><img
                src="img/btn-3.png" alt=""></a></li>

    </ul>
</div>
<footer>
    <button onclick="location.href='getWorkSteps?ID=${User.getFactID()}&facname=${User.getFactName()}'" class="back" ><img src="img/back.png" alt="" style="width: 16%"></button>
    <button onclick="parent.location.href='Loginout'" class="exit"><img src="img/exit.png" alt="" style="width: 25%"></button>
</footer>
</body>
</html>
<script>

    $(".user", parent.document).text("${User.getFactName()}");
    $("#factName",parent.document).text("${WorkStep.operName}");

    $(function () {


        function distance() {
            var HeaWid = $('header').outerWidth();
            var AWid = $('.main-box li a').outerWidth();
            $('header').css('height', HeaWid * 0.3);
            $('.main-box li a').css('height', AWid * 0.5);
            $('.main-box li a img').css('width', AWid * 0.66).css('margin-top', AWid * 0.15).css('margin-left', AWid * 0.18);
            $('.special').css('width', AWid * 0.54).css('margin-left', AWid * 0.22);
            ;
        }

        distance();
        window.onresize = function () {
            distance();
        }
    })
</script>