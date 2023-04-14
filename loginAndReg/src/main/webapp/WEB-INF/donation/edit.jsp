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
	<h1>edit a donation</h1>
    <form:form action="/donations/process/edit/${donation.id}" modelAttribute="donation" method="post">
    	<input type="hidden" name="_method" value="put"/>
        <form:hidden path="donor"/>
        <div>
            <form:label path="name"> Donation Name</form:label>
            <form:input type="text" path="name"/>
            <form:errors path="name"/>
        </div>
        <div>
            <form:label path="quantity" > Quantity</form:label>
            <form:input type="text" path="quantity"/>
            <form:errors path="quantity"/>
        </div>
        <input type="submit" value="EDIT DONATION"/>
        </form:form>
</body>
</html>