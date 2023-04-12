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
					<td><c:out value="${donation.name}"/></td>
					<td><c:out value="${donation.quantity}"/></td>
					<td><c:out value="${donation.donor}"/></td>
					<td>
						<form action="/donations/delete/${donation.id}" method="post">
						    <input type="hidden" name="_method" value="delete">
						    <input type="submit" value="Delete">
						</form>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>