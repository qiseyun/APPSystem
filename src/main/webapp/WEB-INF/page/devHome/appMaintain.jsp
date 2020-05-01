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
            <form>
                <fieldset>
                    <legend>表单项</legend>
                    <p>
                        软件名称<input type="text" name="" /> ------
                        APP状态<input type="text" /> ------
                        所属平台<input type="text" />
                    </p>
                    <p>
                        一级分类<input type="text" /> ------
                        <%--<select name="queryStatus" class="form-control">--%>
                            <%--<c:if test="${statusList != null }">--%>
                                <%--<option value="">--请选择--</option>--%>
                                <%--<c:forEach var="dataDictionary" items="${statusList}">--%>
                                    <%--<option--%>
                                            <%--<c:if test="${dataDictionary.valueid == queryStatus }">selected="selected"</c:if>--%>
                                            <%--value="${dataDictionary.valueid}">${dataDictionary.valuename}</option>--%>
                                <%--</c:forEach>--%>
                            <%--</c:if>--%>
                        <%--</select>--%>
                        二级分类<input type="text" /> ------
                        三级分类<input type="text" />
                    </p> <span class="help-block">这里填写帮助信息.</span>
                    <button class="btn" type="submit">查询</button>
                </fieldset>
            </form>
            <table class="table table-hover table-bordered">
                <thead>
                <tr>
                    <th>
                        APK名称
                    </th>
                    <th>
                        软件大小(单位:M)
                    </th>
                    <th>
                        交付时间
                    </th>
                    <th>
                        所属平台
                    </th>
                    <th>
                        所属分类(一级分类、二级分类、三级分类)
                    </th>
                    <th>
                        状态
                    </th>
                    <th>
                        下载次数
                    </th>
                    <th>
                        最新版本号
                    </th>
                    <th>
                        操作
                    </th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>
                        ${AppInfo.APKName}
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
                    <td>
                        操作
                    </td>
                </tr>
                <%--<c:forEach items="${list}" var="account">--%>
                    <%--<tr>--%>
                        <%--<td>${account.id}</td>--%>
                        <%--<td>${account.name}</td>--%>
                        <%--<td>${account.money}</td>--%>
                    <%--</tr>--%>
                <%--</c:forEach>--%>
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
