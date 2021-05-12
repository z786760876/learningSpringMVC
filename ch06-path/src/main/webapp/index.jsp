<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>

<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
    <%--  没有"/"开头的链接，都自动拼接"basePath" --%>
</head>
<body>
<p>第一个springmvc项目</p>
<p>
    <a href="user/some.do">发起/user/some.do的GET请求</a>
    <br>

</p>
</body>
</html>
