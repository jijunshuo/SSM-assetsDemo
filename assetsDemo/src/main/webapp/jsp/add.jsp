<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/10/3
  Time: 16:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="/static/js/jquery-1.12.4.js"></script>
<body>
<p style="color: red;" id="error"></p>
<form action="/doadd" method="post">
    <table border="1px">
        <tr>
            <td colspan="2" align="center" style="font-size: 32px">新增固定资产</td>
        </tr>
        <tr>
            <td>资产编号:</td>
            <td><input type="text" name="assetid"/></td>
        </tr>
        <tr>
            <td>资产名称:</td>
            <td><input type="text" name="assetname"/></td>
        </tr>
        <tr>
            <td>资产类型:</td>
            <td>
                <select name="assettype">
                    <option value="">请选择</option>
                    <option value="电子设备">电子设备</option>
                    <option value="机械设备">机械设备</option>
                    <option value="运输设备">运输设备</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>入库日期:</td>
            <td><input type="text" name="intodate"/></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="增加"/>
                <input type="reset" value="清空"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
<script type="text/javascript">
    $("form").submit(function () {
        var assetid = $("[name='assetid']").val();
        var assetname = $("[name='assetname']").val();
        var assettype = $("[name='assettype']").val();
        var intodate = $("[name='intodate']").val();
        if (assetid == "") {
            $("#error").text("资产编号不能为空！");
            return false;
        }
        if (assetname == "") {
            $("#error").text("资产名称不能为空！");
            return false;
        }
        if (assettype == "") {
            $("#error").text("资产类型不能为空！");
            return false;
        }
        if (intodate == "") {
            $("#error").text("入库日期不能为空！");
            return false;
        }
    })
</script>
