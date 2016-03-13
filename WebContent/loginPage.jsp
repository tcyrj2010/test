<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录</title>
</head>
<body>

${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message}
<form name='f' action='${pageContext.request.contextPath}/j_spring_security_check' method='POST'>
      用户名:<input type='text' name='j_username' value=''> </br>
      密码:<input type='password' name='j_password'/> </br>
    <input name="submit" type="submit" value="登录"/>
</form>



</body>
</html>