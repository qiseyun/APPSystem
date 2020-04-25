<%--
  Created by IntelliJ IDEA.
  User: MSI-PC
  Date: 2020/4/20
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>开发者主页</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/statics/css/main.css" />
</head>
<body>
<div id="app">
    <div id="a01">
        <div class="div01">
            <span class="span001"></span>
            <div class="div0101">
                <span class="span002">test001</span>
            </div>

        </div>
        <div class="div02">
            <h2 class="h201">欢迎您：test001|角色： 开发者账号</h2>
            <span class="span003">注销</span><a href="over" class="a1">logOut</a>
        </div>
        <div class="div03">
            <h4 class="h40101">@2020 All Rights Relerls</h4>
        </div>
    </div>
    <div id="a02">
        <h2 class="h201">APP BMS</h2>

        <div class="d01"><img src=""></div>
        <h4 class="h40201">Vermoe</h4>
        <h4 class="h40202">test001</h4>
        <h4 class="h40203">测试账户001</h4>

        <span class="span0201">APP账号管理<span class="span02001"><a href="#" class="">^</a></span></span>
        <span class="span0202">APP应用管理<span class="span02002"><a href="#" class="">^</a></span></span>
    </div>
    <div class="div0201">
        <span class="span021"><a href="#" class="">设置</a></span>
        <span class="span021"><a href="#" class="">打开</a></span>
        <span class="span021"><a href="#" class="">隐身</a></span>
        <span class="span021"><a href="over" class="">退出</a></span>
    </div>



</div>

</body>
</html>
