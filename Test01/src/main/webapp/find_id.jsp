<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/find_id.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap" rel="stylesheet">
<style type="text/css">
*{
font-family: 'IBM Plex Sans KR', sans-serif;
}
</style>
</head>
<body>
	
	<jsp:include page="header1.jsp" />
	<hr>
	<h2>《 아이디 찾기 》</h2>
		<form id="box" action="find_idOK.do" method="post">
		
			<h3 id="phone">▽휴대폰번호로 찾기</h3><br>
			이름&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="cust_name" id="sub1" ><br>
			휴대폰번호 &nbsp;&nbsp;<input type="text" name="cust_phone" id="sub1"><br>
			<input type="submit" value="전송" id="sub">
		</form>
		

		<form id="box" action="find_idOK.do" method="post">
			<h3>▽이메일로 찾기</h3>
			이름&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="cust_name" id="sub1"><br>
			이메일&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="cust_email" id="sub1"><br>
			<input  type="submit" value="전송" id="sub">
		</form>

	<jsp:include page="footer.jsp"/>

	 
</body>
</html>