<%--
  Created by IntelliJ IDEA.
  User: 潘岳
  Date: 2019/7/27
  Time: 13:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="http://localhost:8080/register" method="post">
    <span>用户名：</span>
    <input type="text" name="username"/>
    <br/>
    <span>密码：</span>
    <input type="password" name="password"/>
    <br/>
    <span>确认密码：</span>
    <input type="password" name="repassword"/>
    <br/>
    <span>手机号：</span>
    <input type="text" name="phonenumber"/>
    <br/>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
