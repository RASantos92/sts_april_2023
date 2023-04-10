<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>movie review form details</h1>
	<h3>movie: <c:out value="${movie}"/></h3>
	<h3>rating: <c:out value="${rating}"/></h3>
	<h3>comment: <c:out value="${comment}"/></h3>
</body>
</html>