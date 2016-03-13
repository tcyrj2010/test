<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="resources/jquery-1.12.1.js"></script>
<script type="text/javascript">
	function validatePerson(){
		$.ajax({
	          type: "get",//使用post方法访问后台
	          dataType : 'json',  
			  url: "demo/json/testjson",
			  success: function(data) {
				  alert(data.person_name);
			  },
			  error:function(e){
				  alert("shibai");
			  }
		});
	}
	
	function jsoncallback(data){
		alert('callback')
		
	}

</script>
<title>管理员界面</title>
</head>
<body>

欢迎进入首页<br/>
<a href="demoPage/personAdd.jsp">添加用户</a><br/>
	用户名：<input type="text" name="username" value="" id="userId"><br/>
	密码：<input type="text" name="password" value=""><br/>
	<input type="button" value="验证" onclick="validatePerson();">
</body>
</html>