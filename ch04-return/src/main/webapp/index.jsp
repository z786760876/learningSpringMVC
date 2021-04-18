<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p>>处理器方法返回string表示视图名称</p>
<form action="returnString-value.do" method="post">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>

    <input type="submit" value="提交参数">
</form>

<br/><br/>

<p>处理器方法返回string表示视图完整路径</p>
<form action="returnString-value2.do" method="post">
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>

    <input type="submit" value="提交参数">
</form>

<br/><br/>


</body>
</html>
