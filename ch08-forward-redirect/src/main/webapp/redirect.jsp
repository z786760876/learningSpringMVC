<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>WEB-INF/redirect.jsp 从 redirect重定向 获取数据</h3>
<form action="doForward.do" method="post">
    <h3>myname数据：${param.myname}</h3><br/>
    <h3>myage数据：${param.myage}</h3>
    <h3>取参数数据：<%=request.getParameter("myname")%>
    </h3>
</form>
</body>
</html>
