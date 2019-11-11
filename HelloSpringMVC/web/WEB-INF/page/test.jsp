<%--
  Created by IntelliJ IDEA.
  User: CANPONG
  Date: 2019/11/11
  Time: 17:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Spring MVC 传参方式</title>
</head>
<body>
<form action="/param" role="form">
    用户名：<input type="text" name="userName"><br/>
    密码：<input type="text" name="password"><br/>
    验证码：<input type="text" name="alidatecode"><br/>

    <input type="submit" value="提  交">
</form>
</body>
</html>
