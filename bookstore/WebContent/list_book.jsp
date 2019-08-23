<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>


	<center>
        <h1>Books Management</h1>
        <h2>
            <a href="/new">Add New Book</a>
            &nbsp;&nbsp;&nbsp;
            <a href="/list">List All Books</a>
             
        </h2>
    </center>
	<div align="center">
	
		<table border="1" cellpadding="5">
			<caption><h2>List of book</h2></caption>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Title</th>
				<th>Author</th>
			</tr>
			<c:forEach items="${listbook}" var="book">
				<tr>
					<td><c:out value="${book.id}"></c:out></td>
					<td><c:out value="${book.title}"></c:out></td>
					<td><c:out value="${book.author}"></c:out></td>
					<td><c:out value="${book.price}"></c:out></td>
					<tr>
					<a href="/edit?id=<c:out value='${book.id}'/>"Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp;
					<a href="/elete?id=<c:out value='${book.id}'/>"Delete</a>
				</tr>
			</c:forEach>
			</table>
			
			</div>
			
</body>
</html>