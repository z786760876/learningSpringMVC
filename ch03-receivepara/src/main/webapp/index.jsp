<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>提交参数给controller</p>
<p>
<form action="receiveproperty.do" method="post">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>

    <input type="submit" value="提交参数">
</form>

</p>
</body>
</html>
