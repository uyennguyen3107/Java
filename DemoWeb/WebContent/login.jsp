<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>.resource/dep.css" rel="stylesheet"> 
</head>
<body>
<form action="login" method="post"> name 
    <input name="name" type="text">
     password 
    <input name="pass" type="text">
    <input type="submit">
    </form>
</body>
</html>