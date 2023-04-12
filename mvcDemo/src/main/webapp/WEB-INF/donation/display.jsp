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
	<h1>Donation name: <c:out value="${donation.name}"/></h1>
	<h1>Donation quantity: <c:out value="${donation.quantity}"/></h1>
	<h1>Donation donor: <c:out value="${donation.donor}"/></h1>
	<h1>Created at: <c:out value="${donation.createdAt}"/></h1>
</body>
</html>