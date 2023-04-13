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
	<h1>dashboard</h1>
	<a href="/users/create"> Create a user</a>
	<a href="/donations/create"> Create a Donation</a>
	<h2>All Donations</h2>
	<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">Donation Name</th>
      <th scope="col">Quantity</th>
      <th scope="col">Donor</th>
      <th>action</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${allDonations}" var="donation">
    <tr>
			<td>${donation.id}</td>
			<td><a href="/donations/display/${donation.id}"/>${donation.name}</a></td>
			<td>${donation.quantity}</td>
			<td>${donation.donor.userName}</td>
			<td><a class="btn btn-outline-warning" href="/donations/edit/${donation.id}">Edit</a></td>
    </tr>
	</c:forEach>
  </tbody>
</table>

<h2>All Users</h2>
	<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">User Name</th>
      <th scope="col">Email</th>
      <th scope="col">Total Donations</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${allUsers}" var="user">
    <tr>
			<td>${user.id}</td>
			<td><a href="/users/display/${user.id}">${user.userName}</a></td>
			<td>${user.email}</td>
			<td>${user.donations.size()}</td>
    </tr>
	</c:forEach>
  </tbody>
</table>
</body>
</html>