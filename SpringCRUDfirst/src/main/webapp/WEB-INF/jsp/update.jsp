<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Details</title>
</head>
<body>
	<h2>Update Employee Details</h2>
	<form action="../updateData" method="post">
		<table>
			<tr>
				<td>Employee Name:-</td>
				<td><input type="text" name="ename" value="${e.ename }">
					<input type="hidden" name="id" value="${e.id }">
				</td>
				
			</tr>
			<tr>
				<td>Employee Contact:-</td>
				<td><input type="text" name="econtact" value="${e.econtact }"></td>
			</tr>
			<tr>
				<td>Employee Email:-</td>
				<td><input type="text" name="eemail" value="${e.eemail }"></td>
			</tr>
			<tr>
				<td>Employee City:-</td>
				<td><input type="text" name="ecity" value="${e.ecity }"></td>
			</tr>
			<tr>
					<td><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>

</body>
</html>