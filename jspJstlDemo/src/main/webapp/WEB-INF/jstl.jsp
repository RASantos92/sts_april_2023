<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css"/>
<link rel="stylesheet"
	href="/webjars/bootstrap/4.5.2/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/4.5.2/js/bootstrap.min.js"></script> 

<meta charset="ISO-8859-1">
<title>JSTL demo</title>
</head>
<body>
	<h1 class="text-danger">Welcome to JSTL</h1>
	<c:out value="${test}"/>
	<p><c:out value="${name}"/></p>
	<p>${age}</p>
	<p>${isHungry}</p>
	
	
	<h1>if-statement</h1>
		<c:if test="${isHungry}">
			<p><c:out value="${name}"/> is hungry as always</p>
		</c:if>
	<h1>if-else statement</h1>
	<c:choose>
		<c:when test="${age < 21 }">
			<p> you are under 21 </p>
		</c:when>
		<c:otherwise>
			<p> well, you are over 21 </p>
		</c:otherwise>
	</c:choose>
		<h1>for each</h1>
	<ul>
		<c:forEach var="user" items="${allUsers}">
			<li><c:out value="${user}"/></li>
		</c:forEach>
	</ul>
</body>
</html>