<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix='sec' uri='http://www.springframework.org/security/tags' %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
前端TAG:<sec:authentication property="name"/><br/>
新增员工：<br/>

<form action="${pageContext.request.contextPath}/demo/person/insert.do" method="post">
姓名：<input name="person_name" value="" type="text">
年龄：<input name="person_age" value="" type="text">
<input type="submit" value="提交">
</form>

<br/>
<a href="${pageContext.request.contextPath}/demo/person/list">列表</a><br/>
<a href="${pageContext.request.contextPath}/demoPage/tagTest.jsp">Tag获取用户</a><br/>
<a href="${pageContext.request.contextPath}/adminPage.jsp">管理员界面</a><br/>
<a href="${pageContext.request.contextPath}/j_spring_security_logout">登出</a>

</body>
</html>