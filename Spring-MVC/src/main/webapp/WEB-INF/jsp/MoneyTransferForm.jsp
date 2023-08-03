<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Money Transfer Form</title>
</head>
<body>
	<form action="transferMoney">
		<table border="1" align="center" widht="50%">
			<tr>
				<th>Destination Bank Name</th>
				<td><input type=text></td>
			</tr>

			<tr>
				<th>Destination Bank Account Number</th>
				<td><input type=text></td>
			</tr>

			<tr>
				<th>Transfer Amount</th>
				<td><input type=text name="amount"></td>
			</tr>

			<tr>
				<th><input type=submit value=Transfer></th>
				<td><input type=reset value=cancel></td>
			</tr>

		</table>
	</form>
</body>
</html>