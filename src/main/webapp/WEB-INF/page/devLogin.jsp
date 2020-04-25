<%--
  Created by IntelliJ IDEA.
  User: MSI-PC
  Date: 2020/4/20
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>APP开发者平台</title>
    <style>
        .divOne{
            width: 200px;
            height: 100px;
            background-color: #5A738E;
            margin: 0 auto;
        }
        form{
            text-align: center;
        }
        body{
            background-color: #5A738E;
        }
    </style>
</head>
<body>
<h1 style="text-align: center">APP开发者平台</h1>
<div class="divOne">
    <form action="Login" method="post">
        <input type="text" name="devCode" placeholder="请输入用户名" /><br/>
        <input type="password" name="devPassword" placeholder="请输入密码" /><br/>
        <span>${error}</span><br/>
        <input type="submit" value="登陆" />
        <input type="reset" value="重置"  />
    </form>
</div>
</body>
</html>
