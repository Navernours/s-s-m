<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/3/10
  Time: 18:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>

<h3>查询了所有的账户信息</h3>


    <table class="table table-striped">
       <caption style="text-align: center">所有用户信息</caption>
        <thead>
         <tr>
             <th>编号</th>
             <th>姓名</th>
             <th>性别</th>
             <th>手机号</th>
             <th>部门号</th>
         </tr>
        </thead>
        <tbody>
         <c:forEach items="${list}" var="employee">
             <tr>
                 <td>${employee.emp_id}</td>
                 <td>${employee.emp_name}</td>
                 <td>${employee.emp_gender}</td>
                 <td>${employee.emp_phone}</td>
                 <td>${employee.emp_de_id}</td>
             </tr>
         </c:forEach>
        </tbody>
    </table>

</body>
</html>
