<%--
  Created by IntelliJ IDEA.
  User: MSI-PC
  Date: 2020/4/26
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <%-- css --%>
    <link href="${pageContext.request.contextPath }/statics/mycss/bootstrap.min.css" rel="stylesheet">
    <%-- js --%>
    <script src="${pageContext.request.contextPath }/statics/js/jquery-3.4.1.min.js"></script>

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
            <form action="${pageContext.request.contextPath}/dev/flatform/app/list" method="post">
                <fieldset>
                    <legend>表单项</legend>
                    <p>
                        软件名称:<input type="text" name="softwareName" /> ------
                        app状态:
                        <select name="">
                            <option>--请选择--</option>
                            <option>option 1</option>
                            <option>option 2</option>
                        </select>------
                        所属平台:
                        <select name="">
                            <option>--请选择--</option>
                            <option>option 1</option>
                            <option>option 2</option>
                        </select>
                    </p>
                    <p>
                        一级分类:
                        <select name="categoryLevel1">
                            <option>--请选择--</option>
                            <c:forEach var="categoryLevel1" items="${one}" >
                                <option>${categoryLevel1}</option>
                            </c:forEach>
                        </select>------
                        二级分类:
                        <select name="categoryLevel2">
                            <option>--请选择--</option>
                            <option>option 1</option>
                            <option>option 2</option>
                        </select>------
                        三级分类:
                        <select name="categoryLevel3">
                            <option>--请选择--</option>
                            <option>option 1</option>
                            <option>option 2</option>
                        </select>
                    </p> <span class="help-block">这里填写帮助信息.</span>
                    <button class="btn" type="submit">查询</button>
                </fieldset>
                <br/>
                <button class="btn" type="submit"><a href="${pageContext.request.contextPath}/dev/flatform/app/addBegin">新增app信息</a></button>
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
                <c:forEach var="list" items="${applist}" >
                    <tr>
                        <td>${list.softwareName}</td>
                        <td>${list.APKName}</td>
                        <td>${list.softwareSize}</td>
                        <td>${list.flatformId}</td>
                        <td>${list.categoryLevel1},${list.categoryLevel2},${list.categoryLevel3}</td>
                        <td>${list.status}</td>
                        <td>${list.downloads}</td>
                        <td>${list.versionId}</td>
                        <td>
                            <select>
                                <option><a href="#">acti</a></option>
                                <option><a href="#">acti</a></option>
                                <option><a href="#">acti</a></option>
                                <option><a href="#">acti</a></option>
                            </select>
                        </td>
                    </tr>
                </c:forEach>

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
