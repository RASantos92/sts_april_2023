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
	<h1>Welcome to the Dashboard <c:out value="${loggedInUser.userName}"/> </h1>
	<a href="/donations/create">Donate</a>
	<a href="/users/logout">logout</a>
	<h1>All Donations from Database</h1>
	<table class="table table-dark">
	  <thead>
	    <tr>
	      <th scope="col">id</th>
	      <th scope="col">Donation Name</th>
	      <th scope="col">Quantity</th>
	      <th scope="col">Donor user name</th>
	      <th> Actions <th>
	    </tr>
	  </thead>
	  <tbody>
	    <c:forEach items="${allDonations}" var="donation">
	    <tr>
				<td>${donation.id}</td>
				<td><a href="/donations/display/${donation.id}">${donation.name}</a></td>
				<td>${donation.quantity}</td>
				<td>${donation.donor.userName}</td>
				<td>
					<a class="btn btn-outline-warning" href="/donations/edit/${donation.id}">Edit</a>
					<form action="/donations/delete/${donation.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<input type="submit" value="Delete" class="btn btn-outline-danger btn-dark"/>
					</form>
				</td>
	    </tr>
		</c:forEach>
	  </tbody>
</table>
</body>
</html>