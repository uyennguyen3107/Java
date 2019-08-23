<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Store Application </title>
</head>
<body>
<center>
<h1> Book Management </h1>
<h2>
 
<a href="/new">"Add New Book</a> &nbsp;&nbsp;&nbsp;
<a href="/list">List All Book</a>  
</h2>
</center>
<div align="center">
<form action="" method="post">\
<table border="1" cellpadding="5"> 
 <cation>
 <h2>Add New Book</h2>
 </cation>
<tr>
<th>Title:</th>
<td> <input type="text" name ="title" value="<c:out value=""/>"></td>
</tr>
<tr>
<th>Author:</th>
<td> <input type="text" name ="author" value="<c:out value=""/>"></td>
</tr>
<tr>
<th>Price:</th>
<td> <input type="text" name ="price" value="<c:out value=""/>"></td>
</tr>
<tr>
 
<td colspan="2"  align="center"> <input type="submit" name ="title" value="<c:out value=""/>">
</td>
</tr>

</table>
</form>
</div>

</body>
</html>