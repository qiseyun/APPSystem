<%--
  Created by IntelliJ IDEA.
  User: MSI-PC
  Date: 2020/4/20
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>开发者主页</title>
    <link href="${pageContext.request.contextPath }/statics/mycss/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span2">
            <img alt="140x140" src="/statics/images/img1.jpg" class="img-circle" />
            <blockquote class="pull-right">
                <p>
                    欢迎你开发者：
                </p>
                ${devUserSession.devCode}
            </blockquote>
            <br/><br/><br/><br/>
            <ul class="nav nav-list well">
                <li class="nav-header">
                    <a href="${pageContext.request.contextPath }/dev/flatform/init">首页</a>
                </li>
                <li class="nav-header">
                    APP用户管理
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/403.jsp">app开发者账户申请</a>
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/403.jsp">个人信息维护</a>
                </li>
                <li class="nav-header">
                    APP应用管理
                </li>
                <li>
                    <a href="${pageContext.request.contextPath }/dev/flatform/app/begin">app维护</a>
                </li>
            </ul>
        </div>
        <div class="span10">
            <blockquote class="pull-right">
                <small>注销 <cite></cite></small>
                <p>
                    <a href="${pageContext.request.contextPath }/dev/over">logOut</a>
                </p>
            </blockquote>
            <br/><br/><br/><br/>
            <h3 class="text-success">
                ${devUserSession.devCode}欢迎进入开发者主页
            </h3>
        </div>
    </div>
</div>
</body>
</html>
</body>
</html>
