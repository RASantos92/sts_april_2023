<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>create a donation</h1>
    <form:form action="/donations/process/create" modelAttribute="donation" method="post">
        <form:input type="hidden" path="donor" value="${user_id}"/>
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
        <input type="submit" value="DONATE"/>
        </form:form>
</body>
</html>