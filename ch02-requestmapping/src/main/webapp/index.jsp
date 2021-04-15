<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>第一个springmvc项目</p>
<p>
    <a href="/test/some.do">发起some.do的GET请求</a>
    <br>
    <form action="/test/other.do" method="post">
        <input type="submit" value="发起other.do的POST请求">
    </form>
    <br>
    <a href="/test/doSpecificMode.do">发起doSpecificMode.do的请求</a>
</p>
</body>
</html>
