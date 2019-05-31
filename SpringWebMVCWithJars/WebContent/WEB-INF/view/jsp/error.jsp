<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:errors path="model.*" style="color: red;" />
${model.fname}<br>
${model.lname}<br>
${model.phone}<br>
${model.hobby[0]}<br>
${model.address.houseno}<br>
${model.address.street}<br>
${model.address.location}<br>
${model.address.city}<br>


</body>
</html>