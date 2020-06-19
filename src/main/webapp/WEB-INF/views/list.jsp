<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>list.jsp<br>
	개인정보 <br>
	번호 : ${list.num }<br>
	이름 : ${list.name }<br>
	날짜 ㅣ ${list.mydate }<br>
	
	<a href="main">메인 페이지</a>
	<a href="input">검색 페이지</a>
	<a href="inputuser">등록 페이지</a>
<hr>
</body>
</html>