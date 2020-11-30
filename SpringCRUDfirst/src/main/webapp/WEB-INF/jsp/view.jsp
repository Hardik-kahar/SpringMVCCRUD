<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1 > All Records of Employess</h1>
 <table align="center" border="1">
 	<tr>
 		<th>Id</th>
 		<th>Name</th>
 		<th>Contact</th>
 		<th>Email</th>
 		<th>City</th>
 		<th>Edit</th>
 		<th>Delete</th>
 	</tr>
 	<c:forEach var="e" items="${list }">
 		<tr>
 			<td>${e.id }</td>
 			<td>${e.ename }</td>
 			<td>${e.econtact }</td>
 			<td>${e.eemail }</td>
 			<td>${e.ecity }</td>
 			<td><a href="edit/${e.id }">Edit</a></td>
 			<td><a href="delete/${e.id }">Delete</a></td>
 		</tr>
 	</c:forEach>
 </table>
</body>
</html>