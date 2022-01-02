<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap" rel="stylesheet">
<style type="text/css">
*{
font-family: 'IBM Plex Sans KR', sans-serif;
}
#qq{
	font-size: 20px;
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="header1.jsp" />
	<hr>
	<br>
	<br>
	<h4 id="qq">고객님의 비밀번호는 ${cust_pwd_m} 입니다.</h4>
	<br>
	<br>
	<jsp:include page="footer.jsp"/>
</body>
</html>