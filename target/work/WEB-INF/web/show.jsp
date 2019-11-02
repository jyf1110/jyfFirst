<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% String path = request.getContextPath();%>
<html>
<head>
    <title>show</title>
</head>
<style type="text/css">
    td {
        border: 1px solid gray;
    }
    tr {
        border: 1px solid gray;
    }
</style>
<body>
<tr>
    <td>用户id</td>
    <td>用户账号</td>
    <td>用户名</td>
    <td>用户邮箱</td>
    <td>订单编号</td>
    <td>下单时间</td>
    <td>订单金额</td>
    <td>用户操作</td>
</tr>
<%--<c:forEach items="${requestScope.orders}" var="order" varStatus="stat">--%>
    <%--<td>${order.user.userId}</td>--%>
    <%--<td>${order.user.userAccount}</td>--%>
    <%--<td>${order.user.userName}</td>--%>
    <%--<td>${order.user.email}</td>--%>
    <%--<td>${order.orderId}</td>--%>
    <%--<td>${order.orderTime}</td>--%>
    <%--<td>${order.orderAmount}</td>--%>
    <%--<td><span>修改</span>  <span>删除</span></td>--%>
<%--</c:forEach>--%>
</body>
</html>
