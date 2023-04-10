<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Review form</h1>
	<form method="post" action="/process/review">
		<div>
			<label>Movie</label>
			<input type="text" name="movie"/>
		</div>
			<div>
			<label>Rating</label>
			<input type="number" name="rating"/>
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