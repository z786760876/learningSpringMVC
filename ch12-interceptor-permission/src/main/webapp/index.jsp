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
</head>
<body>

<p>一个拦截备</p>
<form action="doSome.do" method="post">
    姓名:<input type="text" name="name"> <br/>
    年龄:<input type="text" name="age"> <br/>
    <input type="submit" value="提交请料">
</form>

</body>
</html>
