<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/resource/dep.css" rel="stylesheet">
</head>
<body>
 
 <form action="video" method="post">
 Tên Sản Phẩm <input class ="a" type="text" name="TenSP"/>
 Giá <input class ="b" type="text" name="Gia"/>
 <input type="submit" value="ok"/>
 </form>
 list sản phẩm: </br>
  
 <div class="box"> 
 <c:forEach items="${list}" var="SP">
 <div>
 <img class="hinh"  src="<%=request.getContextPath()%>/resource/${SP.getImg()}">
 </div>
  
  <div class="tt"> 
   	 	<c:out value="${SP.getTen()}"></c:out> </br>
     	<c:out value="${SP.getGia()}"></c:out> </br>
   </div>
    </c:forEach>
   </div>
 
</body>
</html>