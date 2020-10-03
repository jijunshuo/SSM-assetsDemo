<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/10/3
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<form action="/" method="post">
    <p> 资产编号:<input type="text" name="assetid"/>
        资产类型:<select name="assettype">
            <option value="">请选择</option>
            <option value="电子设备">电子设备</option>
            <option value="机械设备">机械设备</option>
            <option value="运输设备">运输设备</option>
        </select>
        <input type="submit" value="查询"/>
        <a href="/toadd">新增固定资产</a>
    </p>
    <table border="1px" width="500px">
        <tr>
            <td>资产编号</td>
            <td>资产名称</td>
            <td>资产类型</td>
            <td>入库日期</td>
        </tr>
        <c:forEach var="a" items="${assets}">
            <tr>
                <td>${a.assetid}</td>
                <td>${a.assetname}</td>
                <td>${a.assettype}</td>
                <td>
                    <fmt:formatDate value="${a.intodate}" type="both" pattern="yyyy-MM-dd"></fmt:formatDate>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>

