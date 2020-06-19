<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>test.jsp<br>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forEach items="${lists }" var="dto">
	num : ${dto.num }<br>
	name : <a href="updatepage?num=${dto.num }">${dto.name }</a><br>
	mydate : ${dto.mydate }<br><br>
</c:forEach>
	<a href="main">메인 페이지</a>&nbsp;&nbsp;
	<a href="list">검색 페이지</a>&nbsp;&nbsp;
	<a href="inputuser">등록 페이지</a>&nbsp;&nbsp;
</body>
</html>