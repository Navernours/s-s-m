<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/9
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3> <a href="employee/findAll">查询所有用户信息</a></h3>

<h3>测试保存</h3>
<form action="employee/save" method="post">
    编号：<input type="text" name="emp_id"/><br>
    姓名：<input type="text" name="emp_name"/><br>
    性别：<input type="text" name="emp_gender"/><br>
    手机号：<input type="text" name="emp_phone"/><br>
    部门号：<input type="text" name="emp_de_id"/><br>

    <input type="submit" value="保存 "/><br>
</form>

<h3>根据id删除账户</h3>

<form action="employee/delete" method="post">
    emp_id:<input type="text" name="emp_id"/><br>
    <input type="submit" value="删除 "/><br>
</form>

<h3>根据id修改账户</h3>

<form action="employee/update" method="post">
    emp_id： <input type="text" name="emp_id"/><br>
    姓名：<input type="text" name="emp_name"/><br>
    性别：<input type="text" name="emp_gender"/><br>
    手机号：<input type="text" name="emp_phone"/><br>
    部门号：<input type="text" name="emp_de_id"/><br>
    <input type="submit" value="修改 "/><br>
</form>

</body>
</html>
