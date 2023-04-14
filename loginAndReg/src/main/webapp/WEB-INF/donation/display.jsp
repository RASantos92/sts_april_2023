<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Donation from <c:out value="${donation.donor.userName}"/></h1>
	<h3>Donation name: <c:out value="${donation.name}"/></h3>
	<h3>Quantity: ${donation.quantity}</h3>
	<form action="/donations/delete/${donation.id}" method="post">
		<input type="hidden" name="_method" value="delete"/>
		<input type="submit" value="Delete" class="btn btn-outline-danger btn-dark"/>
	</form>
</body>
</html>