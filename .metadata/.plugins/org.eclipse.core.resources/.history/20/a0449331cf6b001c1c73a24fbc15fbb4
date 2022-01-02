<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/showContent.css" type="text/css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR:wght@300&display=swap" rel="stylesheet">
</head>
<body>
			<%
				if(session.getAttribute("now_id") == null){
					%>
						<jsp:include page="header1.jsp" />
					<%
				}else{
					%>
						<jsp:include page="header2.jsp" />
					<%
				}
			%>
	<div id="QnAcontent">
	&nbsp;<h2>문의내용</h2>
	<hr>
	제목 : ${b.qna_title }<br>
	아이디 : ${b.cust_id }<br>
	날짜 : ${b.qna_date }<br>
	문의내용<br>
	<textarea rows="10" cols="80" readonly="readonly">${b.qna_content }</textarea><br>	
	<hr>	
	</div>
	<div id="menu">
		<li><a href="listQnA.do">목록</a></li>
	</div>
	<div id="footer">
		<jsp:include page="footer.jsp"/>
		</div>
</body>
</html>
