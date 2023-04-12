<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<form:form action="/donations/process/create" method="post" modelAttribute="donation">
	    <div class="form-group">
	        <form:label path="name">Donation Name</form:label>
	        <form:input type="text" path="name" class="form-control"/>
	        <form:errors path="name"/>
	    </div>
	    <div class="form-group">
	        <form:label path="quantity">Quantity</form:label>
	        <form:input type="number" path="quantity" class="form-control" />
	        <form:errors path="quantity"/>
	    </div>
	    <div class="form-group">
	        <form:label path="donor">Donor</form:label>
	        <form:input type="text" path="donor" class="form-control" />
	        <form:errors path="donor"/>
	    </div>
	    <input type="submit" value="Add Donation" class="btn btn-primary" />
	</form:form>

	<form action="/donations/search">
		<input type="text" placeholder="search for donations" name="searchValue"/>
		<input type="submit" value="Search"/>
	</form>
	<table class="table">
		<thead>
			<th>Donation Name</th>
			<th>Quantity</th>
			<th>Donor Name</th>
			<th>Action</th>
		</thead>
		<tbody>
			<c:forEach var="donation" items="${allDonations}">
				<tr>
					<td><a href="/donations/display/${donation.id}"/><c:out value="${donation.name}"/></a></td>
					<td><c:out value="${donation.quantity}"/></td>
					<td><c:out value="${donation.donor}"/></td>
					<td>
						<form action="/donations/delete/${donation.id}" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input type="submit" value="Delete">
						</form>
						||
						<div class="btn btn-outline-warning"><a href="/donations/edit/${donation.id}"/>Edit</a></div>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>