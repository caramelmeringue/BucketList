<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>버킷리스트</title>
<link rel="stylesheet" href="/bootstrap/css/bootstrap.css" />
<style type="text/css">
:root {
	var-color-main: #34314C;
	var-color-sub: #48B7E4;
	var-color-point-archive: #FF7372;
	var-color-point-marking: #FFC952;
}
</style>
<style>
	body {
		width: 80%;
		margin: auto;
	}
</style>
</head>
<body>
	<div id="title">
		<h1>버킷리스트</h1>
		<h5>맘에 드는게 없어서 만들어본 머랭 소프트 0호작</h5>
	</div>
	<br />
	<div id="register">
		<form action="/register" method="post" class="form-horizontal">
			<div class="form-group">
			    <label class="sr-only" for="object">새로운 목표</label>
			    <div class="col-sm-11">
			    	<input type="text" class="form-control" id="object" name="object" placeholder="새로운 목표를 입력하세요">
				</div>
				<input type="submit" value="목표등록" class="btn btn-default" style="margin-left: -5px" />
			</div>
		</form>
	</div>
	<br />
	<div id="list">
		<table class="table table-bordered">
			<thead>
				<tr>
					<td width="50px">번호</td>
					<td>목표</td>
					<td width="110px">등록일</td>
					<td width="110px">달성일</td>
					<td width="80px">비고</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list }" var="bucket">
					<tr>
						<td>${bucket.number }</td>
						<td>${bucket.object }</td>
						<td><fmt:formatDate value="${bucket.register_date }" type="date"/></td>
						<td><fmt:formatDate value="${bucket.achieve_date }" type="date"/></td>
						<td>
							<a href="/achieve?number=${bucket.number }">
								<c:choose>
									<c:when test="${bucket.is_achieved == 'Y' }">
										<span class="glyphicon glyphicon-ok" aria-hidden="true" style="color: #FF7372"></span>
									</c:when>
									<c:otherwise>
										<span class="glyphicon glyphicon-ok" aria-hidden="true" style="color: gray"></span>
									</c:otherwise>
								</c:choose>
							</a>
							<a href="/mark?number=${bucket.number }">
								<c:choose>
									<c:when test="${bucket.is_marked == 'Y' }">
										<span class="glyphicon glyphicon-star" aria-hidden="true" style="color: #FFC952"></span>
									</c:when>
									<c:otherwise>
										<span class="glyphicon glyphicon-star" aria-hidden="true" style="color: gray"></span>
									</c:otherwise>
								</c:choose>
							</a>
							<a href="/delete?number=${bucket.number }"><span class="glyphicon glyphicon-remove" aria-hidden="true" style="color: gray"></span></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>