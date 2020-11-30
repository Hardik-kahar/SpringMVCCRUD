<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee Details</title>
</head>
<body>
<h2>Add Employee Details</h2>
	<form action="save" method="post">
		<table>
			<tr>
				<td>Employee Name:-</td>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<td>Employee Contact:-</td>
				<td><input type="text" name="econtact"></td>
			</tr>
			<tr>
				<td>Employee Email:-</td>
				<td><input type="text" name="eemail"></td>
			</tr>
			<tr>
				<td>Employee City:-</td>
				<td><input type="text" name="ecity"></td>
			</tr>
			<tr>
					<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>

</body>
</html>