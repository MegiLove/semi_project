<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>${title }</h2>
	<hr>
	<form action="insertQnA.do" method="post"
	enctype="multipart/form-data">
		<input type="hidden" name="no" value="${no }">
		제목 : <input type="text" name="qna_title"><br>
		아이디 : <input type="text" name="cust_id"><br>
		문의내용 : <br>
		<textarea rows="10" cols="80" name="qna_content"></textarea><br>
		<input type="submit" value="등록">
		<input type="reset" value="취소">
		
	</form>
</body>
</html>