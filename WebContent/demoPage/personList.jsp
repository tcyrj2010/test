<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

<a href="${pageContext.request.contextPath}/demoPage/personAdd.jsp" >新增</a>
人员列表：<br/>
${personlist}
<table>
	<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>年龄</th>
	</tr>
	<c:forEach items="${requestScope.personlist}" var="person">
	<tr>
		<td>${person.person_id}</td>
		<td>${person.person_name}</td>
		<td>${person.person_age}</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>