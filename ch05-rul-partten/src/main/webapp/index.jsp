<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

<p>URL</p>
<form action="/some.do" method="post">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="submit" value="提交参数">
</form>

<br/><br/>

<img src="images/4.jpeg" alt="我是一个静态资源,不能显示">


</body>
</html>
