<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> //bộ thư viện hộ trợ viết if else trong html
</head>
<body>
    xinchao!
    <c:forEach items="${list}" var="listName">
    ${listName.getName()}
    ${listName.getTuoi()}
    </c:forEach>
</body>
</html>