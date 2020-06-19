<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="updatedata">
	<input type="hidden" name="num" value="${up.num }">
	이름 : <input type="text" name="name" value="${up.name }"><br>
	날짜 : <input type="date" name="mydate" value="${up.mydate }"><br>
	<input type="submit">
	</form>
</body>
</html>