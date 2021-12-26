<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>게시물 상세</h2>
	<hr>
	제목 : ${b.qna_title }<br>
	아이디 : ${b.cust_id }<br>
	날짜 : ${b.regdate }<br>
	문의내용 : <br>
	<textarea rows="10" cols="80" readonly="readonly">${b.qna_content }</textarea><br>	
	<hr>	
	
	<a href="listQnA.do">목록</a>

</body>
</html>