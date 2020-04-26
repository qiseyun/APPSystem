<%--
  Created by IntelliJ IDEA.
  User: MSI-PC
  Date: 2020/4/26
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <!-- css -->
    <link href="/statics/mycss/bootstrap.min.css" rel="stylesheet">
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
                test001
            </blockquote>
            <br/><br/><br/><br/>
            <ul class="nav nav-list well">
                <li class="nav-header">
                    <a href="dev/flatform/init">首页</a>
                </li>
                <li class="nav-header">
                    APP用户管理
                </li>
                <li>
                    <a href="<%=request.getContextPath()%>/403.jsp">app开发者账户申请</a>
                </li>
                <li>
                    <a href="<%=request.getContextPath()%>/403.jsp">个人信息维护</a>
                </li>
                <li class="nav-header">
                    APP应用管理
                </li>
                <li>
                    <a href="maintain/begin">app维护</a>
                </li>
            </ul>
        </div>
        <div class="span10">
            <blockquote class="pull-right">
                <small>注销 <cite></cite></small>
                <p>
                    <a href="dev/over">logOut</a>
                </p>
            </blockquote>
            <br/><br/><br/><br/>
            <form>
                <fieldset>
                    <legend>表单项</legend>
                    <p>
                        <input type="text" /> --------<input type="text" /> --------<input type="text" />
                    </p>
                    <p>
                        <input type="text" /> --------<input type="text" /> --------<input type="text" />
                    </p> <span class="help-block">这里填写帮助信息.</span> <label class="checkbox"><button class="btn" type="submit">提交</button></label>
                </fieldset>
            </form>
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th>
                        编号
                    </th>
                    <th>
                        产品
                    </th>
                    <th>
                        交付时间
                    </th>
                    <th>
                        状态
                    </th>
                    <th>
                        状态
                    </th>
                    <th>
                        状态
                    </th>
                    <th>
                        状态
                    </th>
                    <th>
                        状态
                    </th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>
                        1
                    </td>
                    <td>
                        TB - Monthly
                    </td>
                    <td>
                        01/04/2012
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                </tr>
                <tr class="success">
                    <td>
                        1
                    </td>
                    <td>
                        TB - Monthly
                    </td>
                    <td>
                        01/04/2012
                    </td>
                    <td>
                        Approved
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                </tr>
                <tr class="error">
                    <td>
                        2
                    </td>
                    <td>
                        TB - Monthly
                    </td>
                    <td>
                        02/04/2012
                    </td>
                    <td>
                        Declined
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                </tr>
                <tr class="warning">
                    <td>
                        3
                    </td>
                    <td>
                        TB - Monthly
                    </td>
                    <td>
                        03/04/2012
                    </td>
                    <td>
                        Pending
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                </tr>
                <tr class="info">
                    <td>
                        4
                    </td>
                    <td>
                        TB - Monthly
                    </td>
                    <td>
                        04/04/2012
                    </td>
                    <td>
                        Call in to confirm
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                    <td>
                        Default
                    </td>
                </tr>
                </tbody>
            </table>
            <div class="pagination pagination-centered">
                <ul>
                    <li>
                        <a href="#">上一页</a>
                    </li>
                    <li>
                        <a href="#">1</a>
                    </li>
                    <li>
                        <a href="#">2</a>
                    </li>
                    <li>
                        <a href="#">3</a>
                    </li>
                    <li>
                        <a href="#">4</a>
                    </li>
                    <li>
                        <a href="#">5</a>
                    </li>
                    <li>
                        <a href="#">下一页</a>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</div>
</body>
</html>
