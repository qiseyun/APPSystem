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
    <title>开发者登陆</title>
    <link href="${pageContext.request.contextPath }/statics/mycss/bootstrap.min.css" rel="stylesheet" />
</head>
<body style="background-color: lightgray;">
<br/><br/><br/><br/><br/><br/><br/><br/>
<h3 style="text-align: center;">
    开发者登陆(login)
</h3><br/>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span4">
        </div>
        <div class="span4">
            <form class="form-horizontal" action="${pageContext.request.contextPath }/dev/Login" method="POST" >
                <div class="control-group">
                    <label class="control-label" for="inputEmail">账户:</label>
                    <div class="controls">
                        <input id="inputEmail" type="text" name="devCode" placeholder="  请输入用户名" />
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputPassword">密码:</label>
                    <div class="controls">
                        <input id="inputPassword" type="password" name="devPassword" placeholder="  请输入密码" />
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <span style="color: red;">${error}</span><br/>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <button type="submit" class="btn">登陆</button>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <button type="reset" class="btn">重填</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</div>
</body>
</html>


<%--</div>--%>

    <%--<div id="app">--%>
        <%--<h2 class="h201">———   APP开发者平台   ———</h2>--%>
        <%--<form action="${pageContext.request.contextPath }/dev/Login" method="post" >--%>
            <%--<input class="input01" type="text" name="devCode"  placeholder="  请输入用户名">--%>
            <%--<input class="input02" type="password" name="devPassword" placeholder="  请输入密码">--%>
            <%--<input class="bu01" type="submit" value="登陆" />--%>
            <%--<input class="bu02" type="reset" value="重填" />--%>
        <%--</form>--%>
        <%--<h3>—————————————————</h3>--%>
        <%--<h4>@2020 All Rights Relerls</h4>--%>
        <%--<span style="color: red">${error}</span>--%>
        <%--<p>${pageContext.request.contextPath }</p>--%>
    <%--</div>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
