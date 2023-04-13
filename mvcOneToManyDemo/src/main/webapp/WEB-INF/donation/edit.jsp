<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
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
<h1>edit donation</h1>
<form:form action="/donations/process/edit/${donation.id}" method="post" modelAttribute="donation">
	<input type="hidden" name="_method" value="put"/>
	<form:hidden path="donor"/>
    <div class="form-group">
        <label>Donation Name</label>
        <form:input path="name" class="form-control" />
        <form:errors path="name" class="text-danger" />
    </div>
    <div class="form-group">
        <label>Quantity</label>
        <form:input type="number" path="quantity" class="form-control" />
        <form:errors path="quantity" class="text-danger" />
    </div>
    <input type="submit" value="edit Donation" class="btn btn-primary" />
</form:form>
</body>
</html>