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
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Display user</h1>
	<h3>userName: <c:out value="${user.userName}"/></h3>
	<h3>email: <c:out value="${user.email}"/></h3>
	<h2>All of <c:out value="${user.userName}"/> donations</h2>
		<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Donation Name</th>
      <th scope="col">Quantity</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${user.donations}" var="donation">
    <tr>
			<td>${donation.id}</td>
			<td>${donation.name}</td>
			<td>${donation.quantity}</td>
    </tr>
	</c:forEach>
  </tbody>
</table>
</body>
</html>