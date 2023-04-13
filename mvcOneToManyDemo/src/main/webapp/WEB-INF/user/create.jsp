<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<h1>create user</h1>
	<form:form action="/users/process/create" modelAttribute="user" method="post">
        <div>
            <form:label path="userName" > User Name</form:label>
            <form:input type="text" path="userName"/>
            <form:errors path="userName"/>
        <div>
        <div>
            <form:label path="email" > Email</form:label>
            <form:input type="text" path="email"/>
            <form:errors path="email"/>
        <div>
        <input type="submit" value="Create User"/>
    </form:form>
</body>
</html>