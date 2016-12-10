<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>버킷리스트</title>
<link rel="stylesheet" href="bootstrap/css/bootstrap.css" />
<style type="text/css">
:root {
	var-color-main: 34314C;
	var-color-sub: #48B7E4;
	var-color-point-archive: #FF7372;
	var-color-point-marking: #FFC952;
}
</style>

</head>
<body>
	<div id="title">버킷리스트</div>
	<div id="register">
		<form action="/register" method="post">
			<input type="text" name="object" /> <input type="submit" value="등록" />
		</form>
	</div>
	<div id="list">
		<table>
			<tr>
				<td>번호</td>
				<td>목표</td>
				<td>등록일</td>
				<td>달성일</td>
				<td>비고</td>
			</tr>
			<c:forEach items="${list }" var="bucket">
				<tr>
					<td>${bucket.number }</td>
					<td>${bucket.object }</td>
					<td>${bucket.register_date }</td>
					<td>${bucket.achieve_date }</td>
					<td>
						<a href="/achieve?number=${bucket.number }">${bucket.is_achieved }</a>
						<a href="/mark?number=${bucket.number }">${bucket.is_marked }</a>
						<a href="/delete?number=${bucket.number }">삭제</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>