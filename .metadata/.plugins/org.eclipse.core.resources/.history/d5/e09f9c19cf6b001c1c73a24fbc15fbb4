<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나의 문의내용</title>
<link rel="stylesheet" href="css/mypage_qna.css" type="text/css">
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
	
	<h2>&nbsp;&nbsp;&nbsp;MyPage</h2>
	<hr>
	<div class="mypage">
		<div class="menu_mypage">
			<form action="mypageMain.jsp" method="post">
				<input id="my_menu" type="hidden" name="cust_id" value="${now_id }">
				<input id="my_menu" class="menu_button1" id="1" type="submit" value="회원정보 관리">
			</form>
			<form action="listQnA_mypage.do" method="post">
				<input id="my_menu1" type="hidden" name="cust_id" value="${now_id }">
				<input id="my_menu1" class="menu_button2" type="submit" value="나의게시물 관리">
			</form>
			<form action="showLoc.jsp" method="post">
				<input id="my_menu" class="menu_button3" type="submit" value="관심지역 관리">
			</form>
		</div>
			
		<div class="show_mypage">
			<h3 style="margin-right:0px;">나의 문의내용</h3>
			<hr>
			제목 : ${b.qna_title }<br>
			아이디 : ${b.cust_id }<br>
			날짜 : ${b.qna_date }<br>
			문의내용<br>
			<textarea rows="10" cols="80" readonly="readonly">${b.qna_content }</textarea><br>	
			<hr>	
			
			<div class="register-submit">
				<a style="text-decoration:none;" id="submit_all1" href="updateQnA.do?qna_no=${b.qna_no }">수정</a>
				<a style="text-decoration:none;" id="submit_all2" href="listQnA_mypage.do?cust_id=${now_id }">목록</a>
			</div>	
		</div>
	</div>	
	
	<div id="footer">
		<jsp:include page="footer.jsp"/>
	</div>
</body>
</html>


