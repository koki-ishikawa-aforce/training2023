<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>${errorMsg}</p>

<form action="/loginTest/registration" method="POST">
	<label>ID</label>
		<input type="text" name="id" required maxlength="50" pattern="^[a-zA-Z0-9]+$">
		
	<br>
	
	<label>Password</label>
		<input type="password" name="password" required maxlength="100" pattern="^[a-zA-Z0-9]+$">
		
	<br>
	
	<label>User Name</label>
		<input type="text" name="user_name" maxlength="100">
	
	<br>
	
	<label>Age</label>
		<input type="text" name="age" maxlength="3" pattern="^[0-9]+$">
	
	<br>
		
	<input type="submit" value="registration">	
</form>


</body>
</html>