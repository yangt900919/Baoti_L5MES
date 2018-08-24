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
    <jsp:include page="../resources.jsp"></jsp:include>
    <link rel="stylesheet" href="../css/cpindex.css">
</head>
<script>
    function query(val)
    {
        var type=$("#type").val();
    }
</script>
<body>



<div class="content">

       <ul>
           <c:forEach items="${exceptionList}" var="map">
          <li onclick="location.href='detail?ID=${map.id}'">
               <div class="top-box">
                   <div class="right">
                       异常编号：${map.exceptionNo}

                   </div>
                   <div class="left">
                       <div class="right-top">异常分类：${map.classificatName}</div>
                       <div class="right-bottom">异常细类：${map.fineClassName}</div></div>
               </div>
               <div class="bottom-box" style="overflow: hidden;
text-overflow:ellipsis;
white-space: nowrap;">异常描述：${map.exceptionDesciption}</div>
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
