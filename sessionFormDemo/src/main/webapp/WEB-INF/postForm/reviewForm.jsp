<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Review form</h1>
	<form method="post" action="/process/review">
		<input type="hidden" name="reviewer" value="Anthony G"/>
		<div>
			<label>Movie</label>
			<input type="text" name="movie"/>
		</div>
			<div>
			<label>Rating</label>
			<input type="number" name="rating"/>
			<p><c:out value="${ratingError}"/></p>
		</div>
		<div>
			<label>Comment</label>
			<textarea name="comment"
         		 rows="5" cols="33">
			</textarea>
			
		</div>
		<input type="submit" value="Submit movie Review"/>
	</form>
</body>
</html>