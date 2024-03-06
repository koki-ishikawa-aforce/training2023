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
	<form action="/loginTest/signin" method="POST">
		<label>ID</label>
			<input type="text" name="id">
		
		<br>
		
		<label>Password</label>
			<input type="password" name="password">
		
		<br>
		
		<input type="submit" value="SignIn">
	</form>

	<a href="/loginTest/registration" method="GET">新規登録はこちら</a>		

</body>
</html>