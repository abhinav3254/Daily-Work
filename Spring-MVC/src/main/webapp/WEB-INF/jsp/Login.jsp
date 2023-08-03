<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="validateUser" method="post">
		<table width="50%" bgcolor="lightblue" ,align="center">
			<tr>
				<th>Username</th>
				<td><input type="text" name="uname"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="password" name="pwd"></td>
			</tr>
			<tr>
				<td><input type="submit" value="SignIn" /></td>
				<td><input type="reset" value="cancel" /></td>
			</tr>
		</table>
	</form>
</body>
</html>