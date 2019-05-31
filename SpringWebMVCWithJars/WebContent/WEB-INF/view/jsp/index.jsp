<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:errors path="model.*" style="color: red;" />
	<br>
	<form action="show" method="post">
		<table>
			<tr>
				<td><spring:message code="label.fname" /></td>
				<td><input type="text" name="fname" /></td>
			</tr>

			<tr>
				<td>LName:</td>
				<td><input type="text" name="lname" /></td>
			</tr>

			<tr>
				<td>Phone:</td>
				<td><input type="text" name="phone" /></td>
			</tr>

			<tr>
				<td>Hobby(s):</td>
				<td><select name="hobby" multiple>
						<option value="coding">Coding</option>
						<option value="reading">Reading</option>
						<option value="writing">Writing</option>
						<option value="sleeping">Sleeping</option>
				</select></td>
			</tr>

			<tr>
				<td>HouseNo:</td>
				<td><input type="text" name="address.houseno" /></td>
			</tr>

			<tr>
				<td>Street:</td>
				<td><input type="text" name="address.street" /></td>
			</tr>

			<tr>
				<td>Location:</td>
				<td><input type="text" name="address.location" /></td>
			</tr>

			<tr>
				<td>City:</td>
				<td><input type="text" name="address.city" /></td>
			</tr>

			<tr align="center">
				<td><input type="submit" /></td>
			</tr>
		</table>
	</form>


</body>
</html>